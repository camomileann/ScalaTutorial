package com.home.scala.tutorial

import com.home.scala.tutorial.ChecksumAccumulator.calculate

/**
 * @author Anna Ivashchuk
 * @version 1.0
 * @since 14/05/2012
 */
object Summer {
  def main(args: Array[String]) {
    for(arg <- args) {
      println(arg + ": " + calculate(arg))
    }
  }
}
