object PolynomialFeatures {

  def main(args: Array[String]): Unit = {

    // Input dataset
    val numbers = List(1, 2, 3)

    // Generate polynomial features up to degree 3
    val polynomialFeatures = numbers.flatMap { number =>
      (1 to 3).map { degree =>
        Math.pow(number, degree).toInt
      }
    }

    println("Original Dataset:")
    println(numbers.mkString("[", ", ", "]"))

    println("\nPolynomial Features up to Degree 3:")
    println(polynomialFeatures.mkString("[", ", ", "]"))
  }
}
