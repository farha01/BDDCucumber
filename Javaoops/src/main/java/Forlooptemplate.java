public class Forlooptemplate {
    public static void add() {
        int a = 5; int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Hardcoded range 1 to 10
            add();
        }
    }
}
