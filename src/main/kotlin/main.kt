fun main() {
    listlession()
    throLists()
//    peoplesnames()

    var a = Person("mercy", 36)
    var b = Person("Joan", 56)
    var c = Person("Maxine", 73)
    var d = Person("kate", 78)
    var e = Person("Collin", 78)
    var people2 = listOf(a,b,c,d,e)
    var aduits = people2.filter{person -> person.name.length>5}
    println(aduits)

    var sortedPeople = people2.sortedBy{person -> person.name.length>5}
    println(sortedPeople)

}


fun listlession() {
    var streams = listOf("lisaLab", "Lovelace", "AnitaB")
    println(streams)


// mutable
//    var colors = mutableListOf("Red","blue","Black","Green")
    var colors = mutableListOf<String>()
//    colors.addAll("Yellow",)
    println(colors)
    colors.add("Yellow")
    println(colors)
    colors.remove("Red")
    println(colors)


//    streams.add()//immutable
    var names = listOf("Adam", "Eve", "Cain", "Abel", 0.7)
    println(names)

}


fun throLists() {
    var nums = listOf(21, 20, 19, 19, 18, 22, 20, 23, 25)
    println(nums.maxOrNull())
    println(nums.minOrNull())
    println(nums.sum())
    println(nums.average())
    println(nums.first())
    println(nums.last())
    println(nums[4])
    println(nums.indexOf(20))
    println(nums.lastIndexOf(20))
    println(nums.count())
    println(nums.size)
    println(nums.get(5))

    var num = mutableListOf(21, 20, 19, 19, 18, 22, 20, 23, 25)
    num.add(1, 24)
    println(num)


// iterate through lists
    var names2 = listOf("Jack", "Jill", "James", "Bill", "Janet")
    names2.forEach { name -> println(name) }
    for (name in names2) {
        println(name)

// sorting list
        var sortedNames = names2.sorted()
        println(sortedNames)
        var sortedNames4 = names2.sortedDescending()
        println(sortedNames4)
        var sortedNames3 = names2.reversed()
        println(sortedNames3)



        data class Car(var make: String, var model: String)




    }
    // filtering list
    var KidsAges = listOf(4,6,3,12,13,7,12,15,8,16)
    var teenagers = KidsAges.filter { age -> age>12}

    println(teenagers)


}
// write a function that take in a list of names and returns a list of names longer that 5 character

fun listNamesLoger(){
    var pupils= listOf("maxine", "Jane", "Kate","Joan")
    var students = pupils.filter { name -> name.length>5 }
//    return students
}

data class  Person (var name:String, var age: Int)
