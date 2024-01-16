import it.sam.be.classi.Rubrica;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 3");

        Rubrica io = new Rubrica("Samuele", "3627384920189");

        io.aggiungiNumero("mamma", "7483994827");
        io.aggiungiNumero("papa", "382949284829");
        io.stampaRubrica();
        io.ricercaUtenteNum("382949284829");
        io.ricercaUtente("mamma");
        io.aggiungiNumero("fafgsdg", "429583494534");
        io.stampaRubrica();
        io.cancellaContatto("fafgsdg");
        io.stampaRubrica();

    }
}