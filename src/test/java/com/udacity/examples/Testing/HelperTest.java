package com.udacity.examples.Testing;

import org.junit.*;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

import static org.junit.Assert.assertEquals;

public class HelperTest {

    @BeforeClass
    public static void globalSetup(){
        System.out.println("Setting up testing environment");
    }

    @AfterClass
    public static void globalTeardown(){
        System.out.println("Destroying testing environment");
    }

    @Before
    public void initTest(){
        System.err.println("Commencing test");
    }

    @After
    public void teardownTest(){
        System.err.println("Ending test");
    }


    @Test
    public void testGetCount(){
        assertEquals(5, Helper.getCount(Arrays.asList("a","b","c","d","e")));
        assert(Helper.getCount(Arrays.asList("a","b","c","d","e"))==5);
    }

    @Test
    @Ignore
    public void testStats(){
        IntSummaryStatistics stats = Helper.getStats(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        assertEquals(1,stats.getMin());
        assertEquals(10,stats.getMax());
        assertEquals(0,stats.getAverage(),5.5);
        assertEquals(55,stats.getSum());
    }

    @Test
    public void testCountStringsLengthThree(){
        assertEquals(3,Helper.getStringsOfLength3( Arrays.asList("abcd","abc","abcde","a","ab","abc","xyz")));
    }

    @Test
    public void testSquaresList(){
        assertEquals(Arrays.asList(4,9,16,25,36),Helper.getSquareList(Arrays.asList(2,3,4,5,6)));
    }

    @Test
    public void testMergedList(){
        assertEquals("matt, laus, lucas, isaac", Helper.getMergedList(Arrays.asList("matt","laus","lucas","isaac")));
    }

    @Test
    public void testFilteredList(){
        assertEquals(Arrays.asList("Matt","Laus"),Helper.getFilteredList(Arrays.asList("Matt","","Laus","")));
    }
}
