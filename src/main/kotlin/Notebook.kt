class Notebook {

    /*
    Klasse "Notebook":

Eigenschaften:
Notizen: Eine Liste von Note-Objekten, die die gespeicherten Notizen enthält.
Methoden:
anzeigen(): Gibt alle Notizen im Notebook aus.
hinzufügen(notiz): Fügt eine neue Note dem Notebook hinzu.
löschen(index): Löscht eine Note aus dem Notebook basierend auf dem Index.

     */
    val notizen : MutableList<Note> = mutableListOf()
    fun anzeigen (){
if (notizen.isEmpty()) {
    println("Notizen empty")
} else {
    for ((index, note) in notizen.withIndex()) {
        println("Note: $index ")
        note.anzeigen()
    }
}
    }
    fun hinzufügen(notiz: Note){
       notizen.add(notiz)
        println("Notiz Hinzufügt")
    }

    fun löschen(index: Int){
        if (index in 0 until notizen.size){
            notizen.removeAt(index)
            println("Notiz hat gelöschet")
    } else {
        println("Ungülting Index")
    }
}}