package task.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        User irina = new User("Ирина", 28);
        User irina1 = new User("Ирина", 28);
        User ivan = new User("Иван", 21);
        User petr = new User("Петр", 23);
        User anna = new User("Анна", 22);

        users.add(irina);
        users.add(irina1);
        users.add(ivan);
        users.add(petr);
        users.add(anna);

        System.out.println(getMaxAgeUser(users));
    }

    private static Optional<User> getMaxAgeUser(Collection<User> collection) {
        return collection.stream()
                .distinct()
                .sorted(Comparator.comparingInt(User::getAge).thenComparing(User::getName))
                .max(Comparator.comparingInt(User::getAge));
    }
}