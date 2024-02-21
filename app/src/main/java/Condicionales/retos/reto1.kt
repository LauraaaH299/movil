package Condicionales.retos

class Reto1 {
}

fun conversion(faren:Double): Double{
    val celsius:Double = (faren-32)/(1.8)
    return celsius

}


fun main(){
    println("Ingrese los grados en Farenheit")
    var faren= readln().toDouble()
    var celsius:Double = conversion(faren)

    println(" $faren grados Farenheit son $celsius grados Celsius  \n")

}

