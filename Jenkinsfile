pipeline {
    agent any

    stages {
        stage('Checkout App Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Puneeth-019/QAA.git'
            }
        }

        stage('Checkout Regression Framework') {
            steps {
                dir('regression-tests') {
                    git branch: 'main',
                        credentialsId: 'PAT',
                        url: 'https://github.com/Puneeth-019/REG.git'
                }
            }
        }

        stage('Build App') {
            steps {
                // Run Maven only if pom.xml exists in QAA repo
                sh 'ls -l' // debug: confirm pom.xml is present
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
                publishHTML([
                    reportDir: 'regression-tests/test-output',
                    reportFiles: 'index.html',
                    reportName: 'TestNG Regression Report'
                ])
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'regression-tests/test-output/**', fingerprint: true
            // Updated to match actual TestNG output location
            junit 'regression-tests/test-output/testng-results.xml'
        }
        failure {
            echo "Build failed. Email notification skipped due to missing SMTP setup."
        }
    }
}
