package ch03.ex3_4_2_NoOverridingForExtensionFunctions1

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!") // 繼承函式無法被override

fun main(args: Array<String>) {
    val view: View = Button()
    view.showOff()
}
