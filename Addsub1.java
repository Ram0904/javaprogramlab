import com.math.Mypack.Mycl;

class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = Mycl.add(num1, num2);
        int difference = Mycl.subtract(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}