trait Tokenizer {
  def tokenize(str: String): Array[String]
}

object SimpleTokenizer {
  val pattern = "\\s+"
}

class SimpleTokenizer extends Tokenizer {
  override def tokenize(str: String) = {
    // kind of shitty (double traversal)
    val preprocessed = str.replaceAll("\\-\n+", "-")
    for (token <- preprocessed.split(SimpleTokenizer.pattern))
      yield token
  }
}
