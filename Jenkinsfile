pipeline {
     agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2'
            args 'COPY /opt/app/examAnalysis/app.jar:/target/denemeDemo-0.0.1-SNAPSHOT.jar'
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
                echo 'Creating the image AvengersAssemble'
            }
        }
    }
}