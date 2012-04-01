package com.home.scala.tutorial

/**
 * DATE: Anna Ivashchuk
 * USER: 01.04.12
 */

class Complex(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary

  override def toString =
    "" + re + (if (im < 0) "" else "+") + im +"i"
}