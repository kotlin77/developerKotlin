fun main() {

    init()
}


fun init( ){
    Person.name = "Coco77"
    Person.showName()
    
}

object Person{
    
    var name:String = ""
    
    fun showName(){
       println("el srt: $name es muy inteligente")
    }

}