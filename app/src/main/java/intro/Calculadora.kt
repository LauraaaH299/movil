package intro
import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {
}

fun main() {

    println("Ingrese su primer número")
    var a:Double = readln().toDouble()

    println("Ingrese su segundo número")
    var b:Double = readln().toDouble()

    println("Ingrese  la operación que desea hacer")
    var operacion = readln().toString().lowercase()



    when (operacion){
        //Aqui se realiza un switch
        "suma"->   print("La suma es ${a+b}")

        "resta" -> print("La resta es ${a-b}")

        "multiplicacion" -> print("La resta es ${a*b}")

        "division" -> print("La resta es ${a/b}")

        "potencia" -> print("Los números al cuadrado son ${a.pow(2)} y ${b.pow(2)}")

        "raiz" -> print("La raíz de los números son ${sqrt(a)} y ${sqrt(b)}")

        else -> print("No se reconoce la operación")

    }
}