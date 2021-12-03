package info_retrieval;

import java.util.*;

public class AskOdp {

    String odp;
    int ile;
    // https://cookpad.com/pl/wyszukaj/zero%20waste

    public AskOdp(int index) {
        List<String> odpowiedzi = new ArrayList<>();

        odpowiedzi.add("Słodki bananowy chleb z bakaliami" +
                "\n" +
                "4 mocno przejrzałe banany\n" +
                "2 jajka ekologiczne\n" +
                "\n" +
                "120 g zwykłego cukru\n" +
                "\n" +
                "80 g roztopionego masła\n" +
                "\n" +
                "1/2 tabliczki posiekanej mlecznej lub gorzkiej czekolady\n" +
                "\n" +
                "1/2 szklanki mieszanki bakaliowej (orzechy włoskie, migdały, rodzynki, figi, itp.)\n" +
                "\n" +
                "220 g mąki orkiszowej lub mąki pszennej\n" +
                "\n" +
                "1 płaska łyżeczka proszku do pieczenia\n" +
                "\n" +
                "1 płaska łyżeczka sody oczyszczonej\n" +
                "\n" +
                "szczypta soli morskiej\n" +
                "\n" +
                "1 łyżka płatków owsianych" +
                "" +
                "1. Mąkę, sodę oczyszczoną i proszek do pieczenia przesiej przez sito pozbywając się grudek, dodaj odrobinkę soli i wymieszaj ze sobą suche składniki. Bakalie i czekoladę posiekaj nożem na drobniejsze cząstki." +
                "2. Banany obierz ze skórki (1 banana pozostaw do dekoracji), przełóż do dużej misy i rozgnieć widelcem na papkę. Do puree z bananów wsyp cukier, wlej jajka jedynie lekko roztrzepane rózgą kuchenną oraz płynne, wystudzone masło. Mokre składniki wymieszaj z suchymi składnikami, bakaliami i czekoladą, wystarczy mieszać za pomocą rózgi albo łyżki jedynie do połączenia." +
                "3. Ciasto przełóż do keksówki o wymiarach 10 x 25 cm wyłożonej papierem do pieczenia. Ostatniego pozostałego banana pokrój w plasterki i ułóż na wierzchu, ciasto posyp płatkami owsianymi. Wstaw do rozgrzanego wcześniej piekarnika do temperatury 170 stopni na 1 godzinę.");



        // ===================================================================================


        odpowiedzi.add("Zupa gulaszowa z serduszkami kurzymi i warzywami" +
                "\n" +
                "500 g serduszek kurzych\n" +
                "\n" +
                "1 papryka pomarańczowa\n" +
                "\n" +
                "1 większa marchewka\n" +
                "\n" +
                "1 korzeń pietruszki\n" +
                "\n" +
                "1 żółta cebula\n" +
                "\n" +
                "300 ml gorącego bulionu jarzynowo – drobiowego\n" +
                "\n" +
                "sól, duża ilość mielonego pieprzu\n" +
                "\n" +
                "1 łyżka suszonej słodkiej papryki\n" +
                "\n" +
                "50 ml śmietanki 30 %\n" +
                "\n" +
                "1 łyżka mąki pszennej\n" +
                "\n" +
                "30 ml oleju rzepakowego\n" +
                "\n" +
                "1 torebeczka kaszy orkiszowej" +
                "\n" +
                "1. Serduszka kurcząt umyj dokładnie chłodną wodą. Przełóż do garnka, zalej wodą nieco ponad poziom mięsa i doprowadź jedynie do zagotowania. Wylej wodę, przepłukaj serduszka, pozbędziesz się w ten sposób szumowin i nieprzyjemnego zapachu." +
                "2. Cebulkę poszatkuj drobno, marchew i pietruszkę pokrój w talarki, paprykę w kosteczkę. W garnku z rozgrzanym olejem zeszklij cebulkę. Po chwili dodaj pozostałe warzywa i serduszka drobiowe." +
                "3. Wlej gorący rosół i gotuj całość przez 40 minut do miękkości, jarzyny powinny się praktycznie rozgotować zabarwiając sos na pomarańczowy odcień." +
                "4. W śmietance 30 % rozmieszaj mąkę, pozbywając się jakichkolwiek grudek. Mieszankę wlej do gotującego się gulaszu, wymieszaj, podgrzewaj jeszcze chwilę aż sos się zagęści. Pod koniec dopraw do smaku przyprawami na pikantnie. Podawaj z kaszą orkiszową ugotowaną w osolonym wrzątku przez 12 minut.");



        // ===================================================================================


        odpowiedzi.add("Gulasz z karkówki i łopatki wieprzowej" +
                "\n" +
                "    GULASZ WIEPRZOWY\n" +
                "\n" +
                "    300 g mięsa z łopatki wieprzowej\n" +
                "\n" +
                "    300 g karkówki wieprzowej\n" +
                "\n" +
                "    1 papryka czerwona\n" +
                "\n" +
                "    1 papryka żółta\n" +
                "\n" +
                "    2 marchewki\n" +
                "\n" +
                "    200 g pieczarek\n" +
                "\n" +
                "    40 g przecieru pomidorowego bez konserwantów\n" +
                "\n" +
                "    30 ml oleju rzepakowego\n" +
                "\n" +
                "    1,5 litra gorącego bulionu na włoszczyźnie\n" +
                "    PRZYPRAWY\n" +
                "\n" +
                "    4 ziela angielskie\n" +
                "\n" +
                "    4 liście laurowe\n" +
                "\n" +
                "    1 opakowanie Knorr Fix do gulaszu\n" +
                "\n" +
                "    1 łyżka słodkiej papryki\n" +
                "\n" +
                "    1/2 łyżeczki ostrej papryki\n" +
                "\n" +
                "    sól i mielony pieprz\n" +
                "    DODATKOWO\n" +
                "\n" +
                "    kromki świeżego białego pieczywa lub pszenna bułka\n" +
                "\n" +
                "    masło" +
                "\n" +
                "1. Mięso wieprzowe pokrój w niewielką kostkę. Na dnie garnka z nieprzywierającym dnem (najlepiej gotuj w garnku niskociśnieniowym, np. marki Zwieger, który przyspieszy proces) rozgrzej olej rzepakowy, obsmaż na nim 10 minut pokrojone kawałki mięsa. Po chwili dodaj przyprawy: ostrą i słodką paprykę, ziele angielskie i liście laurowe." +
                "2. Obie papryki, marchew i pieczarki umyj i pokrój na plasterki. Przełóż do garnka z mięsem, wlej gorący bulion i gotuj do miękkości warzyw i mięsa przez 40 – 60 minut." +
                "3. Pod koniec dodaj przecier pomidorowy, fix do gulaszu oraz dopraw do smaku solą i mielonym pieprzem. Gulasz wieprzowy podawaj na gorąco z kawałkiem świeżej pszennej bułki posmarowanej warstewką masła.");


        // ===================================================================================


        odpowiedzi.add("Tarte flambée ze śmietanką crème fraîche, ciętym boczkiem i cebulą" +
                "\n" +
                "    SPÓD Z CIASTA CHLEBOWEGO\n" +
                "\n" +
                "    200 g mąki pszennej typ 450, 480 lub 500\n" +
                "\n" +
                "    2 łyżki oleju roślinnego\n" +
                "\n" +
                "    120 ml letniej wody\n" +
                "\n" +
                "    1/2 łyżeczki soli morskiej\n" +
                "    WYPEŁNIENIE TARTY\n" +
                "\n" +
                "    200 ml crème fraîche lub gęstej, słodkiej śmietanki 36 %\n" +
                "\n" +
                "    1 czerwona cebula\n" +
                "\n" +
                "    1 cebula żółta\n" +
                "\n" +
                "    100 g boczku parzonego pokrojonego w drobne słupki\n" +
                "\n" +
                "    sól morska i grubo mielony czarny pieprz" +
                "\n" +
                "1. Mąkę przesiej przez sito wprost do misy, wsyp sól i wymieszaj. Do kopki suchych składników stopniowo wlewaj letnią wodę i olej, zagniataj dłońmi jednolitej konsystencji ciasto. Ciasto nie powinno przywierać i kleić się do dłoni, jeśli jest zbyt kleiste, dosyp niewielką ilość mąki." +
                "2. Ciasto rozłóż równomiernie na dużej blasze wyłożonej papierem do pieczenia. Możesz pomóc sobie wałkiem kuchennym, co znacznie ułatwi rozłożenie ciasta na dużej powierzchni. Rozwałkuj najcieniej jak się uda, najlepiej 2 mm grubości ciasta." +
                "3. Piekarnik rozgrzej do temperatury 250 stopni – grzanie góra, dół lub 220 stopni – termoobieg. Obie cebule obierz z łupin i pokrój w cienkie krążki. Boczek pokrój w drobne słupki." +
                "4. Na całej powierzchni spodu rozsmaruj crème fraîche. Śmietankę oprósz bezpośrednio z młynka do mielenia odrobiną soli morskiej i grubo zmielonego pieprzu. Cebulkę i boczek wyłóż na spód chlebowej tarty pokryty słodką śmietanką." +
                "5. Nie zwlekaj z pieczeniem tarty po posmarowaniu jej śmietanką, zapobiegając namoknięciu spodu. Tarte flambée od razu wstaw do rozgrzanego piekarnika na maksymalny czas pieczenia 10 minut. Odpowiednio upieczona tarta będzie chrupiąca, o lekko zarumienionych brzegach (nie przypalonych).");


        // ===================================================================================


        odpowiedzi.add("Ratatouille – gulasz warzywny ratatuj" +
                "\n" +
                "1 mniejszy bakłażan\n" +
                "\n" +
                "1 żółta cukinia\n" +
                "\n" +
                "1 zielona cukinia\n" +
                "\n" +
                "1 zielona papryka\n" +
                "\n" +
                "1 czerwona papryka\n" +
                "\n" +
                "3 pomidory\n" +
                "\n" +
                "1 cebula żółta\n" +
                "\n" +
                "1 czerwona cebula\n" +
                "SOS POMIDOROWY\n" +
                "\n" +
                "1 puszka pomidorów krojonych\n" +
                "\n" +
                "6 suszonych pomidorów w oliwie\n" +
                "\n" +
                "30 ml oleju ze słoiczka suszonych pomidorów\n" +
                "\n" +
                "2 ząbki czosnku\n" +
                "\n" +
                "30 ml oliwy z oliwek\n" +
                "\n" +
                "sól morska i mielony pieprz" +
                "\n" +
                "1. Bakłażana wraz ze skórką pokrój w cienkie plastry, oprósz solą i umieść w durszlaku. Pozostaw go na 30 minut, dla wypuszczenia wody i uwolnienia goryczki." +
                "2. Całe pomidory sparz wrzątkiem przez kilka sekund, następnie obierz ze skórki." +
                "3. Przygotuj sos pomidorowy: zblenduj na gładko pomidory z puszki wraz z passatą, suszone pomidory, czosnek i oliwę oraz olej z suszonych pomidorów. Sos przypraw do smaku solą i mielonym pieprzem." +
                "4. Aromatyczny sos przelej na spód naczynia żaroodpornego. Piekarnik rozgrzej do temperatury 180 stopni." +
                "5. Pozostałe warzywa: cukinie, papryki i cebule pokrój w cienkie plastry. Układaj je w naczyniu żaroodpornym na zmianę, wraz z przygotowanym wcześniej bakłażanem odsączonym z płynu." +
                "6. Oprósz warzywa solą morską i mielonym pieprzem, skrop delikatnie odrobiną oliwy z oliwek. Naczynie żaroodporne przykryj pokrywką lub folią aluminiową." +
                "7. Wstaw do nagrzanego piekarnika na 50 minut. 10 minut przed końcem pieczenia odkryj naczynie żaroodporne i daj warzywom szansę na przyrumienienie się.");

        // ===================================================================================


        odpowiedzi.add("Kuchnia japońska – okonomiyaki" +
                "\n" +
                "Okonomiyaki to japoński przysmak. Coś na wzór naszego placka ziemniaczanego, z tym, że przygotowywany jest z kapusty pekińskiej lub białej. Posiekana kapusta mieszana jest z ciastem na bazie mąki pszennej, bulionu i jajek. Dodatki do okonomiyaki daje się na usmażony placek.\n" +
                "\n" +
                "Dodatkami mogą być tradycyjne japońskie przysmaki takie jak wędzony tuńczyk czy też na przykład owoce morza. Mogą to być także bardziej europejskie dodatki, używane także na ulicach Japonii jako dodatek do okonomiyaki, jak boczek podsmażany w kostkach czy też pieczarki.\n" +
                "\n" +
                "Zasada jest taka, że do okonomiyaki dodajemy to co mamy pod ręką. To swoisty czyściciel lodówki taki sam jak pizza czy nasz gulasz, gdzie dodajemy wszystko to co mamy zbędne w lodówce. Okonomiyaki jest banalnie proste w przygotowaniu. Dlatego to taka popularna potrawa w kraju kwitnącej wiśni. Przepis na okonomiyaki znaleźć można na naszym ulubionym blogu kulinarnym czyli na prostepesto.pl gdzie serdecznie zapraszamy.");


        // ===================================================================================


        odpowiedzi.add("Leczo z papryką i cukinią" +
                "\n" +
                "4 czerwone papryki\n" +
                "\n" +
                "1 zielona papryka\n" +
                "\n" +
                "1 większa zielone cukinia\n" +
                "\n" +
                "1 cebula\n" +
                "\n" +
                "1 kiełbasa krucha, np. myśliwska\n" +
                "\n" +
                "2 kiełbasy śląskie\n" +
                "\n" +
                "50 ml oleju rzepakowego" +
                "\n" +
                "1. Cebulę poszatkuj drobno. Pętka kiełbasy pokrój w plastry. Do garnka z grubszym dnem wlej olej rzepakowy, wrzuć cebulę i kiełbasę. Wszystko podsmaż, aż cebula stanie się szklista." +
                "2. Papryki umyj i usuń gniazda nasienne. Pokrój w cienkie, długie paski i przełóż do garnka. Duś na niewielkim ogniu, pod lekko uchyloną pokrywką przez 15 minut. Co jakiś czas przemieszaj leczo od spodu, zapobiegniesz przypaleniu i przywieraniu do garnka." +
                "3. Cukinię przekrój wzdłuż na 4 części, następnie podłużne części pokrój w kostkę. Przełóż do garnka z leczo. Całość gotuj kolejne 30 minut, do miękkości warzyw." +
                "4. Po ugotowaniu papryka powinna być wręcz rozgotowana. Warzywa powinny wypuścić płyn, leczo powinno przypominać nieco zupę." +
                "5. Dopraw do smaku solą i zmielonym pieprzem.");


        // ===================================================================================

        odpowiedzi.add("Żołądki drobiowe w sosie paprykowym" +
                "\n" +
                "800 g żołądków drobiowych\n" +
                "\n" +
                "1 czerwona papryka\n" +
                "\n" +
                "1 żółta papryka\n" +
                "\n" +
                "1 większa cebula\n" +
                "\n" +
                "4 kulki ziela angielskiego\n" +
                "\n" +
                "3 3 liście laurowe\n" +
                "\n" +
                "3 łyżki przyprawy węgierskiej z papryką\n" +
                "\n" +
                "sól i mielony czarny pieprz\n" +
                "\n" +
                "50 ml oleju rzepakowego\n" +
                "\n" +
                "500 ml wody\n" +
                "\n" +
                "3 łyżki mąki" +
                "\n" +
                "1. Żołądki drobiowe myjemy w chłodnej wodzie. Kroimy na mniejsze kawałki i oczyszczamy z ewentualnych żyłek. W garnku rozgrzewamy tłuszcz. Podsmażamy na nim żołądki przez 10 minut, co chwilę mieszając." +
                "2. Cebulę i obie papryki kroimy drobno i dorzucamy do garnka. Wlewamy 200 ml wody, dodajemy ziele angielskie oraz liście laurowe. Gotujemy przez 60 minut pod lekko uchyloną pokrywką, do miękkości żołądków. " +
                "3. W między czasie mieszamy co jakiś czas oraz uzupełniamy wodę, jeśli nadmiernie odparuje. Czas gotowania można wydłużyć nieco, jeśli żołądki nadal pozostaną zbyt twarde." +
                "4. Pod sam koniec gulasz doprawiamy do smaku solą, czarnym pieprzem oraz sporą ilością przyprawy węgierskiej z papryką." +
                "5. W dzbanku mieszamy trzepaczką 200 ml wody z 3 łyżkami mąki. Wlewamy do gulaszu i gotujemy jeszcze kilka minut, aż sos delikatnie się zagęści i będzie bardziej treściwy.");


        // ===================================================================================

        odpowiedzi.add("Chłopski garnek czyli sycący kociołek z kiełbasą i boczkiem" +
                "\n" +
                "200 g boczku parzonego\n" +
                "\n" +
                "200 g kiełbasy\n" +
                "\n" +
                "1 cebula\n" +
                "\n" +
                "1/2 główki białej kapusty\n" +
                "\n" +
                "1 czerwona papryka\n" +
                "\n" +
                "1 marchewka\n" +
                "\n" +
                "4 ziemniaki\n" +
                "\n" +
                "1 puszka białej fasolki\n" +
                "\n" +
                "2 pomidory malinowe\n" +
                "\n" +
                "przyprawa chilli\n" +
                "\n" +
                "pieprz i sól\n" +
                "\n" +
                "2 łyżki oleju do smażenia" +
                "\n" +
                "1. Wszystko przygotowujemy w jednym dużym garnku. Na oliwie zeszklić cebulę pokrojoną w grubą kostkę. Po chwili dodać pokrojony boczek parzony i swojską kiełbasę i smażyć. Smażyć kilka minut aż boczek wytopi trochę tłuszczu i skurczy się." +
                "2. Do garnka dodajemy pokrojoną: paprykę, marchewkę, ziemniaki oraz białą kapustę. Wlewamy 1 szklankę gorącej wody oraz przyprawiamy solą, pieprzem i przyprawą chilli wedle uznania. Gotujemy kolejne 40 minut, aż dodane warzywa (szczególnie ziemniaki i marchew) zmiękną całkowicie. W między czasie można dodać kolejną szklankę wody." +
                "3. Po tym czasie dodajemy białą fasolkę (odsączoną z zalewy i wypłukaną intensywnie wodą) oraz pomidory malinowe – obrane ze skórki i pokrojone. Gotujemy jeszcze przez 10 minut, doprawiamy ewentualnie dodatkowo do smaku. Chłopski garnek gotowy.");



        // ===================================================================================

        odpowiedzi.add("Pikantne Chili con carne prosto z Meksyku" +
                "\n" +
                "500 g mielonej wołowiny\n" +
                "\n" +
                "100 g boczku\n" +
                "\n" +
                "1 czerwona cebula\n" +
                "\n" +
                "2 ząbki czosnku\n" +
                "\n" +
                "1 czerwona papryka\n" +
                "\n" +
                "1 czerwona papryczka chili\n" +
                "\n" +
                "1 papryczka jalapeno\n" +
                "\n" +
                "1 łyżka koncentratu pomidorowego\n" +
                "\n" +
                "400 g pomidorów z puszki\n" +
                "\n" +
                "100 ml gorącego bulionu wołowego\n" +
                "\n" +
                "400 g czerwonej fasoli z puszki\n" +
                "\n" +
                "1/2 łyżeczki ostrej papryki\n" +
                "\n" +
                "2 łyżki oliwy\n" +
                "\n" +
                "2 łyżeczki cukru\n" +
                "\n" +
                "sól dla smaku" +
                "\n" +
                "1. Rozgrzewamy olej w dużym rondlu. Dodajmy posiekane w kostkę warzywa: cebulę, czosnek, ostre papryczki oraz boczek. Podsmażamy mieszając, do momentu zeszklenia cebuli." +
                "2. Dodajmy pokrojoną czerwoną paprykę oraz mieloną wołowinę. Smażmy nie przerywając mieszania, na średnim płomieniu, aż mięso się zetnie" +
                "3. Dodajmy pomidory z puszki oraz koncentrat pomidorowy. Wlewamy gorący bulion i dusimy około 30 minut czasu. Nasze chili con carne powinno w tym czasie zgęstnieć i nabrać konsystencji przypominającej leczo." +
                "4. Pod sam koniec gotowania dodajemy fasolę czerwoną, i podgrzewajmy jeszcze przez chwilę. Doprawiamy do smaku cukrem i solą. " +
                "5. Podawajmy klasycznie tak jak ma to miejsce w kuchni meksykańskiej, z opieczonymi tortillami pszennymi.");


        // ===================================================================================


        odpowiedzi.add("3 czerwone papryki\n" +
                "\n" +
                "1 cebula\n" +
                "\n" +
                "3 pomidory malinowe\n" +
                "\n" +
                "300 g boczku parzonego\n" +
                "\n" +
                "300 g kiełbasy\n" +
                "\n" +
                "sól i pieprz\n" +
                "\n" +
                "przyprawy opcjonalne: cukier trzcinowy, słodka papryka i chilli" +
                "\n" +
                "1. Cebulę oraz boczek pokroić w większą kostkę. Wrzucić do garnka i delikatnie podsmażyć, mieszając co chwilę." +
                "2. W między czasie paprykę pokroić na cienkie paski, a kiełbasę na plasterki. Paprykę i kiełbasę przełożyć do garnka z boczkiem i cebulką. Dusić na niewielkim ogniu pod przykryciem około 20 – 25 minut." +
                "3. Pomidory obrać ze skórki. W tym celu zanurzyć całego pomidora we wrzącej wodzie na niecałą minutę, po tym skórka zacznie odchodzić sama bez użycia noża. Pomidory pokroić w grubą kostkę." +
                "4. Gdy zauważymy że papryka zmiękła już wystarczająco (powinna być lekko rozpadająca się), dodajemy pomidory. Gotujemy jeszcze około 5 minut." +
                "5. Doprawiamy do smaku solą i pieprzem. Możemy również podkreślić smak niewielką ilością cukru trzcinowego, a także słodką i ostrą papryką wedle uznania.");


        odp = odpowiedzi.get(index);
        ile = odpowiedzi.size();
    }

}
