#!groovy
pipeline {
  agent any
	parameters { 
	    choice(name: 'action', choices: ['create', 'destroy'], description: 'Choose create or destroy')
	    string(name: 'env', defaultValue: '', description: '')
	    booleanParam( defaultValue: true, name: 'Boolean-value' )
	}
	stages {
        stage('GIT-PIPELINE-SUB-DIR-STAGE-1') {
	  steps {
                sh 'echo "testing1......"'
                sh ''' #!/bin/bash
			echo "Clone the Git repository"
			rm -rf ${WORKSPACE}/turicreate
                   	git clone --single-branch --branch master https://github.com/laksgreen/turicreate.git
                '''
	}
    }
         stage('GIT-PIPELINE-SUB-DIR-STAGE-2') {
	   steps {
               sh 'echo "testing2......"'
               sh 'ls -al ${WORKSPACE}/turicreate/'
               sh 'cat ${WORKSPACE}/turicreate/Dockerfile'
               echo 'Hello world!'
               echo "mesage: ${params.action}"
	       echo "message: ${params.env}"
	  	}
	 }
     }
}
