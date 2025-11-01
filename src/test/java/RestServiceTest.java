import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class RestServiceTest {
    @Test
    public void shouldCalculateForRegistredAndOverLimit() {
        RestService service = new RestService();
        long expected = 12;
        int actual = service.calculate(10000, 3000);
        Assertions.assertEquals(expected, actual);
    }
}
