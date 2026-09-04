import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // ----------------- GOLFATINE -----------------
        List<String> colonneGolf = Arrays.asList("Partite Giocate", "Vittorie", "Win %", "Media Punti", "Over/Under Par");
        Gioco golfatine = new Gioco("Golfatine", colonneGolf);

        Punteggio delux = new Punteggio("Delux");
        delux.addStat("Partite Giocate", 72); delux.addStat("Vittorie", 24); delux.addStat("Win %", "33.3%"); delux.addStat("Media Punti", 70.43); delux.addStat("Over/Under Par", "+9.79");
        golfatine.aggiungiPunteggio(delux);

        Punteggio rohn = new Punteggio("Just Rohn");
        rohn.addStat("Partite Giocate", 61); rohn.addStat("Vittorie", 22); rohn.addStat("Win %", "36.1%"); rohn.addStat("Media Punti", 71.28); rohn.addStat("Over/Under Par", "+9.79");
        golfatine.aggiungiPunteggio(rohn);

        Punteggio dread = new Punteggio("nonsonodread");
        dread.addStat("Partite Giocate", 77); dread.addStat("Vittorie", 20); dread.addStat("Win %", "26.0%"); dread.addStat("Media Punti", 70.52); dread.addStat("Over/Under Par", "+10.40");
        golfatine.aggiungiPunteggio(dread);

        Punteggio masseo = new Punteggio("ilMasseo");
        masseo.addStat("Partite Giocate", 35); masseo.addStat("Vittorie", 8); masseo.addStat("Win %", "22.9%"); masseo.addStat("Media Punti", 80.37); masseo.addStat("Over/Under Par", "+15.57");
        golfatine.aggiungiPunteggio(masseo);

        Punteggio mollu = new Punteggio("Mollu");
        mollu.addStat("Partite Giocate", 28); mollu.addStat("Vittorie", 8); mollu.addStat("Win %", "28.6%"); mollu.addStat("Media Punti", 86.46); mollu.addStat("Over/Under Par", "+24.57");
        golfatine.aggiungiPunteggio(mollu);

        Punteggio gabbo = new Punteggio("GaBBo");
        gabbo.addStat("Partite Giocate", 65); gabbo.addStat("Vittorie", 4); gabbo.addStat("Win %", "6.2%"); gabbo.addStat("Media Punti", 84.05); gabbo.addStat("Over/Under Par", "+24.28");
        golfatine.aggiungiPunteggio(gabbo);

        Punteggio jtaz = new Punteggio("JTaz");
        jtaz.addStat("Partite Giocate", 23); jtaz.addStat("Vittorie", 1); jtaz.addStat("Win %", "4.3%"); jtaz.addStat("Media Punti", 80.16); jtaz.addStat("Over/Under Par", "+22.54");
        golfatine.aggiungiPunteggio(jtaz);

        Punteggio marza = new Punteggio("Just Marzaa");
        marza.addStat("Partite Giocate", 1); marza.addStat("Vittorie", 0); marza.addStat("Win %", "0.0%"); marza.addStat("Media Punti", 45.00); marza.addStat("Over/Under Par", "-9.00");
        golfatine.aggiungiOspite(marza);

        Punteggio nbay = new Punteggio("nbayungchape");
        nbay.addStat("Partite Giocate", 2); nbay.addStat("Vittorie", 0); nbay.addStat("Win %", "0.0%"); nbay.addStat("Media Punti", 60.50); nbay.addStat("Over/Under Par", "-1.50");
        golfatine.aggiungiOspite(nbay);

        Punteggio fava = new Punteggio("fava");
        fava.addStat("Partite Giocate", 2); fava.addStat("Vittorie", 0); fava.addStat("Win %", "0.0%"); fava.addStat("Media Punti", 78.50); fava.addStat("Over/Under Par", "+16.50");
        golfatine.aggiungiOspite(fava);


        // ----------------- SDROGOCORSE (Tutte le stagioni combinate) -----------------
        List<String> colonneSdrogocorse = Arrays.asList("Partecipazioni", "Elenchi vinti", "Win %", "Media punti elenco", "Media punti gara", "Punti totali");
        Gioco sdrogocorse = new Gioco("Sdrogocorse", colonneSdrogocorse);
        
        // --- 2026 ---
        Punteggio p1 = new Punteggio("Mollura-", "2026");
        p1.addStat("Partecipazioni", 12); p1.addStat("Elenchi vinti", 5); p1.addStat("Win %", "42%"); p1.addStat("Media punti elenco", 38.67); p1.addStat("Media punti gara", 9.47); p1.addStat("Punti totali", 464);
        sdrogocorse.aggiungiPunteggio(p1);

        Punteggio p2 = new Punteggio("GaBbODSQUARED", "2026");
        p2.addStat("Partecipazioni", 17); p2.addStat("Elenchi vinti", 4); p2.addStat("Win %", "24%"); p2.addStat("Media punti elenco", 34.00); p2.addStat("Media punti gara", 8.50); p2.addStat("Punti totali", 578);
        sdrogocorse.aggiungiPunteggio(p2);

        Punteggio p3 = new Punteggio("Deluxiah", "2026");
        p3.addStat("Partecipazioni", 22); p3.addStat("Elenchi vinti", 5); p3.addStat("Win %", "23%"); p3.addStat("Media punti elenco", 37.50); p3.addStat("Media punti gara", 9.38); p3.addStat("Punti totali", 825);
        sdrogocorse.aggiungiPunteggio(p3);

        Punteggio p4 = new Punteggio("ilMasseo", "2026");
        p4.addStat("Partecipazioni", 21); p4.addStat("Elenchi vinti", 4); p4.addStat("Win %", "19%"); p4.addStat("Media punti elenco", 37.10); p4.addStat("Media punti gara", 9.16); p4.addStat("Punti totali", 779);
        sdrogocorse.aggiungiPunteggio(p4);

        Punteggio p5 = new Punteggio("JRohn7", "2026");
        p5.addStat("Partecipazioni", 20); p5.addStat("Elenchi vinti", 3); p5.addStat("Win %", "15%"); p5.addStat("Media punti elenco", 34.80); p5.addStat("Media punti gara", 8.59); p5.addStat("Punti totali", 696);
        sdrogocorse.aggiungiPunteggio(p5);

        Punteggio p6 = new Punteggio("TITTI-2", "2026");
        p6.addStat("Partecipazioni", 14); p6.addStat("Elenchi vinti", 2); p6.addStat("Win %", "14%"); p6.addStat("Media punti elenco", 28.36); p6.addStat("Media punti gara", 7.09); p6.addStat("Punti totali", 397);
        sdrogocorse.aggiungiPunteggio(p6);

        Punteggio p7 = new Punteggio("StillDread", "2026");
        p7.addStat("Partecipazioni", 22); p7.addStat("Elenchi vinti", 1); p7.addStat("Win %", "5%"); p7.addStat("Media punti elenco", 32.82); p7.addStat("Media punti gara", 8.11); p7.addStat("Punti totali", 722);
        sdrogocorse.aggiungiPunteggio(p7);

        // --- 2025 ---
        Punteggio s25_1 = new Punteggio("Deluxiah", "2025");
        s25_1.addStat("Partecipazioni", 11); s25_1.addStat("Elenchi vinti", 7); s25_1.addStat("Win %", "64%"); s25_1.addStat("Media punti elenco", 47.64); s25_1.addStat("Media punti gara", 11.91); s25_1.addStat("Punti totali", 524);
        sdrogocorse.aggiungiPunteggio(s25_1);

        Punteggio s25_2 = new Punteggio("JRohn7", "2025");
        s25_2.addStat("Partecipazioni", 12); s25_2.addStat("Elenchi vinti", 1); s25_2.addStat("Win %", "8%"); s25_2.addStat("Media punti elenco", 36.92); s25_2.addStat("Media punti gara", 9.23); s25_2.addStat("Punti totali", 443);
        sdrogocorse.aggiungiPunteggio(s25_2);

        Punteggio s25_3 = new Punteggio("StillDread", "2025");
        s25_3.addStat("Partecipazioni", 12); s25_3.addStat("Elenchi vinti", 1); s25_3.addStat("Win %", "8%"); s25_3.addStat("Media punti elenco", 30.67); s25_3.addStat("Media punti gara", 7.67); s25_3.addStat("Punti totali", 368);
        sdrogocorse.aggiungiPunteggio(s25_3);

        Punteggio s25_4 = new Punteggio("ilMasseo", "2025");
        s25_4.addStat("Partecipazioni", 9); s25_4.addStat("Elenchi vinti", 1); s25_4.addStat("Win %", "11%"); s25_4.addStat("Media punti elenco", 31.44); s25_4.addStat("Media punti gara", 7.86); s25_4.addStat("Punti totali", 283);
        sdrogocorse.aggiungiPunteggio(s25_4);

        Punteggio s25_5 = new Punteggio("Mollura-", "2025");
        s25_5.addStat("Partecipazioni", 5); s25_5.addStat("Elenchi vinti", 1); s25_5.addStat("Win %", "20%"); s25_5.addStat("Media punti elenco", 36.80); s25_5.addStat("Media punti gara", 9.20); s25_5.addStat("Punti totali", 184);
        sdrogocorse.aggiungiPunteggio(s25_5);

        Punteggio s25_6 = new Punteggio("JMarzaa", "2025");
        s25_6.addStat("Partecipazioni", 2); s25_6.addStat("Elenchi vinti", 1); s25_6.addStat("Win %", "50%"); s25_6.addStat("Media punti elenco", 42.00); s25_6.addStat("Media punti gara", 10.50); s25_6.addStat("Punti totali", 84);
        sdrogocorse.aggiungiOspite(s25_6);

        Punteggio s25_7 = new Punteggio("GaBbODSQUARED", "2025");
        s25_7.addStat("Partecipazioni", 8); s25_7.addStat("Elenchi vinti", 0); s25_7.addStat("Win %", "0%"); s25_7.addStat("Media punti elenco", 35.25); s25_7.addStat("Media punti gara", 8.81); s25_7.addStat("Punti totali", 282);
        sdrogocorse.aggiungiPunteggio(s25_7);

        Punteggio s25_8 = new Punteggio("TITTI-2", "2025");
        s25_8.addStat("Partecipazioni", 2); s25_8.addStat("Elenchi vinti", 0); s25_8.addStat("Win %", "0%"); s25_8.addStat("Media punti elenco", 35.00); s25_8.addStat("Media punti gara", 8.75); s25_8.addStat("Punti totali", 70);
        sdrogocorse.aggiungiPunteggio(s25_8);


        // ----------------- GENERAZIONE -----------------
        List<Gioco> giochi = new ArrayList<>();
        giochi.add(golfatine);
        giochi.add(sdrogocorse);

        HtmlGenerator generator = new HtmlGenerator();
        generator.generaSito(giochi, "../index.html");
    }
}
