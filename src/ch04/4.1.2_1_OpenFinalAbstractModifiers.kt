package ch04.ex1_2_1_OpenFinalAbstractModifiers

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable { //kotlin類別預設是final,需要設定open才可以繼承

    fun disable() {} //final fun

    open fun animate() {} // open fun

    override fun click() {} // 因為覆寫一個open函式,所以也是open,但是可以指定為final
}
