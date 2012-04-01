package com.home.scala.tutorial

import java.util.{Locale, Date}
import java.text.DateFormat._


object FrenchDate {
  def main(args: Array[String]) {
    def now = new Date
    def df = getDateInstance(LONG, Locale.FRANCE)

    println(df format now)
  }
}