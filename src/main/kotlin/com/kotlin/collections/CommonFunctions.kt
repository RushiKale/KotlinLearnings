package com.kotlin.collections

import sun.security.ec.point.ProjectivePoint
import java.util.stream.Collectors


data class Person(val name : String,val age : Int)

class CommonFunctions {
    /***
     * Constructing collections
     *          Construct from elements -> listOf<T>(), setOf<T>(), mutableListOf<T>(), mutableSetOf<T>()
     *          Create with collection builder functions -> buildList(), buildSet(), or buildMap()
     *          Empty collections -> emptyList(), emptySet(), and emptyMap()
     *          Concrete type constructors -> ArrayList or LinkedList
     *          Copy ->  toList(), toMutableList(), toSet() and others,
     *          Invoke functions on other collections -> filter(), map(), association()
     *          ----------------------------------------------------------------------------------------------
     *          Initializer functions for lists -> val list = List(3, {it+1}) OR List(5, {def_val})
     *
     *          // to be continued from -> https://kotlinlang.org/docs/ranges.html#progression
     */


    //  Construct from elements -> listOf<T>(), setOf<T>(), mutableListOf<T>(), mutableSetOf<T>()
    fun fromElements(){
        val immutableList : List<Int> = listOf(1,2,4)
        println("Immutable List $immutableList")

        val immutableSet : Set<Int> = setOf(1,2,4)
        println("Immutable Set $immutableSet")

        val mutableList : MutableList<Int> = mutableListOf(1,2,4)
        println("Mutable List $mutableList")

        val mutableSet : MutableSet<Int> = mutableSetOf(1,2,4)
        println("Mutable List $mutableSet")
    }


    //  Create with collection builder functions -> buildList(), buildSet(), or buildMap()
    fun builderFunction(){
        val lst : List<Int> = buildList {
            add(1)
            add(2)
            add(2)
            add(3)
        }
        println("Lst : $lst")

        val set : Set<Int> = buildSet {
            this.add(10)
            this.add(20)
            add(20)
            add(30)
        }
        println("Set : $set")

        val map : Map<Int,String> = buildMap {
            put(1,"One")
            put(2,"two")
        }
        println("Map : $map")

    }

    fun emptyCollections(){
        val emptyList = emptyList<Int>()
        println("Empty list  : $emptyList")
        val emptySet = emptySet<Int>()
        println("Empty Set : $emptySet")
        val emptyMap = emptyMap<Int,String>()
        println("Empty Map $emptyMap")
    }

    fun concreteConstructors(){
//        val arrayList : ArrayList<Int> = arrayListOf(1,2,3)
        val arrayList : ArrayList<Int> = ArrayList()
        println("Before adding elements : $arrayList")
        arrayList.add(1)
        arrayList.add(2)
        arrayList.add(3)

    }

    fun usingCopy(){
        val lst : List<Int> = listOf(1,2,3)
        val set : Set<Int> = lst.toSet()
        val list = set.toList()
        println("List : $lst")
        println("Set from list : $set")
        println("List from set  : $list")
    }

    fun usingFilter(){
        val lst = listOf<Int>(1,2,3,4,5,6,7,8)
        val filteredList = lst.filter { it % 2 == 0 }
        println("Filtered Even list : $filteredList")


        val set = setOf<Int>(1,2,3,4,5,6,7,8)
        val filteredSet = set.filter { it % 2 != 0 }
        println("Filtered odd set : $filteredSet")

        val map : Map<Int,String> = mapOf(Pair(1,"One"), Pair(2,"Two"))
        val filteredMap = map.filter { (key,value) -> key==1 || value == "Two" }
        println("Filtered map where key = 1 or value = two: $filteredMap")


        /**
         * types of filters ->
         *          filterIndexed(){index,it -> index = 2 && it = 2}
         *          filterNot(){it % 2 == 0}
         *          lst.filterIsInstance<String>().forEach{ ::println }
         *          filterNotNull()
         */

    }

    fun usingPartition(){
        val listOfNums = listOf<Int>(1,2,3,4,5,5,6)

        listOfNums.map {  }
        val(odd,even) = listOfNums.partition { it % 2 != 0 }
        println("ODD : $odd")
        println("EVEN : $even")

        val setOfNums = setOf<Int>(1,2,3,4,5,6,7,8)
        val(gt:List<Int>,lt:List<Int>) = setOfNums.partition { it > 5 }
        var parts:Pair<List<Int>,List<Int>> = setOfNums.partition { it > 5 }
        parts.first.forEach { print(it) }
        parts.second.forEach { print(it) }

        println("Greater than list  : ${gt + 1}")
        println("less than list : $lt")

        val hashMap:Map<Int,String> = mutableMapOf(Pair(1,"Hello"), Pair(2,"Hi"), Pair(3,"Bolo"))
        val mappedMap = hashMap.forEach{}


    }
}



fun main(){



//    val obj = CommonFunctions()
//    obj.fromElements()
//    obj.builderFunction()
//    obj.emptyCollections()
//    obj.usingCopy()
//    obj.usingFilter()
//    obj.usingPartition()
//    obj.usingPartition()



}

/*fun main(){
val cust = Cust(100,"ABC",909009)

    val(phone,name, id)=cust
    println("id:$id\tname:$name\tPhone:$phone")
val custList:List<Cust> = listOf(
    Cust(100,"1",1000),
    Cust(101,"2",3000),
    Cust(102,"3",500),
    Cust(103,"4",4000),
    Cust(104,"5",2500),
    Cust(105,"6",9000)
)
//val newList:List<String> = custList.filter { it.salary >= 2500 }.map(Cust::name)
//    val newList:List<String> = custList.filter { it.salary >= 2500 }.map{it.name}
    val newList:List<String> = custList.filter { it.salary >= 2500 }.map{ it.salary.toString()}
    print("Result::$newList")

}*/


data class Cust(val id:Int,val name:String,val salary:Long){}