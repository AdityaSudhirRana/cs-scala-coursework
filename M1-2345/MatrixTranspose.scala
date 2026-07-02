import breeze.linalg._

object MatrixTranspose {

  def main(args: Array[String]): Unit = {

    val matrix = DenseMatrix(
      (1.0, 2.0, 3.0),
      (4.0, 5.0, 6.0),
      (7.0, 8.0, 9.0)
    )

    println("Original Matrix:")
    println(matrix)

    println("\nTranspose:")
    println(matrix.t)

    println("\nDeterminant:")
    println(det(matrix))
  }
}