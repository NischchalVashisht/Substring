//this prograam is used to count all vowels in Substring
// of a given String
class MySubs {

  //defining substring method
  def subStr(st: String): Int = {
    val lower_str = st.toLowerCase()
    val arr = Array(0)

    //iterating  to string length
    for (increm1 <- 0 to lower_str.length() - 1) {
      for (increm2 <- increm1 + 1 to lower_str.length()) {
        val ch_array = lower_str.substring(increm1, increm2).toCharArray
        for (inside_char <- ch_array) {

          // Checking whether current character is vowel or not
          if (inside_char == 'a' || inside_char == 'e' || inside_char == 'i' || inside_char == 'o' || inside_char == 'u') {
            //adding all vowel characters to current array(0)
            arr(0) += 1

          }

        }

      }
    }
    arr(0)
  }
}

object MainObject {
  def main(args: Array[String]) {
    val ms = new MySubs
    println(ms.subStr("bacef"))
  }
}
