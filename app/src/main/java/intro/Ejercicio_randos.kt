package intro

class Ejercicio_randos {
}
fun main() {


    println("Ingrese su primer número")
    var a:Int= readln().toInt()


    if (a in 1 .. 10){ //escribir 1 .. 10 y ahí sale la suegrencia

        println("EL número está dentro del rango")


    }else{
        println("EL número  no está dentro del rango")
    }

}