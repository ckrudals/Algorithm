fun main() {
    val num = readLine()!!.toInt()
    val list = mutableListOf<Pair<Int,String>>()
    for(i in 0 until num){
        val line = readLine()!!.split(" ")
        list.add(Pair(line[0].toInt(),line[1]))
    }
    list.sortWith{a,b -> a.first - b.first}


    for(i in 0 until num){
        println("${list[i].first} ${list[i].second}")
    }
}
