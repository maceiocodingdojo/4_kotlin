import junit.framework.Assert.*
import org.jetbrains.spek.api.Spek
import java.math.BigDecimal

class TrocoTest : Spek({
    describe("um passador de troco") {
        val passaTroco = PassaTroco()

        it("sem troco, deve retornar uma list vazia") {
            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("10"))
            assertEquals(troco, listOf<BigDecimal>())
        }

        it("com troco devemos retorna uma lista com pelo menos um valor"){
            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("15"))
            assertEquals(troco.isNotEmpty(), true)
        }

        it("verificar a quantidade de cedulas com valor de troco igual a 1"){
            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("9"))
            assertEquals(troco.size ,1)
            assertEquals(troco.get(PassaTroco.UM_REAL) ,1)
        }

        it("verificar a quantidade de cedulas com valor de troco igual a 2"){
            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("8"))
            assertEquals(troco.size ,1)
            assertEquals(troco.get(0) ,2)
        }
    }
})

