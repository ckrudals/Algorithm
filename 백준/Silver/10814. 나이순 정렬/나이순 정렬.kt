fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()
    val list = ArrayList<Pair<Int, String>>()

    repeat(input) {
        val ages = br.readLine().split(" ").map { it }
        list.add(Pair(ages[0].toInt(), ages[1]))
    }
    list.sortWith { d1, d2 ->

        d1.first - d2.first
    }

    for (i in 0 until input) {
        bw.write("${list[i].first} ${list[i].second}\n")
    }

    bw.flush()


}
