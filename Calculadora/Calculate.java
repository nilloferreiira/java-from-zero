public class Calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            min(x, y);
        } else if (args[0].equals("multiplicar")) {
            mult(x, y);
        } else if (args[0].equals("dividir")) {
            div(x, y);
        } else {
            System.out.println("Operacação invalida");
        }

    }

    public static void sum(int x, int y) {
        System.out.println(x + y);
    }

    public static void min(int x, int y) {
        System.out.println(x - y);
    }

    public static void mult(int x, int y) {
        System.out.println(x * y);
    }

    public static void div(int x, int y) {
        System.out.println(x / y);
    }
}