package com.account.project.assessment;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

/**
 * Unit test for simple App.
 */
public class AppTestIT
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        get("/echo/hello").then().assertThat().body("message", equalTo("hello"));
    }
}
