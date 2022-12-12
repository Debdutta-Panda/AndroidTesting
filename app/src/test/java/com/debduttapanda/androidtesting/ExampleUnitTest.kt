package com.debduttapanda.androidtesting

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}

class CalculatorTest {
    @Test
    fun evaluatesExpression1() {
        val calculator = Calculator()
        val sum = calculator.evaluate("1+2")
        assertEquals(3, sum)
    }
    @Test
    fun evaluatesExpression2() {
        val calculator = Calculator()
        val sum = calculator.evaluate("1+2")
        assertEquals(2, sum)
    }
}