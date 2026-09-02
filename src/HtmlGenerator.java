import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class HtmlGenerator {

    public void generaSito(List<Gioco> giochi, String percorsoFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(percorsoFile))) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html lang=\"it\">");
            writer.println("<head>");
            writer.println("    <meta charset=\"UTF-8\">");
            writer.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            writer.println("    <title>Classifiche Giochi</title>");
            
            writer.println("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">");
            writer.println("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>");
            writer.println("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@300;400;600&family=Outfit:wght@500;700;900&display=swap\" rel=\"stylesheet\">");
            
            writer.println("    <style>");
            writer.println("        :root {");
            writer.println("            --bg-color: #0f172a;");
            writer.println("            --card-bg: rgba(30, 41, 59, 0.7);");
            writer.println("            --text-primary: #f8fafc;");
            writer.println("            --text-secondary: #94a3b8;");
            writer.println("            --accent-color: #3b82f6;");
            writer.println("            --accent-glow: rgba(59, 130, 246, 0.5);");
            writer.println("            --guest-color: #f59e0b;");
            writer.println("        }");
            writer.println("        body {");
            writer.println("            margin: 0;");
            writer.println("            padding: 0;");
            writer.println("            background-color: var(--bg-color);");
            writer.println("            color: var(--text-primary);");
            writer.println("            font-family: 'Inter', sans-serif;");
            writer.println("            min-height: 100vh;");
            writer.println("            display: flex;");
            writer.println("            flex-direction: column;");
            writer.println("            align-items: center;");
            writer.println("            background: radial-gradient(circle at top, #1e293b 0%, #0f172a 100%);");
            writer.println("        }");
            writer.println("        header { margin-top: 50px; text-align: center; }");
            writer.println("        h1 {");
            writer.println("            font-family: 'Outfit', sans-serif; font-size: 3rem; font-weight: 900;");
            writer.println("            background: linear-gradient(to right, #60a5fa, #c084fc);");
            writer.println("            -webkit-background-clip: text; -webkit-text-fill-color: transparent;");
            writer.println("            text-shadow: 0px 4px 15px rgba(96, 165, 250, 0.3); margin: 0;");
            writer.println("        }");
            writer.println("        .tabs { display: flex; gap: 15px; margin-top: 40px; margin-bottom: 20px; }");
            writer.println("        .tab-button {");
            writer.println("            background: rgba(255,255,255,0.05); border: 1px solid rgba(255,255,255,0.1);");
            writer.println("            color: var(--text-primary); padding: 10px 25px; border-radius: 30px;");
            writer.println("            cursor: pointer; font-family: 'Outfit', sans-serif; font-weight: 600; font-size: 1rem; transition: all 0.3s ease;");
            writer.println("        }");
            writer.println("        .tab-button:hover { background: rgba(255,255,255,0.1); transform: translateY(-2px); }");
            writer.println("        .tab-button.active { background: var(--accent-color); border-color: var(--accent-color); box-shadow: 0 0 15px var(--accent-glow); }");
            writer.println("        .content-container { width: 100%; max-width: 900px; margin-bottom: 50px; }");
            writer.println("        .leaderboard { display: none; animation: fadeIn 0.5s ease; }");
            writer.println("        .leaderboard.active { display: block; }");
            writer.println("        @keyframes fadeIn { from { opacity: 0; transform: translateY(10px); } to { opacity: 1; transform: translateY(0); } }");
            writer.println("        .card {");
            writer.println("            background: var(--card-bg); backdrop-filter: blur(10px);");
            writer.println("            border: 1px solid rgba(255,255,255,0.1); border-radius: 20px; padding: 30px; box-shadow: 0 20px 40px rgba(0,0,0,0.4);");
            writer.println("            overflow-x: auto; margin-bottom: 30px;");
            writer.println("        }");
            writer.println("        .section-title {");
            writer.println("            font-family: 'Outfit', sans-serif; font-size: 1.8rem; font-weight: 700;");
            writer.println("            margin-bottom: 20px; margin-top: 0; color: var(--accent-color);");
            writer.println("        }");
            writer.println("        .guests-title { color: var(--guest-color); margin-top: 40px; }");
            writer.println("        table { width: 100%; border-collapse: collapse; }");
            writer.println("        th, td { padding: 12px 15px; text-align: left; border-bottom: 1px solid rgba(255,255,255,0.05); }");
            writer.println("        th { cursor: pointer; color: var(--accent-color); font-family: 'Outfit', sans-serif; font-weight: 700; user-select: none; transition: background 0.2s; border-radius: 8px; }");
            writer.println("        .guests-table th { color: var(--guest-color); }");
            writer.println("        th:hover { background: rgba(255,255,255,0.1); }");
            writer.println("        tbody tr { transition: transform 0.2s, background 0.2s; }");
            writer.println("        tbody tr:hover { transform: scale(1.01); background: rgba(255,255,255,0.03); border-radius: 8px; }");
            writer.println("        .player-name { font-weight: 600; font-size: 1.1rem; }");
            writer.println("        .sort-icon { font-size: 0.8rem; margin-left: 5px; opacity: 0.7; }");
            writer.println("    </style>");
            writer.println("</head>");
            writer.println("<body>");
            
            writer.println("    <header>");
            writer.println("        <h1>Melagodo Classifiche</h1>");
            writer.println("    </header>");

            writer.println("    <div class=\"tabs\">");
            for (int i = 0; i < giochi.size(); i++) {
                String activeClass = (i == 0) ? "active" : "";
                writer.println("        <button class=\"tab-button " + activeClass + "\" onclick=\"openTab(event, 'gioco_" + i + "')\">" + giochi.get(i).getNome() + "</button>");
            }
            writer.println("    </div>");

            writer.println("    <div class=\"content-container\">");
            for (int i = 0; i < giochi.size(); i++) {
                Gioco g = giochi.get(i);
                String activeClass = (i == 0) ? "active" : "";
                
                writer.println("        <div id=\"gioco_" + i + "\" class=\"leaderboard " + activeClass + "\">");
                writer.println("            <div class=\"card\">");
                writer.println("                <h2 class=\"section-title\">Classifica Ufficiale</h2>");
                
                List<Punteggio> classifica = g.getClassifica();
                if (classifica.isEmpty()) {
                    writer.println("                <div style=\"text-align: center; color: var(--text-secondary);\">Nessun dato.</div>");
                } else {
                    writer.println("                <table id=\"table_" + i + "\">");
                    writer.println("                    <thead><tr>");
                    writer.println("                        <th onclick=\"sortTable('table_" + i + "', 0)\">Giocatore <span class=\"sort-icon\">↕</span></th>");
                    
                    int colIndex = 1;
                    for (String col : g.getIntestazioniColonne()) {
                        writer.println("                        <th onclick=\"sortTable('table_" + i + "', " + colIndex + ")\">" + col + " <span class=\"sort-icon\">↕</span></th>");
                        colIndex++;
                    }
                    writer.println("                    </tr></thead>");
                    writer.println("                    <tbody>");
                    
                    for (Punteggio p : classifica) {
                        writer.println("                        <tr>");
                        writer.println("                            <td class=\"player-name\">" + p.getNomeGiocatore() + "</td>");
                        for (String col : g.getIntestazioniColonne()) {
                            Object val = p.getStatistiche().get(col);
                            writer.println("                            <td>" + (val != null ? val : "-") + "</td>");
                        }
                        writer.println("                        </tr>");
                    }
                    
                    writer.println("                    </tbody>");
                    writer.println("                </table>");
                }
                
                // Ospiti d'onore
                List<Punteggio> ospiti = g.getOspiti();
                if (!ospiti.isEmpty()) {
                    writer.println("                <h2 class=\"section-title guests-title\">Ospiti d'Onore</h2>");
                    writer.println("                <table id=\"table_ospiti_" + i + "\" class=\"guests-table\">");
                    writer.println("                    <thead><tr>");
                    writer.println("                        <th onclick=\"sortTable('table_ospiti_" + i + "', 0)\">Ospite <span class=\"sort-icon\">↕</span></th>");
                    
                    int colIndex = 1;
                    for (String col : g.getIntestazioniColonne()) {
                        writer.println("                        <th onclick=\"sortTable('table_ospiti_" + i + "', " + colIndex + ")\">" + col + " <span class=\"sort-icon\">↕</span></th>");
                        colIndex++;
                    }
                    writer.println("                    </tr></thead>");
                    writer.println("                    <tbody>");
                    
                    for (Punteggio p : ospiti) {
                        writer.println("                        <tr>");
                        writer.println("                            <td class=\"player-name\">" + p.getNomeGiocatore() + "</td>");
                        for (String col : g.getIntestazioniColonne()) {
                            Object val = p.getStatistiche().get(col);
                            writer.println("                            <td>" + (val != null ? val : "-") + "</td>");
                        }
                        writer.println("                        </tr>");
                    }
                    
                    writer.println("                    </tbody>");
                    writer.println("                </table>");
                }
                
                writer.println("            </div>");
                writer.println("        </div>");
            }
            writer.println("    </div>");

            writer.println("    <script>");
            writer.println("        function openTab(evt, gameId) {");
            writer.println("            var i, leaderboards, tabbuttons;");
            writer.println("            leaderboards = document.getElementsByClassName(\"leaderboard\");");
            writer.println("            for (i = 0; i < leaderboards.length; i++) {");
            writer.println("                leaderboards[i].className = leaderboards[i].className.replace(\" active\", \"\");");
            writer.println("            }");
            writer.println("            tabbuttons = document.getElementsByClassName(\"tab-button\");");
            writer.println("            for (i = 0; i < tabbuttons.length; i++) {");
            writer.println("                tabbuttons[i].className = tabbuttons[i].className.replace(\" active\", \"\");");
            writer.println("            }");
            writer.println("            document.getElementById(gameId).className += \" active\";");
            writer.println("            evt.currentTarget.className += \" active\";");
            writer.println("        }");
            
            writer.println("        function sortTable(tableId, n) {");
            writer.println("            var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;");
            writer.println("            table = document.getElementById(tableId);");
            writer.println("            if (!table) return;");
            writer.println("            switching = true;");
            writer.println("            dir = \"desc\";"); // Default a decrescente per i punteggi
            writer.println("            while (switching) {");
            writer.println("                switching = false;");
            writer.println("                rows = table.rows;");
            writer.println("                for (i = 1; i < (rows.length - 1); i++) {");
            writer.println("                    shouldSwitch = false;");
            writer.println("                    x = rows[i].getElementsByTagName(\"TD\")[n];");
            writer.println("                    y = rows[i + 1].getElementsByTagName(\"TD\")[n];");
            writer.println("                    var valX = x.innerHTML.toLowerCase();");
            writer.println("                    var valY = y.innerHTML.toLowerCase();");
            writer.println("                    var numX = parseFloat(valX.replace(/[^0-9.-]+/g,\"\"));");
            writer.println("                    var numY = parseFloat(valY.replace(/[^0-9.-]+/g,\"\"));");
            writer.println("                    if(!isNaN(numX) && !isNaN(numY)) { valX = numX; valY = numY; }");
            writer.println("                    if (dir == \"asc\") {");
            writer.println("                        if (valX > valY) { shouldSwitch = true; break; }");
            writer.println("                    } else if (dir == \"desc\") {");
            writer.println("                        if (valX < valY) { shouldSwitch = true; break; }");
            writer.println("                    }");
            writer.println("                }");
            writer.println("                if (shouldSwitch) {");
            writer.println("                    rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);");
            writer.println("                    switching = true;");
            writer.println("                    switchcount ++;");
            writer.println("                } else {");
            writer.println("                    if (switchcount == 0 && dir == \"desc\") {");
            writer.println("                        dir = \"asc\";");
            writer.println("                        switching = true;");
            writer.println("                    }");
            writer.println("                }");
            writer.println("            }");
            writer.println("        }");
            
            // Ordina la prima colonna della prima tabella di default
            writer.println("        window.onload = function() {");
            writer.println("            if(document.getElementById('table_0')) { sortTable('table_0', 1); }");
            writer.println("            if(document.getElementById('table_ospiti_0')) { sortTable('table_ospiti_0', 1); }");
            writer.println("        };");
            writer.println("    </script>");
            
            writer.println("</body>");
            writer.println("</html>");

            System.out.println("Sito generato con successo: " + percorsoFile);
            
        } catch (IOException e) {
            System.err.println("Errore durante la generazione del sito HTML: " + e.getMessage());
        }
    }
}
