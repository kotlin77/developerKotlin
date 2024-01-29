fun main() {
    
    var person:Person = Person()
    
    person.name = "Felipe"
    person.age = 18
    person.id = "10490..."
    person.phone = "318303.."
    
    
    println("el nombre de la persona es ${person.name}")
    person.walk()
    person.dataPrint()
    
}


class Person{
    
    var name:String = ""
    var age:Int = 0
    var id:String = ""
    var phone:String = ""
    
    
    fun walk(){
        println("la persona esta caminando...")
    }
    
    fun dataPrint(){
        var text = "Nombre: $name \nEdad: $age \nId: $id \nPhone: $phone"
        println(text)
    }
}