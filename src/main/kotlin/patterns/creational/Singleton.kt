package patterns.creational

object RegistroConfiguracion {
    private var entorno: String = "dev"

    fun leerEntorno(): String = entorno

    fun cambiarEntorno(nuevoEntorno: String) {
        entorno = nuevoEntorno
    }
}
