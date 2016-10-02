import org.scalatest._

class TokenizerSpec extends FlatSpec with Matchers {
  val tokenizer = new SimpleTokenizer();

  "Tokenizer" should "split tokens by spaces" in {
    val tokens = tokenizer.tokenize("abc  def")
    tokens.length should be (2)
    tokens(0) should be ("abc")
    tokens(1) should be ("def")
  }

  it should "not split abbreviations" in {
    val tokens = tokenizer.tokenize("U.S.A.")
    tokens.length should be (1)
    tokens(0) should be ("U.S.A.")
  }

  it should "not split contractions" in {
    val tokens = tokenizer.tokenize("I'm")
    tokens.length should be (1)
    tokens(0) should be ("I'm")
  }

  it should "not split by hyphen" in {
    val tokens = tokenizer.tokenize("foo-bar")
    tokens.length should be (1)
    tokens(0) should be ("foo-bar")
  }

  it should "not split hyphen and newline" in {
    val tokens = tokenizer.tokenize("foo-\nbar")
    tokens.length should be (1)
    tokens(0) should be ("foo-\nbar")
  }

}
