fun main() {

  val n = readline()

  var num = readline()?.toInt() ?: 0
  var num2 = readlnOrNull()?.toInt() ?:0
  var num3 = readlnOrNull()?.toDouble() ?:0.0
  var num4 = readlnOrNull()?.toFloat() ?: 0.0f
  var num5 = readlnOrNull()?.toBoolean() ?: false
  
  println("Tipo string $n")
  println("Tipo Int $num")
  println("Tipo int dnv $num2")
  println("Tipo Double $num3")
  println("Tipo float $num4")
  println("tipo Boolean $num5")
  
}