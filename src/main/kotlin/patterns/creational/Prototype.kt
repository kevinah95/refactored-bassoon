package patterns.creational

interface Prototipo {
    fun clone(): Prototipo
}

data class DocumentoBase(
    val titulo: String,
    val cuerpo: String,
    val etiquetas: List<String>
) : Prototipo {
    override fun clone(): Prototipo = copy(etiquetas = etiquetas.toList())
}
