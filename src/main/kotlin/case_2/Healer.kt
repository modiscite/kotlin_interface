package case_2

class Healer: ICharacter {
    override var health: Int = 60
    override val damage: Int = 5
    override val defend: Int = 5
    val heal: Int = 10

    override fun attack(target: ICharacter) {
        val damageDealt = damage - target.defend
        target.health -= damageDealt
        println("Healer swings a staff for $damageDealt damage!")
    }

    override fun defend(attackDamage: Int) {
        health -= attackDamage
        println("Healer use defends, damage reduced to $attackDamage damage!")
    }

    override fun getHealth() {
        println("Healer current health is $health")
    }

    fun heal(target: ICharacter){
        println("Healer use heals!")
        target.health += heal
    }
}