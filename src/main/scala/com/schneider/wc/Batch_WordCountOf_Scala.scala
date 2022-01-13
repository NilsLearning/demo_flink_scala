package com.schneider.wc

import org.apache.flink.api.scala.ExecutionEnvironment
import org.apache.flink.api.scala._

// 批处理的word count
object Batch_WordCountOf_Scala {
  def main(args: Array[String]): Unit = {
    // 创建一个批处理的执行环境
    val env = ExecutionEnvironment.getExecutionEnvironment

    // 从文件中读取数据
    val inputPath =
      "D:\\item\\code\\ems\\demo_flink_scala\\src\\main\\resources\\hello.txt"
    val inputDataSet = env.readTextFile(inputPath)

    // 对数据进行转换处理统计，先分词，再按照word进行分组，最后进行聚合统计
    val resultDataSet = inputDataSet
      .flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(0) // 以第一个元素作为key，进行分组
      .sum(1) // 对所有数据的第二个元素求和

    // 打印输出
    resultDataSet.print()
  }
}
