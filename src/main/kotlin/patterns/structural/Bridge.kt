package patterns.structural

interface Implementacion {
    fun exportar(datos: String): String
}

class ImplementacionTexto : Implementacion {
    override fun exportar(datos: String): String = "TXT: $datos"
}

class ImplementacionHtml : Implementacion {
    override fun exportar(datos: String): String = "<html>$datos</html>"
}

abstract class Reporte(protected val implementacion: Implementacion) {
    abstract fun generar(): String
}

class ReporteSimple(implementacion: Implementacion) : Reporte(implementacion) {
    override fun generar(): String = implementacion.exportar("Reporte simple")
}

class ReporteDetallado(implementacion: Implementacion) : Reporte(implementacion) {
    override fun generar(): String = implementacion.exportar("Reporte detallado con todos los datos")
}
