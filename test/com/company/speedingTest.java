package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class speedingTest {
    @Before
    public void setUp() throws Exception {



    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void caughtSpeedingOnBirthday() throws Exception {

        assertTrue(speeding.caughtSpeeding(60, true)==0);
        assertTrue(speeding.caughtSpeeding(66,true)==1);
        assertTrue(speeding.caughtSpeeding(90,true)==2);
        assertTrue(speeding.caughtSpeeding(-4,true)== -1);



    }
    @Test
    public void caughtSpeedingNotOnBirthday() throws Exception {

        assertTrue(speeding.caughtSpeeding(60, false)==0);
        assertTrue(speeding.caughtSpeeding(66,false)==1);
        assertTrue(speeding.caughtSpeeding(90,false)==2);
        assertTrue(speeding.caughtSpeeding(-4,false)== -1);
    }

}