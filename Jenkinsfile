pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Récupère le code depuis le dépôt configuré dans le job
                checkout scm
            }
        }
        stage('List Files') {
            steps {
                // Adaptation selon votre OS (Linux/Mac : sh, Windows : bat)
                script {
                    if (isUnix()) {
                        sh 'ls -la'
                    } else {
                        bat 'dir'
                    }
                }
            }
        }
    }
}