package case_2

class Healer(override val name: String, private val attackPower: Int) : IHealer {
    private var health: Int = 100

    override fun heal(target: ICharacter) {
        val heal = 20
        println("$name heals ${target.name} with $heal health")
        target.setHealth(health + heal)
    }

    override fun attack(target: ICharacter) {
        val damage = attackPower
        println("$name attacks ${target.name} with $damage damage")
        target.defend(damage)
    }

    override fun defend(damage: Int) {
        var actualDamage = damage
        actualDamage -= 5

        println("$name received $actualDamage damage")
        val newHealth = getHealth() - actualDamage
        setHealth(newHealth)

        if (newHealth <= 0) {
            println("$name has been defeated")
        }
    }

    override fun getHealth(): Int {
        return health
    }

    override fun setHealth(health: Int) {
        this.health = if (health < 0) 0 else health
    }
}