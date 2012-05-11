package com.home.scala.tutorial

import java.util.regex.Pattern

/**
 * @author Anna Ivashchuk
 * @version 1.0
 * @since 10/05/2012
 */
object PatternExample {
  def main(args: Array[String]) {
    val pattern = Pattern.compile("\\s{3}")
    val matcher = pattern.matcher("   ")
    if(matcher.matches()) {
      println(matcher.replaceFirst("P"))
    }
  }
}
