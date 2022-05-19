fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var i = 2
    var input = br.readLine().toInt()

    while(input!=1){
        if(input%i==0){
            input/=i
            bw.write("${i}\n")
        }else{
            i++
        }
    }
    bw.flush()
}