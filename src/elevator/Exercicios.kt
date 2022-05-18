import kotlin.math.abs

internal fun elevator(right: Int, left: Int, call: Int): String{
    val difRight = abs(call - left)
    val difLeft = abs(call - right)
    return if(difLeft<difRight) "left" else "rigth"

}

internal fun thread(number: Int){
  val thread = Thread(
      Runnable { run {
              for(returnA in 0..100){
                  println(returnA) } }
      })
    thread.start()
}

fun main(){
    thread(2)
    elevator(2, 4, 5)
}