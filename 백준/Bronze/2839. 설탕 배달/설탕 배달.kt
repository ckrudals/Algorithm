  fun main() = with(System.`in`.bufferedReader()) {

      var input = readLine().toInt()
      var count = 0

      while (true) {
          if (input % 5 == 0) {
              print("${input / 5 + count}")
              break
          } else if (input <= 0) {
              print(-1)
              break
          }

          input -= 3
          count++
      }
  }
  