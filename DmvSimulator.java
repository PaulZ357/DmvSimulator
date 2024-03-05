import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        final int MAX_NUMBER = 200;
        int random = rand.nextInt(MAX_NUMBER)+1;
        System.out.print("Welcome to the DMV. Your number is ");
        System.out.println(random+".");
        System.out.println("Please wait until your number is called");
        
        int count = random + 1;
        while (count != random) {
            count = ((count - 1) % MAX_NUMBER) + 1;
            System.out.println(count);
            count++;
        }
        System.out.println(count);
        System.out.println("You don't have the required paperwork... SO YOU WILL DIE!!! GET OUT NOW OR I WILL GET YOU!!!!");
    }
}