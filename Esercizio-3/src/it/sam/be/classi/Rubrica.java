package it.sam.be.classi;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Rubrica implements Comparable<Rubrica>{
    private String nome;
    private String numero;

    public Rubrica(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rubrica rubrica = (Rubrica) o;
        return Objects.equals(nome, rubrica.nome) && Objects.equals(numero, rubrica.numero);
    }

    @Override
    public int compareTo(Rubrica o) {
        return 0;
    }

    Map<String, String> Rubrica = new HashMap<>();

    public Map<String, String> aggiungiNumero(String x, String y){
        Rubrica.put(x, y);
        return Rubrica;
    }
     public Map<String,String> cancellaContatto(String x){
        Rubrica.remove(x);
        return Rubrica;
     }

     public void ricercaUtenteNum(String x){
         Set<String> ricerca = Rubrica.keySet();
         for (String n : ricerca){
             if (Rubrica.get(n).equals(x)){
                 System.out.println("Nome: " + n);
             }
         }
     }

     public void ricercaUtente(String x){
         Set<String> ricerca = Rubrica.keySet();
         for (String n : ricerca){
             if (n.equals(x)){
                 System.out.println("Numero: " + Rubrica.get(n));
             }
         }
     }

     public void stampaRubrica(){
         Set<String> ricerca = Rubrica.keySet();
         for (String n : ricerca){
             System.out.println("Nome: " + n + " Numero: " + Rubrica.get(n));
         }
     }



}
