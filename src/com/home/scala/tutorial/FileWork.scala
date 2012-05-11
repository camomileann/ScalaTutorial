package com.home.scala.tutorial

import io.Source

/**
 * @author Anna Ivashchuk
 * @version 1.0
 * @since 11/05/2012
 */
object FileWork {
  def main(args: Array[String]) {
    if(args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines())
      println(line.length + " " + line)
    } else {
      Console.err.println("Please enter file name")
    }
  }

  def widthOfLength(s: String) = s.length.toString.length
}
