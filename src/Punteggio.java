import java.util.LinkedHashMap;
import java.util.Map;

public class Punteggio {
    private String nomeGiocatore;
    private String stagione; // Opzionale
    private Map<String, Comparable> statistiche;

    public Punteggio(String nomeGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
        this.statistiche = new LinkedHashMap<>();
    }
    
    public Punteggio(String nomeGiocatore, String stagione) {
        this.nomeGiocatore = nomeGiocatore;
        this.stagione = stagione;
        this.statistiche = new LinkedHashMap<>();
    }

    public void addStat(String chiave, Comparable valore) {
        statistiche.put(chiave, valore);
    }

    public String getNomeGiocatore() {
        return nomeGiocatore;
    }
    
    public String getStagione() {
        return stagione;
    }
    
    public void setStagione(String stagione) {
        this.stagione = stagione;
    }

    public Map<String, Comparable> getStatistiche() {
        return statistiche;
    }
}
