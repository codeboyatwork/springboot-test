pipeline{
 parameters { 
 string(name: 'NODE_LABEL', defaultValue: 'node-2004', description: 'This is the node where the tests will be executed')
 string(name: 'IMAGE_NAME', defaultValue: 'sbexample:latest', description: 'This is the name of the docker image on which tests will be executed')
 booleanParam(name: 'E2E_TESTS', defaultValue: true, description: 'Check to run the e2e tests')
 booleanParam(name: 'ACCEPTANCE_TESTS', defaultValue: false, description: 'Check to run the e2e tests')
 }  
agent{
label params.NODE_LABEL || 'node-2004'
} 

stages {
	    // reference to maven
	    // ** NOTE: This 'maven-3.5.2' Maven tool must be configured in the Jenkins Global Configuration.   
	   
	    
	    stage('Clone Repo') { 
	     steps {
	      git 'https://github.com/codeboyatwork/springboot-test.git'        
	      mvnHome = tool 'maven'
	     }	      
	    } 
	    stage('Run E2E Tests') {
	      // build project via maven
	      when {
	      	params.E2E_TESTS == true
	      }
	      steps {
	      	sh "'${mvnHome}/bin/mvn' clean test -Dtest=com.experiment.tests.e2etests.**.*Test*"
	      }    
	    } 
	    stage('Run Acceptance Tests') {
	      // build project via maven
	      when {
	      	params.E2E_TESTS == true
	      }
	      steps{
	      	sh "'${mvnHome}/bin/mvn' clean test -Dtest=com.experiment.demo.acceptancetests.**.*Test*"
	      }
	      
	    }   
}
}