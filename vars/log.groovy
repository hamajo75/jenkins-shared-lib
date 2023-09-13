def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def call(message) {
  def logger = new Logger(message)
  return logger
}