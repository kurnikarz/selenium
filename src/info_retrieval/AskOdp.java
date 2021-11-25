package info_retrieval;

import java.util.*;

public class AskOdp {

    String odp;
    int ile;
    // https://cookpad.com/pl/wyszukaj/zero%20waste

    public AskOdp(int index) {
        List<String> odpowiedzi = new ArrayList<>();

        odpowiedzi.add("Obrane mięso z rosołu\n" +
                "Marchweka z rosołu\n" +
                "Pół suchej bułki pszennej\n" +
                "Jajo\n" +
                "Kilka listków mrożonego szpinaku\n" +
                "Pół szklanki mleka\n" +
                "Bułka tarta\n" +
                "Pietruszka zielona\n" +
                "" +
                "1. Mięso obrać, bułkę pszenną namoczyć w mleku, aż będzie zupełnie miękka. Odsączyć i dodać do mięsa razem z marchewką, jajkiem szpinakiem i pietruszką. Wszystko zmielić na jednolitą masę. Formować kotleciki, obtoczyć w bułce tartej i smażyć na oleju tak jak mielone. Nie ma raczej potrzeby doprawiać, gdyż mięso i marchewka ma już swój smak z rosołu. Tym bardziej jest to danie dla maluchów A one nie potrzebują dodatkowych przypraw. Podawać z ziemniakami.");


        //========================================================================


        odpowiedzi.add("Pączek zielonych szparag\n" +
                "5 ziemniaków\n" +
                "1 marchewka\n" +
                "1 cebula\n" +
                "2 ząbki czosnku\n" +
                "Oliwa\n" +
                "Sól, pieprz\n" +
                "" +
                "1. Ziemniaki kroję w kostkę, marchewkę w plasterki, cebulę w piórka. Na patelnię wlewam łyżkę oliwy i podduszam wszystkie składniki ok. 30 min na średnim ogniu. 5 min przed końcem dodaje czosnek." +
                "2. Szparagi obieram i łamię w miejscu gdzie same będą chciały pęknąć ;) wszystko dosłownie wrzucamy do garnka z wodą i robimy aromatyczny wywar z dodatkiem soli" +
                "3. Główki szparag zostawiamy na sam koniec - wrzucony je już do zmiksowanego kremu" +
                "4. Gdy składniki z patelni będą już miękkie, wrzucamy je do miksera, zalewamy wywarem że szparagów. Zdrewniałe części odstawiamy, a cała resztę miksujemy na gładką krem" +
                "5. Przelewamy krem do garnka, dodajemy główki zielonych szparag i gotujemy na wolnym ogniu jeszcze z 10 min aby były miękkie ale też i chrupkie" +
                "6. Zupę krem opcjonalnie polewamy oliwą i przyzdabiamy ulubionymi pestkami bądź też kawałkami fety. Smacznego :)");


        //========================================================================


        odpowiedzi.add("Mięso: kawałki, których już nikt nie mógł zjeść\n" +
                "Warzywa: pozostała cebula marynowana wraz z mięsem\n" +
                "Sałatki owocowe i warzywne, których biesiadnicy nie pokonali\n" +
                "Sosy, ketchupy itp\n" +
                "" +
                "1. Robimy przegląd ostatków. Nadające się do użycia selekcjonujemy. Warzywa podlewamy odrobiną wody i dusimy pod przykryciem. Mięso kroimy na mniejsze kawałki. Dodajemy do warzyw. Po chwili zalewamy sosem i dusimy jeszcze około 7 minut." +
                "2. Wydajemy na stół w charakterze gorącej zakąski lub wraz z ryżem i surówką jako danie główne.");



        //=========================================================================


        odpowiedzi.add("Ciasto francuskie\n" +
                "Cukinia\n" +
                "Cebula biała\n" +
                "Cebula szalotka\n" +
                "Groszek cukrowy\n" +
                "Pomidorki koktajlowe\n" +
                "Ser podpuszkowy\n" +
                "Ser feta\n" +
                "Ser typu włoskiego\n" +
                "Musztarda\n" +
                "Sriracha\n" +
                "Gochugaru\n" +
                "" +
                "1. Ciasto francuskie posmaruj musztardą i okraś sosem sriracha." +
                "2. Układaj kolejne warstwy warzyw: cebula, cukinia, groszek" +
                "3. Na wierzch ułóż przekrojowe na pół pomidorki i sery, tworząc kolorową kompozycję. Posyp gochugaru. I wstaw do rozgrzanego pieca na ok 40min" +
                "4. Smacznego!");

        //=========================================================================

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
                "3. Saszetkę wrzucić do gotującej wody i gotować, aż da smak. Jest to produkt naturalny na bazie suszonych warzyw. Ilość wody zależy od ilości składników. Zupa ma być gęsta. Do gotowego bulionu dodać podsmażone warzywa. Gotować wszystko do miękkości. Dodać odsączoną fasole i pokrojone pomidory. Wymieszać i spróbować. Smaku zupy nadaje tłuszcz od kiełbasek. Sól i zawsze możecie dosmaczyć po swojemu. Na koniec dodajemy kiełbaski i podajemy."
        );


        //=========================================================================


        odpowiedzi.add("Bułka wrocławska\n" +
                "Szynka\n" +
                "Ser\n" +
                "Szczypiorek\n" +
                "Masło\n" +
                "Czosnek\n" +
                "" +
                "1. Włącz piekarnik na 180 stopni przecisnij przez praske czosnek i dodaj masło następnie posmaruj bułkę lub chleb" +
                "2. Zapiekanki z szynką serem oraz masłem czosnkowym krok przepisu 1 zdjęcie\n" +
                "\n" +
                "Połóż szynkę ser oraz szczypiorek piecz ok 5 min aż ser się roztopi i bułka będzie chrupka\n" +
                "3. Podawaj z ulubionym sosem ketchup majonez lub inny Smacznego");

        //=========================================================================

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

        odp = odpowiedzi.get(index);
        ile = odpowiedzi.size();
    }

}
