import java.util.*

/**
 * Created by master Alish on 8/6/18.
 */
class TaxCalculator {
    var currentYear = Calendar.getInstance().get(Calendar.YEAR)

    fun calc(year: Int, volume: Int, code: TransportCode): Double {
        val lifetime = currentYear - year
        val taxRate = getTaxRate(lifetime, code)
        return Math.ceil(taxRate * volume)
    }

    private fun getTaxRate(lifetime: Int, code: TransportCode): Double {
        return when  {
            lifetime < 5 -> code.rateLessThan5Years
            5 <= lifetime && lifetime < 10 -> code.rateFrom5To10Years
            10 <= lifetime && lifetime < 15 -> code.rateFrom10To15Years
            else -> code.rateOver15Years
        }
    }
}