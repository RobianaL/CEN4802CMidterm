pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'final-project', url: 'https://github.com/RobianaL/CEN4802CMidterm/tree/final-project'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
