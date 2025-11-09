import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RestServiceTest {
    @Test
    public void shouldCalculateForRegistredAndOverLimit() {
        RestService service = new RestService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int money = 0;
        int expected = 0;

        int actual = service.calculate(income, expenses, threshold, money);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegistredAndOverLimit2() {
        RestService service = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 0;
        int money = 0;

        int actual = service.calculate(income, expenses, threshold, money);

        Assertions.assertEquals(expected, actual);
    }
}
