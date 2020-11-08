fun main(){
    //val: value cannot be reassigned (immutable)
    //var :variable (it can be reassigned-mutable)
    //User input
    println("Enter first number: ")
    val a=readLine()!!.toInt() //!! ensures input isn't null
    println("Enter second number: ")
    val b=readLine()!!.toInt()
   // val c=add(a,b)
    mult(a,b)
    //String interpolation
   // println("sum of $a and $b is $c")
}
//Function with return type
fun add(a: Int, b:Int):Int{
    return a+b
}
//function with no return type
fun mult(a:Int,b:Int){
    val c=a*b
    println("Multi of $a and $b is $c")
}
//changes