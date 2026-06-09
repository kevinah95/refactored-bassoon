package patterns.structural

interface Componente {
    fun descripcion(): String
    fun costo(): Int
}

class CafeSimple : Componente {
    override fun descripcion(): String = "Café simple"
    override fun costo(): Int = 25
}

abstract class Decorator(private val componente: Componente) : Componente {
    override fun descripcion(): String = componente.descripcion()
    override fun costo(): Int = componente.costo()
}

class DecoratorLeche(componente: Componente) : Decorator(componente) {
    override fun descripcion(): String = "${super.descripcion()} + leche"
    override fun costo(): Int = super.costo() + 10
}

class DecoratorCaramelo(componente: Componente) : Decorator(componente) {
    override fun descripcion(): String = "${super.descripcion()} + caramelo"
    override fun costo(): Int = super.costo() + 15
}
