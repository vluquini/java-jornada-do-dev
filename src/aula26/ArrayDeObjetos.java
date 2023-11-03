package aula26;

public class ArrayDeObjetos {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("User1"),
                new User("User2"),
                new User("User3")
        };

        System.out.println(users[1].getName());
    }
}
