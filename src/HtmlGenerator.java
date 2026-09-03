import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
            writer.println("            --bg-color: #050505;");
            writer.println("            --card-bg: #111111;");
            writer.println("            --text-primary: #ffffff;");
            writer.println("            --text-secondary: #aaaaaa;");
            writer.println("            --accent-color: #92c300;");
            writer.println("            --guest-color: #f59e0b;");
            writer.println("        }");
            writer.println("        body {");
            writer.println("            margin: 0; padding: 20px;");
            writer.println("            background-color: var(--bg-color); color: var(--text-primary);");
            writer.println("            font-family: 'Inter', sans-serif; min-height: 100vh;");
            writer.println("            display: flex; flex-direction: column; align-items: center;");
            writer.println("        }");
            writer.println("        header {");
            writer.println("            width: 100%; max-width: 1000px; text-align: left;");
            writer.println("            margin-top: 20px; margin-bottom: 40px;");
            writer.println("            border-bottom: 1px solid #333; padding-bottom: 15px;");
            writer.println("        }");
            writer.println("        .header-sub {");
            writer.println("            font-size: 0.9rem; font-weight: 600; letter-spacing: 2px;");
            writer.println("            color: var(--text-secondary); margin: 0; text-transform: uppercase;");
            writer.println("        }");
            writer.println("        .header-main {");
            writer.println("            font-family: 'Outfit', sans-serif; font-size: 3rem; font-weight: 900;");
            writer.println("            margin: 0; letter-spacing: 1px; text-transform: uppercase; color: #fff;");
            writer.println("        }");
            writer.println("        .tabs {");
            writer.println("            display: grid; grid-template-columns: 1fr 1fr; gap: 20px;");
            writer.println("            width: 100%; max-width: 1000px; margin-bottom: 40px;");
            writer.println("        }");
            writer.println("        @media(max-width: 700px) { .tabs { grid-template-columns: 1fr; } }");
            writer.println("        .tab-button {");
            writer.println("            background: var(--card-bg); border: 2px solid #222;");
            writer.println("            color: var(--text-primary); padding: 30px; text-align: left;");
            writer.println("            height: 250px; display: flex; flex-direction: column; justify-content: flex-end;");
            writer.println("            cursor: pointer; transition: all 0.2s ease; border-radius: 4px;");
            writer.println("        }");
            writer.println("        .tab-button:hover { border-color: var(--accent-color); transform: scale(1.02); }");
            writer.println("        .tab-button.active { border-color: var(--accent-color); background: #1a1a1a; }");
            writer.println("        .tab-sub {");
            writer.println("            display: block; font-size: 0.8rem; font-weight: 600; letter-spacing: 2px;");
            writer.println("            color: var(--text-secondary); margin-bottom: 5px; text-transform: uppercase;");
            writer.println("        }");
            writer.println("        .tab-title {");
            writer.println("            display: block; font-family: 'Outfit', sans-serif;");
            writer.println("            font-size: 2rem; font-weight: 900; text-transform: uppercase;");
            writer.println("        }");
            writer.println("        .content-container { width: 100%; max-width: 1000px; margin-bottom: 50px; }");
            writer.println("        .leaderboard { display: none; animation: fadeIn 0.5s ease; }");
            writer.println("        .leaderboard.active { display: block; }");
            writer.println("        @keyframes fadeIn { from { opacity: 0; transform: translateY(10px); } to { opacity: 1; transform: translateY(0); } }");
            writer.println("        .card {");
            writer.println("            background: var(--card-bg);");
            writer.println("            border: 1px solid #333; padding: 30px;");
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
            writer.println("        .season-filters { margin-bottom: 20px; display: flex; gap: 15px; align-items: center; background: rgba(0,0,0,0.2); padding: 15px; border-radius: 10px; }");
            writer.println("        .season-filters label { cursor: pointer; display: flex; align-items: center; gap: 5px; font-weight: bold; }");
            writer.println("        .season-filters input { width: 18px; height: 18px; accent-color: var(--accent-color); cursor: pointer; }");
            writer.println("    </style>");
            writer.println("</head>");
            writer.println("<body>");
            
            writer.println("    <header onclick=\"goHome()\" style=\"cursor: pointer;\" title=\"Torna alla Home\">");
            writer.println("        <h2 class=\"header-sub\">GAMING STATS</h2>");
            writer.println("        <h1 class=\"header-main\">MELAGODO</h1>");
            writer.println("    </header>");
            
            writer.println("    <button id=\"back-button\" onclick=\"goHome()\" style=\"display:none; background:none; border:1px solid #333; color:#aaa; padding:10px 20px; cursor:pointer; margin-bottom:20px; align-self:flex-start;\">← Torna al Menù</button>");

            writer.println("    <div id=\"tabs-container\" style=\"width: 100%; max-width: 1000px;\">");
            writer.println("        <div style=\"margin-bottom: 30px;\">");
            writer.println("            <span class=\"header-sub\" style=\"letter-spacing: 3px;\">MENU PRINCIPALE</span>");
            writer.println("            <span class=\"header-main\" style=\"display:block; font-size: 4rem;\">CLASSIFICHE</span>");
            writer.println("        </div>");
            writer.println("        <div class=\"tabs\">");
            for (int i = 0; i < giochi.size(); i++) {
                writer.println("            <button class=\"tab-button\" onclick=\"openTab(event, 'gioco_" + i + "')\">");
                writer.println("                <span class=\"tab-title\">" + giochi.get(i).getNome() + "</span>");
                writer.println("            </button>");
            }
            writer.println("        </div>");
            writer.println("    </div>");
            
            writer.println("    <script>");
            writer.println("        const multiSeasonData = {};");
            writer.println("        const multiSeasonGuestsData = {};");
            writer.println("    </script>");

            writer.println("    <div class=\"content-container\">");
            for (int i = 0; i < giochi.size(); i++) {
                Gioco g = giochi.get(i);
                // Controlla se il gioco ha stagioni
                boolean hasSeasons = false;
                List<String> stagioni = new ArrayList<>();
                for (Punteggio p : g.getClassifica()) {
                    if (p.getStagione() != null) {
                        hasSeasons = true;
                        if (!stagioni.contains(p.getStagione())) stagioni.add(p.getStagione());
                    }
                }
                writer.println("        <div id=\"gioco_" + i + "\" class=\"leaderboard\">");
                writer.println("            <div class=\"card\">");
                writer.println("                <h2 class=\"section-title\">Classifica Ufficiale</h2>");
                
                if (hasSeasons) {
                    writer.println("                <div class=\"season-filters\">");
                    writer.println("                    <span>Seleziona Stagioni da sommare:</span>");
                    for(String s : stagioni) {
                        String isChecked = s.equals("2026") ? "checked" : "";
                        writer.println("                    <label><input type=\"checkbox\" value=\"" + s + "\" " + isChecked + " onchange=\"renderMultiSeason(" + i + ")\"> " + s + "</label>");
                    }
                    writer.println("                </div>");
                    
                    // Inietta i dati JSON
                    writer.println("                <script>");
                    writer.println("                    multiSeasonData[" + i + "] = [");
                    for (Punteggio p : g.getClassifica()) {
                        writer.print("                        { giocatore: '" + p.getNomeGiocatore().replace("'", "\\'") + "', stagione: '" + p.getStagione() + "', stats: { ");
                        for (String col : g.getIntestazioniColonne()) {
                            Object val = p.getStatistiche().get(col);
                            if (val != null) {
                                String valStr = val.toString().replace(",", ".").replace("%","").replace("+","");
                                writer.print("'" + col + "': " + valStr + ", ");
                            }
                        }
                        writer.println("} },");
                    }
                    writer.println("                    ];");
                    writer.println("                    multiSeasonGuestsData[" + i + "] = [");
                    for (Punteggio p : g.getOspiti()) {
                        writer.print("                        { giocatore: '" + p.getNomeGiocatore().replace("'", "\\'") + "', stagione: '" + p.getStagione() + "', stats: { ");
                        for (String col : g.getIntestazioniColonne()) {
                            Object val = p.getStatistiche().get(col);
                            if (val != null) {
                                String valStr = val.toString().replace(",", ".").replace("%","").replace("+","");
                                writer.print("'" + col + "': " + valStr + ", ");
                            }
                        }
                        writer.println("} },");
                    }
                    writer.println("                    ];");
                    writer.println("                </script>");
                }
                
                List<Punteggio> classifica = g.getClassifica();
                if (classifica.isEmpty()) {
                    writer.println("                <div style=\"text-align: center; color: var(--text-secondary);\">Nessun dato.</div>");
                } else {
                    writer.println("                <table id=\"table_" + i + "\">");
                    writer.println("                    <thead><tr>");
                    writer.println("                        <th onclick=\"sortTable('table_" + i + "', 0)\">Giocatore <span class=\"sort-icon\">&#8597;</span></th>");
                    
                    int colIndex = 1;
                    for (String col : g.getIntestazioniColonne()) {
                        writer.println("                        <th onclick=\"sortTable('table_" + i + "', " + colIndex + ")\">" + col + " <span class=\"sort-icon\">&#8597;</span></th>");
                        colIndex++;
                    }
                    writer.println("                    </tr></thead>");
                    writer.println("                    <tbody id=\"tbody_" + i + "\">");
                    
                    if (!hasSeasons) {
                        for (Punteggio p : classifica) {
                            writer.println("                        <tr>");
                            writer.println("                            <td class=\"player-name\">" + p.getNomeGiocatore() + "</td>");
                            for (String col : g.getIntestazioniColonne()) {
                                Object val = p.getStatistiche().get(col);
                                writer.println("                            <td>" + (val != null ? val : "-") + "</td>");
                            }
                            writer.println("                        </tr>");
                        }
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
                    writer.println("                        <th onclick=\"sortTable('table_ospiti_" + i + "', 0)\">Ospite <span class=\"sort-icon\">&#8597;</span></th>");
                    
                    int colIndex = 1;
                    for (String col : g.getIntestazioniColonne()) {
                        writer.println("                        <th onclick=\"sortTable('table_ospiti_" + i + "', " + colIndex + ")\">" + col + " <span class=\"sort-icon\">&#8597;</span></th>");
                        colIndex++;
                    }
                    writer.println("                    </tr></thead>");
                    writer.println("                    <tbody id=\"tbody_ospiti_" + i + "\">");
                    
                    if (!hasSeasons) {
                        for (Punteggio p : ospiti) {
                            writer.println("                        <tr>");
                            writer.println("                            <td class=\"player-name\">" + p.getNomeGiocatore() + "</td>");
                            for (String col : g.getIntestazioniColonne()) {
                                Object val = p.getStatistiche().get(col);
                                writer.println("                            <td>" + (val != null ? val : "-") + "</td>");
                            }
                            writer.println("                        </tr>");
                        }
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
            writer.println("            document.getElementById('tabs-container').style.display = 'none';");
            writer.println("            document.getElementById('back-button').style.display = 'block';");
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
            writer.println("        function goHome() {");
            writer.println("            document.getElementById('tabs-container').style.display = 'block';");
            writer.println("            document.getElementById('back-button').style.display = 'none';");
            writer.println("            var leaderboards = document.getElementsByClassName(\"leaderboard\");");
            writer.println("            for (var i = 0; i < leaderboards.length; i++) {");
            writer.println("                leaderboards[i].className = leaderboards[i].className.replace(\" active\", \"\");");
            writer.println("            }");
            writer.println("        }");
            
            // Render dinamico per le stagioni
            writer.println("        function renderMultiSeason(gameIndex) {");
            writer.println("            const container = document.getElementById('gioco_' + gameIndex);");
            writer.println("            const checkboxes = container.querySelectorAll('.season-filters input[type=checkbox]:checked');");
            writer.println("            const selectedSeasons = Array.from(checkboxes).map(c => c.value);");
            writer.println("            const rawData = multiSeasonData[gameIndex] || [];");
            writer.println("            const rawGuestsData = multiSeasonGuestsData[gameIndex] || [];");
            writer.println("            ");
            writer.println("            function renderGroup(dataList, tbodyId, tableId) {");
            writer.println("                const aggregated = {};");
            writer.println("                dataList.forEach(row => {");
            writer.println("                    if (selectedSeasons.includes(row.stagione)) {");
            writer.println("                        if (!aggregated[row.giocatore]) {");
            writer.println("                            aggregated[row.giocatore] = { ");
            writer.println("                               giocatore: row.giocatore, ");
            writer.println("                               Partecipazioni: 0, ");
            writer.println("                               'Elenchi vinti': 0,");
            writer.println("                               'Punti totali': 0 ");
            writer.println("                            };");
            writer.println("                        }");
            writer.println("                        aggregated[row.giocatore].Partecipazioni += row.stats['Partecipazioni'] || 0;");
            writer.println("                        aggregated[row.giocatore]['Elenchi vinti'] += row.stats['Elenchi vinti'] || 0;");
            writer.println("                        aggregated[row.giocatore]['Punti totali'] += row.stats['Punti totali'] || 0;");
            writer.println("                    }");
            writer.println("                });");
            writer.println("                ");
            writer.println("                const tbody = document.getElementById(tbodyId);");
            writer.println("                if (!tbody) return;");
            writer.println("                tbody.innerHTML = '';");
            writer.println("                ");
            writer.println("                Object.values(aggregated).forEach(p => {");
            writer.println("                    if(p.Partecipazioni === 0) return;");
            writer.println("                    let winPct = ((p['Elenchi vinti'] / p.Partecipazioni) * 100).toFixed(1) + '%';");
            writer.println("                    let mediaElenco = (p['Punti totali'] / p.Partecipazioni).toFixed(2);");
            writer.println("                    let mediaGara = (p['Punti totali'] / (p.Partecipazioni * 4)).toFixed(2);");
            writer.println("                    ");
            writer.println("                    let tr = document.createElement('tr');");
            writer.println("                    tr.innerHTML = `");
            writer.println("                        <td class=\"player-name\">${p.giocatore}</td>");
            writer.println("                        <td>${p.Partecipazioni}</td>");
            writer.println("                        <td>${p['Elenchi vinti']}</td>");
            writer.println("                        <td>${winPct}</td>");
            writer.println("                        <td>${mediaElenco}</td>");
            writer.println("                        <td>${mediaGara}</td>");
            writer.println("                        <td>${p['Punti totali']}</td>");
            writer.println("                    `;");
            writer.println("                    tbody.appendChild(tr);");
            writer.println("                });");
            writer.println("                sortTable(tableId, 1);");
            writer.println("            }");
            writer.println("            renderGroup(rawData, 'tbody_' + gameIndex, 'table_' + gameIndex);");
            writer.println("            renderGroup(rawGuestsData, 'tbody_ospiti_' + gameIndex, 'table_ospiti_' + gameIndex);");
            writer.println("        }");

            writer.println("        function sortTable(tableId, n) {");
            writer.println("            var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;");
            writer.println("            table = document.getElementById(tableId);");
            writer.println("            if (!table || !table.rows || table.rows.length <= 1) return;");
            writer.println("            switching = true; dir = \"desc\";");
            writer.println("            while (switching) {");
            writer.println("                switching = false;");
            writer.println("                rows = table.rows;");
            writer.println("                for (i = 1; i < (rows.length - 1); i++) {");
            writer.println("                    shouldSwitch = false;");
            writer.println("                    x = rows[i].getElementsByTagName(\"TD\")[n];");
            writer.println("                    y = rows[i + 1].getElementsByTagName(\"TD\")[n];");
            writer.println("                    if(!x || !y) continue;");
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
            writer.println("                    switching = true; switchcount ++;");
            writer.println("                } else {");
            writer.println("                    if (switchcount == 0 && dir == \"desc\") { dir = \"asc\"; switching = true; }");
            writer.println("                }");
            writer.println("            }");
            writer.println("        }");
            
            writer.println("        window.onload = function() {");
            writer.println("            if(document.getElementById('table_0')) { sortTable('table_0', 1); }");
            writer.println("            if(document.getElementById('table_ospiti_0')) { sortTable('table_ospiti_0', 1); }");
            writer.println("            Object.keys(multiSeasonData).forEach(idx => renderMultiSeason(idx));");
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
