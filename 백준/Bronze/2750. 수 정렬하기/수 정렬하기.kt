fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val list = mutableListOf<Int>()
    repeat(br.readLine().toInt()){
        list.add(br.readLine().toInt())
    }
    for(i in list.sorted()){
        bw.write("${i}\n")
    }
    bw.flush()
}