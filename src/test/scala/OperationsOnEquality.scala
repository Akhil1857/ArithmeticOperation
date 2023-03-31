import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class OperationsOnEquality extends AnyFlatSpec with Matchers{

  val objectCheckQuality = new TypesOfEqualityCheck[Int]

  "equalsCheck" should "performs the (.equals) and return the result" in{
    val firstList = List(1, 7, 5, 4, 9, 3)
    val secondList = List(10, 14, 15, 49, 68)
    val result:Boolean =objectCheckQuality.equalsCheck(firstList,secondList)
    result shouldBe false
  }

  "doubleEqualCheck" should "performs the (==) and return the result" in {
    val firstList = List(1, 7, 5, 4, 9, 3)
    val secondList = List(1, 7, 5, 4, 9, 3)
    val result: Boolean = objectCheckQuality.doubleEqualCheck(firstList,secondList)
    result shouldBe true
  }

  "notEqualCheck" should "performs the (!=) and return the result" in {
    val firstList = List(1, 7, 5, 4, 9, 3)
    val secondList = List(1, 7, 5, 4, 9, 3)
    val result: Boolean = objectCheckQuality.notEqualCheck(firstList, secondList)
    result shouldBe false
  }

  "neCheck" should "performs the (ne) and return the result" in {
    val firstList = List(1, 7, 5, 4, 9, 3)
    val secondList = List(1, 7, 5, 4, 9, 3)
    val result: Boolean = objectCheckQuality.neCheck(firstList, secondList)
    result shouldBe true
  }

  "eqCheck" should "performs the (eq) and return the result" in {
    val firstList = List(1, 7, 5, 4, 9, 3)
    val result: Boolean = objectCheckQuality.eqCheck(firstList, firstList)
    result shouldBe true
  }


}
