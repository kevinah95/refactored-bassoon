package patterns.creational

interface ProductoMotor {
    fun tipo(): String
}

interface ProductoPanel {
    fun tema(): String
}

interface FabricaAbstracta {
    fun crearMotor(): ProductoMotor
    fun crearPanel(): ProductoPanel
}

class MotorWeb : ProductoMotor {
    override fun tipo(): String = "motor web"
}

class PanelWeb : ProductoPanel {
    override fun tema(): String = "tema claro"
}

class MotorMovil : ProductoMotor {
    override fun tipo(): String = "motor móvil"
}

class PanelMovil : ProductoPanel {
    override fun tema(): String = "tema oscuro"
}

class FabricaWeb : FabricaAbstracta {
    override fun crearMotor(): ProductoMotor = MotorWeb()
    override fun crearPanel(): ProductoPanel = PanelWeb()
}

class FabricaMovil : FabricaAbstracta {
    override fun crearMotor(): ProductoMotor = MotorMovil()
    override fun crearPanel(): ProductoPanel = PanelMovil()
}

class Catalogo(private val fabrica: FabricaAbstracta) {
    fun describirConfiguracion(): String {
        val motor = fabrica.crearMotor()
        val panel = fabrica.crearPanel()
        return "Configuración: ${motor.tipo()} + ${panel.tema()}"
    }
}
