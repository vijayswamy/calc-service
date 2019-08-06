pipeline {
  agent any
  stages {
    stage('Unit Test') {
      steps {
        sh 'mvn clean test surefire-report:report'
        sh '''pwd
ls /var/lib/jenkins/workspace/blue-ocean-github_master/target'''
      }
    }
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Archieve Artifacts') {
      steps {
        archiveArtifacts 'target/site/*.html,target/*.jar'
        echo 'Pushing to Nexus here'
      }
    }
  }
}