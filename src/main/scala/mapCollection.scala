object mapCollection extends App {  val ratings = Map("Lady in the Water" -> 3.0,    "Snakes on a Plane" -> 4.0,    "You, Me and Dupree" -> 3.5);  for ((x, y) <- ratings) {    println(s"Name: $x   Rating : $y");  }}