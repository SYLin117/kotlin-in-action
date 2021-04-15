package ch04.ex2_1_InitializingClasses

class User(//只用小誇號設定類別
    val nickname: String,
    val isSubscribed: Boolean = true
)

class User2 constructor(_nickname: String){
    val nickname = _nickname
}

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)
    val bob = User("Bob", false)
    println(bob.isSubscribed)
    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}
