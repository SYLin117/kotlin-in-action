package ch03.ex3_3_3_UtilityFunctionsAsExtensions2

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) { //this為接收端物件 此處表示為Collection<T>
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)


fun main(args: Array<String>) {
    println(listOf("one", "two", "eight").join(" "))
//    println(listOf(1, 2, 3).join(" ")) //因為上面宣告是<String>
}
