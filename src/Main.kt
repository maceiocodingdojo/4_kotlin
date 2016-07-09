import java.math.BigDecimal
import java.util.*

class PassaTroco{
    companion object{
        val UM_REAL = 1
    }

    fun calculaTroco(valorCompra: BigDecimal, valorRecebido: BigDecimal): Map<Int, Int> {
        var diferenca : BigDecimal = valorRecebido - valorCompra
        var listDeTroco : List<Int>? = null

        if(valorCompra.compareTo(valorRecebido) != 0){

            var cedula : BigDecimal = diferenca
            listDeTroco = ArrayList()
            listDeTroco.add(1)

            return mapOf(1 to 1)
        }

        return listOf<Int>()
    }

}

