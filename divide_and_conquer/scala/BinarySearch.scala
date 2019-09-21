class BinarySearch {

  def search(arr: Array[Int], element: Int): Boolean = {
    def innerFunc(arr: Array[Int], startIndex: Int, endIndex: Int): Boolean = {
      if(startIndex < endIndex) {
        val midIndex = (startIndex + endIndex) / 2
        arr(midIndex) match {
          case ele if element == ele => true
          case ele if element > ele => innerFunc(arr, midIndex + 1, endIndex)
          case ele if element < ele => innerFunc(arr, startIndex, midIndex - 1)
        }
      } else
        false
    }
    innerFunc(arr, 0, arr.length - 1)
  }

}

object BinarySearch extends App {
  val obj = new BinarySearch

  // Array needs to be in sorted order
  val arr: Array[Int] = Array(1,2,3,4,5,6,7,8)

  print(obj.search(arr, 0))
}
