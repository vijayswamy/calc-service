pipeline {
  agent any
  stages {
    stage('Unit Test') {
      steps {
        sh 'mvn clean test surefire-report:report'
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
        realtimeJUnit(testResults: 'target/surefire-reports/*.xml')
      }
    }
  }
}