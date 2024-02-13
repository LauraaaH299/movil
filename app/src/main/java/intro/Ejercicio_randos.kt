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
    //Ahora con letras
    println("Ingrese su letra")
    var letra:String= readln().toString().uppercase()
   //
    // var char ="a" downTo("u")
    var n2 = 1..10

    //
    var result:Int = (0..50).random()
    print(result)
    when (result){
        //Aqui se realiza un switch
        0-> print("No hay resultados")
        1,2,3,4,5,6 -> println("El resultado esta enre 1  y 6")
    }



}