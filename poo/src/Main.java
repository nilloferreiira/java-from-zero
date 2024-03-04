public class Main {
    public static void main(String[] args) {
        User[] users = new User[]{
            new User("Danillo", "Ferreira")
        };   

        for(int i = 0; i < users.length; i++) {
        System.out.println(users[i].getFullName());
        };
    }
}