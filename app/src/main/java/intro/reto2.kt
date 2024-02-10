package intro

class reto2 {
}

fun dosisvacuna(pesobebe:Double,mesesbebe:Int): Double{

    val dosis:Double = ((pesobebe+10)*8)/(mesesbebe*10)
    return dosis


}

fun main(){
    println("Ingrese el peso del bebé")
    var peso= readln().toDouble()
    println("Ingrese los meses del bebé")
    var meses = readln().toInt()
    println("La dosis adecuada es")
     print(dosisvacuna(peso,meses))



}