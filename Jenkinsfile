pipeline {
    agent any
    triggers {
        githubPush()   // reacts to GitHub webhook
    }
    stages {
        stage('Checkout App (Develop)') {
            steps {
                git branch: 'main', url: 'https://github.com/Puneeth-019/QAA.git'
            }
        }
        stage('Checkout Tests') {
    steps {
        git branch: 'main', 
            url: 'https://github.com/Puneeth-019/REG.git', 
            credentialsId: 'NEW_pass'
    }
}

      stage('Run Tests') {
    tools {
        jdk 'JDK17'  
      
    }
    steps {
        sh 'mvn clean test -Dheadless=true'
    }
}
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
