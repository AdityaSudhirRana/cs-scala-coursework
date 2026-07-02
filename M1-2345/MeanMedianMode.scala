object MeanMedianMode {

  def main(args: Array[String]): Unit = {

    val numbers = List(12, 15, 18, 20, 15, 10, 15, 22)

    println("Numbers: " + numbers)

    val mean = numbers.sum.toDouble / numbers.length
    println("Mean = " + mean)

    val sorted = numbers.sorted

    val median =
      if (sorted.length % 2 == 0)
        (sorted(sorted.length / 2 - 1) + sorted(sorted.length / 2)) / 2.0
      else
        sorted(sorted.length / 2)

    println("Median = " + median)

    val mode = numbers.groupBy(identity).maxBy(_._2.size)._1

    println("Mode = " + mode)
  }
}