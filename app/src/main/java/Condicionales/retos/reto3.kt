
package Condicionales.retos
import kotlin.math.pow
import kotlin.math.sqrt

class reto3 {
}

fun main() {
    //parsear es pasar el dato qu eno tiene tipo a un formato
    // Método por los paréntesis

    println("Ingrese su primer número")
    var a:Double = readln().toDouble()

    println("Ingrese su segundo número")
    var b:Double = readln().toDouble()


    println("Ingrese  la operación que desea hacer")
    var operacion = readln().toString()

    if (operacion=="suma"){
        var suma:Double = a+b
        print("La suma es  $suma \n")

    }
    else if(operacion == "resta"){
        var resta:Double = a-b
        print("La resta es  $resta \n")
    }
    else if(operacion == "multiplicacion"){
        var mult:Double = a*b
        print("La multiplicación es  $mult \n")

    }
    else if(operacion == "division"){
        var div:Double = a/b
        print("La división es  $div\n")

    }

    else if(operacion == "potencia"){
        var pa:Double= a.pow(2)
        print("La potencia del primer número es $pa\n")
        var pb= a.pow(2)
        print("La potencia del primer número es $pa\n")

    }

    else if(operacion == "raiz"){
        var pa:Double= sqrt(a)
        print("La potencia del primer número es $pa\n")
        var pb= sqrt(b)
        print("La potencia del primer número es $pb\n")

    }




}
// 3 tipos de condicionales
// Los simples son el if usan los operadores lógicos de and, or negacion
// Operadores de comparación, mayor menor, igual


// Condicionales anidades
// Anidar varias, aparece el else

// COndicionales múltiples
// conocidas como switch case

