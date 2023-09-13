def info(message) {
    println "INFO: ${message}"
}

def warning(message) {
    println "WARNING: ${message}"
}

def call(message) {
  def logger = new Logger(message)
  return logger
}