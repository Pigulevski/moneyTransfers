import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("- Денежные переводы -")
    println("1. Перевод с карты(комиссия 0.75%, минимум 35 рублей)")
    println("2. Перевод с VK Pay(комиссия не взымается)")
    println("3. Завершить")
    println()
    while (true) {
        print("Введите номер операции:")
        val operationNumber: Int = scanner.nextInt()
        if (operationNumber == 1) {
            print("Введите сумму перевода:")
            val amount: Int = scanner.nextInt()
            val many = amount * 0.75 /10_000
            if (many > 35) {
                val rubles = many / 1
                val kopecks = many % 1 * 10
                println("Комиссия составит: ${"%.0f".format(rubles)} руб. ${"%.0f".format(kopecks)} коп.")
            } else {
                println("Комиссия составит: 35 руб. 0 коп.")
            }
        } else if (operationNumber == 2) {
            println("Комиссия не взымается")
        }else if (operationNumber == 3) {
            break
        }else {
            println("Не верная операция")
        }
    }
}