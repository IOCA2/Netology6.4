import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RestServiceTest {
    @Test
    public void shouldCalculateForRegistredAndOverLimit() {
        RestService service = new RestService();
        long expected = 12;
        int actual = service.calculate(0, 0, 0);
        Assertions.assertEquals(expected, actual);
    }
}
