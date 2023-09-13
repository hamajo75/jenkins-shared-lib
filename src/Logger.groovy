class Logger {
  String name

  def Logger(name) {
    this.name = name
  }

  def info(String message) {
    echo " echo: ${message}"
    println name + " INFO: ${message}"
  }

  def warning(String message) {
    println name + " WARNING: ${message}"
  }
}
