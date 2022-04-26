package main

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    val result = nextInt()

    print(solve(result))

}

fun solve(
    result: Int,
    count: Int = 0,
    answer: Int = 99999
): Int {

    var ans = answer
    var cnt = count
    if (result == 1) {
        return if (cnt < ans) {
            cnt
        } else {
            ans
        }
    }


    cnt += 1
    if (count >= answer) return ans

    if (result % 3 == 0) ans = solve(result / 3, cnt, ans)

    if (result % 2 == 0) ans = solve(result / 2, cnt, ans)

    ans = solve(result.minus(1), cnt, ans)



    return ans

}


