package case_2

class Assassin: ICharacter{
    override var health: Int = 70
    override val damage: Int = 30
    override val defend: Int = 5

    override fun attack(target: ICharacter) {
        val damageDealt = damage - target.defend
        target.health -= damageDealt
        println("Assassin swings a dagger for $damageDealt damage!")
    }

    override fun defend(attackDamage: Int) {
        health -= attackDamage
        println("Assassin use defends, damage reduced to $attackDamage damage!")
    }

    override fun getHealth() {
        println("Assasin current health is $health")
    }
}