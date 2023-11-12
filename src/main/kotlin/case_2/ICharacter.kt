package case_2

interface ICharacter {
    val name: String
    fun attack(target: ICharacter)
    fun defend(damage: Int)
    fun getHealth(): Int
    fun setHealth(health: Int)
}