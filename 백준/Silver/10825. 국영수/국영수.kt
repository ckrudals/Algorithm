fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val input = br.readLine().toInt()
    val list = List(input) {
        val n = br.readLine().split(" ")
        Info(n[0], n[1].toInt(), n[2].toInt(), n[3].toInt())
    }
    val result = list.sortedWith(Comparator { o1, o2 ->

        if (o1.korean == o2.korean) //국어점수가 같다면
            if (o1.english == o2.english) { // 국어점수와 영어점수가 같다면
                if (o1.math == o2.math) // 국어점수와 영어좀수, 수학점수 모두 같다면
                    o1.name.compareTo(o2.name) // 이름 사전순서대로
                else
                    o2.math.compareTo(o1.math) // 수학점수가 감소하는 순서대로
            } else
                o1.english.compareTo(o2.english)// 영어점수가 증거하는대로
        else
            o2.korean.compareTo(o1.korean) // 국어 점수가 감소하는대로


    })
    result.forEach {
        bw.write("${it.name}\n")
    }
    bw.flush()

}

data class Info(
    val name: String,
    val korean: Int,
    val english: Int,
    val math: Int
)