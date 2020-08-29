import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
    // Esto es JUnit
    @Before
    public void beforeTestDo() {
        System.out.println("Antes del test");
    }

    @Test
    public void testGetHello() {
        System.out.println("Este es el test");
        assertEquals("Hello Mundito", new Hello().getHello());
    }

    @After
    public void afterTestDo() {
        System.out.println("Despues del test");
    }
}
