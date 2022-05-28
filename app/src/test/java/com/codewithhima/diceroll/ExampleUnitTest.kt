package com.codewithhima.diceroll

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_function(){
        val dice = MainActivity.Dice(6)
        val rollresult = dice.roll()

        assertTrue("the value of rollResult was not between 0 and 6" , rollresult in 1..6)
    }
}
