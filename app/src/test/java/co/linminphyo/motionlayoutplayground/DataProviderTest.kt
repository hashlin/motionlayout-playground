package co.linminphyo.motionlayoutplayground

import org.junit.Assert.*
import org.junit.Test

/**
 * Created by lin min phyo on 2019-05-01.
 */
class DataProviderTest{

    val dataProvider = DataProvider()


    @Test
    fun `Test index generation is correct 0 to 1`(){
        dataProvider.swipedTimes = 0
        val dataIndex = dataProvider.getIndex( 1 , 0)
        val expected = 2
        assertEquals(expected,dataIndex)
    }


    @Test
    fun `Test index generation is correct 1 to 0`(){
        dataProvider.swipedTimes = 1
        val dataIndex = dataProvider.getIndex( 0 , 1)
        val expected = 1
        assertEquals(expected,dataIndex)
    }





    @Test
    fun `Test index generation is correct 3 to 0`(){
        dataProvider.swipedTimes = 3
        val dataIndex = dataProvider.getIndex( 0 , 3)
        val expected = 5
        assertEquals(expected,dataIndex)
    }


    @Test
    fun `Test index generation is correct 3 to 0 swiped 8`(){
        dataProvider.swipedTimes = 7
        val dataIndex = dataProvider.getIndex( 0 , 3)
        val expected = 0
        assertEquals(expected,dataIndex)
    }

}