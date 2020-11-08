fun main(){
    print("Enter IOT marks: ")
    val iot= readLine()!!.toFloat()
    print("Enter Android marks: ")
    val and=readLine()!!.toFloat()
    print("Enter Web API marks: ")
    val web=readLine()!!.toFloat()

    val total=iot+and+web
    val percentage=total*100/300
    val res=result(percentage)
    println("Result: $res")


}
fun result(p:Float):String{
    when(p)
    {
        in 60..100 -> return "1st Division"
        in 40..59 ->  return "2nd Division"
        in 40..49 -> return "3rd Division"
        else-> return "Fail"


    }


}
