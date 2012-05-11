package com.home.scala.tutorial

import io.Source

/**
 * @author Anna Ivashchuk
 * @version 1.0
 * @since 11/05/2012
 */
object FileWorkFormatted {
  def main(args: Array[String]) {
    if(args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines().toList

      /*var maxWidth = 0
      for(line <- lines) {
        maxWidth = maxWidth.max(widthOfLength(line))
      }*/
      val longestLine = lines.reduceLeft(
        (a, b) => if(a.length > b.length) a else b
      )

      val maxWidth = widthOfLength(longestLine)

      for (line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + "|" + line)
      }

      println("Max: " + maxWidth)
    } else {
      Console.err.println("Enter file name, please!")
    }
  }

  def widthOfLength(s: String) = s.length.toString.length
}
