class Note  ( val title: String, val inhalt : String){
    /*
    Klasse "Note":

Eigenschaften:
Titel: Ein String, der den Titel der Notiz enthält.
Inhalt: Ein String, der den Inhalt der Notiz enthält.
Methoden:
anzeigen(): Gibt den Titel und den Inhalt der Notiz aus.
     */
fun anzeigen () {
   println("Titel:  $title")
        println("Inhalt: $inhalt")
}
}