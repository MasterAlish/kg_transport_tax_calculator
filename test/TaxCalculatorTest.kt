import junit.framework.Assert

/**
 * Created by master Alish on 8/6/18.
 */
class TaxCalculatorTest : junit.framework.TestCase() {
    private val calculator = TaxCalculator()

    fun testCalculationTransportAutoWithLifetimeOver15YearsShouldBeRight() {
        calculator.currentYear = 2018
        var result = calculator.calc(2002, 1000, TransportCode._001)
        Assert.assertEquals(450.0, result)

        result = calculator.calc(1999, 1000, TransportCode._002)
        Assert.assertEquals(300.0, result)

        result = calculator.calc(1998, 1000, TransportCode._003)
        Assert.assertEquals(150.0, result)

        result = calculator.calc(1996, 1000, TransportCode._004)
        Assert.assertEquals(50.0, result)

        result = calculator.calc(1980, 1000, TransportCode._005)
        Assert.assertEquals(90.0, result)

        result = calculator.calc(2003, 1000, TransportCode._006)
        Assert.assertEquals(1200.0, result)
    }

    fun testCalculationForTransportWithLifetimeFrom10To15YearsShouldBeRight() {
        calculator.currentYear = 2018
        var result = calculator.calc(2004, 1000, TransportCode._001)
        Assert.assertEquals(600.0, result)

        result = calculator.calc(2004, 1000, TransportCode._002)
        Assert.assertEquals(450.0, result)

        result = calculator.calc(2005, 1000, TransportCode._003)
        Assert.assertEquals(300.0, result)

        result = calculator.calc(2006, 1000, TransportCode._004)
        Assert.assertEquals(100.0, result)

        result = calculator.calc(2007, 1000, TransportCode._005)
        Assert.assertEquals(90.0, result)

        result = calculator.calc(2008, 1000, TransportCode._006)
        Assert.assertEquals(1200.0, result)
    }

    fun testCalculationForTransportWithLifetimeFrom5To10YearsShouldBeRight() {
        calculator.currentYear = 2018
        var result = calculator.calc(2009, 1000, TransportCode._001)
        Assert.assertEquals(750.0, result)

        result = calculator.calc(2009, 1000, TransportCode._002)
        Assert.assertEquals(600.0, result)

        result = calculator.calc(2010, 1000, TransportCode._003)
        Assert.assertEquals(300.0, result)

        result = calculator.calc(2011, 1000, TransportCode._004)
        Assert.assertEquals(100.0, result)

        result = calculator.calc(2012, 1000, TransportCode._005)
        Assert.assertEquals(150.0, result)

        result = calculator.calc(2013, 1000, TransportCode._006)
        Assert.assertEquals(1200.0, result)
    }

    fun testCalculationForTransportWithLifetimeLessThan5YearsShouldBeRight() {
        calculator.currentYear = 2018
        var result = calculator.calc(2014, 1000, TransportCode._001)
        Assert.assertEquals(900.0, result)

        result = calculator.calc(2014, 1000, TransportCode._002)
        Assert.assertEquals(750.0, result)

        result = calculator.calc(2015, 1000, TransportCode._003)
        Assert.assertEquals(300.0, result)

        result = calculator.calc(2016, 1000, TransportCode._004)
        Assert.assertEquals(100.0, result)

        result = calculator.calc(2017, 1000, TransportCode._005)
        Assert.assertEquals(150.0, result)

        result = calculator.calc(2018, 1000, TransportCode._006)
        Assert.assertEquals(1800.0, result)
    }
}