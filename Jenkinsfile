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
        jdk 'JDK'  
      
    }
    steps {
        sh '''
                    echo "JAVA_HOME is $JAVA_HOME"
                    echo "PATH includes: $PATH"
                    java -version
                    javac -version
                    mvn -version
                '''

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
