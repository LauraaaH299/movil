package intro

class Cara_sello {



}
// En este programa cara es uno y sello es cero
fun main() {
    println("Cuantas veces quiere jugar")
    var n: Int = readln().toInt()
    var i: Int = 0
    while (i<n){
        println("Escriba cara o sello")
        var eleccion = readln().toString().lowercase()
        var eleccion_pc:Int = (0..1).random()

        if(eleccion == "cara" &&  eleccion_pc == 1){
            println("Muy bien, ganaste!")

        }else if(eleccion == "sello" &&  eleccion_pc == 0){

            println("Muy bien, ganaste!")
        }else{

            println("Perdiste :(")
        }

        i +=1


    }


}