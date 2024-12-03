// 2. Create a function that receives an array of integers and returns the largest number. 
fun maxNumber(numbers: IntArray):Int{
    var max = numbers[0]
    for(num in numbers){
        if(num > max){
            max = num
        }
    }
    return max
}
fun testMaxNumber(){
   val max1 = maxNumber(intArrayOf(3,55,121,2,66,78)) 
   println("max1 is $max1")
   val max2 = maxNumber(numbers = intArrayOf(33,5,1,102,656,89)) 
   println("max2 is $max2")
}
fun main() {
	testMaxNumber()
}
