import java.math.BigDecimal
import java.util.*

class PassaTroco{
    fun calculaTroco(valorCompra: BigDecimal, valorRecebido: BigDecimal): List<BigDecimal> {
        var diferenca : BigDecimal = valorRecebido - valorCompra;
        var listDeTroco : List<BigDecimal>? = null;

        if(valorCompra.compareTo(valorRecebido) != 0){
            return listOf(BigDecimal.ONE)
        }



        return listOf<BigDecimal>()
    }

}

