package info_retrieval;

import java.util.*;

public class AskOdp {

    String odp;
    int ile;
    // https://misamocy.pl/kategoria/przepisy/zero-waste/

    public AskOdp(int index) {
        List<String> odpowiedzi = new ArrayList<>();

        odpowiedzi.add("Rollsy z liści buraka lub jarmużu" +
                "\n" +
                "Składniki:\n" +
                "\n" +
                "– 12 dużych liści buraka lub jarmużu\n" +
                "\n" +
                "– 12 małych gałązek brokułu\n" +
                "\n" +
                "– kostka wędzonego tofu\n" +
                "\n" +
                "– 2 marchewki\n" +
                "\n" +
                "– miseczka dowolnych kiszonek\n" +
                "\n" +
                "– 3 ogórki gruntowe\n" +
                "\n" +
                "– 2 łyżki oleju sezamowego\n" +
                "\n" +
                "– sok z limonki\n" +
                "\n" +
                "– 1 dojrzałe awokado\n" +
                "\n" +
                "– sos sojowy do podania\n" +
                "\n" +
                "– sól" +
                "" +
                "1.    Licie umyj, wrzuć do dużej miski i zalej gorącą wodą. Odstaw na kilka minut. W drugiej misce w ten sam sposób sparz brokuł.\n" +
                "2.    Tofu pokrój w słupki i chwilę podsmaż na oleju sezamowym.\n" +
                "3.    Marchewki pokrój w słupki lub paski przy pomocy obieraczki do warzyw. Ogórki pokrój w słupki. Kiszonki pokrój w słupki lub na mniejsze kawałki.\n" +
                "4.    Delikatnie odlej wodę z liści i pozostaw je na sitku. Liść rozłóż na talerzu, i odrobinę osusz ręcznikiem kuchennym. Na środek włóż dodatki. Najpierw złóż boki, a później zwijaj od podstawy liścia.\n" +
                "5.    Awokado zblenduj z odrobiną soli i sokiem z limonki. Sos sojowy nalej do małej miseczki.\n" +
                "6.    Rollsy z liści buraka lub jarmużu przekrój na pół ułóż obok siebie na talerzu i zjadaj, maczając je uprzednio w sosie z awokado lub sosie sojowym. Podobnie jak jada się sushi. ");


        // ====================================================================

        odpowiedzi.add("MARCHEWKOWE KLUSECZKI Z PESTO Z NACI MARCHWI" +
                "\n" +
                "Składniki:\n" +
                "\n" +
                "    Marchew z nacią 4-5 szt.\n" +
                "    Mąka ryżowa – 1/2 szklanki\n" +
                "    Mąka kukurydziana – 1/2 szklanki\n" +
                "    Gałka muszkatołowa – 1 łyżeczka\n" +
                "    Orzeszki ziemne – 1/2 szklanki\n" +
                "    Czosnek – 3 ząbki\n" +
                "    Czubryca zielona – 1 łyżeczka\n" +
                "    Olej rydzowy – do pesto\n" +
                "    Sól do smaku" +
                "\n" +
                "Wykonanie:\n" +
                "\n" +
                "Pesto\n" +
                "\n" +
                "Myjemy marchew. Nać oddzielamy od marchwi. Niewielką część naci odkładamy do miski. Na suchej patelni smażymy orzeszki ziemne, aż zrobią się delikatnie złote. Dodajemy do nich czubrycę i jeszcze chwilę trzymamy je na patelni, mieszając, żeby się nie przypaliły. Odkładamy do ostygnięcia. Nać marchwi (razem z czerwonymi końcówkami) szatkujemy drobno. W moździerzu lub w blenderze rozdrabniamy orzechy. Do orzechów dodajemy nać marchwi, czosnek (obrany), sól, i olej rydzowy. Po połączeniu w jednolitą masę, pesto jest gotowe.\n" +
                "\n" +
                "Kluseczki\n" +
                "\n" +
                "Marchew kroimy na kawałki i gotujemy do miękkości. W misce mieszamy wszystkie rodzaje mąki. Dodajemy gałkę muszkatołowa, sól i resztkę naci odłożonej do miseczki. Ugotowaną marchew wyławiamy z wody. Wodę zostawiamy i uzupełniamy – będzie potrzebna do gotowania klusek. Gorącą marchew blendujemy na puree. Ciepłe puree z marchwi dodajemy do mąki i szybko zagniatamy. Będzie mieć konsystencję plasteliny. Robimy z niej rulony, które po spłaszczeniu kroimy na cienkie plastry. Wrzucamy na gorąca wodę po gotowaniu marchwi. Gotujemy aż kluski będą miękkie. Podajemy od razu po ugotowaniu, gdyż mąka ryżowa szybko robi się twarda.");


        // ====================================================================

        odpowiedzi.add("BEZRESZTKOWE WYKORZYSTANIE PIGWOWCA" +
                "\n" +
                "1) Nalewka: kilogram owoców obieramy i wydrążamy gniazda nasienne, zasypujemy cukrem/miodem i odstawiamy zamknięte na dwa tygodnie. po tym czasie dolewamy 0,5 l alkoholu (wódka), macerujemy ok. 2 miesięcy. Po zlaniu nalewki mamy owoce, które można wykorzystać do zwykłego ciasta biszkoptowego. Odpad – nieco gniazd nasiennych \uD83D\uDE42\n" +
                "\n" +
                "2) Pestki dokładnie suszymy. Później zalewamy filtrowaną wodą, miksujemy i mamy rewelacyjny żel do twarzy o dobroczynnym działaniu dla skóry. Zero waste \n" +
                "\n" +
                "3) Drugą część owoców ze skórką kroimy wydrążając gniazda nasienne, dodajemy skórki owoców z pkt. 1 i robimy mocny pyszny ocet (wsad do 1/3 wysokości słoja, zalewamy wodą i dodajemy 4 łyżki miodu. Przykrywamy ręcznikiem papierowym, zakładamy gumkę. Codziennie mieszamy płyn z owocami, po ok. 6 tygodniach zlewamy pyszny  ocet do butelek. Odpad: nieco gniazd nasiennych reszta przepisu w pkt 4 \uD83D\uDE42\n" +
                "\n" +
                "4)  Przemacerowane owoce ze skórkami miksujemy z namoczonymi wcześniej ziarnami gorczycy, możemy dosłodzić lub nadać ostrości przyprawą ras el hanout, czy inną ulubioną. Mamy rasową i unikalną fermentowaną musztardę. Zero waste ");


        // ====================================================================


    odpowiedzi.add("ZUPA RZODKIEWKOWA Z WYKORZYSTANIEM LIŚCI" +
            "\n" +
            "– 2 pęczki rzodkiewki razem z liśćmi\n" +
            "\n" +
            "– młode ziemniaki\n" +
            "\n" +
            "– bulion warzywny\n" +
            "\n" +
            "-2 łyżki twarożku kremowego typu almette/Twój smak lub śmietanka.\n" +
            "\n" +
            "– pęczek kopru\n" +
            "\n" +
            "– kurkuma, sól i pieprz " +
            "\n" +
            "Przygotowanie : rzodkiewki kroimy w plasterki i podsmażamy na maśle przez 3-4minuty.Liście siekamy w drobną kostkę i dodajemy do rzodkiewek. Smażymy 1minutę. Gotujemy bulion i dorzucamy ziemniaki pokrojone w kostkę. Dodajemy rzodkiewki wraz z liśćmi. Twarożek/śmietankę hartujemy z zupą. Dolewamy płyn. Na koniec doprawiamy kurkumą, solą i pieprzem oraz posiekany");

// ====================================================================


    odpowiedzi.add("ROLLSY Z RZODKIEWKĄ I PESTO Z LIŚCI" +
            "\n" +
            "– liście rzodkiewki\n" +
            "\n" +
            "– 3 łyżki słonecznika \n" +
            "\n" +
            "– 3 łyżki platkow drozdzowych\n" +
            "\n" +
            "– 3 lyżki oliwy\n" +
            "\n" +
            "– sól i pieprz " +
            "\n" +
            "Wszystko wrzucić do kielicha blendera i zmiksowac. W moim przypadku musiałam kilka razy zamieszac dodatkowo łyżką, żeby wszystko sie ladnie wymieszalo. Na zdjeciu pesto a obok rzodkiewki w rollsach.");


        // ====================================================================

        odpowiedzi.add("KOSTKI ROSOŁOWE Z OBIEREK" +
                "\n" +
                "– natkę i obierki z marchewki\n" +
                "\n" +
                "– natkę i obierki z pietruszki\n" +
                "\n" +
                "– natkę i obierki z selera\n" +
                "\n" +
                "– obierki z ziemniaka\n" +
                "\n" +
                "– łupinę z czosnku\n" +
                "\n" +
                "– ja jeszcze dodałam nać hodowanego w ogródku lubczyku\n" +
                "\n" +
                "– woda\n" +
                "\n" +
                "– przyprawy: sól, pieprz, słodka papryka" +
                "\n" +
                "Wszystkie obierki i nacie dokładnie myjemy. Wkładamy do garnka i zalewany wodą, tak składniki były przykryte. Gotujemy ok. 40 min. , w trakcie dodajemy przyprawy. Ugotowany wywar przecedzamy przez sitko, studzimy. Po ostygnięciu przelewamy do woreczków lub pojemniczków do mrożenia kostek lodu i mrozimy. Gotowe kostki wykorzystujemy jako bazę do zup, risotto innych ");


        // ====================================================================


        odpowiedzi.add("AROMATYCZNY, CHRUPIĄCY CHŁODNIK Z NATKĄ RZODKIEWKI" +
                "\n" +
                "– 2 pęczki botwinki,\n" +
                "– pęczej rzodkiewki,\n" +
                "– 5 ogórków małych że skórka\n" +
                "– 1 ząbek czosnku\n" +
                "– jogurt naturalny wegański\n" +
                "– cytryna\n" +
                "– sól\n" +
                "– świeżo zmielony pieprz\n" +
                "– pęczek posiekanego koperku" +
                "\n" +
                "Botwinke pokroić i delikatnie podgotować w małej ilości wody, dodać starte na grubych oczkach rzodkiewki i ogórki ze skórka, pokroić drobno liście rzodkiewki, dodać jogurt, czosnek przeciśnięty przez praskę i przyprawy, obficie posypać koperkiem, dobrze schłodzić.");




        // ====================================================================


        odpowiedzi.add("BEZGLUTENOWA, WEGAŃSKA TARTA Z WYKORZYSTANIEM RESZTEK PO SOKU " +
                "\n" +
                "400-450g mąki gryczanej\n" +
                "\n" +
                "100 ml oliwy z oliwek \n" +
                "\n" +
                "350 ml woda\n" +
                "\n" +
                "Sól i pieprz \n" +
                "\n" +
                "Resztki po soku – 1 burak, 2 marchewki\n" +
                "\n" +
                "2paczki tofu \n" +
                "\n" +
                "250 ml mleko \n" +
                "\n" +
                "Czarna sól, pieprz \n" +
                "\n" +
                "Siemienie lniane 2 łyżeczki \n" +
                "\n" +
                "Kurkuma \n" +
                "\n" +
                "-cebula, cukinia, pomidorki " +
                "\n" +
                "Buraka i marchewkę wycisnąć i wypić na świeżo, najlepiej na śniadanie. \n" +
                "\n" +
                "Resztki odłożyć na później. \n" +
                "\n" +
                "Mąkę połączyć z pozostałymi składnikami, resztkami soku i mieszać do uzyskania jednolitej konsystencji. Jeśli trzeba, dolej wody. Zagnieć z ciasta kulę i zostaw na 15 min. \n" +
                "\n" +
                "Składniki na masę przełożyć do naczynia blendera i zblendować na gładka masę. \n" +
                "\n" +
                "Po tym czasie, oprysz stolnicę mąka i wyłóż na nią ciasto. Delikatnie rozwałkuj ciasto, jeśli ciasto przywiera do stolnicy, oprusz mąka. Rozwałkowane ciasto przełóż delikatnie do naczynia żaroodpornego, skropionego oliwa z oliwek.\n" +
                "\n" +
                "Delikatnie palcami zagnieć ciasto na ściankach. Spód i boki ponakuwaj widelcem. W takiej postaci piecz ciasto przez 10 min w 180°c.\n" +
                "\n" +
                "Po tym czasie wyjmij lekko upieczone ciasto. Przełóż masę i wyrównaj. Wyłóż warzywami, posyp przyprawami i piecz kolejne 20-25 min.");


        // ====================================================================

        odpowiedzi.add("GOŁĄBKI Z KASZĄ ORKISZOWĄ I TOFU W LIŚCIACH BOTWINY " +
                "\n" +
                "– 2 pęczki botwiny\n" +
                "\n" +
                "– 100g kaszy orkiszowej\n" +
                "\n" +
                "– 1 cebula\n" +
                "\n" +
                "– 1 ząbek czosnku\n" +
                "\n" +
                "– kozi twarożek\n" +
                "\n" +
                "– 180g twardego tofu\n" +
                "\n" +
                "– 2 łyżki płatków drożdżowych\n" +
                "\n" +
                "– 2 łyżki sosu sojowego\n" +
                "\n" +
                "– łyżeczka papryki wędzonej\n" +
                "\n" +
                "– pół łyżeczki cebuli suszonej\n" +
                "\n" +
                "– pół łyżeczki czosnku granulowanego\n" +
                "\n" +
                "– pół łyżki oleju" +
                "\n" +
                "Z botwiny oddzielić liście, łodygi i młode buraki. Buraki zawinąć w folię i piec ok. 1h w temperaturze 200C. Po upieczeniu obrać.\n" +
                "\n" +
                "Ugotować kaszę orkiszową zgodnie z przepisem na opakowaniu.\n" +
                "\n" +
                "Tofu pokruszyć rękami na drobne kawałki. Wymieszać z resztą składników i przełożyć na blachę z papierem do pieczenia. Piec 10-15 min. w 150C z termoobiegiem, mieszając co parę minut. Gotowe tofu powinno być wysuszone.\n" +
                "\n" +
                "Cebulę pokrojoną w kostkę, czosnek przeciśnięty przez praskę i łodygi botwiny pokrojone na 1cm kawałki podsmażyć. Następnie wymieszać z kaszą, tofu i jajkiem.\n" +
                "\n" +
                "Liście botwiny sparzyć partiami przez 1 min.\n" +
                "\n" +
                "Jeśli liście są małe, ułożyć 2 obok siebie, wypełnić farszem i zwinąć gołąbka. Jeśli liście są duże, wystarczy jeden. Gotowe gołąbki gotować na parze przez 25 min. Podawać z kozim twarożkiem i pieczonymi buraczkami.");



        odp = odpowiedzi.get(index);
        ile = odpowiedzi.size();
    }

}
