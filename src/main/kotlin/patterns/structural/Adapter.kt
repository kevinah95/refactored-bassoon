package patterns.structural

class ServicioPagoLegacy {
    fun procesarMontoEnCentavos(total: Int): String {
        return "Pago legacy por ${total} centavos"
    }
}

interface Objetivo {
    fun cobrar(totalEnPesos: Double): String
}

class AdaptadorPago(
    private val servicioPagoLegacy: ServicioPagoLegacy
) : Objetivo {
    override fun cobrar(totalEnPesos: Double): String {
        val centavos = (totalEnPesos * 100).toInt()
        return servicioPagoLegacy.procesarMontoEnCentavos(centavos)
    }
}
