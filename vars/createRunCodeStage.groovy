def call(message) {
  stage('RunCode') {
      steps {
          script{
              log.info(message)
          }
      }
  }
}