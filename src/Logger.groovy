class Logger {
  String name

  def construct(name) {
    this.name = name
  }

  def info(String message) {
    println name + " INFO: ${message}"
  }

  def warning(String message) {
    println name + " WARNING: ${message}"
  }
}
