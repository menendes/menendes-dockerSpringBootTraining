pipeline {
     agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2'
            args '-v /opt/app/springboot-app:/target'
        }
    }

    stages {
       
        stage('Build') {
            steps {
               sh 'mvn clean install'
            }
        }
        stage('test'){
             steps {
               sh 'test komutu'
            }
        }
        stage('Create Image') {
            steps {
                input(message: 'Do you want to create image?', id:'OK')
                echo 'Creating the image AvengersAssemble'
            }
        }
    }
}