package case_2

class Warrior: ICharacter{
    override var health: Int = 100
    override val damage: Int = 20
    override val defend: Int = 15

    override fun attack(target: ICharacter) {
        val damageDealt = damage - target.defend
        target.health -= damageDealt
        println("Warrior swings a heavy sword for $damageDealt damage!")
    }

    override fun defend(attackDamage: Int) {
        val damageBlocked = minOf(defend, attackDamage)
        health -= attackDamage - damageBlocked
        println("Warrior use defends, blocking $damageBlocked damage!")
    }

    override fun getHealth() {
        println("Warrior current health is $health")
    }
}