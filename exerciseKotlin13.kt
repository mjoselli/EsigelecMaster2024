// 13. Create a higher order function called operationMath that accepts two numbers 
// and a lambda function. The operacaoMatematica function must apply the lambda function to the 
// two numbers and return the result. Then create some lambda functions to perform mathematical 
// operations such as addition, subtraction, multiplication, and division. 
// Use the higher order function to perform these operations with different pairs of numbers.
fun operationMath(num1:Int, num2:Int, operation: (Int,Int) -> Int) : Int{
    return operation(num1,num2) 
}
fun testOperationMath(){
    val sum = operationMath(2,5,{ a,b -> a+b })
    println("sum is $sum")
    val minusOperation: (Int,Int) -> Int = { a,b -> a-b}
    val minus = operationMath(2,5,minusOperation)
    println("minus is $minus")
}
fun main() {
    testOperationMath()
}
