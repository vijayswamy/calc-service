pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package surefire-report:report'
      }
    }
    stage('Archieve') {
      steps {
        archiveArtifacts 'target/*.html,target/*.jar'
      }
    }
    stage('Deploy') {
      steps {
        echo '"Deploying jar to server"'
      }
    }
  }
}