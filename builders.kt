fun main() {
init()
}
    fun init(){
        var person:Person = Person("felipe",-18,"3183038","189233")
/*
        var listPeople:MutableList<Person> = mutableListOf()

        listPeople.add(person)

        listPeople.add(Person("coco",18,"2462","7777774"))
        listPeople.add(Person("Drigelio",50,"318344","222222222222222222"))
        listPeople.add(Person("Angela",45,"52782","2782"))
        listPeople.add(Person("Leidy",29,"762","2772"))
        
		for(people in listPeople) println("Nombre: ${people.dataPrint()}")
        
     */
     person.dataPrint()
        
    }
    
    class Person constructor(name: String, age: Int, phone: String, id: String) {

    var name:String = name
    var age:Int = age
    var phone:String = phone
    var id:String = id


    constructor():this("",0,"",""){
        println("Estas en el constructor...")
    }
        
        
    init {
        println("Antes de ajustar la edad $age")
        if (age < 0) this.age = 0
    }

    fun walk() {
        println("la persona esta caminando...")
    }
    
    

    fun dataPrint() {
        var texto = "Nombre: $name \nEdad: $age \nIdentificació: $id \nTelefono: $phone"
        println("$texto")
    }
    
    }