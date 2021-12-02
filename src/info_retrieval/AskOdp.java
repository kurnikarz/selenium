package info_retrieval;

import java.util.*;

public class AskOdp {

    String odp;
    int ile;
    // https://cookpad.com/pl/wyszukaj/zero%20waste

    public AskOdp(int index) {
        List<String> odpowiedzi = new ArrayList<>();

        odpowiedzi.add("Zapiekanka" +
                "\n" +
                "\n" +
                "\n" +
                "    Opakowania makaronu (u mnie kokardki)\n" +
                "    Ser (żółty mozzarella)\n" +
                "    Pomidor\n" +
                "    Szynka\n" +
                "    Zioła np tymianek\n" +
                "    1 łyżka masła\n" +
                "    2 łyżki mąki\n" +
                "    2 szklanki mleka\n" +
                "    1 szczypta gałki muszkatołowej\n" +
                "    1 szczypta kurkumy sól pieprz\n" +
                "\n" +
                "" +
                "1. Makaron gotujemy w osolonej wodzie przelewamy na sito płuczemy. Szynkę i pozostałe składniki kroimy w kostkę. Masło roztopić w garnku. Dodać mąkę wymieszać i gdy tylko połączy się z masłem dodać mleko. Mieszamy energicznie trzepaczką by nie zrobiły się grudki. Gotować chwilę aby sos zgęstniał. Doprawić sól pieprz kurkumą i gałką muszkatołową do smaku (nie wolno z nią przesadzić bo sos będzie nie dobry.)" +
                "2. Makaron mieszamy z pokrojonymi składnikami i częścią startego sera. Przekładamy do naczynia żaroodpornego zalewamy sosem beszamelowy posypujemy resztą sera i kładziemy pokrojone w plastry ser mozarella. Piec 180 st około 40 min.\n" +
                "Posypujemy ziołami. SMACZNEGO!");


        // ==================================================================================

        odpowiedzi.add("Rolada dwa mięsa " +
                "\n" +
                "\n" +
                "    2 bardzo duże filety z kurczaka\n" +
                "    300 g karkówki\n" +
                "    1 opakowania ciasta filo\n" +
                "    5 łyżek musztardy dijon\n" +
                "    5 żółtek\n" +
                "    3 łyżki roztopionego masła\n" +
                "    Sól, pieprz, zioła prowansalskie\n" +
                "\n" +
                "1. Filety podzielic na kotlety i cienko rozbić. Oprószyć z jednej strony solą i pieprzem. Karkówkę pokroić w paski również przyprawić solą i pieprzem. Z drugiej strony filet posmarować musztardą i poukładać karkówkę tak do połowy fileta. Zwinąć roladę." +
                "2. Płat ciasta posmarować roztrzepanym żółtkiem. Na brzegu ciasta ułożyć roladkę założyć brzegi do środka i zawinąć roladkę (taki większy gołąbek)." +
                "3. Wyłożyć na blaszkę do pieczenia, posmarować roztopionym masłem i posypać ziołami prowansalskimi. Piec w piekarniku nagrzanym do 180°C 40-50 min. Wyłączyć piekarnik i zostawić jeszcze na 20 min.");



        // ==================================================================================

        odpowiedzi.add("Bananowiec" +
                "\n" +
                "\n" +
                "    5 bananów (bardzo dojrzałe)\n" +
                "    2 szklanki mąki pszennej\n" +
                "    1 łyżeczka proszku do pieczenia\n" +
                "    1 łyżeczka sody oczyszczonej\n" +
                "    2 jaja\n" +
                "    120 gr miękkiego masła\n" +
                "    8 łyżek mleka ciepłego\n" +
                "    3/4 szklanki cukru\n" +
                "\n" +
                "1. Banana rozgnieść widelcem na papkę. Mąkę wymieszać i przesiać z proszkiem i sodą. Masło utrzeć z cukrem. Miksując dodać po jednym jajku. Następnie dodawać naprzemiennie: mąkę, mleko, banana. Masa nie powinna być gęsta, jednak tak może się zdarzyć, wówczas wszystko wymieszać łyżką." +
                "2. Foremki keksówki (dwie małe) wysmarować masłem i wlać ciasto. Piekarnik nagrzać do 180stopni i piec około 50 minut. Do suchego patyczka." +
                "3. Ciasto pozostawić do wystygnięcia w piekarniku.");


        // ==================================================================================


        odpowiedzi.add("Makaron z duszonymi warzywami z kalarepką " +
                "" +
                "\n" +
                "\n" +
                "    50 gram makaronu pełnoziarnistego\n" +
                "    1 Papryka czerwona\n" +
                "    Pół kalarepki\n" +
                "    Liście i łodygi kalarepy\n" +
                "    3 ząbki czosnku\n" +
                "    Pół cebuli\n" +
                "    Kawałek cukinii\n" +
                "    2 łyżki oliwy do smażenia\n" +
                "    Przyprawy\n" +
                "    Bazylia\n" +
                "    Sól\n" +
                "    Pieprz\n" +
                "    Natka pietruszki\n" +
                "\n" +
                "" +
                "1. Warzywa umyj i pokrój w kosteczkę, liście i łodygi kalarepki rozdrobnij" +
                "2. Wstaw wodę na makaron, wrzuć do osolonej wody pokrojoną kalarepkę (korzeń)" +
                "3. Na oliwie podsmaż paprykę cukinię cebulę i czosnek. Dodaj też pokrojone liście i łodygi kalarepki. Duś pod przykryciem. W razie potrzeby dodaj wody. Przypraw do smaku." +
                "4. Po 10 minutach do gotującej się kalarepki wrzuć makaron i gotuj jeszcze około 10 minut zgodnie z przepisem na opakowaniu" +
                "5. \n" +
                "\n" +
                "Odcedź makaron i kalarepkę. Wyłóż wszystko na talerz. Posyp natką pietruszki i bazylią. Smacznego\n");


        odp = odpowiedzi.get(index);
        ile = odpowiedzi.size();
    }

}
