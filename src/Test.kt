import java.math.BigDecimal

//class SimpleTest : Spek({
//    describe("a calculator") {
//        val calculator = SampleCalculator()
//
//        it("should return the result of adding the first number to the second number") {
//            val sum = calculator.sum(2, 4)
//            assertEquals(6, sum)
//        }
//
//        it("should return the result of subtracting the second number from the first number") {
//            val subtract = calculator.subtract(4, 2)
//            assertEquals(2, subtract)
//        }
//    }
//})

class TrocoTest : Spek({
    describe("um passador de troco") {
        val passaTroco = PassaTroco()



        it("sem troco, deve retornar uma list vazia") {
            val troco= passaTroco.calculaTroco(BigDecimal("10"), BigDecimal("10"))
            listOf<BigDecimal>(BigDecimal("10"), BigDecimal("10"))
            assertEquals(troco,listOf<BigDecimal>() )
        }

        it("should return the result of subtracting the second number from the first number") {
            val subtract = calculator.subtract(4, 2)
            assertEquals(2, subtract)
        }
    }
})