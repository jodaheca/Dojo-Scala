
object funciones {

  def main(arg: Array[String]) = {

    var lista = List(1,2,3)
    lista.map((x:Int) => println(x+4))
    var s = suma2(7,8)
    println ("valor de la suma = " + s)

    } 


    def suma(x:Int,y:Int) = x+y
    val suma2 =(x:Int,y:Int) => x+y 

}