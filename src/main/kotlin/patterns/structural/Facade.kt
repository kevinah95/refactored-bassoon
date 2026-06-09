package patterns.structural

class Inventario {
    fun reservar(sku: String): String = "Inventario reservado para $sku"
}

class Pagos {
    fun cobrar(total: Double): String = "Cobro realizado por $total"
}

class Envio {
    fun programar(direccion: String): String = "Envío programado a $direccion"
}

class Fachada(
    private val inventario: Inventario = Inventario(),
    private val pagos: Pagos = Pagos(),
    private val envio: Envio = Envio()
) {
    fun completarPedido(sku: String, total: Double, direccion: String): List<String> {
        return listOf(
            inventario.reservar(sku),
            pagos.cobrar(total),
            envio.programar(direccion)
        )
    }
}
