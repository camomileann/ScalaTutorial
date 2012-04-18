package com.home.scala.tutorial

/**
 * @author Anna Ivashchuk
 * @version 1.0
 * @since 18/04/2012
 */
object GreetingStrings {
  def main(args: Array[String]){

    val greetStrings = new Array[String](3)

    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World!\n"

    for (i <- 0 to 2)
      print (greetStrings(i))
  }
}
