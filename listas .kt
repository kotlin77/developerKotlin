listas 
fun main() {
  Listas Inmutables ListOf, setOf
  Listas Mutables mutableListOf, arrayListOf, mutableSetOf
    
    
    val list = listOf(1,2,3,4,5) no se puede modificar
 	val listNumbers = mutableListOf(9,5,2,99,11)  se puede modificar
    
  
    
    listNotMutable(list)
    listMutable(listNumbers)
    
    
    listNumbers.add(1,77)

    listMutable(listNumbers)
    
    listNumbers.sort() 
    listMutable(listNumbers)

    println(listNumbers.get(3))
    listNumbers[0] = 77
    listMutable(listNumbers)
    
    number de list
    println(listNumbers.count())
    
    listNumbers.addAll(list)
   
   	listNumbers.sort()
    listMutable(listNumbers)
    listNumbers.sortDescending()
    listMutable(listNumbers)
    
     listas sin repetir valores
    
    val coco = setOf(1,1,1,2,3,4,4,4,5,5,5)
    println(coco)
    
}

fun listMutable(list ListInt){
    
println(list)
    
}

fun listNotMutable(list ListInt){
    println(list)
    
}
