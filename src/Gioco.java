import java.util.ArrayList;
import java.util.List;

public class Gioco {
    private String nome;
    private List<String> intestazioniColonne;
    private List<Punteggio> classifica;
    private List<Punteggio> ospiti;

    public Gioco(String nome, List<String> intestazioniColonne) {
        this.nome = nome;
        this.intestazioniColonne = intestazioniColonne;
        this.classifica = new ArrayList<>();
        this.ospiti = new ArrayList<>();
    }

    public void aggiungiPunteggio(Punteggio p) {
        this.classifica.add(p);
    }
    
    public void aggiungiOspite(Punteggio p) {
        this.ospiti.add(p);
    }

    public String getNome() {
        return nome;
    }

    public List<String> getIntestazioniColonne() {
        return intestazioniColonne;
    }

    public List<Punteggio> getClassifica() {
        return classifica;
    }
    
    public List<Punteggio> getOspiti() {
        return ospiti;
    }
}
