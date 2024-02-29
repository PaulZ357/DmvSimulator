import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(100)+1;
        System.out.print("Welcome to the DMV. Your number is ");
        System.out.println(random+".");
        System.out.println("Please wait until your number is called");
        
        int count = random + 1;
        while (count != random) {
            count = ((count - 1) % 100) + 1;
            System.out.println(count);
            count++;
        }
        System.out.println(count);
        System.out.println("You don't have the required paperwork.");
    }
}