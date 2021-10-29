pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'gradle build'
				gat 'gradle war'
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
