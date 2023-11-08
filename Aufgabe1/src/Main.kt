fun main() {
    val meinAuto = Auto("Volkswagen", "Golf")
    val meinFahrzeug = Fahrzeug("Fahrrad")
    pruefeFahrzeugUndDruckeDetails(meinAuto)
    pruefeFahrzeugUndDruckeDetails(meinFahrzeug)
    pruefeFahrzeugUndDruckeDetails(null)
    pruefeUndCasteFahrzeug(meinAuto)
    pruefeUndCasteFahrzeug(meinFahrzeug)
}

fun pruefeFahrzeugUndDruckeDetails(fahrzeug: Fahrzeug?) {
    // Füge hier deine Implementierung ein.
    if (fahrzeug is Auto) {
        // Dank Smart Cast kann direkt auf die Eigenschaft modell zugegriffen werden.
        println("Das Auto ist ein ${fahrzeug.marke} ${fahrzeug.modell}.")
    } else if (fahrzeug != null) {
        println("Das ist kein Auto, sondern ein anderes Fahrzeug der Marke ${fahrzeug.marke}.")
    } else {
        println("Das Fahrzeug ist null und kann nicht geprüft werden.")
    }
}

// Funktion, die ein 'Fahrzeug' Objekt entgegennimmt und versucht, es sicher in ein 'Auto' zu casten
fun pruefeUndCasteFahrzeug(fahrzeug: Fahrzeug) {
    // Versuche das Fahrzeug-Objekt zu einem Auto-Objekt zu casten
    val auto = fahrzeug as? Auto
    // Überprüfe, ob der Cast erfolgreich war und gib entsprechendes Feedback aus
    if (auto != null) {
        // Cast erfolgreich, gib die Marke und das Modell des Autos aus
        println("Das Fahrzeug ist ein Auto der Marke ${auto.marke} und dem Modell ${auto.modell}.")
    } else {
        // Cast nicht erfolgreich, gib eine Meldung aus, dass das Fahrzeug kein Auto ist
        println("Das Fahrzeug ist kein Auto.")
    }
}