pipeline {
		environment {
    registry = "uttiya/mycalculator"
    registryCredential = 'DockerHub'
    dockerImage = ''
    dockerImageLatest = ''
  }
  options {
         skipDefaultCheckout true
       }
  triggers {
        pollSCM 'H/2 * * * *'
    }
  agent any
  stages {
    stage('Clone Git') {
      steps {
        git 'https://github.com/UttiyaGhosh/myCalculator.git'
      }
    }
    stage('Unit Test'){
        steps {
             sh 'mvn test'
        }
    }
    stage('Build Jar'){
        steps {
             sh 'mvn clean install'
        }
    }
    stage('Build Image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
          dockerImageLatest = docker.build registry + ":latest"
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
            dockerImageLatest.push()
          }
        }
      }
    }
    stage('Remove Unused Docker Image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }
    stage('Execute Rundeck job') {
        steps {
          script {
            step([$class: "RundeckNotifier",
                  includeRundeckLogs: true,
                  jobId: "8102a10b-49cf-4cfa-986c-ce9ee9c3ed58",
                  rundeckInstance: "myCalculator",
                  shouldFailTheBuild: true,
                  shouldWaitForRundeckJob: true,
                  tailLog: true])
          }
        }
    }
  }
}
