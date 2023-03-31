class TypesOfEqualityCheck[T] {

  //Method(.equals) Returns True if two values are equal
  def equalsCheck(firstList: List[T], secondList: List[T]): Boolean = {
    firstList.equals(secondList)
  }

  //Operator(==) Returns True if two values are equal
  def doubleEqualCheck(firstList: List[T], secondList: List[T]): Boolean = {
    firstList == secondList
  }

  //Operator(!=) Returns True if two values are not equal
  def notEqualCheck(firstList: List[T], secondList: List[T]): Boolean = {
    firstList != secondList
  }

  //Method(ne) Returns True if two values have different memory locations
  def neCheck(firstList: List[T], secondList: List[T]): Boolean = {
    firstList ne secondList
  }

  //Method(eq) Returns True if two values have the same memory location
  def eqCheck(firstList: List[T], secondList: List[T]): Boolean = {
    firstList eq secondList
  }

}
