pipeline {
     agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }

    stages {
        stage('Git pull') {
            steps {
                echo 'Pulling the project..'
				git 'https://github.com/menendes/menendes-dockerSpringBootTraining'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
				sh label: '', script: 'mvn clean install'
            }
        }
        stage('Create Image') {
            steps {
                echo 'Creating the image....'
            }
        }
    }
}