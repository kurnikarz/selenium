package info_retrieval;
import com.sun.source.doctree.ThrowsTree;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.font.TextHitInfo;
import java.io.*;
import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Akcje {

    public static String[] imie = {"Weronika", "Wiktoria", "Wioleta", "Waleria", "Elżbieta", "Elena", "Eliza", "Elwira", "Emma", "Emilia", "Ewa", "Ewelina", "Estera", "Edyta", "Rita", "Roksana", "Renata", "Róża", "Rozalia", "Regina", "Tamara", "Tola", "Urszula", "Ida", "Idalia", "Iga", "Inga", "Inez", "Ilona", "Izabela", "Iwona", "Irena", "Irma", "Ilza", "Oliwia", "Olimpia", "Oktawia", "Olga", "Otylia", "Odeta", "Paulina", "Patrycja", "Pola", "Pelagia", "Ada", "Adrianna", "Agata", "Aldona", "Alicja", "Alina", "Agnieszka", "Aleksandra", "Amelia", "Amanda", "Anastazja", "Anna", "Anita", "Angelika", "Antonina", "Arleta", "Aurelia", "Sandra", "Sara", "Sonia", "Sylwia", "Samanta", "Sabina", "Dagna", "Dagmara", "Danuta", "Daria", "Daniela", "Diana", "Dominika", "Dorota", "Donata", "Dalia", "Franciszka", "Felicyta", "Faustyna", "Felicja", "Gabriela", "Greta", "Gracja", "Gracjana", "Grażyna", "Gaja", "Honorata", "Hanna", "Jagoda", "Joanna", "Janina", "Jowita", "Julia", "Julita", "Judyta", "Justyna", "Jaśmina", "Kamila", "Kaja", "Karina", "Kalina", "Karolina", "Katarzyna", "Klaudia", "Ksenia", "Klara", "Kornelia", "Kamelia", "Kinga", "Kira", "Lilianna", "Luiza", "Lidia", "Linda", "Laura", "Lena", "Leokadia", "Liwia", "Lucyna", "Ludmiła", "Zuzanna", "Zofia", "Zyta", "Celina", "Cecylia", "Berenika", "Blanka", "Bożena", "Bianka", "Beata", "Brygida", "Beatrycze", "Nina", "Natalia", "Nadia", "Nikola", "Nikoletta", "Nel", "Magda", "Magdalena", "Maja", "Maria", "Marta", "Martyna", "Marika", "Marlena", "Malwina", "Marzena", "Matylda", "Monika", "Marietta", "Miranda"};
    public static String[] meskie = {"Aron", "Adam", "Adrian", "Alan", "Albert", "Alek", "Aleks", "Aleksander", "Aleksy", "Alex", "Alexander", "Alfred", "Alan", "Alojzy", "Amadeusz", "Amir", "Anastazy", "Anatol", "Andrzej", "Antoni", "Ariel", "Arkadiusz", "Armin", "Aron", "Artur", "Aureliusz", "Bartłomiej", "Bartosz", "Bastian", "Beniamin", "Benjamin", "Bernard", "Błażej", "Bogumił", "Bolesław", "Borys", "Bożydar", "Brajan", "Brayan", "Brian", "Bronisław", "Bruno", "Bryan", "Cezary", "Colin", "Cyprian", "Cyryl", "Czesław", "Damian", "Daniel", "Darek", "Dariusz", "David", "Dawid", "Denis", "Diego", "Dobromił", "Dominik", "Dorian", "Edward", "Eliasz", "Emanuel", "Emil", "Emilian", "Ernest", "Erwin", "Eryk", "Eugeniusz", "Eustachy", "Fabian", "Feliks", "Felix", "Filip", "Florian", "Franciszek", "Fryderyk", "Gabriel", "Gniewko", "Gniewomir", "Gracjan", "Grzegorz", "Gustaw", "Henryk", "Heronim", "Hubert", "Hugo", "Ignacy", "Igor", "Ireneusz", "Ivo", "Iwo", "Jacek", "Jacob", "Jakub", "Jan", "Janusz", "Jarosław", "Jeremi", "Jeremiasz", "Jerzy", "Jędrzej", "Joachim", "Joda", "Jonasz", "Jonatan", "Jonathan", "Józef", "Julian", "Juliusz", "Kacper", "Kajetan", "Kamil", "Karol", "Kasjan", "Kasper", "Kaspian", "Kazimierz", "Kevin", "Kewin", "Klaudiusz", "Klemens", "Konrad", "Konstanty", "Kordian", "Kornel", "Korneliusz", "Kosma", "Kryspin", "Krystian", "Krzesimir", "Krzysztof", "Ksawery", "Ksawier", "Kuba", "Leo", "Leon", "Leonard", "Leonardo", "Leopold", "Leszek", "Lew", "Longin", "Lucjan", "Ludwik", "Łazarz", "Łukasz", "Maciej", "Maks", "Maksym", "Maksymilian", "Marcel", "Marceli", "Marcin", "Marek", "Marian", "Mariusz", "Martin", "Mateusz", "Maurycy", "Max", "Maximilian", "Michael", "Michał", "Mieszko", "Mikołaj", "Milan", "Miłosz", "Miron", "Mirosław", "Natan", "Nataniel", "Nathan", "Nathaniel", "Nicolas", "Nikodem", "Nikolas", "Norbert", "Oktawian", "Olaf", "Oleg", "Olgierd", "Oliver", "Olivier", "Oliwer", "Oliwier", "Oscar", "Oskar", "Patryk", "Paweł", "Philip", "Piotr", "Przemysław", "Radosław", "Rafał", "Remigiusz", "Robert", "Roch", "Roman", "Ryan", "Ryszard", "Samuel", "Sebastian", "Sergiusz", "Seweryn", "Sławomir", "Stanisław", "Stefan", "Sylwester", "Szczepan", "Szymon", "Tadeusz", "Teodor", "Teofil", "Tobiasz", "Tomasz", "Tymon", "Tymoteusz", "Tytus", "Victor", "Viktor", "Vincent", "Wacław", "Walenty", "Wawrzyniec", "Wiktor", "Wincent", "Wincenty", "Witold", "Władysław", "Wojciech"};
    public static String[] nazwisko = {"Rosik", "Zuber", "Prokopowicz", "Ptaszyński", "Wojnicki", "Urbański", "Fryc", "Komarnicki", "Barczewski", "Jaźwiński", "Kopaczewski", "Budziak", "Belka", "Sobieski", "Kłoda", "Kowalkowski", "Jasek", "Noworyta", "Gaweł", "Mąkosa", "Bakalarz", "Gacek", "Karasek", "Wiącek", "Halicki", "Paprzycki", "Fabiszewski", "Cios", "Rogalski", "Kępczyński", "Popiela", "Szmigiel", "Schulz", "Meyer", "Jasik", "Korczyński", "Maciejewski", "Mikrut", "Korytkowski", "Nowosielski", "Goch", "Jeżak", "Wieloch", "Psiuk", "Gołąbek", "Grabek", "Jeziorski", "Osiński", "Furmańczyk", "Salamon", "Kuśmierczyk", "Prorok", "Jarzębowski", "Uciński", "Kochan", "Zyskowski", "Kałucki", "Karkoszka", "Fijołek", "Stępniak", "Staszkiewicz", "Lach", "Dobkowski", "Orłowski", "Domalewski", "Kachniarz", "Zduńczyk", "Pisula", "Piecyk", "Rudziński", "Rossa", "Mrozik", "Golis", "Golik", "Ozga", "Szymański", "Pięta", "Zawada", "Liszewski", "Guz", "Ślązak", "Olszański", "Grygiel", "Syski", "Binkowski", "Jakóbczyk", "Bogdan", "Oleszek", "Perek", "Łoś", "Osuch", "Danielski", "Święcicki", "Wacławski", "Stachoń", "Hirsz", "Świerkowski", "Gazda", "Auguścik", "Zaczek", "Chmielewski", "Foryś", "Przybyszewski", "Jesionowski", "Czepiel", "Kochanowski", "Więcławski", "Wodecki", "Lisiecki", "Górnik", "Kudła", "Soszyński", "Szymkiewicz", "Borucki", "Wandzel", "Ptasiński", "Łagodziński", "Boczar", "Poniatowski", "Dybek", "Kozera", "Węsierski", "Skrodzki", "Wnorowski", "Wójcik", "Rzepka", "Denis", "Koperski", "Ploch", "Zawalski", "Koźbiał", "Dura", "Wojda", "Łuszcz", "Parzych", "Frankiewicz", "Polok", "Dworaczek", "Ciszak", "Kosik", "Gawor", "Ceglarz", "Ciok", "Cichecki", "Kabat", "Janiak", "Stolarz", "Szczech", "Miler", "Kortas", "Owczarek", "Szczypiński", "Adamczewski", "Motylewski", "Dobrzański", "Smółka", "Talaśka", "Przygodzki", "Nowicki", "Majerski", "Nowocień", "Szczerbiński", "Brzezicki", "Łukowski", "Kulak", "Kotula", "Cygan", "Mirowski", "Bojanowski", "Orkisz", "Leśniowski", "Sawiński", "Błaszak", "Janeczko", "Teodorczyk", "Łazarczyk", "Łaszkiewicz", "Białkowski", "Sierant", "Zdeb", "Starzec", "Frączek", "Bigaj", "Ługowski", "Wolnik", "Koprowski", "Wegner", "Ćwiek", "Neuman", "Bereza", "Jaworek", "Sidor", "Barylski", "Nawrocki", "Zaborowski", "Czerwiński", "Brzyski", "Federowicz", "Klima"};

    public static String DataUr(int rok, int miesiac, int dzien) {

        String wynik = null;
        if (dzien < 10)
            wynik = rok + "-" + miesiac + "-0" + dzien;
        else if (miesiac < 10)
            wynik = rok + "-0" + miesiac + "-" + dzien;
        else if (dzien < 10 && miesiac < 10)
            wynik = rok + "-0" + miesiac + "-0" + dzien;
        else
            wynik = rok + "-" + miesiac + "-" + dzien;
        return wynik;

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

    public static void clickXY(int x, int y) throws AWTException, InterruptedException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        Thread.sleep(1000);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void Knorr(String mail) throws InterruptedException, AWTException {
        //System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://marketing.tr.netsalesmedia.pl/ts/i5036350/tsc?amc=dis.cubegroup.389902.403207.146737&tst=!!TIMESTAMP!!");
        Thread.sleep(6000);
        firefox.findElement(By.cssSelector(".button-right")).click();
        Thread.sleep(2000);
        firefox.findElement(By.cssSelector("div.agree-row:nth-child(5) > div:nth-child(1) > input:nth-child(1)")).click();
        firefox.findElement(By.cssSelector("div.agree-row:nth-child(6) > div:nth-child(1) > input:nth-child(1)")).click();
        firefox.findElement(By.cssSelector("div.agree-row:nth-child(7) > div:nth-child(1) > input:nth-child(1)")).click();
        firefox.findElement(By.cssSelector("div.agree-row:nth-child(8) > div:nth-child(1) > input:nth-child(1)")).click();
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div[8]/input")).sendKeys(mail);
        Thread.sleep(3000);
        firefox.findElement(By.cssSelector(".download-ebook-button")).click();
        Thread.sleep(6000);
        firefox.close();
    }

    public static void Link4(String imie, String nazwisko, String tel) throws InterruptedException {

        WebDriver firefox = new FirefoxDriver(); //6
        firefox.get("https://zarabiacze.pl/action/796/uid/19/");

        Thread.sleep(20000);
        firefox.findElement(By.id("normalHelpCallMe")).click();
        Thread.sleep(4000);
        firefox.findElement(By.cssSelector("#contact\\.firstName")).sendKeys(imie);
        firefox.findElement(By.cssSelector("#contact\\.name")).sendKeys(nazwisko);
        firefox.findElement(By.cssSelector("#contactPartMobileTelephoneIdNumber")).sendKeys(tel);
        firefox.findElement(By.cssSelector("#policyCalculatePVO\\.helpPageConsents0\\.selectedValue1")).click();
        Thread.sleep(10000);
        firefox.findElement(By.cssSelector("button.button")).click();
        Thread.sleep(4000);
        firefox.close();
    }

    public static void Link42(String imie, String nazwisko, String tel) throws InterruptedException {

        WebDriver firefox = new FirefoxDriver(); //7
        firefox.get("https://zarabiacze.pl/action/793/uid/19/");

        Thread.sleep(20000);
        firefox.findElement(By.id("normalHelpCallMe")).click();
        Thread.sleep(4000);
        firefox.findElement(By.cssSelector("#contact\\.firstName")).sendKeys(imie);
        firefox.findElement(By.cssSelector("#contact\\.name")).sendKeys(nazwisko);
        firefox.findElement(By.cssSelector("#contactPartMobileTelephoneIdNumber")).sendKeys(tel);
        firefox.findElement(By.cssSelector("#policyCalculatePVO\\.helpPageConsents0\\.selectedValue1")).click();
        firefox.findElement(By.cssSelector("button.button")).click();
        Thread.sleep(10000);
        firefox.close();
    }

    public static void Mtu(String kod, String tel) throws InterruptedException {
        Random rand = new Random();
        int r = rand.nextInt(2001 - 1988 + 1) + 1988;
        int przebie = rand.nextInt(7) + 1;
        String dataUr = null;
        int rokUr = rand.nextInt(1986 - 1963 + 1) + 1963;

        int miesUr = rand.nextInt(12 - 1 + 1) + 1;
        int dzienUr = rand.nextInt(29 - 1 + 1) + 1;

        int rokUz = rand.nextInt(14 - 3) + 3;
        int oc = rand.nextInt(5);
        int ac = rand.nextInt(5);
        int pentla = rand.nextInt(11);
        if (dzienUr < 10) {
            dataUr = String.valueOf(rokUr) + String.valueOf(miesUr) + "0" + String.valueOf(dzienUr);
        }
        if (miesUr < 10) {
            dataUr = String.valueOf(rokUr) + "0" + String.valueOf(miesUr) + String.valueOf(dzienUr);
        }
        if (dzienUr < 10 && miesUr < 10) {
            dataUr = String.valueOf(rokUr) + "0" + String.valueOf(miesUr) + "0" + String.valueOf(dzienUr);
        }
        if (dzienUr >= 10 && miesUr >= 10) {
            dataUr = String.valueOf(rokUr) + String.valueOf(miesUr) + String.valueOf(dzienUr);
        }

        String rok = String.valueOf(r);
        WebDriver firefox = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) firefox;
        firefox.manage().window().maximize();
        firefox.get("https://zarabiacze.pl/action/715/66d8eb8b90df0ee2fe42c70f6140d3c9");
        Thread.sleep(10000);

        Select rokProd = new Select(firefox.findElement(By.cssSelector(".ng-tns-c12-0 > div:nth-child(1) > div:nth-child(2) > app-eurotax-vehicle:nth-child(2) > app-selector:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > select:nth-child(1)")));
        switch (pentla) {
            case 0: //ford
                rokProd.selectByValue("1996");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(3000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[17]")).click();
                Thread.sleep(3000);
                Select model = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model.selectByIndex(8);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[9]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[12]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[13]/div/div/div[2]/button[1]")).click();
                Thread.sleep(3000);
                break;

            case 1: //opel
                rokProd.selectByValue("1993");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("op");
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(3000);
                Select model1 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model1.selectByIndex(5);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 2: //renault
                rokProd.selectByValue("1999");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(3000);
                //firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[46]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("re");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(3000);
                Select model2 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model2.selectByIndex(10);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;


            case 3: //skoda
                rokProd.selectByValue("1998");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.cssSelector("button.btn:nth-child(13)")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("sk");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[13]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;


            case 4: //volkswagen
                rokProd.selectByValue("1995");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.cssSelector("button.btn:nth-child(13)")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("vo");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(2000);
                Select model3 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model3.selectByIndex(4);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[5]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[4]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[10]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[11]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 5:
                rokProd.selectByValue("2000");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("to");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(1000);

                Select model5 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model5.selectByIndex(8);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                break;

            case 6:
                rokProd.selectByValue("1999");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("to");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(2000);

                Select model6 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model6.selectByIndex(6);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 7:
                rokProd.selectByValue("1994");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("re");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(2000);
                Select model7 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model7.selectByIndex(9);
                Thread.sleep(3000);
                break;

            case 8:
                rokProd.selectByValue("1996");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("ci");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(2000);

                Select model8 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model8.selectByIndex(6);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 9:
                rokProd.selectByValue("2001");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("maz");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(2000);

                Select model9 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model9.selectByIndex(8);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 10:
                rokProd.selectByValue("1995");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("au");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(2000);

                Select model10 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model10.selectByIndex(3);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[10]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[11]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[12]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 11:
                rokProd.selectByValue("1997");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("se");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[2]")).click();
                Thread.sleep(2000);

                Select model11 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model11.selectByIndex(3);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[1]")).click();
                Thread.sleep(3000);
                break;
        }
        Select przebieg = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-selector[1]/div/div/div[2]/div/select")));
        js.executeScript("arguments[0].scrollIntoView();", przebieg);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-selector[1]/div/div/div[2]/div/select")).click();
        Thread.sleep(1000);
        przebieg.selectByIndex(przebie);
        Thread.sleep(3000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-selector[2]/div/div/div[2]/button[1]")).click();
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-selector[3]/div/div/div[2]/button[1]")).click();
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-input[1]/div/div[1]/div[2]/div/div/input")).sendKeys(kod);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-input[1]/div/div[1]/div[2]/div/div/input")).click();
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-input[2]/div/div[1]/div[2]/div/input")).sendKeys(dataUr);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[1]/div/div/div[2]/button[2]")).click();
        Thread.sleep(2000);
        Select rokUzy = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[2]/div/div/div[2]/div/select")));
        js.executeScript("arguments[0].scrollIntoView();", rokUzy);
        rokUzy.selectByIndex(rokUz);
        Thread.sleep(2000);
        switch (oc) {
            case 0:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[2]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
            case 1:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[3]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
            case 2:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[4]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
            case 3:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[5]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
            case 4:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[6]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
        }
        switch (ac) {
            case 0:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[3]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
            case 1:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[3]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
            case 2:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[4]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
            case 3:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[5]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
            case 4:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[6]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
        }
        Thread.sleep(2000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[3]/div/div[2]/app-input/div/div[1]/div[2]/input")).click();
        Thread.sleep(1000);

        js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[3]/div/div[2]/app-input/div/div[1]/div[2]/input")));
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[3]/div/div[2]/app-input/div/div[1]/div[2]/input")).sendKeys(tel);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-dynamic-clause/div[2]/div[1]/div[1]/app-input-checkbox/div/div/div")).click();
        Thread.sleep(3000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-footer-navigation/div/div")).click();
        Thread.sleep(8000);
        firefox.close();

    }

    public static void Mtu2(String kod, String tel) throws InterruptedException {
        Random rand = new Random();
        int r = rand.nextInt(2001 - 1988 + 1) + 1988;
        int przebie = rand.nextInt(7) + 1;
        String dataUr = null;
        int rokUr = rand.nextInt(1986 - 1963 + 1) + 1963;

        int miesUr = rand.nextInt(12 - 1 + 1) + 1;
        int dzienUr = rand.nextInt(29 - 1 + 1) + 1;

        int rokUz = rand.nextInt(14 - 3) + 3;
        int oc = rand.nextInt(5);
        int ac = rand.nextInt(5);
        int pentla = rand.nextInt(11);
        if (dzienUr < 10) {
            dataUr = String.valueOf(rokUr) + String.valueOf(miesUr) + "0" + String.valueOf(dzienUr);
        }
        if (miesUr < 10) {
            dataUr = String.valueOf(rokUr) + "0" + String.valueOf(miesUr) + String.valueOf(dzienUr);
        }
        if (dzienUr < 10 && miesUr < 10) {
            dataUr = String.valueOf(rokUr) + "0" + String.valueOf(miesUr) + "0" + String.valueOf(dzienUr);
        }
        if (dzienUr >= 10 && miesUr >= 10) {
            dataUr = String.valueOf(rokUr) + String.valueOf(miesUr) + String.valueOf(dzienUr);
        }

        String rok = String.valueOf(r);
        WebDriver firefox = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) firefox;
        firefox.manage().window().maximize();
        firefox.get("https://zarabiacze.pl/action/806/uid/19/");
        Thread.sleep(10000);

        Select rokProd = new Select(firefox.findElement(By.cssSelector(".ng-tns-c12-0 > div:nth-child(1) > div:nth-child(2) > app-eurotax-vehicle:nth-child(2) > app-selector:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > select:nth-child(1)")));
        switch (pentla) {
            case 0: //ford
                rokProd.selectByValue("1996");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(3000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[17]")).click();
                Thread.sleep(3000);
                Select model = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model.selectByIndex(8);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[9]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[12]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[13]/div/div/div[2]/button[1]")).click();
                Thread.sleep(3000);
                break;

            case 1: //opel
                rokProd.selectByValue("1993");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("op");
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(3000);
                Select model1 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model1.selectByIndex(5);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 2: //renault
                rokProd.selectByValue("1999");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(3000);
                //firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[46]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("re");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(3000);
                Select model2 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model2.selectByIndex(10);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;


            case 3: //skoda
                rokProd.selectByValue("1998");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.cssSelector("button.btn:nth-child(13)")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("sk");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[13]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;


            case 4: //volkswagen
                rokProd.selectByValue("1995");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.cssSelector("button.btn:nth-child(13)")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("vo");
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(2000);

                Select model3 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model3.selectByIndex(4);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[5]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[4]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[10]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[11]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 5:
                rokProd.selectByValue("2000");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("to");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(1000);

                Select model5 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model5.selectByIndex(8);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                break;

            case 6:
                rokProd.selectByValue("1999");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("to");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(2000);

                Select model6 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model6.selectByIndex(6);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 7:
                rokProd.selectByValue("1994");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("re");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(2000);
                Select model7 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model7.selectByIndex(9);
                Thread.sleep(3000);
                break;

            case 8:
                rokProd.selectByValue("1996");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("ci");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(2000);

                Select model8 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model8.selectByIndex(6);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 9:
                rokProd.selectByValue("2001");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("maz");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button")).click();
                Thread.sleep(2000);

                Select model9 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model9.selectByIndex(8);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 10:
                rokProd.selectByValue("1995");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("au");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[1]")).click();
                Thread.sleep(2000);

                Select model10 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model10.selectByIndex(3);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[10]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[11]/div/div/div[2]/button[2]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[12]/div/div/div[2]/button[2]")).click();
                Thread.sleep(3000);
                break;

            case 11:
                rokProd.selectByValue("1997");
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")));
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[2]/div/div/div[2]/button[1]")).click();
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[3]/div/div/div[2]/button[12]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/app-input/div/div[1]/div[2]/input")).sendKeys("se");
                Thread.sleep(1000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/div/button[2]")).click();
                Thread.sleep(2000);

                Select model11 = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[4]/div/div/div[2]/div/select")));
                model11.selectByIndex(3);
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[6]/div/div/div[2]/button[1]")).click();
                Thread.sleep(2000);
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-eurotax-vehicle/app-selector[7]/div/div/div[2]/button[1]")).click();
                Thread.sleep(3000);
                break;
        }
        Select przebieg = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-selector[1]/div/div/div[2]/div/select")));
        js.executeScript("arguments[0].scrollIntoView();", przebieg);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-selector[1]/div/div/div[2]/div/select")).click();
        Thread.sleep(1000);
        przebieg.selectByIndex(przebie);
        Thread.sleep(3000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-selector[2]/div/div/div[2]/button[1]")).click();
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[1]/div/div[2]/app-selector[3]/div/div/div[2]/button[1]")).click();
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-input[1]/div/div[1]/div[2]/div/div/input")).sendKeys(kod);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-input[1]/div/div[1]/div[2]/div/div/input")).click();
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-input[2]/div/div[1]/div[2]/div/input")).sendKeys(dataUr);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[1]/div/div/div[2]/button[2]")).click();
        Thread.sleep(2000);
        Select rokUzy = new Select(firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[2]/div/div/div[2]/div/select")));
        js.executeScript("arguments[0].scrollIntoView();", rokUzy);
        rokUzy.selectByIndex(rokUz);
        Thread.sleep(2000);
        switch (oc) {
            case 0:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[2]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
            case 1:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[3]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
            case 2:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[4]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
            case 3:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[5]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
            case 4:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[3]/div/div/div[2]/button[6]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[4]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[5]/div/div/div[2]/button[1]")).click();
                break;
        }
        switch (ac) {
            case 0:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[3]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
            case 1:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[3]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
            case 2:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[4]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
            case 3:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[5]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
            case 4:
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[6]/div/div/div[2]/button[6]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[7]/div/div/div[2]/button[1]")).click();
                firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[2]/div/div[2]/app-selector[8]/div/div/div[2]/button[1]")).click();
                break;
        }
        Thread.sleep(2000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[3]/div/div[2]/app-input/div/div[1]/div[2]/input")).click();
        Thread.sleep(1000);

        js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[3]/div/div[2]/app-input/div/div[1]/div[2]/input")));
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[3]/div/div[2]/app-input/div/div[1]/div[2]/input")).sendKeys(tel);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-dynamic-clause/div[2]/div[1]/div[1]/app-input-checkbox/div/div/div")).click();
        Thread.sleep(3000);
        firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-footer-navigation/div/div")).click();
        Thread.sleep(8000);
        firefox.close();

    }

    public static void Zlote(String mail) throws InterruptedException {
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://www.mypay.pl/webapp/extern.php?k=5627&u=230491");

        Thread.sleep(25000);
        firefox.findElement(By.cssSelector("#register-form-email")).sendKeys(mail);
        Thread.sleep(1000);
        firefox.findElement(By.cssSelector("#register-password")).sendKeys(mail + "V2");
        firefox.findElement(By.cssSelector("div.clearfix:nth-child(4) > label:nth-child(1) > span:nth-child(2) > span:nth-child(2)")).click();
        Thread.sleep(1000);
        firefox.findElement(By.cssSelector("#is_subscribed_label > span:nth-child(2) > span:nth-child(2)")).click();
        Thread.sleep(2000);
        firefox.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[6]/button")).click();
        Thread.sleep(9000);
        firefox.close();
    }

    public static void Nivea(String imie, String nazwisko, String mail, String ulica, String imieNivea, String nazwiskoNivea, String miejscowosc, String kod, String nr, String zdjecie) throws InterruptedException {
        Random rand = new Random();
        int r = rand.nextInt(4);
        int f = rand.nextInt(5);
        int d = rand.nextInt(5);
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://www.nivea.pl/aktualnosci/swieta2018");
        Thread.sleep(10000);
        //firefox.findElement(By.xpath("//*[@id=\"bg\"]"));
        //Thread.sleep(15000);

        firefox.findElement(By.cssSelector("html.sizes body.nx-pagetype-campaign-page div.bdf-cookie-policy-popup div.bdf-cookie-policy-confirmation-required div.bdf-cookie-policy-buttons button.bdf-cookie-policy-accept")).click();
        Thread.sleep(1000);
        firefox.findElement(By.cssSelector("#js-niv-stworz-kartke-btn")).click();
        Thread.sleep(1000);
        WebElement file = firefox.findElement(By.cssSelector(".item-upload-label"));
        file.sendKeys(zdjecie);
        Thread.sleep(2000);
        firefox.findElement(By.cssSelector("button.nivea-btn")).click();
        Thread.sleep(3000);
        firefox.findElement(By.cssSelector(".btn")).click();
        Thread.sleep(3000);
        firefox.findElement(By.cssSelector("div.radio-option:nth-child(1) > label:nth-child(1)")).click();
        firefox.findElement(By.cssSelector("#field_8c768308a6824a52ac52d200f8f9e246_firstname > input:nth-child(2)")).sendKeys(imieNivea);
        firefox.findElement(By.cssSelector("#field_8c768308a6824a52ac52d200f8f9e246_lastname > input:nth-child(2)")).sendKeys(nazwiskoNivea);
        firefox.findElement(By.cssSelector("#field_8c768308a6824a52ac52d200f8f9e246_email > input:nth-child(2)")).sendKeys(mail);
        firefox.findElement(By.cssSelector(".input-wrap > input:nth-child(1)")).sendKeys(mail + "V2");
        firefox.findElement(By.cssSelector("#field_8c768308a6824a52ac52d200f8f9e246_newsletter_policy_activation_pl > div:nth-child(1) > label:nth-child(2)")).click();
        Thread.sleep(1000);
        firefox.findElement(By.cssSelector("#field_8c768308a6824a52ac52d200f8f9e246_account_nivea_newsletter > div:nth-child(1) > label:nth-child(2)")).click();
        firefox.findElement(By.cssSelector("#field_8c768308a6824a52ac52d200f8f9e246_custom_checkbox_pl > div:nth-child(1) > label:nth-child(2)")).click();
        firefox.findElement(By.cssSelector("#field_8c768308a6824a52ac52d200f8f9e246_account_data_privacy_statement > div:nth-child(1) > label:nth-child(2)")).click();
        Thread.sleep(1000);
        firefox.findElement(By.cssSelector("#\\38 c768308a6824a52ac52d200f8f9e246_submit")).click();
        Thread.sleep(6000);
        firefox.findElement(By.cssSelector("#\\38 c768308a6824a52ac52d200f8f9e246_close")).click();
        Thread.sleep(5000);
        firefox.findElement(By.cssSelector("button.nivea-btn")).click();
        Thread.sleep(5000);
        switch (r) {
            case 0:
                firefox.findElement(By.cssSelector("div.js-item-filter:nth-child(1) > div:nth-child(1) > img:nth-child(1)")).click();
                break;
            case 1:
                firefox.findElement(By.cssSelector(".item-fit2-fiter--gray")).click();
                break;
            case 2:
                firefox.findElement(By.cssSelector(".item-fit2-fiter--sepia")).click();
                break;
            case 3:
                firefox.findElement(By.cssSelector(".item-fit2-fiter--winieta")).click();
                break;
        }
        Thread.sleep(2000);
        switch (f) {
            case 0:
                firefox.findElement(By.cssSelector("div.item-fit2-filter-letter:nth-child(1)")).click();
                break;
            case 1:
                firefox.findElement(By.cssSelector("div.item-fit2-filter-letter:nth-child(2)")).click();
                break;
            case 2:
                firefox.findElement(By.cssSelector("div.item-fit2-filter-letter:nth-child(3)")).click();
                break;
            case 3:
                firefox.findElement(By.cssSelector("div.item-fit2-filter-letter:nth-child(4)")).click();
                break;
            case 4:
                firefox.findElement(By.cssSelector("div.item-fit2-filter-letter:nth-child(5)")).click();
                break;
        }
        Thread.sleep(2000);
        firefox.findElement(By.cssSelector("#js-nivea-create-card-filters-send")).click();
        Thread.sleep(6000);
        switch (d) {
            case 0:
                firefox.findElement(By.cssSelector("div.item-reverse-filter-letter:nth-child(1)")).click();
                break;
            case 1:
                firefox.findElement(By.cssSelector("div.item-reverse-filter-letter:nth-child(2)")).click();
                break;
            case 2:
                firefox.findElement(By.cssSelector("div.item-reverse-filter-letter:nth-child(3)")).click();
                break;
            case 3:
                firefox.findElement(By.cssSelector("div.item-reverse-filter-letter:nth-child(4)")).click();
                break;
            case 4:
                firefox.findElement(By.cssSelector("div.item-reverse-filter-letter:nth-child(5)")).click();
                break;
        }
        Thread.sleep(2000);
        firefox.findElement(By.cssSelector("#card_reverse_form_signature")).sendKeys(imie);
        firefox.findElement(By.cssSelector("#card_reverse_form_address1")).sendKeys(imie + " " + nazwisko);
        firefox.findElement(By.cssSelector("#card_reverse_form_address2a")).sendKeys(ulica);
        firefox.findElement(By.cssSelector("#card_reverse_form_address2b")).sendKeys(nr);
        firefox.findElement(By.cssSelector("#card_reverse_form_address3a")).sendKeys(kod);
        firefox.findElement(By.cssSelector("#card_reverse_form_address3b")).sendKeys(miejscowosc);
        firefox.findElement(By.cssSelector(".required")).click();
        firefox.findElement(By.cssSelector(".item-reverse-agrees > div:nth-child(2) > div:nth-child(1) > label:nth-child(2)")).click();
        Thread.sleep(3000);
        firefox.findElement(By.cssSelector("#js-nivea-create-card-filters-send")).click();
        Thread.sleep(5000);
        firefox.close();
    }

    public static void NestleAdsJadlospis1(String mail) throws InterruptedException, AWTException {

        Random r = new Random();
        FirefoxDriver firefox = new FirefoxDriver();
        Actions akcje = new Actions(firefox);
        JavascriptExecutor js = firefox;
        String imieDziecka;
        int dziecko = r.nextInt(2);
        int dzieckoPlec = r.nextInt(2);
        int randomDzieckoMeskie = r.nextInt(229);
        int randomDzieckoZenskie = r.nextInt(152);
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        Robot robot = new Robot();
        String imiee = imie[randomImie];
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        if (dzieckoPlec == 0)
            imieDziecka = meskie[randomDzieckoMeskie];
        else
            imieDziecka = imie[randomDzieckoZenskie];
        char plec[];
        plec = imieDziecka.toCharArray();
        int ostatniInteks = plec.length - 1;
        int rokUrDziecko = r.nextInt(2018 - 2017 + 1) + 2017;
        int miesUrDziecko = r.nextInt(12 - 10 + 1) + 10;
        int dzienUrDziecko = r.nextInt(29 - 10 + 1) + 10;
        int rokUrSpodziewane = 2019;
        int miesUrSpodziewane = r.nextInt(7 - 4 + 1) + 4;
        int dzienUrSpodziewane = r.nextInt(29 - 10 + 1) + 10;
        firefox.manage().window().maximize();

        firefox.get("http://adsmaker.pl/action/1073/uid/26dd63a0ef72a51af97c0efa88357f15/");

        Thread.sleep(10000);
        clickXY(1319, 835);

        Thread.sleep(15000);
        robot.keyPress(KeyEvent.VK_F5);
        Thread.sleep(15000);
        firefox.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[2]/div/div/div")).click();
        clickXY(950, 850);
        //clickXY(1273, 322);
        Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")));
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imiee);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko1);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail + "V2");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail + "V2");
        Thread.sleep(4000);
        firefox.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[4]/div[15]/input")).click();
        Thread.sleep(5000);
        if (dziecko == 0) {
            firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-99120253038303700_1\"]")).click();
            Thread.sleep(1000);
            firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-121321499907850700_3\"]")).sendKeys(imieDziecka);
            if (plec[ostatniInteks] == 'a')
                firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
            else
                firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
            Thread.sleep(2000);
            firefox.executeScript("document.getElementById(\"gigya-textbox-92124100465386450_7\").removeAttribute(\"readonly\")");
            firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-92124100465386450_7\"]")).sendKeys(DataUr(rokUrDziecko, miesUrDziecko, dzienUrDziecko));
        } else {
            firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-99120253038303700_2\"]")).click();
            Thread.sleep(1000);
            if (dzieckoPlec == 0)
                firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
            else
                firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
            Thread.sleep(1000);
            firefox.executeScript("document.getElementById(\"gigya-textbox-3594631840390567_4\").removeAttribute(\"readonly\")");
            Thread.sleep(1000);
            firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-3594631840390567_4\"]")).sendKeys(DataUr(rokUrSpodziewane, miesUrSpodziewane, dzienUrSpodziewane));
        }
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-109994828572319620\"]")));
        Thread.sleep(1000);
        clickXY(1027, 245);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-109994828572319620\"]")).click();
        Thread.sleep(2000);
        firefox.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[2]/div[1]/input")).click();
        Thread.sleep(10000);
        //firefox.close();


        firefox.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        firefox.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        firefox.findElement(By.xpath("//*[text()='Zdrowy Start w Przyszłość']")).click();
        Thread.sleep(3000);
        Zmniejsz(2);
        Thread.sleep(1000);
        clickXY(953, 883);
        Thread.sleep(14000);
        firefox.quit();

        /*
        firefox.get("http://poczta.gazeta.pl/");
        Thread.sleep(3000);
        firefox.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(mail);
        firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[@id=\"mainSubmitLink\"]")).click();
        Thread.sleep(8000);
        clickXY(396, 615);
        Thread.sleep(3500);
        ((JavascriptExecutor) firefox).executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        clickXY(1056, 775);
        clickXY(1056, 745);
        clickXY(904, 753);
        Thread.sleep(14000);
        firefox.quit();
        */
        /*
        firefox.get("http://poczta.interia.pl/");
        Thread.sleep(5000);
        firefox.findElement(By.xpath("/html/body/div[3]/div[2]/button")).click();
        Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[@id=\"formEmail\"]")).sendKeys(mail);
        firefox.findElement(By.xpath("//*[@id=\"formPassword\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/form/div[2]/button/span")).click();
        Thread.sleep(17000);
        try {
            firefox.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/fieldset/button[2]")).click();
        }
        catch (Exception e) {
            clickXY(648,679);
            clickXY(1288,365);
        }
        Thread.sleep(2000);
        //firefox.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]")).click();
        //Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[text()='Zdrowy Start w Przyszłość']")).click();
        Thread.sleep(4000);
        clickXY(1267,989);
        Thread.sleep(14000);
        firefox.quit();
        */
    }

    public static void NestleAdsProbki1(String mail) throws InterruptedException, AWTException {

        Random r = new Random();
        FirefoxDriver firefox = new FirefoxDriver();
        Actions akcje = new Actions(firefox);
        JavascriptExecutor js = firefox;
        String imieDziecka;
        int dziecko = r.nextInt(2);
        int dzieckoPlec = r.nextInt(2);
        int randomDzieckoMeskie = r.nextInt(229);
        int randomDzieckoZenskie = r.nextInt(152);
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        Robot robot = new Robot();
        String imiee = imie[randomImie];
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        if (dzieckoPlec == 0)
            imieDziecka = meskie[randomDzieckoMeskie];
        else
            imieDziecka = imie[randomDzieckoZenskie];
        char plec[];
        plec = imieDziecka.toCharArray();
        int ostatniInteks = plec.length - 1;
        int rokUrDziecko = r.nextInt(2018 - 2017 + 1) + 2017;
        int miesUrDziecko = r.nextInt(12 - 10 + 1) + 10;
        int dzienUrDziecko = r.nextInt(29 - 10 + 1) + 10;
        int rokUrSpodziewane = 2019;
        int miesUrSpodziewane = r.nextInt(7 - 4 + 1) + 4;
        int dzienUrSpodziewane = r.nextInt(29 - 10 + 1) + 10;
        firefox.manage().window().maximize();
        firefox.get("http://adsmaker.pl/action/1074/uid/26dd63a0ef72a51af97c0efa88357f15/");

        Thread.sleep(10000);
        Zmniejsz(1);
        Thread.sleep(1000);
        clickXY(1251, 980);

        Thread.sleep(15000);
        robot.keyPress(KeyEvent.VK_F5);
        Thread.sleep(15000);
        firefox.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[2]/div/div/div")).click();
        clickXY(950, 850);
        //clickXY(1273, 322);
        Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")));
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imiee);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko1);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail + "V2");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail + "V2");
        Thread.sleep(4000);
        firefox.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[4]/div[15]/input")).click();
        Thread.sleep(5000);
        if (dziecko == 0) {
            firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-99120253038303700_1\"]")).click();
            Thread.sleep(1000);
            firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-121321499907850700_3\"]")).sendKeys(imieDziecka);
            if (plec[ostatniInteks] == 'a')
                firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
            else
                firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
            Thread.sleep(2000);
            firefox.executeScript("document.getElementById(\"gigya-textbox-92124100465386450_7\").removeAttribute(\"readonly\")");
            firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-92124100465386450_7\"]")).sendKeys(DataUr(rokUrDziecko, miesUrDziecko, dzienUrDziecko));
        } else {
            firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-99120253038303700_2\"]")).click();
            Thread.sleep(1000);
            if (dzieckoPlec == 0)
                firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
            else
                firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
            Thread.sleep(1000);
            firefox.executeScript("document.getElementById(\"gigya-textbox-3594631840390567_4\").removeAttribute(\"readonly\")");
            Thread.sleep(1000);
            firefox.findElement(By.xpath("//*[@id=\"gigya-textbox-3594631840390567_4\"]")).sendKeys(DataUr(rokUrSpodziewane, miesUrSpodziewane, dzienUrSpodziewane));
        }
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-109994828572319620\"]")));
        Thread.sleep(1000);
        clickXY(1027, 245);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-109994828572319620\"]")).click();
        Thread.sleep(2000);
        firefox.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[2]/div[1]/input")).click();
        Thread.sleep(10000);
        //firefox.close();


        firefox.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        firefox.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        firefox.findElement(By.xpath("//*[text()='Zdrowy Start w Przyszłość']")).click();
        Thread.sleep(3000);
        Zmniejsz(2);
        Thread.sleep(1000);
        clickXY(953, 883);
        Thread.sleep(14000);
        firefox.quit();

        /*
        firefox.get("http://poczta.gazeta.pl/");
        Thread.sleep(3000);
        firefox.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(mail);
        firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[@id=\"mainSubmitLink\"]")).click();
        Thread.sleep(8000);
        clickXY(396, 615);
        Thread.sleep(3500);
        ((JavascriptExecutor) firefox).executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        clickXY(1056, 775);
        clickXY(1056, 745);
        clickXY(904, 753);
        Thread.sleep(14000);
        firefox.quit();
        */
        /*
        firefox.get("http://poczta.interia.pl/");
        Thread.sleep(5000);
        firefox.findElement(By.xpath("/html/body/div[3]/div[2]/button")).click();
        Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[@id=\"formEmail\"]")).sendKeys(mail);
        firefox.findElement(By.xpath("//*[@id=\"formPassword\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/form/div[2]/button/span")).click();
        Thread.sleep(17000);
        try {
            firefox.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/fieldset/button[2]")).click();
        }
        catch (Exception e) {
            clickXY(648,679);
            clickXY(1288,365);
        }
        Thread.sleep(2000);
        //firefox.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]")).click();
        //Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[text()='Zdrowy Start w Przyszłość']")).click();
        Thread.sleep(4000);
        clickXY(1267,989);
        Thread.sleep(14000);
        firefox.quit();
        */

    }

    public static void NestleDodatkowy(String mail) throws InterruptedException, AWTException, IOException {

        Random r = new Random();
        FirefoxDriver firefox = new FirefoxDriver();
        JavascriptExecutor js = firefox;
        String imieDziecka;
        int dziecko = r.nextInt(2);
        int dzieckoPlec = r.nextInt(2);
        int randomDzieckoMeskie = r.nextInt(229);
        int randomDzieckoZenskie = r.nextInt(152);
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int urodzone = r.nextInt(5) + 1;
        int nieurodzone = r.nextInt(4) + 1;
        int dzien = r.nextInt(21);
        Robot robot = new Robot();
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        if (dzieckoPlec == 0)
            imieDziecka = meskie[randomDzieckoMeskie];
        else
            imieDziecka = imie[randomDzieckoZenskie];
        char plec[];
        plec = imieDziecka.toCharArray();
        int ostatniInteks = plec.length - 1;
        firefox.manage().window().maximize();
        firefox.get("http://dodatkowypieniadz.com/wykonaj.php?a=1499&u=153&k=59f3635dd821e60a50bd7");
        //firefox.get("https://www.zdrowystartwprzyszlosc.pl/user/register");

        Thread.sleep(20000);
        Zmniejsz(5);
        Thread.sleep(1000);
        clickXY(1075, 838);

        Thread.sleep(20000);
        clickXY(900,746);
        clickXY(900,746);
        clickXY(900,746);
        clickXY(500,746);
        clickXY(500,746);
        clickXY(500,746);
        Thread.sleep(4000);
        robot.mouseMove(1912, 318);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(1912,578);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);

        Kopiuj(imie[randomImie]);
        clickXY(587,264);   //IMIEDanuta
        Thread.sleep(500);
        Wklej();

        Kopiuj(nazwisko1);
        clickXY(587,353);   //NAZWISKO
        Thread.sleep(500);
        Wklej();

        Kopiuj(mail);
        clickXY(587,438);   //EMAIL
        Thread.sleep(500);
        Wklej();

        Kopiuj(mail+"V2");
        clickXY(587,528);   //HASŁO
        Thread.sleep(500);
        Wklej();

        Kopiuj(mail+"V2");
        clickXY(587,612);   //HASŁO2
        Thread.sleep(500);
        Wklej();

        clickXY(778,833);
        Thread.sleep(5000);
        if (dziecko == 0) {
            Kopiuj(imieDziecka);
            clickXY(554,231);
            Thread.sleep(500);
            Wklej();
            if (plec[ostatniInteks] == 'a')
                clickXY(916,220);
            else
                clickXY(860,220);
            Thread.sleep(2000);
            clickXY(538,315);
            Thread.sleep(1000);
            for (int i=0;i<urodzone;i++)
                clickXY(451,364);
            Thread.sleep(1000);
            switch (dzien) {
                //PIERWSZA LINIJKA ---------
                case 0:
                    clickXY(463,460);
                    break;
                case 1:
                    clickXY(500,460);
                    break;
                case 2:
                    clickXY(534,460);
                    break;
                case 3:
                    clickXY(571,460);
                    break;
                case 4:
                    clickXY(602,460);
                    break;
                case 5:
                    clickXY(637,460);
                    break;
                case 6:
                    clickXY(673,460);
                    break;
                //DRUGA LINIJKA--------------
                case 7:
                    clickXY(463,484);
                    break;
                case 8:
                    clickXY(500,484);
                    break;
                case 9:
                    clickXY(534,484);
                    break;
                case 10:
                    clickXY(571,484);
                    break;
                case 11:
                    clickXY(602,484);
                    break;
                case 12:
                    clickXY(637,484);
                    break;
                case 13:
                    clickXY(673,484);
                    break;
                //TRZECIA LINIJKA------------------
                case 14:
                    clickXY(463,506);
                    break;
                case 15:
                    clickXY(500,506);
                    break;
                case 16:
                    clickXY(534,506);
                    break;
                case 17:
                    clickXY(571,506);
                    break;
                case 18:
                    clickXY(602,506);
                    break;
                case 19:
                    clickXY(637,506);
                    break;
                case 20:
                    clickXY(673,506);
                    break;
            }
            Thread.sleep(2000);
            clickXY(450,487);
            Thread.sleep(1000);
            clickXY(767,736);
        }
        else {
            clickXY(463,160);
            Thread.sleep(1000);
            if (dzieckoPlec == 0)
                clickXY(914,221);
            else
                clickXY(857,218);
            Thread.sleep(1000);
            clickXY(600,248);
            Thread.sleep(1000);
            for (int i=0;i<nieurodzone;i++)
                clickXY(672,273);
            Thread.sleep(1000);
            switch(dzien) {
                //PIERWSZA LINIJKA ---------
                case 0:
                    clickXY(462,367);
                    break;
                case 1:
                    clickXY(500,367);
                    break;
                case 2:
                    clickXY(536,367);
                    break;
                case 3:
                    clickXY(573,367);
                    break;
                case 4:
                    clickXY(606,367);
                    break;
                case 5:
                    clickXY(640,367);
                    break;
                case 6:
                    clickXY(671,367);
                    break;
                //DRUGA LINIJKA--------------
                case 7:
                    clickXY(462,392);
                    break;
                case 8:
                    clickXY(500,392);
                    break;
                case 9:
                    clickXY(536,392);
                    break;
                case 10:
                    clickXY(573,392);
                    break;
                case 11:
                    clickXY(606,392);
                    break;
                case 12:
                    clickXY(640,392);
                    break;
                case 13:
                    clickXY(671,392);
                    break;
                //TRZECIA LINIJKA------------------
                case 14:
                    clickXY(462,417);
                    break;
                case 15:
                    clickXY(500,417);
                    break;
                case 16:
                    clickXY(536,417);
                    break;
                case 17:
                    clickXY(573,417);
                    break;
                case 18:
                    clickXY(606,417);
                    break;
                case 19:
                    clickXY(640,417);
                    break;
                case 20:
                    clickXY(671,417);
                    break;
            }
            Thread.sleep(2000);
            clickXY(445,401);
            Thread.sleep(1000);
            clickXY(770,642);
            Thread.sleep(1000);
            clickXY(770,632);
        }
        Thread.sleep(10000);

        firefox.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        try {
            firefox.findElement(By.xpath("//*[text()='Zdrowy Start w Przyszłość']")).click();
            Thread.sleep(3000);
            Zmniejsz(2);
            Thread.sleep(1000);
            clickXY(953, 934);
            clickXY(953, 884);
            Thread.sleep(10000);
            firefox.quit();
        }
        catch (Exception e) {
            Thread.sleep(2000);
            firefox.quit();
        }
        /*
        firefox.get("http://poczta.gazeta.pl/");
        Thread.sleep(3000);
        firefox.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(mail);
        firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[@id=\"mainSubmitLink\"]")).click();
        Thread.sleep(8000);
        clickXY(396, 615);
        Thread.sleep(3500);
        ((JavascriptExecutor) firefox).executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        clickXY(1056, 775);
        clickXY(1056, 745);
        clickXY(904, 753);
        Thread.sleep(14000);
        firefox.quit();
        */
        /*
        firefox.get("http://poczta.interia.pl/");
        Thread.sleep(5000);
        firefox.findElement(By.xpath("/html/body/div[3]/div[2]/button")).click();
        Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[@id=\"formEmail\"]")).sendKeys(mail);
        firefox.findElement(By.xpath("//*[@id=\"formPassword\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/form/div[2]/button/span")).click();
        Thread.sleep(17000);
        try {
            firefox.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/fieldset/button[2]")).click();
        }
        catch (Exception e) {
            clickXY(648,679);
            clickXY(1288,365);
        }
        Thread.sleep(2000);
        //firefox.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]")).click();
        //Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[text()='Zdrowy Start w Przyszłość']")).click();
        Thread.sleep(4000);
        clickXY(1267,989);
        Thread.sleep(14000);
        firefox.quit();
        */

    }

    public static void Every(String mail, String kod) throws InterruptedException, AWTException, IOException {
        Random r = new Random();
        int indeks = r.nextInt(153);
        int ro = r.nextInt(1994 - 1984 + 1) + 1984;
        int mies = r.nextInt(10) + 1;
        int randomNazwisko = r.nextInt(199);
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        String rokk = String.valueOf(ro);
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        //driver.get("http://adsmaker.pl/action/1214/uid/26dd63a0ef72a51af97c0efa88357f15/");
        //driver.get("http://adsmaker.pl/action/1155/uid/26dd63a0ef72a51af97c0efa88357f15/");
        driver.get("https://www.mypay.pl/webapp/extern.php?k=5774&u=230491");

        Thread.sleep(20000);
        int x = 1779;
        int x1 = 1750;
        for (int i=0;i<7;i++)
        {
            clickXY(x, 1012);
            x += 10;
            Thread.sleep(500);
        }
        for (int i=0;i<7;i++)
        {
            clickXY(x1, 1012);
            x1 -= 10;
            Thread.sleep(500);
        }
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
        try {
            try {
                driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/label")).click();
            }
            catch (Exception e) {
                driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/div/label")).click();
            }
        }
        catch (Exception f) {
            Thread.sleep(1000);
            //driver.quit();
        }
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/button")).click();
        }
        catch (Exception e) {
            //driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/button")).click();
            clickXY(923,611);
        }
        //try {
            Thread.sleep(8000);
            driver.findElement(By.xpath("//*[@id=\"Kobieta \"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie[indeks]);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko1);
            Thread.sleep(1000);
            Select miesiac = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/form/div[5]/div/div/select[1]")));
            miesiac.selectByIndex(mies);
            Thread.sleep(1000);
            Select rok = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/form/div[5]/div/div/select[2]")));
            rok.selectByValue(rokk);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"addressPostalCode\"]")).sendKeys(kod);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys(mail+"V2");
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
            Thread.sleep(1000);
            try {
                driver.findElement(By.xpath("//*[@id=\" globalOpt_optStatus\"]")).click();
            }
            catch (Exception e) {
                clickXY(773,960);
            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/form/div[11]/button")).click();
            Thread.sleep(30000);
            try {
                driver.get("http://poczta.wp.pl/");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
                Thread.sleep(9000);
                driver.findElement(By.xpath("//*[@id=\"folder-152\"]")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='EverydayMe']")).click();
                Thread.sleep(3000);
                Zmniejsz(2);
                Thread.sleep(1000);
                clickXY(960, 973);
                clickXY(960, 936);
                Thread.sleep(20000);
                driver.quit();
            }
            catch (Exception e) {
                Thread.sleep(2000);
                driver.quit();
            }

        }
        //catch (Exception a) {
        //    driver.quit();
        //}
    //}

    public static void Bebiko(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int wybor = r.nextInt(2);
        int wybor2 = r.nextInt(2);
        int dzien = r.nextInt(29) + 1;
        int miesiac = r.nextInt(9) + 1;
        int rokDziecko = 2018;
        int rokPlanowane = 2019;
        String imie;
        int miesiacPlanowane = r.nextInt(5) + 1;
        String dataDziecko = DataUr(rokDziecko, miesiac, dzien);
        String dataPlanowane = DataUr(rokPlanowane, miesiacPlanowane, dzien);
        int indeksZenskie = r.nextInt(153);
        int indeksMeskie = r.nextInt(229);
        String[] zenskie = {"Weronika", "Wiktoria", "Wioleta", "Waleria", "Elżbieta", "Elena", "Eliza", "Elwira", "Emma", "Emilia", "Ewa", "Ewelina", "Estera", "Edyta", "Rita", "Roksana", "Renata", "Róża", "Rozalia", "Regina", "Tamara", "Tola", "Urszula", "Ida", "Idalia", "Iga", "Inga", "Inez", "Ilona", "Izabela", "Iwona", "Irena", "Irma", "Ilza", "Oliwia", "Olimpia", "Oktawia", "Olga", "Otylia", "Odeta", "Paulina", "Patrycja", "Pola", "Pelagia", "Ada", "Adrianna", "Agata", "Aldona", "Alicja", "Alina", "Agnieszka", "Aleksandra", "Amelia", "Amanda", "Anastazja", "Anna", "Anita", "Angelika", "Antonina", "Arleta", "Aurelia", "Sandra", "Sara", "Sonia", "Sylwia", "Samanta", "Sabina", "Dagna", "Dagmara", "Danuta", "Daria", "Daniela", "Diana", "Dominika", "Dorota", "Donata", "Dalia", "Franciszka", "Felicyta", "Faustyna", "Felicja", "Gabriela", "Greta", "Gracja", "Gracjana", "Grażyna", "Gaja", "Honorata", "Hanna", "Jagoda", "Joanna", "Janina", "Jowita", "Julia", "Julita", "Judyta", "Justyna", "Jaśmina", "Kamila", "Kaja", "Karina", "Kalina", "Karolina", "Katarzyna", "Klaudia", "Ksenia", "Klara", "Kornelia", "Kamelia", "Kinga", "Kira", "Lilianna", "Luiza", "Lidia", "Linda", "Laura", "Lena", "Leokadia", "Liwia", "Lucyna", "Ludmiła", "Zuzanna", "Zofia", "Zyta", "Celina", "Cecylia", "Berenika", "Blanka", "Bożena", "Bianka", "Beata", "Brygida", "Beatrycze", "Nina", "Natalia", "Nadia", "Nikola", "Nikoletta", "Nel", "Magda", "Magdalena", "Maja", "Maria", "Marta", "Martyna", "Marika", "Marlena", "Malwina", "Marzena", "Matylda", "Monika", "Marietta", "Miranda"};
        if (wybor2 == 0)
            imie = meskie[indeksMeskie];
        else
            imie = zenskie[indeksZenskie];
        char[] imieDziecka = imie.toCharArray();
        int ostatniIndeks = imieDziecka.length - 1;

        driver.manage().window().maximize();
        driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1435&u=153&k=59f3635dd821e60a50bd7");
        //driver.get("https://www.bebiklub.pl/rejestracja");
        Thread.sleep(7000);

        clickXY(779, 651);
        Thread.sleep(10000);
        //driver.findElement(By.xpath("/html/body/nt-cookie-popup/div[1]/div[2]/div[2]/nt-analytics/button")).click();
        clickXY(946, 553);
        Thread.sleep(5000);
        //driver.findElement(By.xpath("/html/body/div/div[3]")).click();
        clickXY(1265, 398);
        Thread.sleep(2000);
        clickXY(917, 718);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_profileData_email_first\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/nt-analytics/form/fieldset[1]/div/div/div/div[2]/div[1]/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_profileData_email_second\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/nt-analytics/form/fieldset[1]/div/div/div/div[2]/div[1]/nt-reveal-password/div/div[1]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_profileData_plainPassword\"]")).sendKeys(mail + "V2");
        Thread.sleep(1000);
        switch (wybor) {
            case 0:
                driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-registration-reason/fieldset/div/div/div/div[2]/div[1]/div[1]/div[1]/div[2]/label")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-registration-reason/fieldset/div/div/div/div[2]/div[2]/div/div[1]/div[1]/label")).click();
                driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_children_0_childData_first_name\"]")).sendKeys(imie);  //imieDziecko
                Thread.sleep(1000);
                if (imieDziecka[ostatniIndeks] == 'a')
                    driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-registration-reason/fieldset/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/label")).click();
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-registration-reason/fieldset/div/div/div/div[2]/div[2]/div/div[1]/div[1]/label")));
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-registration-reason/fieldset/div/div/div/div[2]/div[2]/div/div[3]/div/div[1]/label")).click();
                Thread.sleep(1000);
                js.executeScript("document.getElementById(\"fos_user_registration_form_children_0_childData_birth_date\").removeAttribute(\"onkeypress\")");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_children_0_childData_birth_date\"]")).sendKeys(dataDziecko);
                Thread.sleep(1000);
                break;
            case 1:
                driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-registration-reason/fieldset/div/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/label")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_children_0_childData_first_name\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_children_0_childData_first_name\"]")).sendKeys(imie);  //imieDziecko
                Thread.sleep(1000);
                if (imieDziecka[ostatniIndeks] == 'a')
                    driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-registration-reason/fieldset/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/label")).click();
                Thread.sleep(1000);
                js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_children_0_childData_first_name\"]")));
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-registration-reason/fieldset/div/div/div/div[2]/div[2]/div/div[3]/div/div[1]/label")).click();
                js.executeScript("document.getElementById(\"//*[@id=\"fos_user_registration_form_children_0_childData_birth_date\"]\").removeAttribute(\"onkeypress\")");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_children_0_childData_birth_date\"]")).sendKeys(dataPlanowane);
                Thread.sleep(1000);
                break;

        }
        driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-order-address/fieldset/div/div/div/div[2]/div[1]/div[1]/div/div/div/label")).click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-order-address/fieldset/div/div/div/div[2]/div[1]/div[1]/div/div/div/label")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/nt-analytics/form/nt-order-address/fieldset/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/label")).click();
        Thread.sleep(1000);
        clickXY(697, 480);
        //driver.findElement(By.xpath("/html/body/main/nt-analytics/form/fieldset[2]/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/div[1]/div/div/label")).click();
        //driver.findElement(By.linkText(" i zapoznałem/am się z ")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/nt-analytics/form/fieldset[2]/div/div/div/div[2]/div[1]/div/div[1]/div/div[3]/div[1]/div/div/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/nt-analytics/form/fieldset[2]/div/div/div/div[2]/div[1]/div/div[1]/div/div[4]/div[1]/div/div/label")).click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/main/nt-analytics/form/fieldset[2]/div/div/div/div[2]/div[1]/div/div[1]/div/div[4]/div[1]/div/div/label")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_submit\"]")).click();
        Thread.sleep(10000);
        //driver.close();

        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='BebiKlub']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div[3]/a")).click();
        Thread.sleep(8000);
        driver.quit();
    }

    public static void Wawel() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions act = new Actions(driver);

        driver.manage().window().maximize();
        driver.get("https://www.sercerosnie.com.pl/logowanie/");
        Thread.sleep(7000);
        act.moveToElement(driver.findElement(By.id("close"))).click().build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/form/p[2]/a")).click();
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[1]/input")));
        driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[1]/input")).sendKeys("Konrad");    //imie
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[2]/input")).sendKeys("Wojtyszko");    //Nazwisko
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[3]/input")).sendKeys("bartokek@wp.pl");    //Mail
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[4]/input")).sendKeys("bartokek@wp.plV");   //Hasło
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[6]/input")).sendKeys("bartokek@wp.plV");  //Hasło2
        Thread.sleep(1000);
        //RADIO----------------------------
        driver.findElement(By.xpath("/html/body/div[2]/form/p[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/form/p[1]")).click();
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/div[2]/form/p[1]")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div[2]/div/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div[3]/div/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div[4]/div/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div[5]/div/label")).click();
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div[5]/div/label")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/form/input")).click();
        Thread.sleep(3000);
        driver.close();

        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("bartokek@wp.pl");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[text()='Serce rośnie']")).click();
        Thread.sleep(3000);

    }

    public static void PampersAds(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        boolean klik = false;
        int indeks = r.nextInt(152);
        int dzien = r.nextInt(29-1+1) + 1;
        int dzienMatka = r.nextInt(29) + 1;
        int mies = r.nextInt(11-1+1)+1;
        int miesMatka = r.nextInt(11) + 1;
        //int rok = r.nextInt(2018-2016+1)+2016;
        int rok = 2018;
        int rokMatka = r.nextInt(1994 - 1973 + 1) + 1973;
        int imieDzieckoMeskie = r.nextInt(199);
        int imieDzieckoZenskie = r.nextInt(152);
        int plec = r.nextInt(2);
        Robot robot = new Robot();
        String dataUr;
        String dataUrMatka;
        if (dzien < 10 && mies < 10)
            dataUr = "0" + dzien + "/0" + mies + "/" + rok;
        else if (dzien < 10)
            dataUr = "0" + dzien + "/" + mies + "/" + rok;
        else if (mies < 10)
            dataUr = dzien + "/0" + mies + "/" + rok;
        else
            dataUr = dzien + "/" + mies + "/" + rok;

        if (dzienMatka < 10 && miesMatka < 10)
            dataUrMatka = "0" + dzienMatka + "/0" + miesMatka + "/" + rokMatka;
        else if (dzienMatka < 10)
            dataUrMatka = "0" + dzienMatka + "/" + miesMatka + "/" + rokMatka;
        else if (miesMatka < 10)
            dataUrMatka = dzienMatka + "/0" + miesMatka + "/" + rokMatka;
        else
            dataUrMatka = dzienMatka + "/" + miesMatka + "/" + rokMatka;
        int randomNazwisko = r.nextInt(199);
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        driver.manage().window().maximize();
        driver.get("https://www.mypay.pl/webapp/extern.php?k=5777&u=230491");

        Thread.sleep(20000);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        Thread.sleep(3000);
        clickXY(1782, 985);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie[indeks]);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dependentBirthday\"]")).click();
        Thread.sleep(1000);
        js.executeScript("document.getElementById(\"dependentBirthday\").removeAttribute(\"readonly\")");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dependentBirthday\"]")).sendKeys(dataUr);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys("Hasylokobana32");
        Thread.sleep(2000);
        //js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"newPassword\"]")));
        //Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div/div[3]/div[7]/button")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_phscenarioformbody_0_btnAction\"]")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[3]/h2")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[4]/div/div/fieldset/div[1]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko1);
        Thread.sleep(1000);
        js.executeScript("document.getElementById(\"birthdate\").removeAttribute(\"readonly\")");
        Thread.sleep(1000);
        driver.findElement(By.id("birthdate")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("birthdate")).sendKeys(dataUrMatka);
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("birthdate")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[5]/h2")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[8]/div[3]/i")).click();
        Thread.sleep(1000);
        if (plec == 0) {
            driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[9]/fieldset/div[1]/div/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"name1\"]")).sendKeys(imie[imieDzieckoZenskie]);
            }
        else
            driver.findElement(By.xpath("//*[@id=\"name1\"]")).sendKeys(meskie[imieDzieckoMeskie]);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[9]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[11]/div/div/div[2]/button")).click();
        Thread.sleep(10000);
        driver.close();
    }

    public static void PampersAds2(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        boolean klik = false;
        int indeks = r.nextInt(152);
        int dzien = r.nextInt(29-1+1) + 1;
        int dzienMatka = r.nextInt(29) + 1;
        int mies = r.nextInt(11-1+1)+1;
        int miesMatka = r.nextInt(11) + 1;
        int rok = r.nextInt(2018-2016+1)+2016;
        int rokMatka = r.nextInt(1994 - 1973 + 1) + 1973;
        int imieDzieckoMeskie = r.nextInt(199);
        int imieDzieckoZenskie = r.nextInt(152);
        int plec = r.nextInt(2);
        Robot robot = new Robot();
        String dataUr;
        String dataUrMatka;
        if (dzien < 10 && mies < 10)
            dataUr = "0" + dzien + "/0" + mies + "/" + rok;
        else if (dzien < 10)
            dataUr = "0" + dzien + "/" + mies + "/" + rok;
        else if (mies < 10)
            dataUr = dzien + "/0" + mies + "/" + rok;
        else
            dataUr = dzien + "/" + mies + "/" + rok;

        if (dzienMatka < 10 && miesMatka < 10)
            dataUrMatka = "0" + dzienMatka + "/0" + miesMatka + "/" + rokMatka;
        else if (dzienMatka < 10)
            dataUrMatka = "0" + dzienMatka + "/" + miesMatka + "/" + rokMatka;
        else if (miesMatka < 10)
            dataUrMatka = dzienMatka + "/0" + miesMatka + "/" + rokMatka;
        else
            dataUrMatka = dzienMatka + "/" + miesMatka + "/" + rokMatka;
        int randomNazwisko = r.nextInt(199);
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        driver.manage().window().maximize();
        driver.get("http://adsmaker.pl/action/1154/uid/26dd63a0ef72a51af97c0efa88357f15/");

        Thread.sleep(10000);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        Thread.sleep(3000);
        clickXY(1782, 985);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie[indeks]);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dependentBirthday\"]")).click();
        Thread.sleep(1000);
        js.executeScript("document.getElementById(\"dependentBirthday\").removeAttribute(\"readonly\")");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dependentBirthday\"]")).sendKeys(dataUr);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys("Hasylokobana32");
        Thread.sleep(2000);
        //js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"newPassword\"]")));
        //Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div/div[3]/div[7]/button")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_phscenarioformbody_0_btnAction\"]")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[3]/h2")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[4]/div/div/fieldset/div[1]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko1);
        Thread.sleep(1000);
        js.executeScript("document.getElementById(\"birthdate\").removeAttribute(\"readonly\")");
        Thread.sleep(1000);
        driver.findElement(By.id("birthdate")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("birthdate")).sendKeys(dataUrMatka);
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("birthdate")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[5]/h2")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[8]/div[3]/i")).click();
        Thread.sleep(1000);
        if (plec == 0) {
            driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[9]/fieldset/div[1]/div/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"name1\"]")).sendKeys(imie[imieDzieckoZenskie]);
        }
        else
            driver.findElement(By.xpath("//*[@id=\"name1\"]")).sendKeys(meskie[imieDzieckoMeskie]);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[9]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[11]/div/div/div[2]/button")).click();
        Thread.sleep(10000);
        driver.close();
    }

    public static void PampersDodatkowy(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        boolean klik = false;
        int indeks = r.nextInt(152);
        int dzien = r.nextInt(29) + 1;
        int dzienMatka = r.nextInt(29) + 1;
        int mies = r.nextInt(11) + 1;
        int miesMatka = r.nextInt(11) + 1;
        int rok = 2018;
        int rokMatka = r.nextInt(1994 - 1973 + 1) + 1973;
        int imieDzieckoMeskie = r.nextInt(199);
        int imieDzieckoZenskie = r.nextInt(152);
        int plec = r.nextInt(2);
        String dataUr;
        String dataUrMatka;
        if (dzien < 10)
            dataUr = "0" + dzien + "/" + mies + "/" + rok;
        if (mies < 10)
            dataUr = dzien + "/0" + mies + "/" + rok;
        if (dzien < 10 && mies < 10)
            dataUr = "0" + dzien + "/0" + mies + "/" + rok;
        else
            dataUr = dzien + "/" + mies + "/" + rok;

        if (dzienMatka < 10)
            dataUrMatka = "0" + dzienMatka + "/" + miesMatka + "/" + rokMatka;
        if (miesMatka < 10)
            dataUrMatka = dzienMatka + "/0" + miesMatka + "/" + rokMatka;
        if (dzienMatka < 10 && miesMatka < 10)
            dataUrMatka = "0" + dzienMatka + "/0" + miesMatka + "/" + rokMatka;
        else
            dataUrMatka = dzienMatka + "/" + miesMatka + "/" + rokMatka;
        int randomNazwisko = r.nextInt(199);
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        driver.manage().window().maximize();
        driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1483&u=153&k=59f3635dd821e60a50bd7");

        Thread.sleep(5000);
        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/");
        Thread.sleep(8000);

        Zmniejsz(4);
        Thread.sleep(1000);
        clickXY(1230,933);

        Thread.sleep(15000);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1645, 779);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        clickXY(1788, 988);
        Thread.sleep(3000);
        clickXY(1782, 985);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie[indeks]);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dependentBirthday\"]")).click();
        Thread.sleep(1000);
        js.executeScript("document.getElementById(\"dependentBirthday\").removeAttribute(\"readonly\")");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dependentBirthday\"]")).sendKeys(dataUr);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys(mail + "V2");
        Thread.sleep(2000);
        //js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"newPassword\"]")));
        //Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div/div[3]/div[7]/button")).click();
        Thread.sleep(8000);
        /*
        while (!klik) {
            try {
                driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_phscenarioformbody_0_btnAction\"]")).click();
                Thread.sleep(6000);
                klik = true;
            } catch (Exception e) {
                driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div/div[3]/div[6]/button")).click();
                Thread.sleep(8000);
            }
        }
        */
        driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_phscenarioformbody_0_btnAction\"]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[3]/h2")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[4]/div/div/fieldset/div[1]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko1);
        Thread.sleep(1000);
        js.executeScript("document.getElementById(\"birthdate\").removeAttribute(\"readonly\")");
        Thread.sleep(1000);
        driver.findElement(By.id("birthdate")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("birthdate")).sendKeys(dataUrMatka);
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("birthdate")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[5]/h2")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[8]/div[3]/i")).click();
        Thread.sleep(1000);
        if (plec == 0) {
            driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[9]/fieldset/div[1]/div/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"name1\"]")).sendKeys(imie[imieDzieckoZenskie]);
        }
        else
            driver.findElement(By.xpath("//*[@id=\"name1\"]")).sendKeys(meskie[imieDzieckoMeskie]);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[6]/div/div/div[9]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/main/div/section/div[2]/div/div/div[3]/div/div[11]/div/div/div[2]/button")).click();
        Thread.sleep(10000);
        driver.close();
    }

    public static void Momondo(String url) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int wybor = r.nextInt(11);
        driver.manage().window().maximize();
        /*
        driver.get("http://www.udanepodroze.c0.pl/");
        Thread.sleep(7000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1600)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/div/div[4]/div/a/img")).click();
        Thread.sleep(8000);
        */
        driver.get(url);
        //driver.get("https://momondo.pl");
        Thread.sleep(17000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1600)", "");
        Thread.sleep(1000);
        switch (wybor) {
            case 0:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[1]/div/a/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                //driver.findElement(By.xpath("//*[text()='podobne']")).click();
                clickXY(1333, 336);
                Thread.sleep(16000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1157, 904);
                clickXY(1157, 904);
                clickXY(1157, 904);
                break;

            case 1:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[8]/div/a/div[2]/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1336, 826);
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1157, 871);
                clickXY(1157, 871);
                clickXY(1157, 871);
                break;

            case 2:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[5]/div/a/div[2]/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1336, 667);
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1152, 861);
                clickXY(1152, 861);
                clickXY(1152, 861);
                break;

            case 3:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[13]/div/a/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1331, 633);
                //driver.findElement(By.linkText("Znajdź podobne")).click();
                //driver.findElement(By.xpath("//*[text()='Znajdź podobne']")).click();
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1159, 861);
                //driver.findElement(By.linkText("Zobacz ofertę")).click();
                //driver.findElement(By.xpath("//*[text()='Zobacz ofertę']")).click();
                break;

            case 4:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[15]/div/a/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1342, 804);
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1152, 673);
                clickXY(1152, 673);
                clickXY(1152, 673);
                break;

            case 5:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[2]/div/a/div[2]/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1341, 624);
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1187, 818);
                Thread.sleep(2000);
                clickXY(1236, 825);
                clickXY(1236, 825);
                clickXY(1236, 825);
                break;

            case 6:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[7]/div/a/div[2]/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1345, 842);
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1152, 673);
                clickXY(1152, 673);
                clickXY(1152, 673);
                break;

            case 7:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[17]/div/a/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1333, 746);
                //driver.findElement(By.cssSelector("#Acnr > div:nth-child(2) > button:nth-child(2)")).click();
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1152, 899);
                clickXY(1152, 899);
                clickXY(1152, 899);
                //driver.findElement(By.cssSelector("#l2xB-price-mb-bE-1f609ae31b2-booking-link > span:nth-child(1)")).click();
                break;

            case 8:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[19]/div/a/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1341, 604);
                //driver.findElement(By.cssSelector("#Acnr > div:nth-child(2) > button:nth-child(2)")).click();
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1152, 819);
                clickXY(1152, 819);
                clickXY(1152, 819);
                break;

            case 9:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[20]/div/a/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1339, 443);
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1174, 902);
                clickXY(1174, 902);
                clickXY(1174, 902);
                break;

            case 10:
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div/div/div/div/div[21]/div/a/div[2]")).click();
                Thread.sleep(8000);
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1300)", "");
                Thread.sleep(1000);
                clickXY(1339, 470);
                Thread.sleep(10000);
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div/div[6]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/a/span")).click();
                clickXY(1174, 902);
                clickXY(1174, 902);
                clickXY(1174, 902);
                break;
        }
        Thread.sleep(35000);
        driver.quit();
    }

    public static void IlePlacisz(String imieNazwisko, String numer) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int godz = r.nextInt(19 - 11 + 1) + 11;
        String godzina = String.valueOf(godz);
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/845/uid/19/");
        //driver.get("http://ileplacisz.pl");
        Thread.sleep(12000);

        driver.findElement(By.xpath("/html/body/div/section[1]/div/form/div[1]/div[1]/input[1]")).sendKeys(imieNazwisko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/section[1]/div/form/div[1]/div[1]/input[2]")).sendKeys(numer);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/section[1]/div/form/div[1]/div[1]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/section[1]/div/form/div[1]/div[2]/div/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/section[1]/div/form/div[1]/div[2]/div/input")).sendKeys(godzina);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/section[1]/div/form/div[1]/div[2]/input")).click();
        Thread.sleep(5000);

        driver.close();
    }

    public static void Polisa(String imie, String numer, String url) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(6000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys(imie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/form/div[3]/div[2]/input")).sendKeys(numer);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/form/div[3]/div[5]/label")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/form/div[3]/div[7]/label")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/form/div[3]/div[8]/label")).click();
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/form/div[3]/div[1]/input")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/form/div[3]/div[9]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        driver.close();
    }

    public static void Loanme(String numer) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        Robot robot = new Robot();
        boolean klik = false;
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("javascript.enabled", true);
        driver.manage().window().maximize();
        driver.get("https://bluepartner.pl/redirect?partner_id=1171&creation_type=LINK&creation_id=433");

        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"phone_number\"]")).sendKeys(numer);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"SubBtn\"]")).click();
        Thread.sleep(10000);
        driver.close();
    }

    public static void Doradca(String imie, String nazwisko, String numer, String mail) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/852/uid/19/");
        Thread.sleep(12000);

        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"imie\"]")).sendKeys(imie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nazwisko\"]")).sendKeys(nazwisko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"telefon\"]")).sendKeys(numer);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section[2]/div/div[1]/div/div/div/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/form/section[1]/div/div/div[3]/div/div[5]/div/button")).click();
        Thread.sleep(6000);
        driver.close();
    }

    public static void TmobilePremium(String numer) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/832/66d8eb8b90df0ee2fe42c70f6140d3c9");
        Thread.sleep(5000);

        clickXY(1190, 265);

        Thread.sleep(13000);
        /*
        clickXY(1643, 990);
        Thread.sleep(1000);
        clickXY(887, 992);
        Thread.sleep(1000);
        Kopiuj(numer);
        clickXY(1311, 993);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1515, 988);
        Thread.sleep(15000);
        driver.quit();
        */
        clickXY(1643, 997);
        Thread.sleep(1000);
        clickXY(1594, 685);
        Thread.sleep(5000);
        clickXY(760, 650);
        Thread.sleep(1000);
        Kopiuj(numer);
        clickXY(948, 597);
        Thread.sleep(1000);
        Wklej();
        clickXY(951, 708);
        Thread.sleep(13000);
        driver.quit();

    }

    public static void Hero(String mail, String login) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        Robot robot = new Robot();
        int skill = r.nextInt(4);
        int skill2 = r.nextInt(4);
        int item = r.nextInt(8);
        int przeciwnik = r.nextInt(9);
        driver.manage().window().maximize();

        try {
            driver.get("https://leadstar.pl/c?pid=5361&tid=1559&ha=921241709&r=6882");
            Thread.sleep(6000);
            driver.findElement(By.id("input-name")).sendKeys(login);
            Thread.sleep(4000);
            driver.findElement(By.id("input-email")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.id("input-password")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("input-password")).sendKeys(mail+"V2");
            Thread.sleep(1000);
            driver.findElement(By.id("start-button")).click();
            Thread.sleep(6000);
            Narzedzia.clickXY(1894,91);
            Narzedzia.clickXY(1894,91);
            Thread.sleep(1000);
            //Narzedzia.clickXY(1230,510);
            //Narzedzia.clickXY(1230,510);
            //Thread.sleep(2000);
            //Narzedzia.clickXY(285,168);
            //Narzedzia.clickXY(285,168);
            clickXY(124,57);
            Thread.sleep(1000);
            clickXY(306,355);
            Thread.sleep(3000);
            clickXY(1138,657);
            Thread.sleep(1000);
            clickXY(1153,689);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            clickXY(532,97);

            Thread.sleep(100000);
            Narzedzia.clickXY(953,666);
            Thread.sleep(2000);
            Narzedzia.clickXY(950,790);

            Thread.sleep(15000);
            Narzedzia.clickXY(946,743);
            Thread.sleep(4000);
            Narzedzia.clickXY(573,843);
            Thread.sleep(2000);
            Narzedzia.clickXY(950,730);
            Thread.sleep(3000);
            Narzedzia.clickXY(939,733);
            Narzedzia.clickXY(954,465);
            Narzedzia.clickXY(952,612);
            Narzedzia.clickXY(952,524);
            Narzedzia.clickXY(952,600);
            Thread.sleep(2000);
            Narzedzia.clickXY(950,800);
            Thread.sleep(2000);
            Narzedzia.clickXY(950,680);
            Thread.sleep(4000);
            Narzedzia.clickXY(950,742);
            Thread.sleep(2000);
            Narzedzia.clickXY(950,695);
            Thread.sleep(2000);
            Narzedzia.clickXY(946,790);
            //SKILE
            switch (skill) {
                case 0:
                    Narzedzia.clickXY(631,431);
                    break;
                case 1:
                    Narzedzia.clickXY(631,470);
                    break;
                case 2:
                    Narzedzia.clickXY(631,496);
                    break;
                case 3:
                    Narzedzia.clickXY(631,540);
                    break;
            }
            Thread.sleep(3000);
            switch (skill2) {
                case 0:
                    Narzedzia.clickXY(631,431);
                    break;
                case 1:
                    Narzedzia.clickXY(631,470);
                    break;
                case 2:
                    Narzedzia.clickXY(631,496);
                    break;
                case 3:
                    Narzedzia.clickXY(631,540);
                    break;
            }
            Thread.sleep(3000);
            Narzedzia.clickXY(939,706);
            Thread.sleep(2000);
            Narzedzia.clickXY(663,825);
            Thread.sleep(4000);
            switch (item) {
                case 0:
                    Narzedzia.Przeciagnij(1310,460,782,676);
                    break;
                case 1:
                    Narzedzia.Przeciagnij(1383,465,745,512);
                    break;
                case 2:
                    Narzedzia.Przeciagnij(1453,466,746,595);
                    break;
                case 3:
                    Narzedzia.Przeciagnij(1386,530,1126,435);
                    break;
                case 4:
                    Narzedzia.Przeciagnij(1462,533,777,431);
                    break;
                case 5:
                    Narzedzia.Przeciagnij(1310,611,1157,593);
                    break;
                case 6:
                    Narzedzia.Przeciagnij(1381,605,1162,508);
                    break;
                case 7:
                    Narzedzia.Przeciagnij(1457,600,745,510);
                    break;
            }
            Thread.sleep(3000);
            Narzedzia.clickXY(947,716);
            Thread.sleep(2000);
            Narzedzia.clickXY(765,838);
            Thread.sleep(3000);
            switch (przeciwnik) {
                case 0:
                    Narzedzia.clickXY(854,387);
                    break;
                case 1:
                    Narzedzia.clickXY(854,412);
                    break;
                case 2:
                    Narzedzia.clickXY(854,443);
                    break;
                case 3:
                    Narzedzia.clickXY(854,465);
                    break;
                case 4:
                    Narzedzia.clickXY(854,492);
                    break;
                case 5:
                    Narzedzia.clickXY(854,516);
                    break;
                case 6:
                    Narzedzia.clickXY(854,540);
                    break;
                case 7:
                    Narzedzia.clickXY(854,567);
                    break;
                case 8:
                    Narzedzia.clickXY(854,597);
                    break;
            }
            Thread.sleep(1000);
            Narzedzia.clickXY(896,754);
            Thread.sleep(5000);
            Narzedzia.clickXY(955,792);
            Thread.sleep(3000);
            Narzedzia.clickXY(944,715);
            Thread.sleep(2000);
            Narzedzia.clickXY(944,715);
            Thread.sleep(5000);
            Narzedzia.clickXY(946,757);
            Thread.sleep(10000);

            try {
                //WP
                driver.get("https://poczta.wp.pl");
                Thread.sleep(7000);
                driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
                Thread.sleep(1000);
                //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
                Narzedzia.clickXY(330,576);
                Thread.sleep(10000);
                try {
                    driver.findElement(By.xpath("//*[text()='Hero Zero']")).click();
                    Thread.sleep(4000);
                    Narzedzia.clickXY(860,845);
                    Narzedzia.clickXY(860,790);
                    Narzedzia.clickXY(860,883);
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Hero Zero']")).click();
                    Thread.sleep(4000);
                    Narzedzia.clickXY(860,845);
                    Narzedzia.clickXY(860,790);
                }
                Thread.sleep(6000);
                driver.quit();
            } catch (Exception e) {
                driver.quit();
            }

        } catch (Exception e) {
            driver.quit();
       }


    }

    public static void BigBang(String mail, String login) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        Robot robot = new Robot();
        int skill = r.nextInt(4);
        int skill2 = r.nextInt(4);
        int item = r.nextInt(9);
        int przeciwnik = r.nextInt(9);
        driver.manage().window().maximize();
        driver.get("https://bluepartner.pl/redirect?partner_id=1171&creation_type=LINK&creation_id=214");

        Thread.sleep(10000);
        try {
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/a")).click();
            Thread.sleep(5000);
            Narzedzia.clickXY(1894,91);
            Narzedzia.clickXY(1894,91);
            Thread.sleep(1000);
            clickXY(124,57);
            Thread.sleep(1000);
            clickXY(306,355);
            Thread.sleep(3000);
            clickXY(1138,716);
            Thread.sleep(1000);
            clickXY(1153,760);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"altContent_link\"]")).click();
            Thread.sleep(4000);
            clickXY(20,56);

            Thread.sleep(80000);
            clickXY(1130,820);
            Kopiuj(login);
            Thread.sleep(3000);
            Wklej();
            Kopiuj(mail);
            clickXY(958,496);
            Thread.sleep(1000);
            Wklej();
            clickXY(958,540);
            Thread.sleep(1000);
            Wklej();
            clickXY(958,713);
            Thread.sleep(2000);
            clickXY(958,713);

            Thread.sleep(10000);
            clickXY(1056 , 571 );
            Thread.sleep( 3757);
            clickXY(590 , 819 );
            Thread.sleep( 2868);
            clickXY(952 , 709 );
            Thread.sleep( 3176);
            clickXY(926 , 540 );
            Thread.sleep( 64);
            clickXY(926 , 587 );
            Thread.sleep( 3128);
            clickXY(937 , 753 );
            Thread.sleep( 3770);
            clickXY(941 , 640 );
            Thread.sleep( 5328);
            clickXY(951 , 742 );
            Thread.sleep( 3844);
            clickXY(1060 , 589 );
            Thread.sleep( 3993);
            clickXY(939 , 723 );
            Thread.sleep( 3637);
            //STATY======================
            switch (skill) {
                case 0:
                    Narzedzia.clickXY(544,386);
                    break;
                case 1:
                    Narzedzia.clickXY(544,418);
                    break;
                case 2:
                    Narzedzia.clickXY(544,446);
                    break;
                case 3:
                    Narzedzia.clickXY(544,470);
                    break;
            }
            Thread.sleep(3000);
            switch (skill2) {
                case 0:
                    Narzedzia.clickXY(544,386);
                    break;
                case 1:
                    Narzedzia.clickXY(544,418);
                    break;
                case 2:
                    Narzedzia.clickXY(544,446);
                    break;
                case 3:
                    Narzedzia.clickXY(544,470);
                    break;
            }
            Thread.sleep(3000);
            clickXY(1065 , 616 );
            Thread.sleep( 4128);
            clickXY(669 , 818 );
            Thread.sleep( 4460);
            //ITEMY====================
            switch (item) {
                case 0:
                    Narzedzia.Przeciagnij(1320,415,740,717);
                    break;
                case 1:
                    Narzedzia.Przeciagnij(1384,415,745,636);
                    break;
                case 2:
                    Narzedzia.Przeciagnij(1452,415,739,552);
                    break;
                case 3:
                    Narzedzia.Przeciagnij(1320,480,744,470);
                    break;
                case 4:
                    Narzedzia.Przeciagnij(1384,480,746,402);
                    break;
                case 5:
                    Narzedzia.Przeciagnij(1452,480,1106,637);
                    break;
                case 6:
                    Narzedzia.Przeciagnij(1320,546,1106,470);
                    break;
                case 7:
                    Narzedzia.Przeciagnij(1384,546,1104,552);
                    break;
                case 8:
                    Narzedzia.Przeciagnij(1452,546,1104,390);
                    break;
            }

            Thread.sleep( 2000);
            clickXY(1052,650);
            Thread.sleep(3000);
            clickXY(757 , 816 );
            Thread.sleep( 4908);
            //FIGHTY========================
            switch (przeciwnik) {
                case 0:
                    Narzedzia.clickXY(854,387);
                    break;
                case 1:
                    Narzedzia.clickXY(854,357);
                    break;
                case 2:
                    Narzedzia.clickXY(854,383);
                    break;
                case 3:
                    Narzedzia.clickXY(854,412);
                    break;
                case 4:
                    Narzedzia.clickXY(854,440);
                    break;
                case 5:
                    Narzedzia.clickXY(854,464);
                    break;
                case 6:
                    Narzedzia.clickXY(854,484);
                    break;
                case 7:
                    Narzedzia.clickXY(854,517);
                    break;
                case 8:
                    Narzedzia.clickXY(854,541);
                    break;
            }
            Thread.sleep(1000);
            clickXY(894,720);
            Thread.sleep( 5677);
            clickXY(941 , 806 );
            Thread.sleep( 4732);
            clickXY(960 , 692 );
            Thread.sleep( 2040);
            clickXY(1037 , 617 );
            Thread.sleep( 3153);
            clickXY(1022 , 759 );
            Thread.sleep( 3252);
            clickXY(1478 , 275 );
            Thread.sleep( 4056);
            clickXY(543 , 319 );
            Thread.sleep( 4225);
            clickXY(1295 , 292 );
            Thread.sleep( 264);
            clickXY(1257 , 297 );
            Thread.sleep( 64);
            clickXY(1257 , 297 );
            Thread.sleep(10000);

            try {
                //WP
                driver.get("https://poczta.wp.pl");
                Thread.sleep(7000);
                driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
                Thread.sleep(1000);
                //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
                Narzedzia.clickXY(350,590);
                Thread.sleep(10000);
                try {
                    driver.findElement(By.xpath("//*[text()='Big Bang Empire']")).click();
                    Thread.sleep(4000);
                    Narzedzia.clickXY(860,745);
                    Narzedzia.clickXY(860,790);
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Hero Zero']")).click();
                    Thread.sleep(4000);
                    Narzedzia.clickXY(860,745);
                    Narzedzia.clickXY(860,790);
                }
                Thread.sleep(6000);
                driver.quit();
            } catch (Exception e) {
                driver.quit();
            }


        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Tmobile2(String numer) throws InterruptedException, AWTException {
        //System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/876/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"removecookie\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[1]/div[1]/div[1]/div[3]/div[1]/div/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"telefon\"]")).sendKeys(numer);
        driver.findElement(By.xpath("//*[@id=\"fake-chx2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"fake-chx\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(10000);
        driver.quit();
    }

    public static void Bgz(String imie, String nazwisko, String tel) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/857/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"input_imie\"]")).sendKeys(imie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"input_nazwisko\"]")).sendKeys(nazwisko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"input_telefonKom\"]")).sendKeys(tel);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkbox_zgoda_all\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"button_Wyslij\"]")).click();
        Thread.sleep(8000);
        driver.close();
    }

    public static void Bankowy(String imie, String nazwisko, String tel, String mail) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/858/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div[1]/div/div[5]/form/div[1]/div[3]/div[4]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"txt_name\"]")).sendKeys(imie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_surname\"]")).sendKeys(nazwisko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_tel\"]")).sendKeys(tel);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_email\"]")).sendKeys(mail);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div[1]/div/div[5]/form/div[2]/div[3]/div[1]/label")).click();
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div[1]/div/div[5]/form/div[2]/div[3]/div[2]/label")).click();
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div[1]/div/div[5]/form/div[2]/div[3]/div[3]/label")).click();
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div[1]/div/div[5]/form/div[2]/div[3]/div[4]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div[1]/div/div[5]/form/div[2]/div[2]/div[1]/button")).click();
        Thread.sleep(7000);
        driver.close();
    }

    public static void Finansowy(String imie, String nazwisko, String tel, String url) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get(url);
        Robot robot = new Robot();
        StringSelection selec = new StringSelection(tel);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selec, selec);


        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/div[1]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_name\"]")).sendKeys(imie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_surname\"]")).sendKeys(nazwisko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_tel\"]")).click();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/section[1]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div[1]/div[1]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/section[1]/div/div/form/div[3]/div/div[2]/div/div[3]/div[1]/button")).click();
        Thread.sleep(7000);
        driver.close();
    }

    public static void Kierunek(String imie, String nazwisko, String numer, String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        StringSelection selec = new StringSelection(numer);
        Robot robot = new Robot();
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selec, selec);
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/861/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_name\"]")).sendKeys(imie);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_surname\"]")).sendKeys(nazwisko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_tel\"]")).click();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txt_email\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/section[1]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/section[1]/div/div/form/div[2]/div/div[2]/div/div[3]/div[1]/button")).click();
        Thread.sleep(6000);
        driver.close();
    }

    public static void Pzu(String imie, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/771/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/a")).click();
        Thread.sleep(1000);
        clickXY(485, 339);
        Kopiuj(imie);
        Thread.sleep(1000);
        Wklej();
        Thread.sleep(500);
        clickXY(734, 343);
        Kopiuj(tel);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(389, 395);
        Thread.sleep(1000);
        clickXY(735, 449);
        Thread.sleep(5000);
        driver.close();
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

    public static void Galeria(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        Robot robot = new Robot();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("http://www.szuracze.pl/action/1111/uid/f5654c6a537aa357f56724568a57f357/");

        Thread.sleep(10000);
        Zmniejsz(5);
        Thread.sleep(1000);
        clickXY(1072, 853);

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(661, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();

    }

    public static void ArkadiaSzuracze7(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("http://www.szuracze.pl/action/1107/uid/f5654c6a537aa357f56724568a57f357/");

        Thread.sleep(8000);
        clickXY(1343,1000);
        Thread.sleep(15000);

        Zmniejsz(5);
        Thread.sleep(1000);
        clickXY(1079, 780);

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();
    }

    public static void ArkadiaDodatkowy(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1485&u=153&k=59f3635dd821e60a50bd7");

        Thread.sleep(10000);
        driver.get("https://tajemniczaaaakonstiiii.blogspot.com/");
        Thread.sleep(15000);

        Zmniejsz(5);
        Thread.sleep(1000);
        clickXY(1079, 780);

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();
    }

    public static void WroclawiaDodatkowy(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1516&u=153&k=59f3635dd821e60a50bd7");

        Thread.sleep(15000);
        Zmniejsz(5);
        Thread.sleep(1000);
        clickXY(1076,655);
        Thread.sleep(15000);

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();
    }

    public static void ArkadiaAds(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("http://adsmaker.pl/action/1111/uid/26dd63a0ef72a51af97c0efa88357f15/");

        Thread.sleep(15000);
        Zmniejsz(4);
        Thread.sleep(1000);
        clickXY(1150, 775);
        clickXY(1150, 670);

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(661, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();
    }

    public static void Wroclawia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("http://www.szuracze.pl/action/1002/uid/f5654c6a537aa357f56724568a57f357/9");

        Thread.sleep(10000);
        Zmniejsz(5);
        Thread.sleep(1000);
        clickXY(1070, 722);

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(661, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();
    }

    public static void GaleriaMiras(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("https://mirasbas.pl/zadanie/12/149ba14d0352f9133a371dca827148f1");
        /* Z WCZORAJ
        Thread.sleep(18000);
        clickXY(900, 278);  //plec
        Thread.sleep(500);
        clickXY(900, 367);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1217, 367); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(900, 453);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1205, 450); //haslo
        Kopiuj("Grde12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(876, 533);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(938, 533);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1016, 533);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        //clickXY(662, 790);
        //Thread.sleep(1000);

        clickXY(849, 704);
        Thread.sleep(500);
        clickXY(1124, 981);
        Thread.sleep(8000);
        */

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(661, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();
    }

    public static void ArkadiaMiras(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("https://mirasbas.pl/zadanie/11/149ba14d0352f9133a371dca827148f1");

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();
    }

    public static void WroclawiaMiras(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String imiee = imie[randomImie];
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        driver.get("https://mirasbas.pl/zadanie/13/149ba14d0352f9133a371dca827148f1");

        Thread.sleep(15000);
        clickXY(717, 310);  //plec
        Thread.sleep(500);
        clickXY(744, 391);  //imie
        Kopiuj(imiee);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1087, 391); //nazwisko
        Kopiuj(nazwiskoo);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(744, 477);  //mail
        Kopiuj(mail);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1082, 477); //haslo
        Kopiuj("Gres12");
        Thread.sleep(500);
        Wklej();
        Wklej();
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 556);
        Kopiuj(String.valueOf(dzien));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(749, 556);
        Kopiuj(String.valueOf(miesiac));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(833, 556);
        Kopiuj(String.valueOf(rok));
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(669, 720);
        Thread.sleep(1000);
        clickXY(1913, 1040);
        Thread.sleep(1000);
        clickXY(976, 981);
        Thread.sleep(10000);

        clickXY(953, 374);
        Thread.sleep(3000);
        clickXY(748, 497);
        clickXY(748, 497);
        clickXY(748, 497);
        Thread.sleep(13000);
        driver.quit();
    }

    public static void Sky() throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int wybor = r.nextInt(5);
        driver.manage().window().maximize();
        driver.get("https://mirasbas.pl/zadanie/5/149ba14d0352f9133a371dca827148f1");

        Thread.sleep(14000);
        clickXY(1394, 413);
        Thread.sleep(5000);
        switch (wybor) {
            case 0:
                clickXY(680, 360);
                Thread.sleep(3000);
                clickXY(1056, 476);
                Thread.sleep(20000);
                clickXY(1061, 731);
                Thread.sleep(1000);
                clickXY(1061, 731);
                Thread.sleep(2000);
                clickXY(984, 530);
                Thread.sleep(2000);
                clickXY(1138, 473);
                break;

            case 1:
                clickXY(680, 430);      //Y+=70
                Thread.sleep(3000);
                clickXY(1061, 556);
                Thread.sleep(20000);
                clickXY(1064, 866);
                Thread.sleep(2000);
                clickXY(1064, 866);
                Thread.sleep(2000);
                clickXY(970, 530);
                break;

            case 2:
                clickXY(680, 500);
                Thread.sleep(3000);
                clickXY(1060, 629);
                Thread.sleep(20000);
                clickXY(1064, 947);
                Thread.sleep(2000);
                clickXY(962, 780);
                break;

            case 3:
                clickXY(755, 596);
                Thread.sleep(3000);
                clickXY(1053, 712);
                Thread.sleep(20000);
                clickXY(1061, 995);
                Thread.sleep(2000);
                clickXY(1061, 995);
                Thread.sleep(3000);
                clickXY(962, 897);
                break;

            case 4:
                clickXY(804, 686);
                Thread.sleep(3000);
                clickXY(1045, 790);
                Thread.sleep(20000);
                clickXY(1060, 750);
                Thread.sleep(2000);
                clickXY(1060, 750);
                Thread.sleep(3000);
                clickXY(975, 528);
                //driver.findElement(By.linkText("Wybierz")).click();
        }
        Thread.sleep(40000);
        driver.quit();
    }

    public static void Flirt(String mail) throws InterruptedException, AWTException { //ze zdjęciem
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        Robot robot = new Robot();
        int wiek = r.nextInt(19 - 10 + 1) + 10;
        int sylw = r.nextInt(4);
        int klik = r.nextInt(5);
        int wlosy = r.nextInt(4);
        //String sciezka = "C:\\Users\\Artur\\Desktop\\klikanie\\flirt zdjecia\\"+i+".jpg";
        driver.manage().window().maximize();
        driver.get("http://adsmaker.pl/action/1054/uid/26dd63a0ef72a51af97c0efa88357f15/ ");
        //driver.get("https://www.flirt.com/");

        Thread.sleep(15000);
        try {
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            Select wiekk = new Select(driver.findElement(By.xpath("//*[@id=\"UserForm_yearsold\"]")));
            wiekk.selectByIndex(wiek);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"UserForm_email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"UserForm_password\"]")).sendKeys("mrcbuch2");
            driver.findElement(By.xpath("//*[@id=\"start_button\"]")).click();
        } catch (Exception e) {
            try {
                driver.findElement(By.xpath("/html/body/div/section/div/div[3]/div[1]/div[2]/div[2]")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div/section/div/div[3]/div[2]/form/div[4]/div[6]/span")).click();
                Thread.sleep(2000);
                Select wiekk = new Select(driver.findElement(By.xpath("//*[@id=\"UserForm_yearsold\"]")));
                wiekk.selectByIndex(wiek);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div/section/div/div[3]/div[2]/form/div[4]/div[6]/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"UserForm_email\"]")).sendKeys(mail);
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div/section/div/div[3]/div[2]/form/div[4]/div[6]/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"UserForm_password\"]")).sendKeys("mrcbuch2");
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div/section/div/div[3]/div[2]/form/div[4]/div[7]/span")).click();
            } catch (Exception e1) {
                driver.findElement(By.xpath("/html/body/div/div[2]/section/div/div/form[2]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/p")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div/div[2]/section/div/div/form[2]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/p")).click();
                Thread.sleep(2000);
                Select wiekk = new Select(driver.findElement(By.xpath("//*[@id=\"age-field\"]")));
                wiekk.selectByIndex(wiek);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div/div[2]/section/div/div/form[2]/div/div[2]/div[2]/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div/div[2]/section/div/div/form[2]/div/div[2]/div[2]/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div/div[2]/section/div/div/form[2]/div/div[1]/div[5]/div[2]/div[1]/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"password-field\"]")).sendKeys("mrcbuch2");
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div/div[2]/section/div/div/form[2]/div/div[2]/div[2]/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"email-field\"]")).sendKeys(mail);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div/div[2]/section/div/div/form[2]/div/div[2]/div[2]/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div/div[2]/section/div/div/form[2]/div/div[2]/div[3]/span")).click();
            }

        }
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[2]/div/span/span/i")).click();
        Thread.sleep(3000);
        //ZDJECIE
        //Kopiuj(sciezka);
        //driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[1]/div[1]/div[3]/div/div[3]/div/div[1]/div/label/span/span[2]")).click();
        //Thread.sleep(1000);
        //Wklej();
        //Thread.sleep(1000);
        //robot.keyPress(KeyEvent.VK_ENTER);
        //Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div/div/span")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/div[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/div[2]/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div[2]/div[1]/div")).click();
        Thread.sleep(1000);
        switch (sylw) {
            case 0:
                driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[3]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[4]")).click();
                break;
            case 3:
                driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[5]")).click();
                break;
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[1]/div")).click();
        Thread.sleep(1000);
        switch (wlosy) {
            case 0:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[2]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[3]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[4]")).click();
                break;
            case 3:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[5]")).click();
                break;
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[3]/div[2]/div/span/span")).click();
        Thread.sleep(10000);
        try {
            //WP
            driver.get("https://poczta.wp.pl");
            Thread.sleep(7000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/nh-sidebar/div/div/div[3]/div[1]/div[5]/div[2]")).click();
            Thread.sleep(3500);
            driver.findElement(By.xpath("//*[text()='Flirt']")).click();
            Thread.sleep(3000);
            clickXY(976, 568);
            clickXY(976, 540);
            Thread.sleep(3000);
            //driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
            clickXY(871, 466);
            clickXY(871, 444);
            Thread.sleep(10000);
            switch (klik) {
                case 0:
                    clickXY(855, 758);
                    Thread.sleep(2000);
                    clickXY(954, 774);
                    Thread.sleep(6000);
                    clickXY(855, 758);
                    break;
                case 1:
                    clickXY(439, 745);
                    Thread.sleep(2000);
                    clickXY(954, 774);
                    Thread.sleep(6000);
                    clickXY(439, 745);
                case 2:
                    clickXY(669, 468);
                    Thread.sleep(2000);
                    clickXY(954, 774);
                    Thread.sleep(6000);
                    clickXY(669, 468);
                case 3:
                    clickXY(431, 968);
                    Thread.sleep(2000);
                    clickXY(954, 774);
                    Thread.sleep(6000);
                    clickXY(431, 968);
                case 4:
                    clickXY(647, 733);
                    Thread.sleep(2000);
                    clickXY(954, 774);
                    Thread.sleep(6000);
                    clickXY(647, 733);
            }
            Thread.sleep(9000);
            //driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div/div/div[1]/div/div[3]/div/span/span[2]")).click();
            //Thread.sleep(6000);
            driver.quit();
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }

    public static void Lovea(String mail, int i) throws AWTException, InterruptedException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        Robot robot = new Robot();
        int stann = r.nextInt(6);
        int wiek = r.nextInt(19 - 10 + 1) + 10;
        int sylw = r.nextInt(4);
        int wlosy = r.nextInt(4);
        int klik = r.nextInt(5);
        String sciezka = "C:\\Users\\Artur\\Desktop\\klikanie\\flirt zdjecia\\" + i + ".jpg";
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/869/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(12000);
        try {
            driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/div[3]/div/div")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            Select wiekk = new Select(driver.findElement(By.xpath("//*[@id=\"UserForm_yearsold\"]")));
            wiekk.selectByIndex(wiek);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"UserForm_email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"UserForm_password\"]")).sendKeys("mrcbuch2");
            driver.findElement(By.xpath("//*[@id=\"start_button\"]")).click();
            Thread.sleep(15000);
        } catch (Exception e) {
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            Select wiekk = new Select(driver.findElement(By.xpath("//*[@id=\"UserForm_yearsold\"]")));
            wiekk.selectByIndex(wiek);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            //driver.findElement(By.xpath("//*[@id=\"UserForm_email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"UserForm_email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"next_step\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"UserForm_password\"]")).sendKeys("mrcbuch2");
            driver.findElement(By.xpath("//*[@id=\"start_button\"]")).click();
            Thread.sleep(15000);
        }
        Thread.sleep(15000);
        //ZDJECIE
        if (i % 2 == 0) {
            Kopiuj(sciezka);
            driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[1]/div[1]/div[3]/div/div[3]/div/div[1]/div/label/span/span[2]")).click();
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(4000);
        }
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div/div/span")).click();
        Thread.sleep(8000);
        //clickXY(907, 472);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/div[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/div[2]/div[2]")).click();
        Thread.sleep(1000);
        //clickXY(921, 553);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div[2]/div[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
        Thread.sleep(1000);
        //clickXY(925, 630);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[1]/div")).click();
        Thread.sleep(1000);
        switch (sylw) {
            case 0:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[2]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[3]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[4]")).click();
                break;
            case 3:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[5]")).click();
                break;
        }
        Thread.sleep(1000);
        //clickXY(953, 623);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[4]/div[2]/div[1]/div")).click();
        Thread.sleep(1000);
        switch (wlosy) {
            case 0:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[4]/div[2]/div[2]/div[2]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[4]/div[2]/div[2]/div[3]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[4]/div[2]/div[2]/div[4]")).click();
                break;
            case 3:
                driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/form/div[2]/div[4]/div[2]/div[2]/div[4]")).click();
                break;
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div[2]/form/div[3]/div[2]/div/span/span")).click();
        Thread.sleep(6000);

        //WP
        driver.get("https://poczta.wp.pl");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/nh-sidebar/div/div/div[3]/div[1]/div[5]/div[2]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("//*[text()='Loveaholics']")).click();
        Thread.sleep(3000);
        clickXY(976, 568);
        clickXY(976, 540);
        Thread.sleep(3000);
        //driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
        clickXY(871, 466);
        clickXY(871, 444);
        Thread.sleep(10000);
        switch (klik) {
            case 0:
                clickXY(855, 758);
                Thread.sleep(2000);
                clickXY(954, 774);
                Thread.sleep(6000);
                clickXY(855, 758);
                break;
            case 1:
                clickXY(439, 745);
                Thread.sleep(2000);
                clickXY(954, 774);
                Thread.sleep(6000);
                clickXY(439, 745);
            case 2:
                clickXY(669, 468);
                Thread.sleep(2000);
                clickXY(954, 774);
                Thread.sleep(6000);
                clickXY(669, 468);
            case 3:
                clickXY(431, 968);
                Thread.sleep(2000);
                clickXY(954, 774);
                Thread.sleep(6000);
                clickXY(431, 968);
            case 4:
                clickXY(647, 733);
                Thread.sleep(2000);
                clickXY(954, 774);
                Thread.sleep(6000);
                clickXY(647, 733);
        }
        Thread.sleep(9000);
        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div/div/div[1]/div/div[3]/div/span/span[2]")).click();
        //Thread.sleep(6000);
        driver.quit();

    }

    public static void ww(String mail) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int plec = r.nextInt(2);
        int randomNazwisko = r.nextInt(199);
        int randomMeskie = r.nextInt(229);
        int randomZenski = r.nextInt(152);
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        String imie1;
        String nazwisko1;
        driver.manage().window().maximize();
        driver.get("https://www.mypay.pl/webapp/extern.php?k=5883&u=230491");

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div/main/section[1]/div[2]/div/a")).click();
        Thread.sleep(3000);
        if (plec == 0) {
            imie1 = imie[randomZenski];
            if (nazw[nazw.length - 1] == 'i')
                nazw[nazw.length - 1] = 'a';
            String nazwiskoo = new String(nazw);
            nazwisko1 = nazwiskoo;
        } else {
            imie1 = meskie[randomMeskie];
            nazwisko1 = nazwisko[randomNazwisko];
        }
        driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/form/div[1]/div[1]/div/input")).sendKeys(imie1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys(nazwisko1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/form/div[3]/input")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/form/div[4]/label")).click();
        driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/form/div[5]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/form/div[6]/button")).click();
        Thread.sleep(6000);
        driver.close();
    }

    public static void wro(String mail) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int plec = r.nextInt(2);
        int pro = r.nextInt(5);
        int randomNazwisko = r.nextInt(199);
        int randomMeskie = r.nextInt(229);
        int randomZenski = r.nextInt(152);
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        String imie1;
        String nazwisko1;
        driver.manage().window().maximize();
        driver.get("https://www.mypay.pl/webapp/extern.php?k=5891&u=230491");

        Thread.sleep(10000);
        Select problem = new Select(driver.findElement(By.xpath("//*[@id=\"radio_fortuna\"]")));
        problem.selectByIndex(pro);

    }

    public static void Magnum71(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomImie = r.nextInt(152);
        driver.manage().window().maximize();
        driver.get("http://www.szuracze.pl/action/1146/uid/f5654c6a537aa357f56724568a57f357/");

        Thread.sleep(10000);
        clickXY(955, 615);

        Thread.sleep(40000);
        clickXY(1847, 1031);
        //clickXY(1847,1031);
        Thread.sleep(1000);
        Zmniejsz(1);
        Kopiuj(imie[randomImie]);
        Thread.sleep(1000);
        clickXY(891, 507);
        Thread.sleep(3000);
        clickXY(891, 507);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        Kopiuj(mail);
        clickXY(891, 591);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(758, 690);
        clickXY(758, 727);
        clickXY(758, 800);
        Thread.sleep(1000);
        clickXY(954, 967);
        clickXY(954, 967);
        Thread.sleep(35000);
        driver.quit();
    }

    public static void Magnum1A(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomImie = r.nextInt(152);
        driver.manage().window().maximize();
        driver.get("http://www.szuracze.pl/action/1148/uid/f5654c6a537aa357f56724568a57f357/");

        Thread.sleep(10000);
        Zmniejsz(3);
        clickXY(1246, 1010);

        Thread.sleep(40000);
        clickXY(1847, 1031);
        //clickXY(1847,1031);
        Thread.sleep(1000);
        Zmniejsz(1);
        Kopiuj(imie[randomImie]);
        Thread.sleep(1000);
        clickXY(891, 507);
        Thread.sleep(3000);
        clickXY(891, 507);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        Kopiuj(mail);
        clickXY(891, 591);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(758, 690);
        clickXY(758, 727);
        clickXY(758, 800);
        Thread.sleep(1000);
        clickXY(954, 967);
        clickXY(954, 967);
        Thread.sleep(35000);
        driver.quit();
    }

    public static void Finata(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/881/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(15000);
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(5000);
        clickXY(1131, 1026);
        Thread.sleep(1000);
        Kopiuj(mail);
        clickXY(1620, 357);  //mail
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        Kopiuj(mail + "S1");
        clickXY(1620, 442);  //haslo
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1620, 552);
        Thread.sleep(10000);
        driver.quit();
        /*
        WebDriver driver2 = new FirefoxDriver();
        //WP
        driver2.manage().window().maximize();
        driver2.get("https://poczta.wp.pl");
        Thread.sleep(7000);
        driver2.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver2.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver2.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(10000);
        driver2.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
        Thread.sleep(4000);
        driver2.findElement(By.xpath("//*[text()='Finiata']")).click();
        Thread.sleep(3000);
        driver2.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/center/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table[6]/tbody/tr/td/table/tbody/tr/td/a")).click();
        Thread.sleep(10000);
        driver2.quit();
        */
    }

    public static void Finata2(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/882/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(8000);
        clickXY(1139, 265);

        Thread.sleep(15000);
        clickXY(1574, 132);
        Thread.sleep(5000);
        clickXY(1131, 1026);
        Thread.sleep(1000);
        Kopiuj(mail);
        clickXY(1620, 357);  //mail
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        Kopiuj(mail + "S1");
        clickXY(1620, 442);  //haslo
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(1620, 552);
        Thread.sleep(10000);
        driver.quit();
        /*
        WebDriver driver2 = new FirefoxDriver();
        //WP
        driver2.manage().window().maximize();
        driver2.get("https://poczta.wp.pl");
        Thread.sleep(7000);
        driver2.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver2.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver2.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(10000);
        driver2.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
        Thread.sleep(4000);
        driver2.findElement(By.xpath("//*[text()='Finiata']")).click();
        Thread.sleep(3000);
        driver2.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/center/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table[6]/tbody/tr/td/table/tbody/tr/td/a")).click();
        Thread.sleep(10000);
        driver2.quit();
        */
    }

    public static void Lech(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int miasto = r.nextInt(5);
        driver.manage().window().maximize();
        driver.get("https://www.mypay.pl/webapp/extern.php?k=5959&u=230491");

        Thread.sleep(16000);
        clickXY(93, 195);

        Thread.sleep(6000);
        clickXY(948, 897);
        Thread.sleep(5000);
        switch (miasto) {
            case 0:
                clickXY(514, 460);
                break;
            case 1:
                clickXY(757, 420);
                break;
            case 2:
                clickXY(997, 680);
                break;
            case 3:
                clickXY(577, 726);
                break;
            case 4:
                clickXY(1094, 565);
                break;
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"vote_email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/section/form/div[2]/div[2]/label/span[1]")).click();
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/section/form/div[2]/div[3]/label/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"form-vote-button\"]")).click();
        Thread.sleep(6000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[text()='kontakt']")).click();
        Thread.sleep(3000);
        clickXY(962, 868);
        Thread.sleep(5000);
        driver.quit();
    }

    public static void Rainbow(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        Robot robot = new Robot();
        int miasto = r.nextInt(10);
        driver.manage().window().maximize();
        driver.get("https://www.mypay.pl/webapp/extern.php?k=5972&u=230491");

        Thread.sleep(14000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(4000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='LAST MINUTE z Rainbow']")).click();
        Thread.sleep(3000);
        clickXY(1095, 962);

        Thread.sleep(15000);
        clickXY(1911, 187);
        clickXY(1911, 187);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(1911, 958);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        Kopiuj(mail);
        clickXY(891, 630);
        clickXY(891, 630);
        Wklej();
        Thread.sleep(1000);
        clickXY(1276, 631);
        Thread.sleep(10000);
        switch (miasto) {
            case 0:
                clickXY(862,360);
                break;
            case 1:
                clickXY(1039,360);
                break;
            case 2:
                clickXY(1213,360);
                break;
            case 3:
                clickXY(1387,360);
                break;
            case 4:
                clickXY(862,415);
                break;
            case 5:
                clickXY(1037,415);
                break;
            case 6:
                clickXY(1210,415);
                break;
            case 7:
                clickXY(1387,415);
                break;
            case 8:
                clickXY(865,464);
                break;
            case 9:
                clickXY(1040,466);
                break;
        }
        Thread.sleep(1000);
        clickXY(940,540);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_TAB);
        //WP
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/nh-sidebar/div/div/div[3]/div[1]/div[1]/div[2]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[3]/div/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Biuro Podróży Rainbow']")).click();
        Thread.sleep(3000);
        clickXY(960, 867);
        clickXY(960, 867);
        Thread.sleep(14000);
        driver.quit();
    }

    public static void Zalando(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        Robot robot = new Robot();
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        driver.manage().window().maximize();
        driver.get("https://www.mypay.pl/webapp/extern.php?k=5983&u=230491");

        Thread.sleep(20000);
        driver.findElement(By.xpath("//*[@id=\"f-it-name\"]")).sendKeys(imie[randomImie]);
        driver.findElement(By.xpath("//*[@id=\"f-it-surname\"]")).sendKeys(nazwisko1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"f-ib-next-step\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"f-it-mail\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"f-ip-pass\"]")).sendKeys(mail+"V2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"f-is-submit\"]")).click();
        Thread.sleep(7000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Zalando Lounge']")).click();
        Thread.sleep(3000);
        clickXY(817, 546);
        clickXY(817, 526);
        clickXY(817, 566);
        Thread.sleep(10000);
        driver.quit();
    }

    public static void Bonga(String mail, String login) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        boolean klik = false;
        int filmik = r.nextInt(7);
        Robot robot = new Robot();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/703/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[5]/div/a[2]")).click();
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("//*[@id=\"user_member_username\"]")).sendKeys(login);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[3]/div/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"user_member_password\"]")).sendKeys(login + "Goragoga24");
            driver.findElement(By.xpath("//*[@id=\"user_member_terms_of_use\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[3]/div/form/div/div[2]/button")).click();
        }
        catch (Exception e) {
                //driver.findElement(By.xpath("//*[@id=\"user_member_username\"]")).sendKeys(login);
                driver.findElement(By.xpath("//*[@id=\"user_member_password\"]")).sendKeys(mail + "G4");
                driver.findElement(By.xpath("//*[@id=\"user_member_terms_of_use\"]")).click();
                Thread.sleep(1000);
                try {
                    driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/table/tbody/tr/td/div[1]/form/div/div[2]/button")).click();
                } catch (Exception a) {
                    driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/form/div/div[2]/button")).click();
                }
            }
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/form/div/div[2]/button")).click();
            Thread.sleep(4000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(9000);
            try {
                try {
                    driver.findElement(By.xpath("//*[text()='BongaCams Support']")).click();
                }
                catch (Exception e) {
                    try {
                        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
                        Thread.sleep(3000);
                        driver.findElement(By.xpath("//*[text()='BongaCams Support']")).click();
                    }
                    catch (Exception f) {
                        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/nh-sidebar/div/div/div[3]/div[1]/div[5]/div[2]")).click();
                        Thread.sleep(3000);
                        driver.findElement(By.xpath("//*[text()='BongaCams Support']")).click();
                    }
                }

                Thread.sleep(3000);
                clickXY(967, 735);
                clickXY(967, 745);
                clickXY(967, 725);
                Thread.sleep(3000);
                clickXY(880,367);
                Thread.sleep(10000);

                switch (filmik) {
                    case 0:
                        clickXY(150, 415);
                        break;

                    case 1:
                        clickXY(450, 415);
                        break;

                    case 2:
                        clickXY(750, 415);
                        break;

                    case 3:
                        clickXY(1050, 415);
                        break;

                    case 4:
                        clickXY(1282, 415);
                        break;

                    case 5:
                        clickXY(1550, 415);
                        break;

                    case 6:
                        clickXY(984, 697);
                        break;
                }
                Thread.sleep(15000);
                driver.quit();

            }
            catch (Exception a) {
                driver.quit();
            }
    }
    public static void Islandoom(String mail, String login) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean wyspa = false;
        int x = 60;
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/623/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(15000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(login);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div/div/div/div[2]/div/form/div[3]/input")).sendKeys(mail+"G3");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div/div/div/div[2]/div/form/div[4]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div/div/div/div[2]/div/form/button[1]")).click();
        Thread.sleep(15000);

        clickXY(927,426);
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div/div[2]/div[2]/div/a")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/button")).click();
        Thread.sleep(3000);
        clickXY(650,580);
        Thread.sleep(4000);
        //driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div/div[2]/div[2]/div/a")).click();
        clickXY(1268,448);
        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/button")).click();
        Thread.sleep(4000);
        clickXY(646,563);
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div[3]/div[3]/div[1]/form/div[4]/div[3]/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"islandWorldSwitch\"]")).click();
        Thread.sleep(3000);

        //MAPA
        clickXY(760,340);
        Thread.sleep(2000);
        while (!wyspa && x < 1900) {
            try {
                driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div[1]/div[1]")).click();
                wyspa = true;
            }
            catch (Exception e) {
                clickXY(x,542);
                x += 100;
                Thread.sleep(2000);
            }
        }
        Thread.sleep(3000);
        clickXY(1000,620);
        Thread.sleep(1000);
        clickXY(567,613);
        driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/form/div[1]/div[2]/div[3]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div[2]/ul/li[1]/div/a/img")).click();

    }

    public static void Lidl(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomImie = r.nextInt(152);
        boolean klik = false;
        Robot robot = new Robot();
        driver.manage().window().maximize();
        driver.get("http://adsmaker.pl/action/1180/uid/26dd63a0ef72a51af97c0efa88357f15/");

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/button")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"s_prename\"]")).sendKeys(imie[randomImie]);
        driver.findElement(By.xpath("//*[@id=\"s_email\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(6000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/div[1]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[3]/div/span[1]")).click();
        Thread.sleep(3000);
        while (!klik) {
            try {
                driver.findElement(By.xpath("//*[text()='Lidl Polska Newsletter']")).click();
                klik = true;
            }
            catch (Exception e) {
                robot.keyPress(KeyEvent.VK_F5);
                Thread.sleep(7000);
            }
        }

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Potwierdź zamówienie newslettera* ›']")).click();
        Thread.sleep(2000);
        clickXY(868,400);
        Thread.sleep(7000);
        driver.quit();
    }

    public static void BongaLogowanie(String login) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://pl.bongacams.com/");

        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[4]/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[5]/div/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header_log_in_log_in_username\"]")).sendKeys(login);
        driver.findElement(By.xpath("//*[@id=\"header_log_in_log_in_password\"]")).sendKeys(login+"Goragoga24");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[5]/div/div/form/div/div[2]/button")).click();
    }

    public static void Royal(String mail, String login) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        boolean klik = false;
        int filmik = r.nextInt(7);
        Robot robot = new Robot();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/888/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[3]/div/a[2]")).click();
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("//*[@id=\"user_member_username\"]")).sendKeys(login);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[11]/div/div/div/div/div[3]/div/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"user_member_password\"]")).sendKeys(login + "Goragoga24");
            driver.findElement(By.xpath("//*[@id=\"user_member_terms_of_use\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[11]/div/div/div/div/div[3]/div/form/div/div[2]/button")).click();
        }
        catch (Exception e) {
            driver.findElement(By.xpath("//*[@id=\"user_member_password\"]")).sendKeys(mail + "G4");
            driver.findElement(By.xpath("//*[@id=\"user_member_terms_of_use\"]")).click();
            Thread.sleep(1000);
            try {
                driver.findElement(By.xpath("/html/body/div[11]/div/div/div/div/div[2]/form/div/div[2]/button")).click();
            } catch (Exception a) {
                driver.findElement(By.xpath("/html/body/div[11]/div/div/div/div/table/tbody/tr/td/div[1]/form/div/div[2]/button")).click();
            }
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/form/div/div[2]/button")).click();
        Thread.sleep(4000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(9000);
        try {
            try {
                driver.findElement(By.xpath("//*[text()='Royalcams Support']")).click();
            }
            catch (Exception e) {
                try {
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/div/div/div[1]/ul/li[2]/div/span[1]")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Royalcams Support']")).click();
                }
                catch (Exception f) {
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/nh-sidebar/div/div/div[3]/div[1]/div[5]/div[2]")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Royalcams Support']")).click();
                }
            }

            Thread.sleep(3000);
            clickXY(967, 735);
            clickXY(967, 745);
            clickXY(967, 725);
            Thread.sleep(3000);
            clickXY(880,367);
            Thread.sleep(10000);

            switch (filmik) {
                case 0:
                    clickXY(150, 415);
                    break;

                case 1:
                    clickXY(450, 415);
                    break;

                case 2:
                    clickXY(750, 415);
                    break;

                case 3:
                    clickXY(1050, 415);
                    break;

                case 4:
                    clickXY(1282, 415);
                    break;

                case 5:
                    clickXY(1550, 415);
                    break;

                case 6:
                    clickXY(984, 697);
                    break;
            }
            Thread.sleep(15000);
            driver.quit();
        }
        catch (Exception a) {
            driver.quit();
        }
    }
    public static void Ventis(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int produkt = r.nextInt(4);
        Robot robot = new Robot();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/893/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(25000);
        //driver.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/ul[1]/li[1]/a/svg")).click();
        clickXY(1428,153);
        Thread.sleep(3000);
        Select country = new Select(driver.findElement(By.xpath("//*[@id=\"Preferences_CountryCode\"]")));
        Thread.sleep(500);
        country.selectByIndex(20);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/form/div[3]/div/div/div/button/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/main/div/section/div/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"registerEmail\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"registerPassword\"]")).sendKeys(mail+"V2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"registerButton\"]")).click();
        Thread.sleep(5000);
        for (int i=0;i<7;i++)
        {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
            Thread.sleep(2000);
        }
        Thread.sleep(30000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-10000)", "");
        Thread.sleep(30000);
        driver.findElement(By.xpath("/html/body/header/nav/div/div/div[1]/ul/li[2]/a")).click();
        Thread.sleep(30000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1000);
        switch (produkt) {
            case 0:
                clickXY(490,760);
                break;
            case 1:
                clickXY(800,760);
                break;
            case 2:
                clickXY(110,760);
                break;
            case 3:
                clickXY(1420,760);
                break;
        }
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"AddItem\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/a[2]")).click();
        Thread.sleep(10000);
        driver.quit();

    }

    public static void Every2Dodatkowy(String mail, String kod) throws InterruptedException, AWTException {
        Random r = new Random();
        int indeks = r.nextInt(153);
        int ro = r.nextInt(1994 - 1984 + 1) + 1984;
        int mies = r.nextInt(11);
        int randomNazwisko = r.nextInt(199);
        char[] nazw = nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwisko1 = new String(nazw);
        String rokk = String.valueOf(ro);
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("http://adsmaker.pl/action/1319/uid/26dd63a0ef72a51af97c0efa88357f15/");
        /*
        Thread.sleep(30000);
        Zmniejsz(4);
        Thread.sleep(1000);
        clickXY(1170, 903);
        */
        Thread.sleep(30000);
        Zwieksz(4);
        Thread.sleep(1000);
        clickXY(604,530);
        Thread.sleep(10000);

        int x = 1779;
        int x1 = 1750;
        for (int i=0;i<7;i++)
        {
            clickXY(x, 1012);
            x += 10;
            Thread.sleep(500);
        }
        for (int i=0;i<7;i++)
        {
            clickXY(x1, 1012);
            x1 -= 10;
            Thread.sleep(500);
        }
        Thread.sleep(1000);
        clickXY(772,814);
        clickXY(960,900);
        Thread.sleep(3000);
        Zmniejsz(5);
        clickXY(877,300);
        Kopiuj(imie[indeks]);
        clickXY(900,328);
        Wklej();
        Kopiuj(nazwisko1);
        clickXY(900,354);
        Wklej();
        clickXY(900,400);

    }

    public static void Black(String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int imieZenskie = r.nextInt(153);
        int imieMeskie = r.nextInt(229);
        int plec = r.nextInt(2);
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        driver.get("http://dodatkowypieniadz.com/wykonaj.php?a=1509&u=153&k=59f3635dd821e60a50bd7");

        Thread.sleep(20000);
        Zmniejsz(5);
        Thread.sleep(1000);
        clickXY(1080,1041);

        Thread.sleep(13000);
        if (plec == 0)
        {
            Kopiuj(imie[imieZenskie]);
            Thread.sleep(500);
            clickXY(846,404);
            Thread.sleep(500);
            Wklej();
        }
        else
        {
            Kopiuj(meskie[imieMeskie]);
            Thread.sleep(500);
            clickXY(846,404);
            Thread.sleep(500);
            Wklej();
        }
        Thread.sleep(1000);
        Kopiuj(mail);
        Thread.sleep(500);
        clickXY(1062,404);
        Thread.sleep(500);
        Wklej();
        Thread.sleep(1000);
        clickXY(963,440);
        Thread.sleep(5000);

        //WP
        try {
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(9000);
            driver.findElement(By.xpath("//*[@id=\"folder-152\"]")).click();
            Thread.sleep(4000);
            try {
                driver.findElement(By.xpath("//*[text()='Black Red White']")).click();
            }
            catch (Exception e) {
                robot.keyPress(KeyEvent.VK_F5);
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[text()='Black Red White']")).click();
            }
            Thread.sleep(5000);
            clickXY(956,830);
            clickXY(956,772);
            Thread.sleep(7000);
            driver.quit();
        }
        catch (Exception e) {
            driver.quit();
        }

    }

    public static void Chili(String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int imieZenskie = r.nextInt(153);
        int imieMeskie = r.nextInt(229);
        int randomNazwisko = r.nextInt(199);
        int plec = r.nextInt(2);
        int dzien = r.nextInt(29) + 1;
        int mies = r.nextInt(11) + 1;
        int rok = r.nextInt(1998 - 1980 + 1) + 1980;
        String dataUr = dzien+"."+mies+"."+"rok";
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        driver.get("https://zarabiacze.pl/action/896/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(8000);
        clickXY(1382,197);

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[2]/div[1]/input")).sendKeys(mail+"V2");
        if (plec == 0)
        {
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys(imie[imieZenskie]);
            Thread.sleep(1000);
            char[] nazw = nazwisko[randomNazwisko].toCharArray();
            if (nazw[nazw.length - 1] == 'i')
                nazw[nazw.length - 1] = 'a';
            String nazwisko1 = new String(nazw);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[4]/input")).sendKeys(nazwisko1);
        }
        else
        {
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys(meskie[imieMeskie]);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[4]/input")).sendKeys(nazwisko[randomNazwisko]);
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"birthDate\"]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"birthDate\"]")).sendKeys(dataUr);
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[11]/div/div[1]/label/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[11]/div/div[3]/label/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[11]/div/div[5]/label/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submitRegistration-btn\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div[1]/div[1]/div/div/div/a")).click();
        Thread.sleep(5000);
        for (int i=0;i<5;i++)
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(10000);
        driver.quit();
    }
}
