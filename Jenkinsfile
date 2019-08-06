pipeline {
  agent any
  stages {
    stage('Unit Test') {
      steps {
        sh 'mvn clean test surefire-report:report'
        realtimeJUnit(allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml', healthScaleFactor: 1)
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