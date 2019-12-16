fun main(args: Array<String>) {

    println("Joueur 1 : Entrez un nombre\n")
    val secretNumber = readLine()!!.toInt()

    var Joueur1: Int
    var attempts=0

    while (true) {
        print("Joueur 2 : Devinez un nombre (1-50): ")
        Joueur1 = readLine()!!.toInt()

        when (Joueur1.compareTo(secretNumber)) {
            -1 -> { println("Plus grand"); attempts++ }
            0 -> { attempts++; println("Bravo ! Vous avez réussi en $attempts essais!"); return }
            1 -> { println("Plus petit"); attempts++ }
        }
    }
}
