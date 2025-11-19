pipeline{
    agent { label 'Jenkins-Agent'}
    tools {
        jdk 'Java21'
        maven 'Maven3'
    }
    environment {
        APP_NAME = "billingsoftware"
        RELEASE = "1.0.0"
        DOCKER_USER = "rajyavardhan36"
        DOCKER_PASS = 'dockerhub'
        IMAGE_NAME = "${DOCKER_USER}"+"/"+"${APP_NAME}"
        IMAGE_TAG = "${RELEASE}-${BUILD_NUMBER}"
    }
    stages{
        stage('CleanUp Workspace'){
            steps{
                cleanWs()
            }
        }
        stage('Checkout from SCM'){
            steps{
                git branch: 'main', credentialsId: 'github', url: 'https://github.com/Vardhan7799/sales-software'
            }
        }
        stage('Build Application'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage ('Test Application') {
            steps{
                sh 'mvn test'
            }
        }
        stage ('SonarQube Analysis') {
            steps{
                script {
                    withSonarQubeEnv(credentialsId: 'jenkins-sonarqube-token') {
                        sh 'mvn sonar:sonar'
                    }
                }
            }
        }
        stage ('Quality Gate') {
            steps {
                script {
                    waitForQualityGate abortPipeline: false, credentialsId: 'jenkins-sonarqube-token'
                }
            }
        }
        stage('Build & Push Docker Image') {
            steps {
                script {
                    withDockerRegistry(credentialsId: DOCKER_PASS) {
                        def image = docker.build("${IMAGE_NAME}:${IMAGE_TAG}")
                        image.push()
                    }
                }
            }
        }
    }
}