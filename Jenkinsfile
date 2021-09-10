pipeline{
 parameters { 
 string(name: 'NODE_LABEL', defaultValue: 'node-2004', description: 'This is the node where the tests will be executed')
 string(name: 'IMAGE_NAME', defaultValue: 'sbexample:latest', description: 'This is the name of the docker image on which tests will be executed')
 booleanParam(name: 'E2E_TESTS', defaultValue: true, description: 'Check to run the e2e tests')
 booleanParam(name: 'ACCEPTANCE_TESTS', defaultValue: false, description: 'Check to run the e2e tests')
 }   

node (params.NODE_LABEL) {
	    // reference to maven
	    // ** NOTE: This 'maven-3.5.2' Maven tool must be configured in the Jenkins Global Configuration.   
	    def mvnHome = tool 'maven'
	

	    // holds reference to docker image
	    def dockerImage
	    // ip address of the docker private repository(nexus)
	 
	    def dockerImageTag = "sbexample${env.BUILD_NUMBER}"
	    
	    stage('Clone Repo') { // for display purposes
	      // Get some code from a GitHub repository
	      git 'https://github.com/codeboyatwork/springboot-test.git'
	      // Get the Maven tool.
	      // ** NOTE: This 'maven-3.5.2' Maven tool must be configured
	      // **       in the global configuration.           
	      mvnHome = tool 'maven'
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