package com.schneider.wc

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment

case class Person(name: String, age: Long)


// 批处理的word count
object Stream_WordCountOf_Scala {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val flintstones = env.fromElements(
      Person("Fred", 35),
      Person("Wilma", 32),
      Person("Jack", 32),
      Person("Tom", 32),
      Person("Tom1", 32),
      Person("Tom2", 32),
      Person("Tom3", 32),
      Person("Tom4", 32),
      Person("Tom5", 32),
      Person("Pebbles", 2)
    )

    val adults = flintstones.filter(_.age > 18)
    adults.print()
    env.execute
  }
}
