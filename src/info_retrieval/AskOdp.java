package info_retrieval;

import java.util.*;

public class AskOdp {

    String odp;
    int ile;
    // https://cookpad.com/pl/wyszukaj/zero%20waste

    public AskOdp(int index) {
        List<String> odpowiedzi = new ArrayList<>();

        odpowiedzi.add("Kapusta biała\n" +
                "Ziemniaki\n" +
                "Marchewka\n" +
                "Cebula\n" +
                "Kalafior\n" +
                "Cukinia\n" +
                "Natka pietruszki\n" +
                "Puszka czarnej fasoli\n" +
                "Pomidory\n" +
                "Piramidka rosołowa Lidl\n" +
                "Pętka ostrych białych kiełbasek smażonych\n" +
                "" +
                "1. Kiełbaski nakłuć widelcem i wrzucić na rozgrzaną patelnię bez tłuszczu. Przykryć i poczekać, aż puści sosy. Obsmażyć z obu stron." +
                "2. Ponieważ tak jak mówiłam są to resztki nie podaje ilości. Wykorzystujesz to co jest. Warzywa umyć i pokroić. Ziemniaki w kostkę bez obierania. Marchewkę obrać i też w kostkę. Kapustę posiekać. Kalafior w małe różyczki, cukinia w plastry. Pietruszkę posiekać. Kiełbaski zdjąć z patelni i dodać warzywa. Smażyć na tłuszczu z kiełbasy, mieszając." +
                "3. Saszetkę wrzucić do gotującej wody i gotować, aż da smak. Jest to produkt naturalny na bazie suszonych warzyw. Ilość wody zależy od ilości składników. Zupa ma być gęsta. Do gotowego bulionu dodać podsmażone warzywa. Gotować wszystko do miękkości. Dodać odsączoną fasole i pokrojone pomidory. Wymieszać i spróbować. Smaku zupy nadaje tłuszcz od kiełbasek. Sól i zawsze możecie dosmaczyć po swojemu. Na koniec dodajemy kiełbaski i podajemy." +
                "4. Smacznego");

        // ==========================================================================================================

        odpowiedzi.add("Bułka wrocławska\n" +
                "Szynka\n" +
                "Ser\n" +
                "Szczypiorek\n" +
                "Masło\n" +
                "Czosnek\n" +
                "" +
                "1. Włącz piekarnik na 180 stopni przecisnij przez praske czosnek i dodaj masło następnie posmaruj bułkę lub chleb" +
                "2. Połóż szynkę ser oraz szczypiorek piecz ok 5 min aż ser się roztopi i bułka będzie chrupka" +
                "3. Podawaj z ulubionym sosem ketchup majonez lub inny Smacznego");

        // ==========================================================================================================

        odpowiedzi.add("\n" +
                "\n" +
                "    250 gr mąki pszennej\n" +
                "    150 gr zimnego masła\n" +
                "    3 jajka i 1 żółtko pomieszane z małą ilością wody\n" +
                "    1 mix kolorowych papryk\n" +
                "    1 mała dynia piżmowa\n" +
                "    1 duży filet z kurczaka\n" +
                "    200 ml śmietanki 30%\n" +
                "    Sól, pieprz, tymianek, czosnek granulowany\n" +
                "    Olej rzepakowy\n" +
                "\n" +
                "" +
                "1. Z przesianej mąki, masła i żółtka z wodą i solą wyrabiam ciasto kruche, a następnie wkładam je do lodówki na 30 min." +
                "2. W tym czasie piekę obraną i skropioną dynię w piekarniku przez 30 min w temp 180 st. Gdy jest miękka, miksuje ją na puree. Na oleju podsmażam pokrojone w paski papryki a następnie pokrojoną w kostkę pierś z kurczaka. Wszystko doprawiam solą, pieprzem, tymiankiem i czosnkiem granulowanym." +
                "3. Dodaje do warzyw i kurczaka, 3 jajka i śmietankę oraz purre z dyni. Ciasto kruche wałkuje i wyklejam nim foremkę do tarty. Wkładam do piekarnika nagrzanego do 200 st na 15 min wraz z suchą fasolą dla obciążenia dna." +
                "4. Po tym czasie wyjmuje ciasto, usuwam fasolę i przekladam do ciasta moją masę. Wkladam całość do piekarnika i piekę jeszcze okoko 20 min." +
                "5. Tarta pysznie smakuje zarówno na ciepło jak i na zimno, podana np. z lekkim, jogurtowo czosnkowym sosem");


        // ==========================================================================================================


        odpowiedzi.add("\n" +
                "\n" +
                "    250 gr mąki pszennej\n" +
                "    150 gr zimnego masła\n" +
                "    3 jajka i 1 żółtko pomieszane z małą ilością wody\n" +
                "    1 mix kolorowych papryk\n" +
                "    1 mała dynia piżmowa\n" +
                "    1 duży filet z kurczaka\n" +
                "    200 ml śmietanki 30%\n" +
                "    Sól, pieprz, tymianek, czosnek granulowany\n" +
                "    Olej rzepakowy\n" +
                "\n" +
                "" +
                "1. Z przesianej mąki, masła i żółtka z wodą i solą wyrabiam ciasto kruche, a następnie wkładam je do lodówki na 30 min." +
                "2. W tym czasie piekę obraną i skropioną dynię w piekarniku przez 30 min w temp 180 st. Gdy jest miękka, miksuje ją na puree. Na oleju podsmażam pokrojone w paski papryki a następnie pokrojoną w kostkę pierś z kurczaka. Wszystko doprawiam solą, pieprzem, tymiankiem i czosnkiem granulowanym." +
                "3. Dodaje do warzyw i kurczaka, 3 jajka i śmietankę oraz purre z dyni. Ciasto kruche wałkuje i wyklejam nim foremkę do tarty. Wkładam do piekarnika nagrzanego do 200 st na 15 min wraz z suchą fasolą dla obciążenia dna." +
                "4. Po tym czasie wyjmuje ciasto, usuwam fasolę i przekladam do ciasta moją masę. Wkladam całość do piekarnika i piekę jeszcze okoko 20 min.");



        // ==========================================================================================================


        odpowiedzi.add("\n" +
                "\n" +
                "    3 ugotowane jajka\n" +
                "    4 plastry mortadeli wp paprykowej\n" +
                "    1/2 cebuli\n" +
                "    Garść świeżej natki pietruszki\n" +
                "    1 łyżka majonezu\n" +
                "    1 łyżka śmietany\n" +
                "    1 łyżeczka musztardy\n" +
                "    Sól pieprz\n" +
                "\n" +
                "" +
                "1. Ugotowane na twardo jajka zmiąć drobno widelcem. Cebulę i mortadelę pokroić w drobną kostkę. Natkę pietruszki posiekać." +
                "2. W/w składniki połączyć z majonezem śmietaną i musztardą. Doprawić solą i pieprzem. Dobrze wymieszać.");


        // ==========================================================================================================


        odpowiedzi.add("\n" +
                "\n" +
                "    2 kopiaste łyżki dżemu truskawkowego\n" +
                "    100 gramów orzechów nerkowca\n" +
                "    100 gramów czekolady deserowa\n" +
                "    1 łyżka miękkiego masła\n" +
                "    Polewa z czekolady\n" +
                "    Ja wykorzystałam\n" +
                "    450 gramów kakaowego biszkoptu (może być jasny biszkopt+2 łyżki ciemnego kakao)\n" +
                "    50 gramów ciasteczek typu petit\n" +
                "    2 łyżki nutelli\n" +
                "    1 łyżeczka ekstraktu rumowego\n" +
                "    50 ml. ajerkoniaku lub innego likieru\n" +
                "    5 łyżek mleka\n" +
                "\n" +
                "1. Wszystkie kruche składniki biszkopt, ciasteczka, orzechy rozdrabniamy w malakserze lub blenderze kielichowym.\n" +
                "Można również ciasta drobno rozkruszyć a orzechy drobno posiekać. Wszystko przekładamy do miski dodajemy resztę składników całość zagniatamy dłońmi do połączenia składników. Masa powinna być zbita, wilgotna i mieć taką konsystencję aby można było łatwo uformować kule." +
                "2. Jeżeli masa jest zbyt luźna to dodajemy więcej suchych składników, jeżeli zbyt sucha to dodajemy więcej dżemu, nutelli lub masła orzechowego.\n" +
                "Z ciasta formujemy kule o dowolnej wielkości i zanurzamy we wcześniej roztopionej czekoladzie z mlekiem i łyżką masła." +
                "3. \n" +
                "\n" +
                "Można opcjonalnie dodatkowo posypać kokosem, płatkami migdałów lub inna dowolna posypką.\n" +
                "Tak przygotowane bajaderki wkładamy do lodówki na 1-2 godziny\n");


        // ==========================================================================================================


        odpowiedzi.add("\n" +
                "\n" +
                "    3 jajka\n" +
                "    kawałek kiełbasy lub wędlina ok50g\n" +
                "    1 cebula\n" +
                "    kilka oliwek i pieczarek\n" +
                "    30 g sera\n" +
                "    masło\n" +
                "    2-3 łyżki śmietany lub mleka\n" +
                "\n" +
                "1. Kiełbasę lub wędlinę pokroić w drobną kostkę i smażyć na patelni do zrumienienia. Dodać pokrojoną w drobną kostkę cebulę i pieczarki, smażyć ok 8 minut, a następnie dodać oliwki. Smażyć jeszcze ok 2 minut i zdjąć z patelni." +
                "2. Jajka rozmieszać z mlekiem lub śmietaną. Aby omlet był pulchniejszy można białka wcześniej ubić na sztywną pianę. Na patelni rozgrzać łyżkę masła, wlać jajka i przykryć pokrywką. Smażyć ok 4 - 5 minut na małym ogniu. Można przewrócić na drigą stronę ale pod przykryciem powinna się góra lekko ściąć." +
                "3. Gdy spód będzie złoty omlet posypuję startym serem, dodaję podsmażone wcześniej dodatki na jedną połowę i przykrywamy drugą. Podajemy samo lub z ulubionymi dodatkami.");



        // ==========================================================================================================


        odpowiedzi.add("Użyłam wody po ugotowanym kalafiorze\n" +
                "1/2 słoika dużego koncentratu pomidorowego\n" +
                "Piramidka smaku do rosoły marki Lidl\n" +
                "Masło\n" +
                "1/2 dużej twardej i soczystej gruszki\n" +
                "Śmietana 18%\n" +
                "Laska cynamonu\n" +
                "Sól\n" +
                "100 g ryżu\n" +
                "Natka pietruszki lub pietruszka suszona\n" +
                "" +
                "1. Do wody po ugotowanym kalafiorze wkładamy piramidkę smaku, która zawiera suszone zioła w idealnych proporcjach (cebula, pieprz czarny, lubczyk, ziele angielskie, liść laurowy) oraz laskę cynamonu. Gotujemy, aż zawrze i dodajemy ryż, który gotujemy do miękkości." +
                "2. Na rozgrzaną patelnie dajemy koncentrat z dodatkiem masła i smażymy. Do koncentratu dodajemy obraną gruszkę, którą należy utrzeć na drobnej tarce. Mieszamy i zalewamy wywarem. Dokładnie rozprowadzamy i wlewamy do garnka. Solimy i dodajemy śmietanę, którą hartujemy wcześniej zupą oraz pietruszkę siekaną bądź suszoną natkę. Można użyć jeszcze przypraw np. cukru i pieprzu zależy jaką ostrość lubimy.");


        // ==========================================================================================================


        odpowiedzi.add("\n" +
                "\n" +
                "    5 jajek\n" +
                "    3/4 - 1 szklanki cukru(zależy jak słodkie chcesz ciasto)\n" +
                "    2 szklanki mąki\n" +
                "    1/2 szklanki oleju\n" +
                "    2 łyżeczki proszku do pieczenia\n" +
                "    2 łyżki ciemnego kakao\n" +
                "    Mrożone owoce w/g uznania\n" +
                "    bułka tarta do obsypania owocow\n" +
                "\n" +
                "1. Mrożone owoce obsypujemy cukrem i bułką tartą." +
                "2. Jajka o temperaturze pokojowej miksujemy z cukrem." +
                "3. Nadal miksując dolewamy cienkim strumieniem olej." +
                "4. Zwalniamy obroty i dodajemy mąkę z proszkiem do pieczenia." +
                "5. Około 1/2 ciasta odlewamy do innego naczynia, do pozostałej część dosypujemy kakao i miksujemy do połączenia się składników." +
                "6. Do wyłożonej papierem do pieczenia formy wykładamy ciasto ciemne i po wyrównaniu powierzchni wylewamy na nie ciasto jasne." +
                "7. Na ciasto wykładamy zamrożone, przemieszane z cukrem i bułką tartą owoce." +
                "8. Wstawiamy do piekarnika o temperaturze 175-180 stopni na około 45 minut." +
                "9. Ciasto jest upieczone gdy wbity w nie patyczek jest po wyjęciu suchy." +
                "10. Po wyjęciu z piekarnika obsypujemy wierzch ciasta cukrem pudrem. Smacznego! ");


        // ==========================================================================================================


        odpowiedzi.add("Szpinakowa pasta z bakłażanem:\n" +
                "1 mniejszy bakłażan\n" +
                "150 g świeżego szpinaku\n" +
                "3 ząbki czosnku\n" +
                "1 garść słonecznika (namoczonego lub podprażonego)\n" +
                "1 łyżeczka suszonej cebuli\n" +
                "1/2 łyżeczki suszonego czosnku\n" +
                "2 łyżeczki białego octu balsamicznego\n" +
                "1 łyżeczka płatków drożdżowych\n" +
                "1 łyżeczka sosu sojowego\n" +
                "1 łyżka soku z cytryny\n" +
                "1 łyżka oleju konopnego (lub innego ulubionego)\n" +
                "1 garść posiekanego świeżego tymianku\n" +
                "skórka z 1/2 cytryny\n" +
                "sól, pieprz\n" +
                "1 łyżka oleju do smażenia (np. rzepakowego)\n" +
                "1 większa pietruszka\n" +
                "1/2 pęczka szparagów\n" +
                "" +
                "1. Bakłażana nakłuwam widelcem. Opiekam na gazie lub palnikiem, by zwęglić trochę skórkę i by nabrał lekko dymnego aromatu. Przekładam do piekarnika i piekę do miękkości (190' ok 30min).\n" +
                "Ostudzonego obieram ze skórki, a miąższ rwę lub kroję na mniejsze kawałki." +
                "2. Na patelni podsmażam czosnek pokrojony w plasterki. Na mniejszym ogniu ok 2 min. Dokładam szpinak, szczyptę soli i podsmażam dalej, aż zwiędnie, a nadmiar wody odparuje.\n" +
                "Przekładam do bakłażana, dodaje resztę składników i blenduję pulsacyjnie w paru miejscach (nie chcę konsystencji pasty, zależy mi by zostały wyczuwalne kawałki). Doprawiam odpowiednio solą i pieprzem." +
                "3. Przy pomocy obieraczki kroję szparagi i pietruszkę na kształt tagliatelle. Na patelni lub w rondelku na odrobinie wody duszę chwilę pietruszkę posypując szczyptą soli (1-2min). Dodaję szparagi i duszę jeszcze kolejną minutkę lub dwie (zależy jaką twardość chcę uzyskać, ja lubię al dente). Opdarowuje ewentualny nadmiar wody, dodaję moją pastę i mieszam." +
                "4. Gotowe danie podaję posypuję odrobiną świeżego tymianku i skórki z cytryny. Można również posypać podprażonymi orzeszkami (np posiekanymi migdałami) czy pestkami (np dyni).");


        odp = odpowiedzi.get(index);
        ile = odpowiedzi.size();
    }

}
