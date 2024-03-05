import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Arrays com tamanho fixos

        // User[] users = new User[]{
        // new User("Danillo", "Ferreira")
        // };

        // for(int i = 0; i < users.length; i++) {
        // System.out.println(users[i].getFullName());
        // };

        // Listas dinamicas
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            User actualUser = new User("User" + i, "Sobrenome" + i);
            users.add(actualUser);
        }

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getFullName());
        }
        ;

    }
}