import java.math.BigDecimal
import java.util.*

class PassaTroco{
    companion object{
        val UM_REAL = 1
        val CINCO_REAIS = 5
        val DEZ_REAIS = 10
        val CINQUENTA_REAIS = 50
        val CEM_REAIS = 100
        val LIST_CEDULAS = Arrays.asList(UM_REAL,CINCO_REAIS,DEZ_REAIS,CINQUENTA_REAIS,CEM_REAIS)
    }


    fun calculaTroco(valorCompra: BigDecimal, valorRecebido: BigDecimal): Map<Int, Int> {
        var diferenca : BigDecimal = valorRecebido - valorCompra
        var listDeTroco : Map<Int, Int> = mapOf()

        if(valorRecebido > valorCompra){

            //return mapOf(getMaiorCedula(diferenca) to 1)
        }

       // getMaiorCedula(diferenca)

        return listDeTroco
    }

    getCedulas(){

    }
    private fun calcularMenorQua(diferenca: BigDecimal) : Int{


        return when(LIST_CEDULAS){

            LIS -> UM_REAL
            BigDecimal("5") -> CINCO_REAIS
            else -> 0
        }
    }
}

