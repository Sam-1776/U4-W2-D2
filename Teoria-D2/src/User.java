import java.util.Objects;
import java.util.Random;

public class User implements Comparable<User>{

    private String nome;
    private String cognome;
    private int eta;
    private int id;

    public User(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        Random rdm = new Random();
        this.id = rdm.nextInt(1,10000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return eta == user.eta && id == user.id && Objects.equals(nome, user.nome) && Objects.equals(cognome, user.cognome);
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", id=" + id +
                '}';
    }

    public int getEta() {
        return eta;
    }

    @Override
    public int compareTo(User o) {
        return o.getEta() - this.getEta();
    }
}
