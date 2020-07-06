package lazday

fun main(){

    testCollection()
}

fun getHello(){
    println("Hello Kotlin")
}

fun testVariable(){

    // variabel yang tidak bisa diubah
    val url="192.168.5.254/mikrotik/"

    // variabel yang bisa diubah
    var name="tio"

    println(url)
    println(name)

}

fun testDataTypes(){
    var intro:String="Hello My Name Is"
    var name:String="Tio"
    var age:Int=23

    println(intro+" "+name+" "+ "Umur Saya : "+age)
}

// Materi Pembahasan Control flow

fun testIf(){
    val minAge:Int=20
    val tioAge:Int=23

    if(tioAge>minAge){
        println("Tio is accepted")
    }else{
        println("Tio is rejected")
    }
}

fun testWhen(){
    val joeLevel: String = "hard"

    when(joeLevel){
        "beginner"->print("Joe has a basic skill")
        "medium"->print("Joe has a intermediet skill")
        "hard"->print("Joe has a expert skill")
        else->print("Joe has no skill")
    }
}

fun testFor(){
    for(x in 1 until 10) println(x)

    for(x in 1..10) println(x)

    for(x in 1..10 step 2) println(x)
}


fun testCollection(){

    // Menggunakan Array Of

    val names= arrayOf("tio","sigit","ridho")

    for(name in names) println(name)

    val nameList= arrayListOf<String>()
    nameList.add("tiar")
    nameList.add("aji")
    nameList.add("raffi")

    for(name in nameList) println(name)
}