package week1

object main {
  def pascal(c: Int, r: Int): Int =
    if (r == 0) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)

  pascal(2, 1)

  def balance(chars: List[Char]): Boolean = {
    def balanceH(chars: List[Char], value: Int): Boolean = {
      if (!chars.isEmpty && value >= 0) {
        val head = chars.head
        val toAdd = if (head == '(') 1 else -1
        balanceH(chars.tail, value + toAdd)
        
      } else {
        if (value == 0) true else false
      }

    }

    balanceH(chars, 0)
  }

  balance("((())))(".toList)

  
}