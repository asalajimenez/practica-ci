pipeline {
    agent any

    tools {
        maven 'Maven 3.9.4'  // Asegúrate de que ese nombre coincide con el definido en Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/asalajimenez/practica-ci.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }
}
