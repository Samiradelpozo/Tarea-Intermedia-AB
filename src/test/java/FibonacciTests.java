import org.example.algoritmoFibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FibonacciTests {
    @Test
    public void FibonacciTests(){
        assertEquals(1, algoritmoFibonacci.numero(1));
        assertEquals(1, algoritmoFibonacci.numero(2));
        assertEquals(2, algoritmoFibonacci.numero(3));
    }

}
