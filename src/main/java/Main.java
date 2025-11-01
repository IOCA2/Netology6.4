public class Main {
    public static void main(String[] args) {
        RestService count = new RestService();
        int Month = count.calculate(10000, 3000);
        System.out.println(Month);

    }
}