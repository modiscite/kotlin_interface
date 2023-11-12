package case_2

import case_1.animals.Cat

fun main() {
    val heroes1 = Warrior("Liu", 40)
    val healer1 = Healer("Aria", 10)
    val heroes2 = Warrior("Yor", 22)

    heroes1.attack(heroes2)
    println(heroes2.getHealth())
    healer1.heal(heroes2)
    println(heroes2.getHealth())
}