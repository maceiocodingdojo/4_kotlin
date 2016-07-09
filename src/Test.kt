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

        it("verificar se o valor recebido é menor valor total"){
            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("5"))
            assertEquals(troco, listOf<BigDecimal>())
        }

    }
})

