fun main() {
    val notizbuch = Notebook()
    var beenden = false

    while (!beenden){
        println("Was möchtest du tun?")
        println("1. Notizen anzeigen")
        println("2. Notiz hinzufügen")
        println("3. Notiz löschen")
        println("4. Beenden")
        val auswahl1 = readLine()

        when (auswahl1){

            "1" ->{
                println("Notizen im Notizbuch: ")
                notizbuch.anzeigen()
            }
            "2" ->{
                println("Geben Sie den Titel der Notiz ein: ")
                val titel = readLine()
                println("Geben Sie den Inhalt der Notiz ein: ")
                val inhalt = readLine()
                val neueNotiz = Note(titel ?: "", inhalt ?: "")
                notizbuch.hinzufügen(neueNotiz)
                println("Notiz hinzugefügt")
            }
            "3" -> {
                println("Geben Sie den Index der zu löschenden Notiz ein: ")
                val index = readLine()?.toIntOrNull()
                if (index != null) {
                    notizbuch.löschen(index)
                    println("Notiz gelöscht")
                } else {
                    println("Ungültiger Index.")
                }
            }
            "4" -> {
                beenden = true
                println("Anwendung beendet.")
            }
            else -> println("Ungültige Auswahl.")
        }
    }
}
