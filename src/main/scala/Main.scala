object Main {
  def main(args: Array[String]):Unit = {
    val tokenizer = new SimpleTokenizer();
    val tokens = tokenizer.tokenize("state-of-\nthe-art")
    println(tokens.toList)
  }
}
