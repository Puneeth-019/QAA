pipeline {
    agent any
    triggers {
        githubPush()   // reacts to GitHub webhook
    }
    stages {
        stage('Checkout App') {
            steps {
                git branch: 'main', url: 'https://github.com/Puneeth-019/QAA.git'
            }
        }
        stage('Checkout Tests') {
            steps {
                // Use Jenkins credentials for secure access
                git url: 'https://github.com/Puneeth-019/REG.git'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
