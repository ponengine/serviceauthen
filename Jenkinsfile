pipeline {
    agent any
    stages {
        stage('pull project') {
            steps {
                 git branch: 'main', credentialsId: 'key_github', url: 'https://github.com/ponengine/serviceprofile.git'
            }
        }
        stage('install'){
            steps{
                sh 'mvn package'
            }
        }
        stage('build image'){
            steps{
                sh 'docker build --rm -t serviceprofile .'
                sh 'docker run -d -p 8082:8082 serviceprofile'
            }
        }
    }
}