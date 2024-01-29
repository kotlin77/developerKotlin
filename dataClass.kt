fun main() {
    init()
}

fun init(){
   var objStudent:Student = Student("felipe",192177,18)
   
   println("Nombre: ${objStudent.name}")
}

 data class Student constructor(var name:String, var code:Int, var age:Int){
        
 
 }