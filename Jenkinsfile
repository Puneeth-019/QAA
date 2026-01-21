pipeline {
    agent any

    stages {
        stage('Checkout App Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Puneeth-019/QAA.git'
            }
        }

        stage('Checkout Regression Tests') {
            steps {
                dir('regression-tests') {
                    git branch: 'main', url: 'https://github.com/Puneeth-019/REG.git'
                }
            }
        }

        stage('Build App') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Regression Suite') {
            steps {
                dir('regression-tests') {
                    sh 'mvn test -DsuiteXmlFile=testng.xml'
                }
            }
        }

        stage('Publish Reports') {
            steps {
                publishHTML([reportDir: 'regression-tests/test-output',
                             reportFiles: 'index.html',
                             reportName: 'TestNG Regression Report'])
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'regression-tests/test-output/**', fingerprint: true
            junit 'regression-tests/target/surefire-reports/*.xml'
        }
        failure {
            mail to: '19puneethshetty@gmail.com',
                 subject: "Regression Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "Check Jenkins for details: ${env.BUILD_URL}"
        }
    }
}
