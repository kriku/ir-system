object Main {
  def main(args: Array[String]):Unit = {
    val tokenizer = new SimpleTokenizer();
    val tokens = tokenizer.tokenize("hey you!")
    println(tokens.toList)
  }
}
