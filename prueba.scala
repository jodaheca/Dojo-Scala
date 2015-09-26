
import Array._
object dojo {

  var nombre = "Impreso desde afuera"

  def main(arg: Array[String]) = {

    var array2 = ("Hola","Mundo")
    var array3 = (1,2,3,4)
    var array1 = new Array[Int](3)
    var matriz = ofDim[Int](2,2)

    var s = suma2(7,8)
    println ("valor de la suma= " + s)
    array1(0) = 1
    array1(1) = 2
    array1(2) = 3
    println("Arreglo")

    for( i <- 0 to array1.length-1) {
      println(array1(i))
    }

    // for( i <- 0 to 1) {
    //   for( j <- 0 to 1) {
    //     println(matriz(i)(j))
    //   }
      
    // }
    // println("Valor almacenado en la posicion 0 "+array1(0))

    // var sum1 = 2
    // var sum2 = 3
    // var sumaT = suma(sum1,sum2)
    // println("Suma = " + sumaT)
     

    }  
    def suma(x:Int,y:Int) = x+y
    val suma2 =(x:Int,y:Int) => x+y 

}

//println(dojo.nombre);