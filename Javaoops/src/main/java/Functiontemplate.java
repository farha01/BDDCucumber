public class Functiontemplate {
    public static void add(int a,int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 15;

        add(a,b);
        add(35,45);
        subtract(80, 40);
    }
    public static void subtract(int a, int b) {
        System.out.println("Sub: " + (a - b) );

    }

}
