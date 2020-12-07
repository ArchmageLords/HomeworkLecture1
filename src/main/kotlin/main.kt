fun main() {
    firstVariant()
    println("\n")
    secondVariant()
    println("\n")
    thirdVariant()
}

fun firstVariant() {
    for(i in 0..100){
        if (i != 0) {
            if (i % 3 == 0 && i % 5 == 0) {
                println("Piff and Paff, $i")
            } else if (i % 3 == 0) {
                println("Piff, $i")
            } else if (i % 5 == 0) {
                println("Paff, $i")
            }
        }
    }
}

fun secondVariant() {
    val list = (0..100).toMutableList()
    list.forEach(){ it ->
        when (it != 0) {
            (it % 3 == 0 && it % 5 == 0) -> println ("Piff and Paff, $it")
            (it % 3 == 0) -> println("Piff, $it")
            (it % 5 == 0) -> println("Paff, $it")
        }
    }
}

fun thirdVariant(){
    var indexingVariable = 0
    while (indexingVariable < 100){
        if (indexingVariable != 0) {
            if (indexingVariable % 3 == 0 && indexingVariable % 5 == 0) {
                println("Piff and Paff, $indexingVariable")
            } else if (indexingVariable % 3 == 0) {
                println("Piff, $indexingVariable")
            } else if (indexingVariable % 5 == 0) {
                println("Paff, $indexingVariable")
            }
        }
        indexingVariable += 1
    }
}