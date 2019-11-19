#!groovy
node {
        stage('STAGE-1') {
                sh 'echo "testing1......"'
                sh ''' #!/bin/bash
			echo "Clone the Git repository"
                   	git clone --single-branch --branch master https://github.com/laksgreen/turicreate.git
                '''
    }
         stage('STAGE-2') {
               sh 'echo "testing2......"'
               sh 'ls -al ${WORKSPACE}/turicreate/'
               sh 'cat ${WORKSPACE}/turicreate/Dockerfile'
               echo 'Hello world!'
               echo "mesage: ${params.action}"
	       echo "message: ${params.env}"
  }
}
