package uk.ac.qub.eeecs.game.spaceDemo;

import java.util.Random;

import uk.ac.qub.eeecs.gage.engine.ElapsedTime;
import uk.ac.qub.eeecs.gage.engine.particle.Emitter;
import uk.ac.qub.eeecs.gage.engine.particle.ParticleSystemManager;
import uk.ac.qub.eeecs.gage.util.MathsHelper;
import uk.ac.qub.eeecs.gage.util.SteeringBehaviours;
import uk.ac.qub.eeecs.gage.util.Vector2;

public class Avoider extends SpaceEntity {
    // /////////////////////////////////////////////////////////////////////////
    // Properties
    // /////////////////////////////////////////////////////////////////////////

    /**
     * Default size for the Seeker
     */
    private static final float DEFAULT_RADIUS = 20;
    private static final float MAX_WIDTH = 35;
    private static final float MIN_WIDTH = 15;

    private Random AISize = new Random();
    private float randomWidth = AISize.nextInt((int) (MAX_WIDTH + 1 - MIN_WIDTH)) + MIN_WIDTH;
    private float randomHeight = randomWidth;


    /**
     * Distance at which the spaceship should avoid other game objects
     */
    private float mSeparateThreshold = 75.0f;

    /**
     * Accumulators used to build up the net steering outcome
     */
    private Vector2 mAccAccumulator = new Vector2();
    private Vector2 mAccComponent = new Vector2();

    /**
     * Particle emitter providing a thrust trail for this spaceship
     */
    private Emitter movementEmitter;

    /**
     * Offset/location variables for the movement emitter so it appears to
     * exit from the back of the spaceship.
     */
    private Vector2 movementEmitterOffset;
    private Vector2 movementEmitterLocation;

    // /////////////////////////////////////////////////////////////////////////
    // Constructors
    // /////////////////////////////////////////////////////////////////////////

    /**
     * Create an AI controlled seeker spaceship
     *
     * @param startX        x location of the AI spaceship
     * @param startY        y location of the AI spaceship
     * @param gameScreen    Gamescreen to which AI belongs
     */

    public Avoider(float startX, float startY, SpaceshipDemoScreen gameScreen) {
        super(startX, startY, DEFAULT_RADIUS*2.0f, DEFAULT_RADIUS*2.0f, null, gameScreen);

        // Define movement variables for the seeker
        setWidth(randomWidth*2.0f);
        setHeight(randomHeight*2.0f);
        maxAcceleration = 20.0f;
        maxVelocity = 20.0f;
        maxAngularVelocity = 200.0f;
        maxAngularAcceleration = 200.0f;

        mRadius = DEFAULT_RADIUS;
        mMass = 10.0f;

        // Define the appearance of the seeker
        mBitmap = gameScreen.getGame().getAssetManager().getBitmap("Spaceship2");

        // Create an offset for the movement emitter based on the size of the spaceship
        movementEmitterOffset = new Vector2(-DEFAULT_RADIUS, 0.0f);
        movementEmitterLocation = new Vector2(position);
        movementEmitterLocation.add(movementEmitterOffset);

        // Create and add a particle effect for the movement of the ship
        ParticleSystemManager particleSystemManager =
                ((SpaceshipDemoScreen) mGameScreen).getParticleSystemManager();
        movementEmitter = new Emitter(
                particleSystemManager, "txt/particle/ThrusterEmitter.JSON",
                movementEmitterLocation);
        particleSystemManager.addEmitter(movementEmitter);
    }
// /////////////////////////////////////////////////////////////////////////
    // Methods
    // /////////////////////////////////////////////////////////////////////////

    /**
     * Update the AI Spaceship
     *
     * @param elapsedTime Elapsed time information
     */
    @Override
    public void update(ElapsedTime elapsedTime) {

       //Look at the player
        angularAcceleration =
                SteeringBehaviours.lookAt(this,
                ((SpaceshipDemoScreen) mGameScreen).getPlayerSpaceship().position);

        if (this.position.x > ((SpaceshipDemoScreen) mGameScreen).getPlayerSpaceship().position.x - 5 || this.position.x < ((SpaceshipDemoScreen) mGameScreen).getPlayerSpaceship().position.x + 5) {
            if (this.position.y > ((SpaceshipDemoScreen) mGameScreen).getPlayerSpaceship().position.y - 5 || this.position.y < ((SpaceshipDemoScreen) mGameScreen).getPlayerSpaceship().position.y + 5) {
                //Flee from the player
                SteeringBehaviours.flee(this,
                        ((SpaceshipDemoScreen)  mGameScreen).getSpaceEntities().get(5).position,
                        mAccComponent);

                // Try to avoid a collision with the other space entities
                SteeringBehaviours.separate(this,
                        ((SpaceshipDemoScreen) mGameScreen).getSpaceEntities(),
                        mSeparateThreshold, 1.0f, mAccComponent);
                mAccAccumulator.add(mAccComponent);

                // If we are trying to avoid a collision then combine
                // it with the seek behaviour, placing more emphasis on
                // avoiding a collision.
                if (!mAccAccumulator.isZero()) {
                    acceleration.x = 0.1f * acceleration.x + 0.9f * mAccAccumulator.x;
                    acceleration.y = 0.1f * acceleration.y + 0.9f * mAccAccumulator.y;
                }

                // Make sure we point in the direction of travel.
                angularAcceleration = SteeringBehaviours.alignWithMovement(this);

                // Call the sprite's superclass to apply the determined accelerations
                super.update(elapsedTime);

                // Update the particle emitter associated with this ship to rhe new position,
                // calculating an offset so the particles emerge from the rear of the ship
                MathsHelper.rotateOffsetAboutCentre(
                        position, movementEmitterOffset, orientation, movementEmitterLocation);
                movementEmitter.setPosition(movementEmitterLocation.x, movementEmitterLocation.y);
            }
        }
    }
}