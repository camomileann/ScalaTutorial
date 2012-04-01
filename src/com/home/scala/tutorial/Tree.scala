package com.home.scala.tutorial

/**
 * DATE: Anna Ivashchuk
 * USER: 01.04.12
 */

abstract class Tree {
  case class Sum(l: Tree, r: Tree) extends Tree
  case class Var(n: String) extends Tree
  case class Const(v: Int) extends Tree
}
