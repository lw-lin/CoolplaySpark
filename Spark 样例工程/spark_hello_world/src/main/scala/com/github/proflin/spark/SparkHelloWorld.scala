package com.github.proflin.spark

import org.apache.spark.{SparkContext, SparkConf}

object SparkHelloWorld {
  def main(args: Array[String]) {
    val conf = new SparkConf()
    conf.setAppName("SparkHelloWorld")
    conf.setMaster("local[2]")
    val sc = new SparkContext(conf)

    val lines = sc.parallelize(Seq("hello world", "hello tencent"))
    val wc = lines.flatMap(_.split(" ")).map(word => (word, 1)).reduceByKey(_ + _)
    wc.foreach(println)

    Thread.sleep(10 * 60 * 1000) // 挂住 10 分钟; 这时可以去看 SparkUI: http://localhost:4040
  }
}
