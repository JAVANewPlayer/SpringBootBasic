package springboot;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HelloWorldControllerTest {
    @Test
    public void testSayHello(){
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }
}
