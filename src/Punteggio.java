import java.util.LinkedHashMap;
import java.util.Map;

public class Punteggio {
    private String nomeGiocatore;
    private Map<String, Comparable> statistiche;

    public Punteggio(String nomeGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
        this.statistiche = new LinkedHashMap<>();
    }

    public void addStat(String chiave, Comparable valore) {
        statistiche.put(chiave, valore);
    }

    public String getNomeGiocatore() {
        return nomeGiocatore;
    }

    public Map<String, Comparable> getStatistiche() {
        return statistiche;
    }
}
