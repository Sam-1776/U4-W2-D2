import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 2");
        System.out.println(numeriOrdinati(6));
        listaExtra(numeriOrdinati(6));
        print(numeriOrdinati(7), false);
    }

    public static List<Integer> numeriOrdinati(int n){
        List<Integer> numeri;
        Integer[] N = new Integer[n];
        Random rdm = new Random();
        int j = 0;
        for (int i = 0; i < n; i++) {
            Integer nRdm = rdm.nextInt(100);
            N[i] = nRdm;
        }
        Arrays.sort(N);
        numeri = new ArrayList<>(Arrays.asList(N));

        return numeri;
    }

    public static List<Integer> listaExtra(List x){
        List<Integer> newNumeri;
        newNumeri = new ArrayList<>(x);
        int counter = x.size() - 1;
        for (int i = 0; i < x.size(); i++) {
            newNumeri.add((Integer) x.get(counter));
            counter--;
        }
        System.out.println(newNumeri);
        return newNumeri;
    }

    public static void print (List<Integer> x, boolean y){
        List<Integer> pari = new ArrayList<>();
        List<Integer> dispari = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) % 2 == 0){
                pari.add(x.get(i));
            }else {
                dispari.add(x.get(i));
            }
        }
        if (y == true){
            System.out.println(pari);
        }else {
            System.out.println(dispari);
        }
    }
}