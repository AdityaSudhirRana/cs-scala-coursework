import breeze.linalg._

object DenseVectorBreeze {

  def main(args: Array[String]): Unit = {

    val dv1 = DenseVector(1.0, 2.0, 3.0, 4.0, 5.0)
    val dv2 = DenseVector(5.0, 4.0, 3.0, 2.0, 1.0)

    println("Vector dv1: " + dv1)
    println("Vector dv2: " + dv2)

    val sum = breeze.linalg.sum(dv1)
    println(f"Sum = $sum%.2f")

    val mean = breeze.stats.mean(dv1)
    println(f"Mean = $mean%.2f")

    val dotProduct = dv1 dot dv2
    println(f"Dot Product = $dotProduct%.2f")

  }
}
