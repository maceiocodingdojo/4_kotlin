import java.math.BigDecimal
import java.util.*

class PassaTroco{
    companion object{
        val UM_REAL = 1
        val CINCO_REAIS = 5
    }

    fun calculaTroco(valorCompra: BigDecimal, valorRecebido: BigDecimal): Map<Int, Int> {
        var diferenca : BigDecimal = valorRecebido - valorCompra
        var listDeTroco : Map<Int, Int> = mapOf()

        if(valorRecebido > valorCompra){

            return mapOf(getMaiorCedula(diferenca) to 1)
        }

        getMaiorCedula(diferenca)

        return listDeTroco
    }

    private fun getMaiorCedula(diferenca: BigDecimal) : Int{

        return when(diferenca){
            BigDecimal("1") -> UM_REAL
            BigDecimal("5") -> CINCO_REAIS
            else -> 0
        }
    }
}

