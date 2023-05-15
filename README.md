# Notizbuch-App

Eine einfache Konsolenanwendung, mit der Benutzer Notizen erstellen, anzeigen und löschen können.

## Funktionalitäten

- Anzeigen von Notizen im Notizbuch
- Hinzufügen neuer Notizen
- Löschen von Notizen basierend auf dem Index

## Anleitung

1. Klonen Sie das Repository auf Ihren lokalen Computer.
2. Öffnen Sie das Projekt in Ihrer bevorzugten Entwicklungsumgebung.
3. Navigieren Sie zur `Main.kt`-Datei und führen Sie sie aus.
4. Wählen Sie die entsprechenden Optionen, um die gewünschten Aktionen auszuführen.
5. Folgen Sie den Anweisungen in der Konsolenausgabe.

## Technologien

- Kotlin

## Autoren

- Vorname Nachname <email@example.com>

## Lizenz

Dieses Projekt ist unter der [MIT-Lizenz](LICENSE) lizenziert.

## Pseudocode

Klasse Note:
    Eigenschaften:
        - Titel
        - Inhalt
    
    Methode anzeigen():
        Gib den Titel und den Inhalt der Notiz aus

Klasse Notebook:
    Eigenschaften:
        - Notizen (eine Liste von Note-Objekten)
    
    Methode anzeigen():
        Wenn Notizen nicht leer sind:
            Für jede Notiz in Notizen:
                Rufe die Methode anzeigen() der Notiz auf
        Sonst:
            Gib "Keine Notizen vorhanden" aus
    
    Methode hinzufügen(notiz):
        Füge die übergebene Notiz zur Liste Notizen hinzu
    
    Methode löschen(index):
        Wenn index innerhalb des gültigen Bereichs der Liste Notizen liegt:
            Entferne die Notiz mit dem entsprechenden Index aus der Liste
    
Notizbuch = neues Notebook()

Schleife, bis der Benutzer die Anwendung beendet:
    Gib das Menü aus:
        1. Notiz anzeigen
        2. Notiz hinzufügen
        3. Notiz löschen
        4. Beenden
        
    Benutzerwahl = Eingabe der Benutzerwahl
    
    Wenn Benutzerwahl gleich 1:
        Notizbuch.anzeigen()
    
    Wenn Benutzerwahl gleich 2:
        Titel = Eingabe des Notiztitels
        Inhalt = Eingabe des Notizinhalts
        NeueNotiz = neues Note-Objekt mit Titel und Inhalt
        Notizbuch.hinzufügen(NeueNotiz)
    
    Wenn Benutzerwahl gleich 3:
        Index = Eingabe des Index der zu löschenden Notiz
        Notizbuch.löschen(Index)
    
    Wenn Benutzerwahl gleich 4:
        Beende die Schleife
    
Ende der Anwendung
