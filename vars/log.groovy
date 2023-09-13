// def info(message) {
//     Logger.info(message)
// }

// def warning(message) {
//     Logger.warning(message)
// }

def call(message) {
  def logger = new Logger(message)
  return logger
}