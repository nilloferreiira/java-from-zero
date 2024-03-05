import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o limite do fibonnaci:");
        Scanner input = new Scanner(System.in);
        int f1 = 0;        
        int f2 = 1;
        int limit = Integer.parseInt(input.nextLine()); 
        while (f2 < limit) {
            int fn = f1 + f2;
            if(fn > limit) {
                break;
            } 
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        } 
        input.close();
    } 
}