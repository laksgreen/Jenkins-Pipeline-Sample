pipeline {
    stages {
        stage('stage 1') {
            steps {
                script{
                    //do your things of second pipeline stage
                }
            }
        }
        stage('stage 2') {
            steps {
                script{
                    //do your things of second pipeline stage
                }
            }
        }
    }
}
