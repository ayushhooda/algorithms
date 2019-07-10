name := "algorithms"

scalaVersion := "2.12.6"

version := "0.1"

lazy val commonSettings = Seq()

/**
  * Module deals with Greedy paradigm of Algorithms
  */
lazy val greedy = (project in file("greedy"))
  .settings(commonSettings)

/**
  * Module deals with Dynamic Programming paradigm of Algorithms
  */
lazy val dynamic = (project in file("dynamic"))
  .settings(commonSettings)

/**
  * Module deals with Backtracking paradigm of Algorithms
  */
lazy val backtracking = (project in file("backtracking"))
  .settings(commonSettings)

/**
  * Module deals with Divide and Conquer paradigm of Algorithms
  */
lazy val divideAndConquer = (project in file("divide_and_conquer"))
  .settings(commonSettings)

/**
  * Module deals with Branch and Bound paradigm of Algorithms
  */
lazy val branchAndBound = (project in file("branch_and_bound"))
  .settings(commonSettings)
