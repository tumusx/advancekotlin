import kotlin.math.abs

internal fun elevator(right: Int, left: Int, call: Int): String{
    val difRight = abs(call - left)
    val difLeft = abs(call - right)
    return if(difLeft<difRight) "left" else "rigth"

}

fun main(){
    elevator(2, 4, 5)
}