fun main(args: Array<String>) {
 println("Vvedite dva chisla")
 var a = readln()
 var b = readln()
    var aa = a.toDouble()
    var bb = b.toDouble()
 println("Vvedite znak operatsii")
 var oper: String = readln()
 when(oper){
     "+" -> result(aa,bb,oper,::sum)
     "-" -> result(aa,bb,oper,::raznitsa)
     "*" -> result(aa,bb,oper,::umnoj)
     "/" -> result(aa,bb,oper,::delen)
 }
}

fun result(a: Double,b: Double,operator: String,operation:(a: Double,b: Double) -> Any){
    val result  = operation.invoke(a, b)
    println("$a $operator $b = $result")
}

fun sum(a: Double,b: Double):Double{
    return a + b
}

fun raznitsa(a: Double,b: Double): Double {
    return a - b
}

fun umnoj(a: Double,b: Double): Double {
    return a * b
}

fun delen(a: Double,b: Double): Double {
    return a / b
}