import scala.util.Random

object TimeSeriesAnalysis {

  def main(args: Array[String]): Unit = {

    // Generate synthetic daily sales data for 30 days
    val random = new Random()

    val salesData = (1 to 30).map { day =>
      val sales = 4500 + random.nextInt(2500)
      (day, sales)
    }

    println("Daily Sales Data:")
    println("-----------------")

    salesData.foreach {
      case (day, sales) =>
        println(s"Day $day: Rs. $sales")
    }

    // Calculate total sales
    val totalSales = salesData.map(_._2).sum

    // Calculate average daily sales
    val averageSales = salesData.map(_._2).sum.toDouble / salesData.length

    // Find minimum sales
    val minimumSales = salesData.map(_._2).min

    // Find maximum sales
    val maximumSales = salesData.map(_._2).max

    println("\nTime Series Analysis:")
    println("---------------------")
    println(s"Total Sales: Rs. $totalSales")
    println(f"Average Daily Sales: Rs. $averageSales%.2f")
    println(s"Minimum Daily Sales: Rs. $minimumSales")
    println(s"Maximum Daily Sales: Rs. $maximumSales")
  }
}
