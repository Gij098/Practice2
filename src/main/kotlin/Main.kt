fun main(args: Array<String>) {

    /*Задание 1
    * Создали две константы и проверили их , используя Control + Shift + P*/

    val age1  = 42
    val age2  = 21

    /*Задание 2
    * Создали константу avg1, куда запихнули среднее арифметическое age1 и age2. Использовали Control + Shift + P,
    * результат целочисленный */

    val avg1 = (age1 + age2) / 2
    println(avg1)

    /*Задание 3
    * исправили положение на веществ*/

    //val avg1 = (age1.toDouble + age2.Double) / 2


    /*Задание 4
    * создали строковые константы*/

    val firstName = "Ида"
    val lastName = "Джаркас"

    /*Задание 5
    * передали строки в одну константу */

    val fullName = "$firstName $lastName"
    println(fullName)

    /*Задание 6
    * завели константу ,которая передает конст fullName */

    val myDetails = "Привет , меня зовут " + fullName
    println(myDetails)

    /*Задание 7
    * Объявите константу Triple для обозначения даты (месяц, день, год) */

    val Triple : Triple <Int, Int, Int> = Triple (9, 9, 2023)
    println(Triple)

    /*Задание 8
    * Создали три константы и извлекли значения из Triple */

    //val month = Triple.first
    val day = Triple.second
    //val year = Triple.third


    /*Задание 9
    *В одну строку вывели значения месяца и года в две константы. */

    var (month , _ , year ) = Triple


    /*Задание 10
    * создали константу , поместили в Pair измененный месяц с существующим годом */

    val anothermonth = Pair (10, year)
    println(anothermonth)


}