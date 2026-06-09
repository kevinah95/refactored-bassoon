package patterns.structural

interface Componente {
    fun renderizar(nivel: Int = 0): String
}

class Archivo(
    private val nombre: String
) : Componente {
    override fun renderizar(nivel: Int): String = "${"  ".repeat(nivel)}- $nombre"
}

class Carpeta(
    private val nombre: String
) : Componente {
    private val hijos = mutableListOf<Componente>()

    fun add(componente: Componente) {
        hijos += componente
    }

    override fun renderizar(nivel: Int): String {
        val lineas = mutableListOf("${"  ".repeat(nivel)}+ $nombre")
        hijos.forEach { lineas += it.renderizar(nivel + 1) }
        return lineas.joinToString("\n")
    }
}
