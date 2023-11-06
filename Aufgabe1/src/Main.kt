fun main() {
    val meinAuto = Auto("Volkswagen", "Golf")
    val meinFahrzeug = Fahrzeug("Fahrrad")
    pruefeFahrzeugUndDruckeDetails(meinAuto)
    pruefeFahrzeugUndDruckeDetails(meinFahrzeug)
    pruefeFahrzeugUndDruckeDetails(null)
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