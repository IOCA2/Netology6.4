public class RestService {
    public int calculate(int income, int expenses, int threshold, int money) {
        int count = 0;
        money = 0;
        for (int month = 0; month < 12; month++) {
            if (threshold <= money) {
                money = (money + income) - expenses;
                ++count;
            } else {
                money = (money - expenses) / 3;
            }
        }
        return count;
    }

}
