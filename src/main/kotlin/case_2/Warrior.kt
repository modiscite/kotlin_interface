package case_2

class Warrior(override val name: String, private val attackPower: Int): ICharacter {
    private var health: Int = 100

    override fun attack(target: ICharacter) {
        val damage = attackPower
        println("$name attacks ${target.name} with $damage damage")
        target.defend(damage)
    }

    override fun defend(damage: Int) {
        var actualDamage = damage
        actualDamage -= 10

        println("$name received $actualDamage damage")
        val newHealth = getHealth() - actualDamage
        setHealth(newHealth)

        if(newHealth <= 0){
            println("$name has been defeated")
        }
    }

    override fun getHealth(): Int {
        return health
    }

    override fun setHealth(health: Int){
        this.health = if (health < 0) 0 else health
    }
}