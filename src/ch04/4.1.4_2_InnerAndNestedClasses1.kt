package ch04.ex1_4_2_InnerAndNestedClasses1

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer //inner class可以參考外部類別
    }
}
