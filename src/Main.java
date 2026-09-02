import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // ----------------- GOLFATINE -----------------
        List<String> colonneGolf = Arrays.asList("Partite Giocate", "Vittorie", "Win %", "Media Punti", "Over/Under Par");
        Gioco golfatine = new Gioco("Golfatine", colonneGolf);

        // Delux
        Punteggio delux = new Punteggio("Delux");
        delux.addStat("Partite Giocate", 71);
        delux.addStat("Vittorie", 24);
        delux.addStat("Win %", "33.8%");
        delux.addStat("Media Punti", 70.46);
        delux.addStat("Over/Under Par", "+9.84");
        golfatine.aggiungiPunteggio(delux);

        // Just Rohn
        Punteggio rohn = new Punteggio("Just Rohn");
        rohn.addStat("Partite Giocate", 60);
        rohn.addStat("Vittorie", 21);
        rohn.addStat("Win %", "35.0%");
        rohn.addStat("Media Punti", 71.53);
        rohn.addStat("Over/Under Par", "+9.95");
        golfatine.aggiungiPunteggio(rohn);

        // nonsonodread
        Punteggio dread = new Punteggio("nonsonodread");
        dread.addStat("Partite Giocate", 76);
        dread.addStat("Vittorie", 20);
        dread.addStat("Win %", "26.3%");
        dread.addStat("Media Punti", 70.60);
        dread.addStat("Over/Under Par", "+10.51");
        golfatine.aggiungiPunteggio(dread);

        // ilMasseo
        Punteggio masseo = new Punteggio("ilMasseo");
        masseo.addStat("Partite Giocate", 35);
        masseo.addStat("Vittorie", 8);
        masseo.addStat("Win %", "22.9%");
        masseo.addStat("Media Punti", 80.37);
        masseo.addStat("Over/Under Par", "+15.57");
        golfatine.aggiungiPunteggio(masseo);

        // Mollu
        Punteggio mollu = new Punteggio("Mollu");
        mollu.addStat("Partite Giocate", 28);
        mollu.addStat("Vittorie", 8);
        mollu.addStat("Win %", "28.6%");
        mollu.addStat("Media Punti", 86.46);
        mollu.addStat("Over/Under Par", "+24.57");
        golfatine.aggiungiPunteggio(mollu);

        // GaBBo
        Punteggio gabbo = new Punteggio("GaBBo");
        gabbo.addStat("Partite Giocate", 65);
        gabbo.addStat("Vittorie", 4);
        gabbo.addStat("Win %", "6.2%");
        gabbo.addStat("Media Punti", 84.05);
        gabbo.addStat("Over/Under Par", "+24.28");
        golfatine.aggiungiPunteggio(gabbo);

        // JTaz
        Punteggio jtaz = new Punteggio("JTaz");
        jtaz.addStat("Partite Giocate", 22);
        jtaz.addStat("Vittorie", 1);
        jtaz.addStat("Win %", "4.5%");
        jtaz.addStat("Media Punti", 80.03);
        jtaz.addStat("Over/Under Par", "+22.33");
        golfatine.aggiungiPunteggio(jtaz);

        // Just Marzaa
        Punteggio marza = new Punteggio("Just Marzaa");
        marza.addStat("Partite Giocate", 1);
        marza.addStat("Vittorie", 0);
        marza.addStat("Win %", "0.0%");
        marza.addStat("Media Punti", 45.00);
        marza.addStat("Over/Under Par", "-9.00");
        golfatine.aggiungiOspite(marza);

        // nbayungchape
        Punteggio nbay = new Punteggio("nbayungchape");
        nbay.addStat("Partite Giocate", 2);
        nbay.addStat("Vittorie", 0);
        nbay.addStat("Win %", "0.0%");
        nbay.addStat("Media Punti", 60.50);
        nbay.addStat("Over/Under Par", "-1.50");
        golfatine.aggiungiOspite(nbay);

        // fava
        Punteggio fava = new Punteggio("fava");
        fava.addStat("Partite Giocate", 2);
        fava.addStat("Vittorie", 0);
        fava.addStat("Win %", "0.0%");
        fava.addStat("Media Punti", 78.50);
        fava.addStat("Over/Under Par", "+16.50");
        golfatine.aggiungiOspite(fava);


        // ----------------- SDROGOCORSE -----------------
        List<String> colonneSdrogocorse = Arrays.asList("Partecipazioni", "Elenchi vinti", "Win %", "Media punti elenco", "Media punti gara", "Punti totali");
        Gioco sdrogocorse = new Gioco("Sdrogocorse", colonneSdrogocorse);
        
        Punteggio p1 = new Punteggio("Mollura-");
        p1.addStat("Partecipazioni", 12);
        p1.addStat("Elenchi vinti", 5);
        p1.addStat("Win %", "42%");
        p1.addStat("Media punti elenco", 38.67);
        p1.addStat("Media punti gara", 9.47);
        p1.addStat("Punti totali", 464);
        sdrogocorse.aggiungiPunteggio(p1);

        Punteggio p2 = new Punteggio("GaBbODSQUARED");
        p2.addStat("Partecipazioni", 17);
        p2.addStat("Elenchi vinti", 4);
        p2.addStat("Win %", "24%");
        p2.addStat("Media punti elenco", 34.00);
        p2.addStat("Media punti gara", 8.50);
        p2.addStat("Punti totali", 578);
        sdrogocorse.aggiungiPunteggio(p2);

        Punteggio p3 = new Punteggio("Deluxiah");
        p3.addStat("Partecipazioni", 22);
        p3.addStat("Elenchi vinti", 5);
        p3.addStat("Win %", "23%");
        p3.addStat("Media punti elenco", 37.50);
        p3.addStat("Media punti gara", 9.38);
        p3.addStat("Punti totali", 825);
        sdrogocorse.aggiungiPunteggio(p3);

        Punteggio p4 = new Punteggio("ilMasseo");
        p4.addStat("Partecipazioni", 21);
        p4.addStat("Elenchi vinti", 4);
        p4.addStat("Win %", "19%");
        p4.addStat("Media punti elenco", 37.10);
        p4.addStat("Media punti gara", 9.16);
        p4.addStat("Punti totali", 779);
        sdrogocorse.aggiungiPunteggio(p4);

        Punteggio p5 = new Punteggio("JRohn7");
        p5.addStat("Partecipazioni", 20);
        p5.addStat("Elenchi vinti", 3);
        p5.addStat("Win %", "15%");
        p5.addStat("Media punti elenco", 34.80);
        p5.addStat("Media punti gara", 8.59);
        p5.addStat("Punti totali", 696);
        sdrogocorse.aggiungiPunteggio(p5);

        Punteggio p6 = new Punteggio("TITTI-2");
        p6.addStat("Partecipazioni", 14);
        p6.addStat("Elenchi vinti", 2);
        p6.addStat("Win %", "14%");
        p6.addStat("Media punti elenco", 28.36);
        p6.addStat("Media punti gara", 7.09);
        p6.addStat("Punti totali", 397);
        sdrogocorse.aggiungiPunteggio(p6);

        Punteggio p7 = new Punteggio("StillDread");
        p7.addStat("Partecipazioni", 22);
        p7.addStat("Elenchi vinti", 1);
        p7.addStat("Win %", "5%");
        p7.addStat("Media punti elenco", 32.82);
        p7.addStat("Media punti gara", 8.11);
        p7.addStat("Punti totali", 722);
        sdrogocorse.aggiungiPunteggio(p7);

        List<Gioco> giochi = new ArrayList<>();
        giochi.add(golfatine);
        giochi.add(sdrogocorse);

        HtmlGenerator generator = new HtmlGenerator();
        generator.generaSito(giochi, "index.html");
    }
}
