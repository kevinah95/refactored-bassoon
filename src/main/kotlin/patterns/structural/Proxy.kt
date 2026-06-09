package patterns.structural

interface Sujeto {
    fun descargar(id: String): String
}

class ServicioDocumentoReal : Sujeto {
    override fun descargar(id: String): String = "Contenido del documento $id"
}

class ProxyDocumento(
    private val real: ServicioDocumentoReal = ServicioDocumentoReal(),
    private val usuarioAutorizado: Boolean = true
) : Sujeto {
    override fun descargar(id: String): String {
        if (!usuarioAutorizado) return "Acceso denegado al documento $id"
        return real.descargar(id)
    }
}
