import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("teoria Collection");

        User utente1 = new User("Piero", "Fanelli", 21);
        User utente2 = new User("Gianni", "gianni", 40);
        User utente3 = new User("Andrea", "allo", 22);

        User[] userArray = {utente1, utente2, utente3};
        ArrayList<User> userList = new ArrayList<>();
        List<User> userList2 = new ArrayList<>();
        List<User> userlist3 = new LinkedList<>();

        userList.add(utente1);
        userList.add(utente2);
        userList.add(utente3);

        ArrayList<User> userList4 = new ArrayList<>(Arrays.asList(userArray));
        System.out.println(userList4);

//        for (User user : userList){
//            System.out.println(user);
//        }
        userList.forEach(user -> {
            System.out.println(user);
        });

        System.out.println(Arrays.asList(userArray) instanceof ArrayList<User>);

    }
}