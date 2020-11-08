fun main(){
    println("Enter any real number: ")
    val n= readLine()!!.toInt()


}
fun checkOddEven(n:Int){
    val check=n%2
    if(check==0)
    {
        println("Number is even")
    }
    else
    {
        println("Number is odd")
    }
}
