def call(message) {
  return stage('RunCode') {
      steps {
          script{
              log.info(message)
          }
      }
  }
}