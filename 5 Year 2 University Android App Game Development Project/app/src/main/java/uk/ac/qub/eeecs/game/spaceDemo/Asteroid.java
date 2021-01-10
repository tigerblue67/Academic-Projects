package uk.ac.qub.eeecs.game.spaceDemo;

import java.util.Random;

import uk.ac.qub.eeecs.gage.engine.AssetManager;
import uk.ac.qub.eeecs.gage.world.GameObject;
import uk.ac.qub.eeecs.gage.world.GameScreen;
import uk.ac.qub.eeecs.gage.world.Sprite;

/**
 * Simple asteroid
 *
 * Note: See the course documentation for extension/refactoring stories
 * for this class.
 *
 * @version 1.0
 */
public class Asteroid extends SpaceEntity {

    // /////////////////////////////////////////////////////////////////////////
    // Properties
    // /////////////////////////////////////////////////////////////////////////

    /**
     * Default size for the asteroid
     */
    private static final float DEFAULT_RADIUS = 20;

    // /////////////////////////////////////////////////////////////////////////
    // Constructors
    // /////////////////////////////////////////////////////////////////////////

    /**
     * Create an asteroid
     *
     * @param startX     x location of the asteroid
     * @param startY     y location of the asteroid
     * @param gameScreen Gamescreen to which asteroid belongs
     *
     *
     *
     */

    float MAX_RADIUS = 80;
    float MIN_RADIUS = 10;

    Random randomSize = new Random();
    float randomHeight = randomSize.nextInt((int) (MAX_RADIUS + 1 - MIN_RADIUS)) + MIN_RADIUS;
    float randomWidth = randomHeight;


    public Asteroid(float startX, float startY, GameScreen gameScreen) {
       super(startX, startY, DEFAULT_RADIUS*2.0f, DEFAULT_RADIUS*2.0f, null, gameScreen);

       //random asteroid selection
        Random random = new Random();
        int selected_asteroid = random.nextInt(3);
        String asteroid_string = "Asteroid1";

        switch(selected_asteroid) {
            case 0: asteroid_string = "Asteroid1";
                 break;
            case 1: asteroid_string = "Asteroid2";
                break;
            case 2: asteroid_string = "Asteroid3";
                break;
            case 3: asteroid_string = "Asteroid4";
                break;
        }

        mBitmap = gameScreen.getGame().getAssetManager()
                .getBitmap(asteroid_string);

        setWidth(randomWidth*2.0f);
        setHeight(randomHeight*2.0f);

        mRadius = DEFAULT_RADIUS;
        mMass = 1000.0f;

        angularVelocity = random.nextFloat() * 240.0f - 20.0f;

    }

    /**
     * Loads asteroid assets
     * @param assetManager The Games asset manager
     */
    static void loadAssets(AssetManager assetManager){
        assetManager.loadAndAddBitmap("Asteroid1", "img/Asteroid1.png");
        assetManager.loadAndAddBitmap("Asteroid2", "img/Asteroid2.png");
    }
}
