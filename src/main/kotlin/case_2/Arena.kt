package case_2

import case_1.animals.Cat

fun main() {
    val warrior = Warrior()
    val assassin = Assassin()
    val healer = Healer()

    warrior.attack(assassin)
    assassin.getHealth()
    warrior.attack(assassin)
    assassin.getHealth()
    healer.heal(assassin)
    assassin.getHealth()
}