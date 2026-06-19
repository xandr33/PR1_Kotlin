//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Enter your body weight: ")
        val mas = readln().toInt()

    println("Enter height: ")
        val hide = readln().toDouble()

   val index = mas / hide

    println("The body mass index is = $index")
}