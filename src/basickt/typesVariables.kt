package basickt

class typeVariables {

}

fun maximeVariables() {
    println("max Double ${Double.MAX_VALUE} - min  ${Double.MIN_VALUE}]")
    println("max Long ${Long.MAX_VALUE} - min  ${Long.MIN_VALUE}]")
    println("max Int ${Int.MAX_VALUE} - min  ${Int.MIN_VALUE}]")
    println("max Byte ${Byte.MAX_VALUE} - min  ${Byte.MIN_VALUE}]")
    println("max Float ${Float.MAX_VALUE} - min  ${Float.MIN_VALUE}]")
    println("max UInt ${UInt.MAX_VALUE} - min  ${UInt.MIN_VALUE}]")
    println("max UByte ${UByte.MAX_VALUE} - min  ${UByte.MIN_VALUE}]")


}

fun main() {
    maximeVariables()
    var types: Int? = 23
    var typesFloat: Float = 2.3f
    var typesDouble: Double = 1.2
    var typesBoolean: Boolean
    var typeChar: Char
    var typeByte: Byte
    var typeLong: Long
    var idadeSer = 34

    //unsigned
    val unsigned : UInt = 10u
    val byte : UByte = 10u
}