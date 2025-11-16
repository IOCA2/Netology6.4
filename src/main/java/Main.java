public class Main {
    public static void main(String[] args) {
        RestService count = new RestService();
        int Month = count.calculate(10_000, 3_000, 20_000);
        System.out.println(Month);

    }
}