package case_2

interface ICharacter {
    var health: Int
    val damage: Int
    val defend: Int

    fun attack(target: ICharacter)
    fun defend(attackDamage: Int)
    fun getHealth()
}