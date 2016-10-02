trait Tokenizer {
  def tokenize(str: String): Array[String]
}

object SimpleTokenizer {
  val pattern = "\\s+"
}

class SimpleTokenizer extends Tokenizer {
  override def tokenize(str: String) = {
    for (token <- str.split(SimpleTokenizer.pattern))
      yield token
  }
}
