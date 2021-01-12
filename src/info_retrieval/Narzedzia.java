package info_retrieval;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Narzedzia {

    public static String[] imieZenskie = {"Weronika", "Wiktoria", "Wioleta", "Waleria", "Elżbieta", "Elena", "Eliza", "Elwira", "Emma", "Emilia", "Ewa", "Ewelina", "Estera", "Edyta", "Rita", "Roksana", "Renata", "Róża", "Rozalia", "Regina", "Tamara", "Tola", "Urszula", "Ida", "Idalia", "Iga", "Inga", "Inez", "Ilona", "Izabela", "Iwona", "Irena", "Irma", "Ilza", "Oliwia", "Olimpia", "Oktawia", "Olga", "Otylia", "Odeta", "Paulina", "Patrycja", "Pola", "Pelagia", "Ada", "Adrianna", "Agata", "Aldona", "Alicja", "Alina", "Agnieszka", "Aleksandra", "Amelia", "Amanda", "Anastazja", "Anna", "Anita", "Angelika", "Antonina", "Arleta", "Aurelia", "Sandra", "Sara", "Sonia", "Sylwia", "Samanta", "Sabina", "Dagna", "Dagmara", "Danuta", "Daria", "Daniela", "Diana", "Dominika", "Dorota", "Donata", "Dalia", "Franciszka", "Felicyta", "Faustyna", "Felicja", "Gabriela", "Greta", "Gracja", "Gracjana", "Grażyna", "Gaja", "Honorata", "Hanna", "Jagoda", "Joanna", "Janina", "Jowita", "Julia", "Julita", "Judyta", "Justyna", "Jaśmina", "Kamila", "Kaja", "Karina", "Kalina", "Karolina", "Katarzyna", "Klaudia", "Ksenia", "Klara", "Kornelia", "Kamelia", "Kinga", "Kira", "Lilianna", "Luiza", "Lidia", "Linda", "Laura", "Lena", "Leokadia", "Liwia", "Lucyna", "Ludmiła", "Zuzanna", "Zofia", "Zyta", "Celina", "Cecylia", "Berenika", "Blanka", "Bożena", "Bianka", "Beata", "Brygida", "Beatrycze", "Nina", "Natalia", "Nadia", "Nikola", "Nikoletta", "Nel", "Magda", "Magdalena", "Maja", "Maria", "Marta", "Martyna", "Marika", "Marlena", "Malwina", "Marzena", "Matylda", "Monika", "Marietta", "Miranda"};
    public static String[] imieMeskie = {"Aron", "Adam", "Adrian", "Alan", "Albert", "Alek", "Aleks", "Aleksander", "Aleksy", "Alex", "Alexander", "Alfred", "Alan", "Alojzy", "Amadeusz", "Amir", "Anastazy", "Anatol", "Andrzej", "Antoni", "Ariel", "Arkadiusz", "Armin", "Aron", "Artur", "Aureliusz", "Bartłomiej", "Bartosz", "Bastian", "Beniamin", "Benjamin", "Bernard", "Błażej", "Bogumił", "Bolesław", "Borys", "Bożydar", "Brajan", "Brayan", "Brian", "Bronisław", "Bruno", "Bryan", "Cezary", "Colin", "Cyprian", "Cyryl", "Czesław", "Damian", "Daniel", "Darek", "Dariusz", "David", "Dawid", "Denis", "Diego", "Dobromił", "Dominik", "Dorian", "Edward", "Eliasz", "Emanuel", "Emil", "Emilian", "Ernest", "Erwin", "Eryk", "Eugeniusz", "Eustachy", "Fabian", "Feliks", "Felix", "Filip", "Florian", "Franciszek", "Fryderyk", "Gabriel", "Gniewko", "Gniewomir", "Gracjan", "Grzegorz", "Gustaw", "Henryk", "Heronim", "Hubert", "Hugo", "Ignacy", "Igor", "Ireneusz", "Ivo", "Iwo", "Jacek", "Jacob", "Jakub", "Jan", "Janusz", "Jarosław", "Jeremi", "Jeremiasz", "Jerzy", "Jędrzej", "Joachim", "Joda", "Jonasz", "Jonatan", "Jonathan", "Józef", "Julian", "Juliusz", "Kacper", "Kajetan", "Kamil", "Karol", "Kasjan", "Kasper", "Kaspian", "Kazimierz", "Kevin", "Kewin", "Klaudiusz", "Klemens", "Konrad", "Konstanty", "Kordian", "Kornel", "Korneliusz", "Kosma", "Kryspin", "Krystian", "Krzesimir", "Krzysztof", "Ksawery", "Ksawier", "Kuba", "Leo", "Leon", "Leonard", "Leonardo", "Leopold", "Leszek", "Lew", "Longin", "Lucjan", "Ludwik", "Łazarz", "Łukasz", "Maciej", "Maks", "Maksym", "Maksymilian", "Marcel", "Marceli", "Marcin", "Marek", "Marian", "Mariusz", "Martin", "Mateusz", "Maurycy", "Max", "Maximilian", "Michael", "Michał", "Mieszko", "Mikołaj", "Milan", "Miłosz", "Miron", "Mirosław", "Natan", "Nataniel", "Nathan", "Nathaniel", "Nicolas", "Nikodem", "Nikolas", "Norbert", "Oktawian", "Olaf", "Oleg", "Olgierd", "Oliver", "Olivier", "Oliwer", "Oliwier", "Oscar", "Oskar", "Patryk", "Paweł", "Philip", "Piotr", "Przemysław", "Radosław", "Rafał", "Remigiusz", "Robert", "Roch", "Roman", "Ryan", "Ryszard", "Samuel", "Sebastian", "Sergiusz", "Seweryn", "Sławomir", "Stanisław", "Stefan", "Sylwester", "Szczepan", "Szymon", "Tadeusz", "Teodor", "Teofil", "Tobiasz", "Tomasz", "Tymon", "Tymoteusz", "Tytus", "Victor", "Viktor", "Vincent", "Wacław", "Walenty", "Wawrzyniec", "Wiktor", "Wincent", "Wincenty", "Witold", "Władysław", "Wojciech"};
    public static String[] nazwisko = {"Rosik", "Zuber", "Prokopowicz", "Ptaszyński", "Wojnicki", "Urbański", "Fryc", "Komarnicki", "Barczewski", "Jaźwiński", "Kopaczewski", "Budziak", "Belka", "Sobieski", "Kłoda", "Kowalkowski", "Jasek", "Noworyta", "Gaweł", "Mąkosa", "Bakalarz", "Gacek", "Karasek", "Wiącek", "Halicki", "Paprzycki", "Fabiszewski", "Cios", "Rogalski", "Kępczyński", "Popiela", "Szmigiel", "Schulz", "Meyer", "Jasik", "Korczyński", "Maciejewski", "Mikrut", "Korytkowski", "Nowosielski", "Goch", "Jeżak", "Wieloch", "Psiuk", "Gołąbek", "Grabek", "Jeziorski", "Osiński", "Furmańczyk", "Salamon", "Kuśmierczyk", "Prorok", "Jarzębowski", "Uciński", "Kochan", "Zyskowski", "Kałucki", "Karkoszka", "Fijołek", "Stępniak", "Staszkiewicz", "Lach", "Dobkowski", "Orłowski", "Domalewski", "Kachniarz", "Zduńczyk", "Pisula", "Piecyk", "Rudziński", "Rossa", "Mrozik", "Golis", "Golik", "Ozga", "Szymański", "Pięta", "Zawada", "Liszewski", "Guz", "Ślązak", "Olszański", "Grygiel", "Syski", "Binkowski", "Jakóbczyk", "Bogdan", "Oleszek", "Perek", "Łoś", "Osuch", "Danielski", "Święcicki", "Wacławski", "Stachoń", "Hirsz", "Świerkowski", "Gazda", "Auguścik", "Zaczek", "Chmielewski", "Foryś", "Przybyszewski", "Jesionowski", "Czepiel", "Kochanowski", "Więcławski", "Wodecki", "Lisiecki", "Górnik", "Kudła", "Soszyński", "Szymkiewicz", "Borucki", "Wandzel", "Ptasiński", "Łagodziński", "Boczar", "Poniatowski", "Dybek", "Kozera", "Węsierski", "Skrodzki", "Wnorowski", "Wójcik", "Rzepka", "Denis", "Koperski", "Ploch", "Zawalski", "Koźbiał", "Dura", "Wojda", "Łuszcz", "Parzych", "Frankiewicz", "Polok", "Dworaczek", "Ciszak", "Kosik", "Gawor", "Ceglarz", "Ciok", "Cichecki", "Kabat", "Janiak", "Stolarz", "Szczech", "Miler", "Kortas", "Owczarek", "Szczypiński", "Adamczewski", "Motylewski", "Dobrzański", "Smółka", "Talaśka", "Przygodzki", "Nowicki", "Majerski", "Nowocień", "Szczerbiński", "Brzezicki", "Łukowski", "Kulak", "Kotula", "Cygan", "Mirowski", "Bojanowski", "Orkisz", "Leśniowski", "Sawiński", "Błaszak", "Janeczko", "Teodorczyk", "Łazarczyk", "Łaszkiewicz", "Białkowski", "Sierant", "Zdeb", "Starzec", "Frączek", "Bigaj", "Ługowski", "Wolnik", "Koprowski", "Wegner", "Ćwiek", "Neuman", "Bereza", "Jaworek", "Sidor", "Barylski", "Nawrocki", "Zaborowski", "Czerwiński", "Brzyski", "Federowicz", "Klima"};

    public static String genImieZen() {
        Random r = new Random();
        int randomImie = r.nextInt(152);
        return imieZenskie[randomImie];
    }

    public static String genImieMes() {
        Random r = new Random();
        int randomImie = r.nextInt(229);
        return imieMeskie[randomImie];
    }

    public static String genNazwisko() {
        Random r = new Random();
        int randomImie = r.nextInt(198);
        return nazwisko[randomImie];
    }

    public static String genNazwiskoZen() {
        Random r = new Random();
        int randomImie = r.nextInt(198);
        char[] nazw = nazwisko[randomImie].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        return nazwisko1;
    }

    public static String genNumer() {
        Random r = new Random();
        String numer;
        int poczatek = r.nextInt(889-500+1)+500;
        int srodek = r.nextInt(889-100+1)+100;
        int koniec = r.nextInt(889-100+1)+100;
        numer = String.valueOf(poczatek)+String.valueOf(srodek)+String.valueOf(koniec);
        return numer;
    }

    public static void clickXY(int x, int y) throws AWTException, InterruptedException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        Thread.sleep(1000);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void clickXYPrawy(int x, int y) throws AWTException, InterruptedException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        Thread.sleep(1000);
        bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public static void Zmniejsz(int razy) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        for (int i = 0; i < razy; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
            Thread.sleep(500);
        }
    }

    public static void Zwieksz(int razy) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        for (int i = 0; i < razy; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_PLUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_PLUS);
            Thread.sleep(500);
        }
    }

    public static void Kopiuj(String copy) {
        StringSelection selec = new StringSelection(copy);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selec, selec);
    }

    public static void Wklej() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
    }

    public static void Przeciagnij(int x1, int y1, int x2, int y2) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.mouseMove(x1,y1);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseMove(x2,y2);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void sprawdzMail() throws InterruptedException, FileNotFoundException {
        PrintWriter zablokowany = new PrintWriter("C:\\Users\\Artur\\Desktop\\klikanie\\maileKupione\\zablokowane.txt");
        PrintWriter dobry = new PrintWriter("C:\\Users\\Artur\\Desktop\\klikanie\\maileKupione\\dobre.txt");
        Scanner doSprawdzenia = new Scanner(new File("C:\\Users\\Artur\\Desktop\\klikanie\\maileKupione\\doSprawdzenia.txt"));
        String mail;
        for (int i=0;i<559;i++) {
            WebDriver driver = new FirefoxDriver();
            mail = doSprawdzenia.nextLine();
            driver.get("http://poczta.wp.pl");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(1000);
            try {
                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
                dobry.println(mail);
                driver.quit();
            } catch (Exception e) {
                zablokowany.println(mail);
                driver.quit();
            }
        }
        dobry.close();
        zablokowany.close();

    }

    public static void napiszMail() throws InterruptedException, FileNotFoundException, AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://poczta.wp.pl");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("maurok17@wp.pl");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/nh-top-action-bar/div/div[1]/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div/div/input")).sendKeys("dumcio.97@wp.pl");
        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/div[3]/div[2]/input")).sendKeys("RUSZAJ DUPE GRUBASIE");
        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[2]/div[2]")).click();
        Narzedzia.Kopiuj("ZAPIERDALAJ DO DOMU");
        Thread.sleep(1000);
        Narzedzia.Wklej();
        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[2]/div[4]/div/div[1]/button/div/span")).click();
        Thread.sleep(6000);
        driver.quit();
    }

    public static String dodajZero(int wartosc) {
        String wynik;
        if (wartosc < 10)
            wynik = "0"+String.valueOf(wartosc);
        else
            wynik = String.valueOf(wartosc);
        return wynik;
    }

    public static void ScrollBy(WebDriver driver, String ile) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+ile+")");
    }

    public static void Arkadia(WebDriver driver, String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        int m=0;
        boolean flaga = false;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        clickXY(1861,1003);
        Thread.sleep(2000);
        clickXY(1861,1003);
        Thread.sleep(2000);
        clickXY(1861,1003);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"idms\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstnameReg\"]")).sendKeys(genImieZen());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lastnameReg\"]")).sendKeys(genNazwiskoZen());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"emailReg\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(mail+"V2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dateDOB\"]")).sendKeys(String.valueOf(dzien));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"monthDOB\"]")).sendKeys(String.valueOf(miesiac));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"yearDOB\"]")).sendKeys(String.valueOf(rok));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lblcommercialoptin\"]/span")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        clickXY(976,982);

        Thread.sleep(15000);
        clickXY(832,334);
        Thread.sleep(2000);
        clickXY(950,424);
        Thread.sleep(1000);
        clickXY(951,587);
        Thread.sleep(15000);
        /*
        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(2000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Westfield Arkadia']")).click();
                Thread.sleep(4000);
                //driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/div[2]/div[3]/table[1]/tbody/tr/td/div[1]/table[2]/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();
                driver.findElement(By.xpath("//*[text()=' WYPEŁNIAM ANKIETĘ']")).click();
                Thread.sleep(10000);
                for (String winHandle : driver.getWindowHandles()) {
                    driver.switchTo().window(winHandle);
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/a")).click();
                Thread.sleep(10000);
                flaga = true;
            } catch (Exception e) {
                clickXY(89, 51);
                Thread.sleep(10000);
            }
            m++;
            if (m > 6) {
                break;
            }
        }
        */
    }

    public static void ArkadiaFF(WebDriver driver, String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int dzien = r.nextInt(28) + 1;
        String dzie = String.valueOf(dzien);
        int miesiac = r.nextInt(11) + 1;
        String mie = String.valueOf(miesiac);
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        String ro = String.valueOf(rok);
        int m=0;
        boolean flaga = false;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        clickXY(1880,1003);
        Thread.sleep(2000);
        clickXY(1870,1003);
        Thread.sleep(2000);
        clickXY(1861,1003);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"idms\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstnameReg\"]")).sendKeys(genImieZen());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lastnameReg\"]")).sendKeys(genNazwiskoZen());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"emailReg\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(mail+"V2");
        Thread.sleep(1000);
        clickXY(680,627);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dateDOB\"]")).sendKeys(dzie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"monthDOB\"]")).sendKeys(mie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"yearDOB\"]")).sendKeys(ro);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lblcommercialoptin\"]/span")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        clickXY(976,982);

        Thread.sleep(15000);
        clickXY(832,289);
        Thread.sleep(2000);
        clickXY(950,376);
        Thread.sleep(1000);
        clickXY(951,508);
        Thread.sleep(15000);
        /*
        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(2000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Westfield Arkadia']")).click();
                Thread.sleep(4000);
                //driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/div[2]/div[3]/table[1]/tbody/tr/td/div[1]/table[2]/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();
                driver.findElement(By.xpath("//*[text()=' WYPEŁNIAM ANKIETĘ']")).click();
                Thread.sleep(10000);
                for (String winHandle : driver.getWindowHandles()) {
                    driver.switchTo().window(winHandle);
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/a")).click();
                Thread.sleep(10000);
                flaga = true;
            } catch (Exception e) {
                clickXY(89, 51);
                Thread.sleep(10000);
            }
            m++;
            if (m > 6) {
                break;
            }
        }
        */
    }

    public static void pobierzAdres(int ile) throws AWTException, FileNotFoundException, InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\bot\\geckodriver\\geckodriver.exe");
        String kods,ulicak,miaston;
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        PrintWriter kodo = new PrintWriter("C:\\bot\\kod.txt");
        //PrintWriter kodo2 = new PrintWriter("C:\\Users\\Artur\\Desktop\\klikanie\\VeePee\\kody2.txt");
        PrintWriter ulica = new PrintWriter("C:\\bot\\ulica.txt");
        PrintWriter miastok = new PrintWriter("C:\\bot\\miasto.txt");
        driver.get("https://www.fakeaddressgenerator.com/World/Poland_address_generator");

        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
        for (int i=0;i<ile*2;i++)
        {
            if (i%2==0) {
                kods = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[11]/div[2]/strong/input")).getAttribute("value");
                ulicak = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[8]/div[2]/strong/input")).getAttribute("value");
                miaston = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[9]/div[2]/strong/input")).getAttribute("value");
                Thread.sleep(1000);
                kodo.println(kods);
                ulica.println(ulicak);
                miastok.println(miaston);
            }
            robot.keyPress(KeyEvent.VK_F5);
            Thread.sleep(5000);
        }
        kodo.close();
        ulica.close();
        miastok.close();
        driver.quit();
    }

    public static void potwierdzArkadie(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        clickXY(333,580);
        clickXY(333,580);
        Thread.sleep(10000);

        try {
            driver.findElement(By.xpath("//*[text()='Westfield Arkadia']")).click();
            Thread.sleep(4000);
            //driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/div[2]/div[3]/table[1]/tbody/tr/td/div[1]/table[2]/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();
            driver.findElement(By.xpath("//*[text()=' WYPEŁNIAM ANKIETĘ']")).click();
            Thread.sleep(10000);
            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/a")).click();
            Thread.sleep(10000);
            driver.quit();
        } catch (Exception e) {
            try {
                driver.findElement(By.xpath("//*[text()='Oferty']")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Galeria Mokotów']")).click();
                Thread.sleep(4000);
                //driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/div[2]/div[3]/table[1]/tbody/tr/td/div[1]/table[2]/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();
                driver.findElement(By.xpath("//*[text()=' WYPEŁNIAM ANKIETĘ']")).click();
                Thread.sleep(10000);
                for(String winHandle : driver.getWindowHandles()){
                    driver.switchTo().window(winHandle);
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/a")).click();
                Thread.sleep(10000);
                driver.quit();
            } catch (Exception f) {
                try {
                    driver.findElement(By.xpath("//*[text()='Wroclavia']")).click();
                    Thread.sleep(4000);
                    //driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/div[2]/div[3]/table[1]/tbody/tr/td/div[1]/table[2]/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();
                    driver.findElement(By.xpath("//*[text()=' WYPEŁNIAM ANKIETĘ']")).click();
                    Thread.sleep(10000);
                    for(String winHandle : driver.getWindowHandles()){
                        driver.switchTo().window(winHandle);
                    }
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[2]/div/div[2]/a")).click();
                    Thread.sleep(10000);
                    driver.quit();
                } catch (Exception d) {
                    driver.quit();
                }

            }

        }
    }

    public static void potwierdzArkadia(WebDriver driver, String mail) throws InterruptedException, AWTException {
        boolean flaga = false;
        int m = 0;
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        clickXY(333,580);
        clickXY(333,580);
        Thread.sleep(15000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Westfield Arkadia']")).click();
                flaga = true;
                Thread.sleep(4000);
                Zmniejsz(1);
                Thread.sleep(1000);
                clickXY(1108,944);
                Thread.sleep(10000);
                for (String winHandle : driver.getWindowHandles()) {
                    driver.switchTo().window(winHandle);
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/a")).click();
                Thread.sleep(10000);
                driver.quit();
            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 10) {
                driver.quit();
                break;
            }
        }
    }

    public static void potwierdzGaleria(WebDriver driver, String mail) throws InterruptedException, AWTException {
        boolean flaga = false;
        int m = 0;
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        clickXY(333,580);
        clickXY(333,580);
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[text()='Oferty']")).click();
        Thread.sleep(3000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Galeria Mokotów']")).click();
                flaga = true;
                Thread.sleep(4000);
                //driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/div[2]/div[3]/table[1]/tbody/tr/td/div[1]/table[2]/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();
                Zmniejsz(1);
                Thread.sleep(1000);
                clickXY(1108,900);
                Thread.sleep(10000);
                for(String winHandle : driver.getWindowHandles()){
                    driver.switchTo().window(winHandle);
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div[2]/a")).click();
                Thread.sleep(10000);
                driver.quit();
            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 10) {
                driver.quit();
                break;
            }
        }
    }

    public static void potwierdzWroclawia(WebDriver driver, String mail) throws InterruptedException, AWTException {
        boolean flaga = false;
        int m = 0;
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        clickXY(333,580);
        clickXY(333,580);
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[text()='Oferty']")).click();
        Thread.sleep(3000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Wroclavia']")).click();
                flaga = true;
                Thread.sleep(4000);
                Zmniejsz(1);
                Thread.sleep(1000);
                clickXY(1108,944);
                Thread.sleep(10000);
                for(String winHandle : driver.getWindowHandles()){
                    driver.switchTo().window(winHandle);
                }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[2]/div/div[2]/a")).click();
                Thread.sleep(10000);
                driver.quit();
            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 10) {
                driver.quit();
                break;
            }
        }
    }

    public static void zmienKarte(WebDriver driver) {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public static void refreshEvery(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[text()='Połączenie zostało przerwane']")).click();
            driver.navigate().refresh();
            Thread.sleep(10000);
        } catch (Exception e) {

        }
    }

    public static void sprawdzLinkEvery(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[text()='Ta witryna jest nieosiągalna']")).click();
            driver.navigate().refresh();
            Thread.sleep(10000);
        } catch (Exception e) {

        }
    }

    public static boolean sprawdzInternet(WebDriver driver) {
        boolean ok = true;
        try {
            driver.findElement(By.xpath("//*[text()='Ta witryna jest nieosiągalna']"));
            ok = false;
        } catch (Exception e) {

        }
        return ok;
    }
}
