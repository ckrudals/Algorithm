fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var input = 1000 - br.readLine().toInt()
    var count = 0
    val coins = intArrayOf(500,100,50,10,5,1)

    for(i in coins){
        val value = input / i
        if (value != 0) {
            count += value
            input -= value * i
        }
    }
    bw.write(count.toString())
    bw.flush()
}