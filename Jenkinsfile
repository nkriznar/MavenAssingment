pipeline {
    agent any

    tools {
        jdk 'JDK21'       // Force Jenkins to use JDK 21
        maven 'Maven'     // Use configured Maven tool
    }

    stages {

        stage('Verify Environment') {
            steps {
                bat 'echo JAVA_HOME=%JAVA_HOME%'
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Checkout') {
            steps {
                git url: 'https://github.com/nkriznar/MavenAssingment.git',
                    branch: 'main'
            }
        }

        stage('Build and Package') {
            steps {
                bat 'mvn clean package'
            }
        }
    }

    post {
        success {
            echo 'Build Successful ✅'
        }
        failure {
            echo 'Build Failed ❌'
        }
    }
}
