package ch03.ex3_4_1_NoOverridingForExtensionFunctions

open class View { //open修飾符是用來表示該類別可以被繼承
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
}
