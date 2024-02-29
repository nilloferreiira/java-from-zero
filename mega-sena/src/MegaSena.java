import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        // generated a random number  < 60
        Random generate = new Random();

        // while
            whileLoop(generate);

        // for
            //forLoop(generate);
    }

    // while
    public static void whileLoop(Random generate) {
        int i = 0;
        while(i < 6) {
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }
    }

    // for
    public static void forLoop(Random generate) {
        for(int i =0; i < 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}