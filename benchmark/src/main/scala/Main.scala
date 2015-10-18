package com.jsuereth.collections

import scala.scalajs.js

object Main extends js.JSApp {
  def main: Unit = {
    println("Hello World")
    OptimiseBenchmark.main(Array())
    // SliceBenchmark.main(Array())
    // StagedCollectionOpsBenchmark.main(Array())

  }
}