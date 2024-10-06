pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub
                git branch: 'main', url: 
'https://github.com/RobianaL/CEN4802CMidterm.git'
            }
        }
        
        stage('Build') {
            steps {
                // Run Maven build
                sh 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                // Run unit tests
                sh 'mvn test'
            }
        }
    }
    
    post {
        always {
            // Archive test results
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
