//Diccionarios 

fun main() {
 	//mapas Inmutables
    val mapThePeople = mapOf("1049019557" to "felipePinto","7923090" to "Drigelio", "45621342" to "Angela")
    val mapTheNumbers = mapOf("id1" to 1, "id2" to 2,"id3" to 3,"id4" to 4)
    println("mapa: ${mapThePeople.keys}")
    println("mapa: ${mapThePeople.values}")
    
    println("mapa: ${mapTheNumbers.values}")
    // mapas Mutable
    
    val vocales = mutableMapOf("v1" to 'a',"v2" to 'e', "v3" to 'i', "v4" to 'o',"v5" to 'u')
                              
    vocales["v6"] = '@'                      
    vocales.put("v7",'%')
    vocales.set("v8",'#')
    println(vocales.values)
    println("la vocal 5 es ${vocales["v5"]}")
    println(vocales.get("v7"))
    
    vocales.remove("v7")
	println("$vocales")
    
    for(vocal in vocales) println("${vocal.value} - ${vocal.key}")
}