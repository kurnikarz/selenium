package info_retrieval;

import java.util.*;

public class AskOdp {

    String odp;
    int ile;
    // https://luksusowakuradomowa.com/category/przepisy/zero-waste/

    public AskOdp(int index) {
        List<String> odpowiedzi = new ArrayList<>();

        odpowiedzi.add("NO WASTE OBIERKI ZIEMNIAKA – POSYPKA" +
                "\n" +
                "    obierki z około 250 g ziemniaków\n" +
                "    50 g cukier" +
                "\n" +
                "1. Piekarnik nastaw na 80 – 90°C (termoobieg)" +
                "2. Obierki z 250 g ziemniaków (powinno być około 80 g) rozłóż dokładnie na blasze wyłożonej papierem do pieczenia i wstaw do piekarnika na około 30 minut\n" +
                "Obierki powinny być dobrze wysuszone, ale nie przypalone" +
                "3. Wyciągnij z piekarnika i odstaw do ostygnięcia" +
                "4. W tym czasie w garnku na małym ogniu zacznij rozpuszczać cukier – aż powstanie rodzaj karmelu – nie mieszaj niech cukier się roztapia powoli sam" +
                "5. Dorzuć wysuszone obierki do garnka z karmelem i energicznie zamieszaj, a następnie przełóż na blachę z papierem do pieczenia i pozostaw około 10 -15 minut do ostygnięcia" +
                "6. Wrzuć do miski robota i zmiksuj parę chwil, aż powstanie posypka" +
                "7. Użyj posypki do tart, quiche, zapiekanek, sałatek itd!");


        // ==================================================================

        odpowiedzi.add("SAŁATKA Z KURCZAKIEM" +
                "\n" +
                "    150 g fasolka szparagowa zielona\n" +
                "    400 g sałata (lub mieszanka różnych sałat, typu rukola, roszponka, lodowa)\n" +
                "    kilka listków bazylia\n" +
                "    100 g żółty ser Emmentaler, albo Gouda (ale nie w plasterkach, tylko w kostce)\n" +
                "    2 łyżeczki kapary\n" +
                "    sól, pieprz do smaku\n" +
                "    25 g sok z cytryny\n" +
                "    30 g oliwa z oliwek\n" +
                "    1 łyżeczka ghee lub zwykłe masło\n" +
                "    150 g resztki pieczonego kurczaka" +
                "\n" +
                "1. Ugotuj fasolkę, lub użyj tą ze słoika; pokrój ją na drobne kawałki i przełóż do miski" +
                "2. Sałatę umyj i podziel na drobniejsze kawałki, przełóż do dużej miski, dorzuć poszarpane listki bazylii" +
                "3. Żółty ser pokrój w kostkę, włóż do miski\n" +
                "4. Dosyp kapary\n" +
                "5. Posól, popieprz, polej sokiem z cytryny i oliwą i zamieszaj\n" +
                "6. W tym czasie na patelni podgrzej masło ghee (lub zwykłe masło) na dość dużym ogniu i podsmaż resztki pieczonego kurczaka. Niech się szybciutko zarumienią!\n" +
                "Jeśli masz skórkę z kurczaka pieczonego, to super, ona bardzo fajnie pasuje do sałatki, podsmaż ją na dużym ogniu również\n" +
                "Kawałki kurczaka połóż na wierzchu sałatki i posyp sumakiem; podaj");

        // ==================================================================

        odpowiedzi.add("ZUPA PASTERNAKOWA Z JABŁKAMI" +
                "\n" +
                "    2 szt cebula\n" +
                "    1 łyżka ghee lub zwykłe masło\n" +
                "    350 g pasternak\n" +
                "    350 g jabłko\n" +
                "    500 g bulion warzywny\n" +
                "    250 g mleko\n" +
                "    2 łyżki biały ser lub gęsta śmietana, lub ewentualnie Almette naturalny" +
                "\n" +
                "1.    Do miski robota wrzuć cebulę i nastaw 5 sekund/prędkość 5\n" +
                "2.     Wrzuć masło i nastaw 3 minuty/100°C/prędkość 2\n" +
                "3.    Pasternak umyj, obierz, pokrój na mniejsze kawałki i wrzuć do miski\n" +
                "4.    Jabłka umyj, przekrój na 4, obierz z gniazd, ale nie obieraj ze skórki; wrzuć do miski\n" +
                "5.    Zalej całość bulionem i gotuj 20 minut/100°C/prędkość 2\n" +
                "6.    Dolej mleko, oraz biały ser i nastaw 2 minuty/100°C/prędkość 2\n" +
                "7.    Nastaw na 1 minutę/prędkość 10\n" +
                "8.    Podawaj z odrobiną tartego parmezanu i kawałkami czerstwego chleba, możesz polać odrobiną oliwy z oliwek, albo z pestek dynii");


        // ==================================================================


        odpowiedzi.add("HALLOUMI PIECZONE W PANIERCE" +
                "\n" +
                "    1 szt ser HALLOUMI\n" +
                "    1 szt białko\n" +
                "    2 łyżki tarta bułka\n" +
                "    1 łyżka parmezan tarty" +
                "\n" +
                "1.    Piekarnik nastaw na 200°C\n" +
                "2.    Ser Halloumi pokrój w kostkę, około 1-2 cm (lub odpowiedniej dla Ciebie wielkości, tak jak lubisz jeść finger foodsy)\n" +
                "3.    Przygotuj 2 mieseczki\n" +
                "    – do pierwszej miseczki wlej białko\n" +
                "    – do drugiej miseczki wsyp bułkę tartą, parmezan tarty (oraz paprykę, bądź też sezam) i zmieszaj wszystko dokładnie razem\n" +
                "4.    Każdy kawałek Halloumi zamocz dokładnie w białku, a następnie w mieseczce z bułką tartą i przypilnuj by cała kosteczka dokładnie została pokryta mieszanką\n" +
                "5.    Przełóż kostki halloumi na blachę od piekarnika wyłożoną papierem do pieczenia, lub Silpatem i zapiekaj około 10 – 15 minut – albo do czasu gdy finger foodsy ładnie się zarumienią (tak jak lubisz – niektórzy lubią bardziej przypalone, inni mniej)\n" +
                "6.    Gotowe! Podawaj z sosami");


        // ==================================================================

        odpowiedzi.add("ZUPA Z KURCZAKIEM Z DNIA WCZORAJSZEGO" +
                "\n" +
                "    1 łyżka ghee lub zwykłe masło\n" +
                "    1 szt cebula\n" +
                "    50 g por\n" +
                "    1 szt liść laurowy\n" +
                "    2 szt marchew\n" +
                "    4 – 5 liści kapusta włoska (savoy)\n" +
                "    750 ml bulion warzywny lub mięsny oczywiście\n" +
                "    160 g makaron typu tagliatelle, lub spaghetti\n" +
                "    ok 200 g resztki pieczonego kurczaka lub kurczaka z rosołu\n" +
                "    pietruszka do pozypania na wierzch" +
                "\n" +
                "1. W garnku, na średnim ogniu, podsmaż na rozpuszczonym ghee – pokrojoną w kosteczkę cebulę, oraz drobno posiekany por – około 2-3 minuty" +
                "2. Dorzuć listek laurowy, pokrojoną w kostkę (lub julienne) marchewkę oraz poszatkowaną w paseczki kapustę, podsmaż około 2-3 minuty" +
                "3. Zalej całość bulionem i na średnim ogniu gotuj około 25 minut" +
                "4. Po tym czasie dodaj makaron, najlepiej pokrusz go na kawałki i gotuj zupę dodatkowe 10 minut\n" +
                "** jeśli chcesz, możesz użyć domowej roboty makaronu (zrób 1 porcję ze 100g mąki, pokrój drobno i dorzuć do zupy) i ale gotuj go tylko 5 minut" +
                "5. Jeśli zupa zrobiła się zbyt gęsta, dolej więcej bulionu lub wody i dosól jeśli trzeba" +
                "6. Na koniec dorzuć pokrojone drobno resztki z kurczaka pieczonego, lub z rosołu" +
                "7. Podaj na talerzach do zupy, posyp odrobiną pietruszki");

        // ==================================================================


        odpowiedzi.add("KOGEL MOGEL ZERO WASTE" +
                "\n" +
                "    4 szt żółtko\n" +
                "    1½ łyżki cukier może być trzcinowy" +
                "\n" +
                "1. Wszystkie składniki wrzuć do miski robota, załóż motylek i nastaw na 5 minut/70°C/prędkość 3");

        // ==================================================================

        odpowiedzi.add("DANIE Z SOCZEWICY I KOMOSY RYŻOWEJ" +
                "\n" +
                "    100 g soczewica sucha (około 200 – 230 g ugotowanej)\n" +
                "    50 g quinoa, komosa ryżowa (około 100 – 130 g ugotowanej)\n" +
                "    1 łyżka ghee lub zwykłe masło\n" +
                "    2 szt cebula\n" +
                "    ½ łyżeczki sól\n" +
                "    4 liście kapusta włoska (savoy)\n" +
                "    200 g pieczarki\n" +
                "    1 pęczek natka pietruszki\n" +
                "    sól, pieprz do smaku\n" +
                "    oliwa z oliwek\n" +
                "    koperek do posypania na wierzchu" +
                "\n" +
                "1. Soczewicę oraz komosę ryżową ugotuj wg wskazówek na opakowaniu" +
                "2. Na dużej patelni rozpuść masło ghee, lub zwykłe masło i podsmaż 2-3 minuty drobno pokrojoną cebulę, dodaj pół łyżeczki soli" +
                "3. Z liści kapusty włoskiej wykrój środki i pokrój je drobno, dorzuć do smażonej cebuli\n" +
                "Resztę liści pokrój w drobne paski, odstaw na bok" +
                "4. Pieczarki pokrój w drobniutką kostkę i dorzuć do cebuli – smaż wszystko razem, aż delikatnie nabiorą kolorów około 10 – 15 minut; możesz potrzebować odrobinę więcej masła" +
                "5. Teraz na patelnię dorzuć pokrojone w paski liście kapusty" +
                "6. Na patelnię dorzuć soczewicę i komosę ryżową, podsmaż wszystko razem ok 2 minuty; dorzuć posiekaną pietruszkę, dopraw solą i pieprzem i zmieszaj" +
                "7. Wyłóż porcje sałatki na miseczki, polej oliwą i posyp koperkiem");

        // ==================================================================

        odpowiedzi.add("PIECZONY KALAFIOR – CRUMBLE Z RODZYNKAMI" +
                "\n" +
                "    1 szt kalafior\n" +
                "    2-3 łyżki oliwa z pestek dyni\n" +
                "    sól\n" +
                "    2 łyżeczki musztarda Dijon\n" +
                "    3 łyżki rodzynki\n" +
                "    50 g tarta bułka\n" +
                "    2 szt cebula szalotka" +
                "\n" +
                "1. Piekarnik nastaw na 210°C" +
                "2. Kalafior umyj, podziel na różyczki, trzon warzywa pokrój na mniejsze kawałki, z liści oderwij części, które ściemniały – resztę pokrój – wrzuć całość do miski i polej oliwą z pestek dyni i posyp solą – ręcznie wszystko zmieszaj, wymasuj kalafiora, tak aby każda jego część była naoliwiona" +
                "3. Wysyp kalafiora na blachę od piekarnika wyłożoną papierem do pieczenia lub matą silikonową i zapiecz 10 minut" +
                "4. W tym czasie w małej miseczce zmieszaj musztardę, rodzynki i bułkę tartą; być może będziesz musiała dodać trochę więcej bułki – ma powstać z tego coś w rodzaju crumble, czyli kruszonki" +
                "5. Szalotki poszatkuj w piórka" +
                "6. Kalafiora wyjmij z piekarnika, ale jeszcze piekarnika nie wyłączaj!" +
                "7. Posyp kalafiora szalotką oraz kruszonką i zapiecz dodatkowe około 10 minut, lub do czasu gdy kalafior jest miękki");


        odp = odpowiedzi.get(index);
        ile = odpowiedzi.size();
    }

}
