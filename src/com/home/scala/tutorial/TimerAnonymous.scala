package com.home.scala.tutorial

/**
 * USER: Anna Ivashchuk
 * DATE: 01/04/12
 */

object TimerAnonymous {

  def main(args: Array[String]) {
    timer(() => println("Hello, Anna"))
  }

  def timer(callback: () => Unit) {
    while (true) {
      callback()
      Thread.sleep(1000)
    }
  }


}
