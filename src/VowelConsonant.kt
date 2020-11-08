fun main(){
    print("Enter a character: ")
    val v= readLine()!![0]
    //val ans=check(v)
    //println("Character $v is $ans")
    checkwithswitch(v)

}
fun check(a:Char):String{
    val c:String
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        return "Vowel"
    else
        return "Consonant"
}
fun checkwithswitch(chr:Char){
    when(chr){
        'a','e','i','o','u'->
            println("Vowel")
        else ->
            print("Consonant")
    }
}