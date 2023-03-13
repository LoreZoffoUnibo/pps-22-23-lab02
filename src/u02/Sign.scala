package u02

object Sign extends App:

  val f: Int => String = _ match
    case x if x >= 0 => "positive"
    case x if x < 0 => "negative"

  println(f(1))
