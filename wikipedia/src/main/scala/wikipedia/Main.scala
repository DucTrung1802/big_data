package wikipedia

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Main extends App {
  val appName = "wikipedia"
  val master = "local"

  val conf = new SparkConf().setAppName(appName).setMaster(master)
  new SparkContext(conf)
}
