fun main(){
    println("Enter Principal: ")
    val p= readLine()!!.toFloat()
    println("Enter Time: ")
    val t= readLine()!!.toFloat()
    println("Enter Rate of Interest: ")
    val r= readLine()!!.toFloat()
    val si=calculateSI(p,t,r)
    println("Simple interest is $si")

}
fun calculateSI(p:Float,r:Float,t:Float): Float{
    return (p*t*r)/100
}
