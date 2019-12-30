package com.udacity.examples.Testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class HelperParameterizedTest {

    private String input;
    private String output;

    public HelperParameterizedTest(String input, String output) {
        super();
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection initData(){
        String names [][] = {{"a","b"},{"a","a"}};
        return Arrays.asList(names);
    }

    @Test
    public void testInput(){
        assertNotEquals(input,output);
    }
}
