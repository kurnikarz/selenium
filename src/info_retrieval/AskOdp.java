package info_retrieval;

import java.util.*;

public class AskOdp {

    String odp;
    int ile;
    // https://misamocy.pl/kategoria/przepisy/zero-waste/

    public AskOdp(int index) {
        List<String> odpowiedzi = new ArrayList<>();

        odpowiedzi.add("Stek z głąba kapusty pekińskiej" +
                "\n" +
                "– głąb z kapusty pekińskiej\n" +
                "\n" +
                "– 2 łyżki oleju\n" +
                "\n" +
                "– 2 ząbki czosnku\n" +
                "\n" +
                "– sól\n" +
                "\n" +
                "– dodatki : czarnuszka, suszona cebula" +
                "\n" +
                "1. Głąb z kapusty przekrawamy na pół. Czosnek obieramy i rozgniatamy delikatnie nożem (chodzio to żeby pękł).\n" +
                "2. Na patelni rozgrzewamy olej, wrzucamy czosnek i chwilkę smażymy, kładziemy połówki kapusty (środkiem do dołu). Przykrywamy pokrywką i dusimy na średnim ogniu około 10 minut.\n" +
                "3. Odkrywamy pokrywkę i smażymy jeszcze około 5 minut, aż spód zyska złoty kolor.\n" +
                "4. Wykładamy na talerz solimy i posypujemy dodatkami");


        odpowiedzi.add("Lemoniada kokosowo-truskawkowa" +
                "\n" +
                "Składniki:\n" +
                "\n" +
                "– ½ kg truskawek\n" +
                "– 600 ml wody z puszki pozostałej po wyjęciu gęstej części mleka kokosowego\n" +
                "– sok z 1 cytryny\n" +
                "– ksylitol do smaku\n" +
                "– 300 ml wody\n" +
                "– listki mięty lub melisy do ozdoby\n" +
                "– kilka truskawek do ozdoby" +
                "\n" +
                "Umyte i odszypułkowane truskawki blendujemy z wodą kokosową, sokiem z cytryny oraz wodą. Dodajemy do smaku ksylitol. Przelewamy do szklanek, dekorujemy ziołami i truskawkami.");


        odpowiedzi.add("chipsy z jarmużu" +
                "\n" +
                "– jarmuż\n" +
                "\n" +
                "– sól\n" +
                "\n" +
                "– olej\n" +
                "\n" +
                "– ostra papryka" +
                "\n" +
                "1. Liście jarmużu myjemy, jeżeli są duże i główny nerw jest gruby, to nie ma szansy, żeby się upiekł. Można go wyciąć lub zostawić i jeść chipsy trzymając za niego jak za patyczek.\n" +
                "2. Do miski wrzucamy liście, skrapiamy olejem, dodajemy sól oraz ostrą paprykę i mieszamy dłońmi w ten sposób, by równomiernie natłuścić liście. Układamy obok siebie na blaszce wyłożonej papierem do pieczenia.\n" +
                "3. Pieczemy około 10-15 minut na górnej półce piekarnika rozgrzanego do temperatury 120 stopni C");

        odpowiedzi.add("Sałatka z liści botwinki z kwaśną nerkowcową śmietaną" +
                "\n" +
                "Składniki:\n" +
                "\n" +
                "– liście botwinki\n" +
                "\n" +
                "– 1/2 dużego ogórka\n" +
                "\n" +
                "– kilka gałązek koperku\n" +
                "\n" +
                "Składniki na śmietanę:\n" +
                "\n" +
                "– 100 g orzechów nerkowca moczonych min. 8 godzin (opcjonalnie nasiona słonecznika)\n" +
                "\n" +
                "– 100 – 200 ml mleka roślinnego\n" +
                "\n" +
                "– sok z cytryny, sól, pieprz i ksylitol do smaku" +
                "\n" +
                "1. Liście botwinki kroimy w paski, ogórek w plasterki, koperek siekamy i wszystko wrzucamy do jednej miski." +
                "2. Orzechy nerkowca odsączamy, dodajemy mleko roślinne i blendujemy na gładką śmietanę. Doprawiamy do smaku.");


        odp = odpowiedzi.get(index);
        ile = odpowiedzi.size();
    }

}
