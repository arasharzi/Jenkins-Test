import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest
{

    @BeforeEach
    void setUp()
    { }


    @Test
    void sayHello()
    {
        assertEquals(Main.SayHello(), "Hello World!");
    }

    @AfterEach
    void tearDown()
    { }


}