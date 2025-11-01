public class Main {
    public static void main(String[] args) {
        RestService count = new RestService();
        int Month = count.calculate(0, 0);
        System.out.println(Month);

    }
}