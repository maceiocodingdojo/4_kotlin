import junit.framework.Assert.*
import org.jetbrains.spek.api.Spek
import java.math.BigDecimal

class TrocoTest : Spek({
    describe("um passador de troco") {
        val passaTroco = PassaTroco()

        it("sem troco, deve retornar uma list vazia") {
            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("10"))
            assertEquals(troco, mapOf<Int, Int>())
        }

        it("com troco devemos retorna uma lista com pelo menos um valor"){
            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("15"))
            assertEquals(troco.isNotEmpty(), true)
        }

        it("verificar a quantidade de cedulas com valor de troco igual a 1"){
            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("11"))
            assertEquals(troco.size ,1)
            assertEquals(troco.get(PassaTroco.UM_REAL) ,1)
        }


//        it("verificar a quantidade de cedulas com valor de troco igual a 2"){
//            val troco = passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("8"))
//            assertEquals(troco.size ,1)
//            assertEquals(troco.get(0) ,2)
//        }

//        it("deve retornar uma cedula de cada valor como troco"){
//            val troco = passaTroco.calculaTroco(BigDecimal("39"), BigDecimal("200"))
//            assertEquals(troco.size ,5)
//            assertEquals(troco.get(0) ,1)
//            assertEquals(troco.get(0) ,2)
//        }
    }
})

