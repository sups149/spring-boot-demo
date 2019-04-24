pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo '$workspace'
                //sh 'gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}