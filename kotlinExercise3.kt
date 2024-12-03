// 3. Create a class called "Person" with attributes "name" and "age". 
// Then create a list of "Person" objects and sort the list alphabetically by the "name" attribute. 
class Person(var name: String,var age: Int){
    public var address = ""
    constructor(name: String,age: Int,address:String) :this(name,age){
        this.address = address
    }
    override fun toString() : String{
        return "My name is $name and my age is $age \n"
    }
}
fun testPerson(){
    val people = arrayListOf(
    	Person("Mark",43),
        Person(age = 3,name = "Isadora"),
        Person(name = "Pierre",age = 55)
    )
    people.sortByDescending{ it.age }
    println(people)
}
fun main() {
	testPerson()
}
