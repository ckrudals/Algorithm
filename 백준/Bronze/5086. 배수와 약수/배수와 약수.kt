fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    while(true){
        val (a,b) = br.readLine().split(" ").map{it.toInt()}

        when{
            a==0 && b == 0 -> break
            a%b==0 -> bw.write("multiple\n")
            b%a==0 -> bw.write("factor\n")
            else -> bw.write("neither\n")
        }


    }
    bw.flush()
}