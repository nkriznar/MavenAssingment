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

        stage('Build, Test, and Package') {
            steps {
                bat 'mvn clean package'
            }
        }
    }

    post {
        always {
            // Publish JUnit Test Results
            junit 'target/surefire-reports/*.xml'
            
            // Publish JaCoCo Code Coverage Reports
            // Make sure the "JaCoCo plugin" is installed in Jenkins for this to work
            jacoco()
        }
        success {
            echo 'Build Successful ✅'
        }
        failure {
            echo 'Build Failed ❌'
        }
    }
}
