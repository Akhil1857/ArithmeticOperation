object EqualityCheckDriver extends App {
  private val objectCheckEquality = new TypesOfEqualityCheck[Int] //Generic
  private val firstList = List(1, 7, 5, 4, 9, 3)
  private val secondList = List(10, 14, 15, 49, 68)

  println(objectCheckEquality.eqCheck(firstList, firstList))
  println(objectCheckEquality.neCheck(firstList, secondList))
  println(objectCheckEquality.equalsCheck(firstList, secondList))
  println(objectCheckEquality.notEqualCheck(firstList, secondList))
  println(objectCheckEquality.doubleEqualCheck(firstList, secondList))

}
