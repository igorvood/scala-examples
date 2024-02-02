package ru.vood.apps.compreh

class Forr {

  def forComreh(): Unit ={
    val intOrString =
      for {
      o1 <- one()
      o2 <- two(o1)
      o2Eq = twoEq(o2)
      o3 <- three(o2Eq)
      o4 <- four(o3)
    } yield o4

//    val executionTimeList = List(("test 1", 100), ("test 2", 230))
//    val numberOfAssertsWithExecutionTime: List[(String, Int, Int)] =
//      for {
//        result <- results
//        (id, time) <- executionTimeList
//        if result.id == id
//      } yield ((id, result.totalAsserts, time))

  }


  def flatM(): Unit ={
    one()
      .flatMap(o1 =>
        two(o1)
          .map { o2 => val o2Eq = twoEq(o2); (o2, o2Eq) }
          .flatMap { case (o2, o2Eq) =>
            three(o2Eq)
              .flatMap(o3 =>
                four(o3)
                  .map(o4 => o4)
              )
          }
      )

  }



  def one(): Either [Int, String] = Right("1")

  def two(s: String): Either [Int, String] = Right("2")

  def twoEq(s: String): Either [Int, String] = Right("2eq")

  def three(s: Either [Int, String]): Either [Int, Boolean] = Right(false)

  def four(s: Boolean): Either [Int, Boolean] = Right(s)


}
