object ultimate extends App {  object Calculator {    def apply(): Calculator = new Calculator()  };  class Calculator() {    def add(x: Int, y: Int): Integer = x + y;    def subtract(x: Int, y: Int): Integer = x + y;    def multiply(x: Int, y: Int): Integer = x * y;    def divide(x: Int, y: Int): Integer = x / y;  };  val calc = Calculator();  println(calc.multiply(69, 6));};