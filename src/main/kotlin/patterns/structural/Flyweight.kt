package patterns.structural

data class ModeloArbol(val textura: String, val color: String)

data class ArbolEnMapa(val x: Int, val y: Int, val modelo: ModeloArbol)

class FabricaPesoMosca {
    private val cache = mutableMapOf<String, ModeloArbol>()

    fun obtener(textura: String, color: String): ModeloArbol {
        val clave = "$textura:$color"
        return cache.getOrPut(clave) { ModeloArbol(textura, color) }
    }
}

class Bosque {
    private val arboles = mutableListOf<ArbolEnMapa>()
    private val fabrica = FabricaPesoMosca()

    fun plantar(x: Int, y: Int, textura: String, color: String) {
        val modelo = fabrica.obtener(textura, color)
        arboles += ArbolEnMapa(x, y, modelo)
    }

    fun totalArboles(): Int = arboles.size
}
