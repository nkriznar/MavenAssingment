pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Pull the latest code from GitHub
                git branch: 'main', url: 'https://github.com/nkriznar/MavenAssingment.git'
            }
        }

        stage('Build') {
            steps {
                // Compile the project
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run unit tests
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Package the application into a JAR
                bat 'mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
            // Archive the built JAR artifact
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        failure {
            echo 'Build failed!'
        }
        always {
            echo 'Pipeline finished.'
        }
    }
}
