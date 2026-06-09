package patterns.creational

data class Computadora(
    val cpu: String,
    val memoriaGb: Int,
    val almacenamientoGb: Int,
    val gpu: String?
)

class Builder {
    private var cpu: String = "genérico"
    private var memoriaGb: Int = 4
    private var almacenamientoGb: Int = 256
    private var gpu: String? = null

    fun cpu(cpu: String): Builder = apply { this.cpu = cpu }
    fun memoriaGb(gb: Int): Builder = apply { this.memoriaGb = gb }
    fun almacenamientoGb(gb: Int): Builder = apply { this.almacenamientoGb = gb }
    fun gpu(gpu: String): Builder = apply { this.gpu = gpu }

    fun build(): Computadora = Computadora(cpu, memoriaGb, almacenamientoGb, gpu)
}
