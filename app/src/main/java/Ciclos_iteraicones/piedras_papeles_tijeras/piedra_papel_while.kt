package Ciclos_iteraicones.piedras_papeles_tijeras

class piedra_papel_while {
}

fun main(){


    println("Ingrese  cuantas veces quiere jugar")
    var n:Int = readln().toInt()
    // piedra es 0, tijera 2, papel 1
    var i: Int = n
    while (0<i){

        println("Escriba su eleccion")
        var eleccion = readln().toString().lowercase()

        var eleccion_pc:Int = (0..2).random()


        if((eleccion == "piedra" &&  eleccion_pc == 0)||(eleccion == "papel" &&  eleccion_pc == 1)||(eleccion == "tijera" &&  eleccion_pc == 2)){
            println(eleccion_pc)
            println("Es un empate")

        }else if((eleccion == "papel" &&  eleccion_pc == 0)||(eleccion == "tijera" &&  eleccion_pc == 1)||(eleccion == "piedra" &&  eleccion_pc == 2)){
            println(eleccion_pc)

            println("Muy bien, ganaste!")
        }else{
            println(eleccion_pc)

            println("Perdiste :(. Tienes una vida menos")
            i -= 1

        }
    }


    }
