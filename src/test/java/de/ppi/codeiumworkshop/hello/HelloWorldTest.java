package de.ppi.codeiumworkshop.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testGetHelloWorld() {
        HelloWorld helloWorld = new HelloWorld(); 
        String result = helloWorld.getHelloWorld();
        assertEquals("Hello World!", result);
    }

}