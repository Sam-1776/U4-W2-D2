import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 1");

        Set<String> paroleSet = new HashSet<>();
        List<String> paroleDuplicate = new ArrayList<>();
        List<String> paroleDistinte = new ArrayList<>();

        System.out.println("Inserire numero di parole");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int nPD = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Inserire parola");
            String word = input.nextLine();
            boolean diverse = paroleSet.add(word);
            if (diverse) {
                paroleDistinte.add(word);
                nPD = paroleDistinte.size();
            }else{
                paroleDuplicate.add(word);
            }

        }

        System.out.println("----- Parole Duplicate -----");
        for (String parole : paroleDuplicate) {
            System.out.println(parole);
        }
        System.out.println("----- Parole Distinte -----");
        for (String parole : paroleDistinte){
            System.out.println(parole);
        }
        System.out.println("Numero di parole Distinte: " + nPD);
    }
}