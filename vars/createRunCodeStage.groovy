def call(message) {
  stage('Example') {
    steps {
        echo 'Hello World'
    }
  }
}

// Only entire pipelines can be defined in shared libraries as of this time.
// This can only be done in vars/*.groovy, and only in a call method. Only one
// Declarative Pipeline can be executed in a single build, and if you attempt
// to execute a second one, your build will fail as a result.