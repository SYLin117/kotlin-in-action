package ch04.main

class Button : Clickable, Focusable {//同時implements兩個interface
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff() // 兩個相同名稱的fun都需要實作
        super<Focusable>.showOff()
    }
}

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}
