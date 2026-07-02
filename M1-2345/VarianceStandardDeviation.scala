object VarianceStandardDeviation {

  def main(args: Array[String]): Unit = {

    val numbers = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

    println("Dataset: " + numbers)

    val mean = numbers.sum.toDouble / numbers.length

    val variance = numbers.map(x => math.pow(x - mean, 2)).sum / numbers.length

    val stdDeviation = math.sqrt(variance)

    println(f"Mean = $mean%.2f")
    println(f"Variance = $variance%.2f")
    println(f"Standard Deviation = $stdDeviation%.2f")
  }
}