function model = SVMTraining(images, labels)


% first we check if the problem is binary classification or multiclass
if max(labels)<2
    %binary classification
    model.type='binary';
    
    %SVM software requires labels -1 or 1 for the binary problem
    labels(labels==0)=-1;

    %Initilaise and setup SVM parameters
    lambda = 1e-20;  
    C = Inf;
%    kerneloption=1;
    kerneloption=2;
%    kerneloption=3;
%    kerneloption=4;
%    kerneloption=5;
    
%    kernel='htrbf';
    kernel='poly';
%    kernel='polyhomog';
%    kernel='gaussian'
    
%     kernelsetoption.kerneloption=1;
% kernelsetoption.method='norm';
%     kernelsetoption.kerneloption=1;
%     oneclassoption.nu=0.3; 
%     oneclassoption.kernel='gaussian';
%     kerneloption=1;
    
   % kerneloption= 5;
    %kernel='gaussian';
    %model.param.kerneloption=kerneloption;

    % Calculate the support vectors
    [xsup,w,w0,pos,tps,alpha] = svmclass(images,labels,C,lambda,kernel,kerneloption,1); 

    % create a structure encapsulating all teh variables composing the model
    model.xsup = xsup;
    model.w = w;
    model.w0 = w0;

    model.param.kerneloption=kerneloption;
    model.param.kernel=kernel;
    
    
else
    %multiple class classification
     model.type='multiclass';
    
    %SVM software requires labels from 1 to N for the multi-class problem
    labels = labels+1;
    nbclass=max(labels);
    
    %Initilaise and setup SVM parameters
    lambda = 1e-20;  
    C = 100000;
    kerneloption= 5;
    kernel='gaussian';
    
    % Calculate the support vectors
    [xsup,w,b,nbsv]=svmmulticlassoneagainstall(images,labels,nbclass,C,lambda,kernel,kerneloption,1);
    
    % create a structure encapsulating all teh variables composing the model
    model.xsup = xsup;
    model.w = w;
    model.b = b;
    model.nbsv = nbsv;

    model.param.kerneloption=kerneloption;
    model.param.kernel=kernel;
    
end



end