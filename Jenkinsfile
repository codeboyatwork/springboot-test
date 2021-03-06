pipeline{
agent{
label "${params.NODE_LABEL}"
} 
 parameters { 
 string(name: 'NODE_LABEL', defaultValue: 'node-2004', description: 'This is the node where the tests will be executed')
 string(name: 'IMAGE_NAME', defaultValue: 'sbexample:latest', description: 'This is the name of the docker image on which tests will be executed')
 string(name: 'URL', defaultValue: 'http://localhost:8081', description: 'This is url where the application is running')
 booleanParam(name: 'E2E_TESTS', defaultValue: true, description: 'Check to run the e2e tests')
 booleanParam(name: 'PRODUCTION_CHECKOUT', defaultValue: false, description: 'Check to run the production checkout tests')
 }  
environment{
mvnHome = tool name: 'maven'
}
stages {
	    // reference to maven
	    // ** NOTE: This 'maven-3.5.2' Maven tool must be configured in the Jenkins Global Configuration.   
	    stage('Clone Repo') { 
	     steps {
	      git 'https://github.com/codeboyatwork/springboot-test.git'        
	      
	     }	      
	    } 
	    stage('Deploy E2E Container') {
	    when {
	      	expression {params.E2E_TESTS == true && params.PRODUCTION_CHECKOUT == false}
	      }
	      steps {
	      	sh "docker run --name sbexample_e2e -d -p 2222:2222 -p 8081:8080 tanmaydeshmukh1/${params.IMAGE_NAME}"
	      }
	    }
	    stage('Wait for E2E Container to load') {
	    when {
	      	expression {params.E2E_TESTS == true || params.PRODUCTION_CHECKOUT == true}
	      }
	      steps {
	      	sleep 60
	      }
	    }
	    stage('Run E2E Tests') {
	      // build project via maven
	      when {
	      	expression {params.E2E_TESTS == true || params.PRODUCTION_CHECKOUT == true}
	      }
	      steps {
	      	sh "'${mvnHome}/bin/mvn' clean test -Dapp.url='${params.URL}'"
	      }    
	    }
	    stage('Cleanup for E2E Tests') {
	    when {
	      	expression {params.E2E_TESTS == true && params.PRODUCTION_CHECKOUT == false}
	      }
	      steps {
	      	sh "docker rm -f sbexample_e2e"
	      }
	    } 
}
}