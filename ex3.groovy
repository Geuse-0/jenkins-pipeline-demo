pipeline {
    agent any 

    stages {
        stage('Build') {
            steps {
                echo 'Compilation en cours...'
            }
        }
        stage('Test') {
            steps {
                echo 'Tests en cours...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Déploiement en cours...'
            }
        }
    }
}