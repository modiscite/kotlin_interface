package case_1.animals

import case_1.interfaces.IAnimal

class Cat: IAnimal {
    override fun makeSound() {
        println("Meow!")
    }

    override fun habitat() {
        println("Cat habitat is Everywhere!")
    }

    override fun favouritePlace(): String {
        return "Everywhere!"
    }
}