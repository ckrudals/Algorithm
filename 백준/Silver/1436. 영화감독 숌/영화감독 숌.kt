fun main(){
    val num = readLine()!!.toInt()
    var count = 1
    for(i in 0 until 10000000){
        if("666" in i.toString()){ // 666이라는 문자열이 있는지 체크
            if(count==num){
                println(i)
                break
            }
            count++
        }
    }
}
