package info_retrieval;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Random;

public class Mirasbas extends Narzedzia {
    public static void RankomatTravel(String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int kraje = r.nextInt(29);
        int cel = r.nextInt(4);
        int dzienPocz = r.nextInt(15 - 1 + 1) + 1;
        String dzienPocza = String.valueOf(dzienPocz);
        int dzienKoniec = r.nextInt(30 - 15 + 1) + 15;
        String dzienKonieca = String.valueOf(dzienKoniec);
        if (dzienKoniec < 10)
            dzienKonieca = "0"+dzienKonieca;
        if (dzienPocz < 10)
            dzienPocza = "0"+dzienPocz;
        String poczUbe = dzienPocza+"-"+"08"+"-"+"2019";
        String koniecUbe = dzienKonieca+"-"+"08"+"-"+"2019";
        int dzien = r.nextInt(29) + 1;
        int mies = r.nextInt(11) + 1;
        int rok = r.nextInt(1998 - 1980 + 1) + 1980;
        String dataUr;
        if (dzien < 10 && mies < 10)
            dataUr = "0" + dzien + "-0" + mies + "-" + rok;
        else if (dzien < 10)
            dataUr = "0" + dzien + "-" + mies + "-" + rok;
        else if (mies < 10)
            dataUr = dzien + "-0" + mies + "-" + rok;
        else
            dataUr = dzien + "-" + mies + "-" + rok;
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        driver.get("https://mirasbas.pl/zadanie/22/149ba14d0352f9133a371dca827148f1");

        Thread.sleep(10000);
        Narzedzia.clickXY(1292,1017);
        Thread.sleep(1000);
        Narzedzia.clickXY(486,575);
        Thread.sleep(8000);
        Narzedzia.clickXY(723,426);
        Thread.sleep(1000);
        Narzedzia.clickXY(752,673);
        switch (kraje) {
            case 0:
                Narzedzia.Kopiuj("Belgia");
                break;
            case 1:
                Narzedzia.Kopiuj("Bułgaria");
                break;
            case 2:
                Narzedzia.Kopiuj("Białoruś");
                break;
            case 3:
                Narzedzia.Kopiuj("Chorwacja");
                break;
            case 4:
                Narzedzia.Kopiuj("Cypr");
                break;
            case 5:
                Narzedzia.Kopiuj("Czechy");
                break;
            case 6:
                Narzedzia.Kopiuj("Dania");
                break;
            case 7:
                Narzedzia.Kopiuj("Finlandia");
                break;
            case 8:
                Narzedzia.Kopiuj("Francja");
                break;
            case 9:
                Narzedzia.Kopiuj("Grecja");
                break;
            case 10:
                Narzedzia.Kopiuj("Hiszpania");
                break;
            case 11:
                Narzedzia.Kopiuj("Holandia");
                break;
            case 12:
                Narzedzia.Kopiuj("Irlandia");
                break;
            case 13:
                Narzedzia.Kopiuj("Islandia");
                break;
            case 14:
                Narzedzia.Kopiuj("Litwa");
                break;
            case 15:
                Narzedzia.Kopiuj("Macedonia");
                break;
            case 16:
                Narzedzia.Kopiuj("Mołdawia");
                break;
            case 17:
                Narzedzia.Kopiuj("Niemcy");
                break;
            case 18:
                Narzedzia.Kopiuj("Norwegia");
                break;
            case 19:
                Narzedzia.Kopiuj("Portugalia");
                break;
            case 20:
                Narzedzia.Kopiuj("Rosja");
                break;
            case 21:
                Narzedzia.Kopiuj("Rumunia");
                break;
            case 22:
                Narzedzia.Kopiuj("Szwajcaria");
                break;
            case 23:
                Narzedzia.Kopiuj("Szwecja");
                break;
            case 24:
                Narzedzia.Kopiuj("Słowacja");
                break;
            case 25:
                Narzedzia.Kopiuj("Turcja");
                break;
            case 26:
                Narzedzia.Kopiuj("Ukraina");
                break;
            case 27:
                Narzedzia.Kopiuj("Wielka Brytania");
                break;
            case 28:
                Narzedzia.Kopiuj("Włochy");
                break;

        }
        Thread.sleep(1000);
        Narzedzia.Wklej();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Narzedzia.clickXY(1531,562);
        Thread.sleep(1000);
        switch(cel) {
            case 0:
                Narzedzia.clickXY(728,765);
                break;
            case 1:
                Narzedzia.clickXY(728,892);
                break;
            case 2:
                Narzedzia.clickXY(866,892);
                break;
            case 3:
                Narzedzia.clickXY(994,892);
                break;
        }
        Thread.sleep(1000);
        Narzedzia.Zmniejsz(4);
        Thread.sleep(1000);
        Narzedzia.Kopiuj(poczUbe);
        Narzedzia.clickXY(848,540);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(koniecUbe);
        Thread.sleep(1000);
        Narzedzia.Wklej();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        Narzedzia.clickXY(831,671);
        Narzedzia.Kopiuj(dataUr);
        Narzedzia.clickXY(819,701);
        Narzedzia.Wklej();
        Narzedzia.clickXY(819,735);
        Thread.sleep(1000);
        Narzedzia.clickXY(967,862);

        Thread.sleep(15000);
        Narzedzia.clickXY(1913,1009);
        Narzedzia.clickXY(1913,1009);
        Thread.sleep(1000);
        Narzedzia.clickXY(942,1039);
        Narzedzia.clickXY(942,988);
        Thread.sleep(2000);
        Narzedzia.Kopiuj(mail);
        Narzedzia.clickXY(954,200);
        Narzedzia.Wklej();
        Narzedzia.clickXY(926,229);
        Narzedzia.clickXY(1026,285);
        Thread.sleep(8000);
        driver.quit();

    }

    public static void Walutomat(String mail, String adres, String kod, String miasto) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int plec = r.nextInt(2);
        Robot robot = new Robot();
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        }
        else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        driver.manage().window().maximize();
        driver.get("https://mirasbas.pl/zadanie/23/149ba14d0352f9133a371dca827148f1");

        Thread.sleep(8000);
        Kopiuj(mail);
        clickXY(1283,540);
        Thread.sleep(1000);
        Wklej();
        Kopiuj(mail+"V2");
        clickXY(1283,605);
        Thread.sleep(1000);
        Wklej();
        clickXY(1165,662);
        clickXY(1165,707);
        clickXY(1341,810);
        Thread.sleep(5000);

        //WP
        driver.get("http://poczta.wp.pl/");
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Walutomat.pl']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div[1]/nh-html-compile/div/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();

        Thread.sleep(7000);
        clickXY(955,450);
        Thread.sleep(3000);
        clickXY(765,306);
        Thread.sleep(2000);
        Kopiuj(imie);
        clickXY(780,392);
        Thread.sleep(1000);
        Wklej();
        Kopiuj(nazwisko);
        clickXY(1014,392);
        Thread.sleep(1000);
        Wklej();
        clickXY(835, 457);
        Thread.sleep(1000);
        clickXY(898,530);
        Thread.sleep(1000);
        clickXY(898,530);
        Thread.sleep(1000);
        clickXY(911,602);

        Kopiuj(adres);
        clickXY(780,716);
        Thread.sleep(1000);
        Wklej();
        Kopiuj(kod);
        clickXY(776,790);
        Thread.sleep(1000);
        Wklej();
        Kopiuj(miasto);
        clickXY(932,790);
        Thread.sleep(1000);
        Wklej();
        clickXY(1076,790);
        Thread.sleep(1000);
        clickXY(1103,867);
        Thread.sleep(1000);
        clickXY(944,1010);

        Thread.sleep(3000);
        robot.mouseMove(1912, 408);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(1912,712);
        Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        clickXY(774,364);
        clickXY(774,535);
        clickXY(774,742);
        clickXY(774,876);
        Thread.sleep(1000);
        clickXY(945,926);

        Thread.sleep(4000);
        clickXY(111,267);
        Thread.sleep(1000);
        clickXY(79,330);
        Thread.sleep(20000);
        clickXY(105,470);
        Thread.sleep(1000);
        clickXY(110,560);
        Thread.sleep(30000);
        driver.quit();

    }

    public static void Arkaida(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", "C:\\bot\\geckodriver\\geckodriver.exe");
        /*
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        */
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://mirasbas.pl/zadanie/11/149ba14d0352f9133a371dca827148f1");
//            driver.get("https://pl.westfield.com/arkadia/registration?destination=/arkadia/homepage");
            Thread.sleep(10000);
            Narzedzia.ArkadiaFF(driver, mail);
//            Narzedzia.potwierdzArkadia(driver,mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Galeria(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", "C:\\bot\\geckodriver\\geckodriver.exe");
        /*
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        */
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://mirasbas.pl/zadanie/12/149ba14d0352f9133a371dca827148f1");
//            driver.get("https://www.galeriamokotow.pl/registration");
            Thread.sleep(10000);
            Narzedzia.Galeria(driver, mail);
//            Narzedzia.potwierdzArkadia(driver,mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Wroclawia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", "C:\\bot\\geckodriver\\geckodriver.exe");
        /*
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        */
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://mirasbas.pl/zadanie/13/149ba14d0352f9133a371dca827148f1");
            Thread.sleep(10000);
            Narzedzia.Wroclavia(driver, mail);
//            Narzedzia.potwierdzArkadia(driver,mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }
    }

    public static void VeePee(String mail, String ulica, String miasto, String kod) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "C:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        char[] nazw = Narzedzia.nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwiskoo = new String(nazw);
        String numer = genNumer();
        boolean flaga = false;
        Robot robot = new Robot();
        driver.manage().window().maximize();
        try {
            driver.get("https://mirasbas.pl/zadanie/25/149ba14d0352f9133a371dca827148f1");

            Thread.sleep(10000);
            Kopiuj(mail);
            clickXY(453,450);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail+"V2");
            clickXY(453,495);
            Thread.sleep(1000);
            Wklej();
            clickXY(370,546);
            clickXY(370,575);
            Thread.sleep(1000);
            clickXY(453,684);

            Thread.sleep(10000);
            clickXY(380,104);
            Thread.sleep(1000);
            clickXY(412,233);

            Thread.sleep(6000);
            Kopiuj(imieZenskie[randomImie]);
            clickXY(1109,493);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwiskoo);
            clickXY(1109,535);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(ulica);
            clickXY(1109,632);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(miasto);
            clickXY(1109,680);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1109,724);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1109,770);
            Thread.sleep(1000);
            Wklej();
            clickXY(1109,823);
            Thread.sleep(10000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

        /*
        //WP
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
        //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Oferty']")).click();
        Thread.sleep(4000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Zlotewyprzedaze.pl']")).click();
                flaga = true;
            } catch (Exception e) {
                robot.keyPress(KeyEvent.VK_F5);
                Thread.sleep(15000);
            }
        }
        Thread.sleep(3000);
        Zmniejsz(1);
        Thread.sleep(1000);
        clickXY(966,983);Thread.sleep(3000);clickXY(966,983);clickXY(966,983);clickXY(966,983);
        clickXY(966,1033);
        Thread.sleep(40000);
        driver.quit();
        */
    }

    public static void Momondo() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int momondo = r.nextInt(2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://mirasbas.pl/zadanie/6/149ba14d0352f9133a371dca827148f1");

            Thread.sleep(5000);
            if (momondo == 0)
                Neworklead.MomondoSamochod(driver);
            else
                Neworklead.MomondoHotel(driver);

        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Pampers(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int m = 0;
        boolean flaga = false;
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String mies = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1995 - 1985 + 1) + 1987);
        String numer = String.valueOf(r.nextInt(70) + 1);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mirasbas.pl/zadanie/36/149ba14d0352f9133a371dca827148f1");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"start\"]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"1\"]/div[3]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"2\"]/div[3]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"3\"]/div[3]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"4\"]/div[3]")).click();

        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"email_field\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"name_field\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"agreements-content\"]/div[3]/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"agreements-content\"]/div[3]/div[2]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"agreements-content\"]/div[3]/div[3]/label/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]/span")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]/span")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"surname_field\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"street_field\"]")).sendKeys(ulica);
        driver.findElement(By.xpath("//*[@id=\"building_no_field\"]")).sendKeys(numer);
        driver.findElement(By.xpath("//*[@id=\"postal-1\"]")).sendKeys(kod1);
        driver.findElement(By.xpath("//*[@id=\"postal-2\"]")).sendKeys(kod2);
        driver.findElement(By.xpath("//*[@id=\"town_field\"]")).sendKeys(miasto);
        driver.findElement(By.xpath("//*[@id=\"select-day\"]")).sendKeys(dzien);
        driver.findElement(By.xpath("//*[@id=\"select-month\"]")).sendKeys(mies);
        driver.findElement(By.xpath("//*[@id=\"select-year\"]")).sendKeys(rok);
        driver.findElement(By.xpath("//*[@id=\"phone_field\"]")).sendKeys(tel);
        driver.findElement(By.xpath("//*[@id=\"type_card_field\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btn-next\"]")).click();

        Thread.sleep(5000);
//        try {
            driver.findElement(By.xpath("//*[@id=\"FYR_NEW2\"]/div[2]/div[4]/label/img")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"UBEZP_RODZAJ\"]/div[2]/div[5]/label")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"DZIECI_WIEK\"]/div[2]/div[5]/label")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"STATUS\"]/div[2]/div[4]/label")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"Internet_LTE_NEW\"]/div[2]/div[1]/label")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"SYTUACJA_MIESZKANIOWA\"]/div[2]/div[4]/label")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"UBEZP_NIERUCH\"]/div[2]/div[4]/label")).click();

//        } catch (Exception e) {
//            driver.findElement(By.xpath("//*[@id=\"poll_submit\"]")).click();
//        }
        Thread.sleep(7000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
        } catch (Exception e) {

        }
        Thread.sleep(3000);
        while (!flaga) {
            try {
                driver.get("https://poczta.wp.pl/k/#/mails/?label=1");
                try {
                    driver.findElement(By.xpath("//*[text()='Wesołe maluszki']")).click();
                } catch (Exception f) {
                    driver.get("https://poczta.wp.pl/k/#/mails/?label=5");
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Maluszki Pieluszki']")).click();
                }

                flaga = true;
                Thread.sleep(4000);
                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr[5]/td/a/img")).click();
                Thread.sleep(10000);
            } catch (Exception e) {
                driver.navigate().refresh();
                Thread.sleep(10000);
            }
            m++;
            if (m > 5) {
                break;
            }

        }
        driver.quit();
    }

    public static void Edison(String mail, String tel) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        String imie;
        String nazwisko;
        Random r = new Random();
        int plec = r.nextInt(2);
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mirasbas.pl/zadanie/51/149ba14d0352f9133a371dca827148f1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"Imię\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"Nazwisko\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"Numer telefonu\"]")).sendKeys(tel);
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div/div/div/form/div/label[5]/label/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div[3]/div/div/div/div/form/div/input")).click();
        Thread.sleep(7000);
        driver.quit();
    }

    public static void Newsletter(String mail) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        String imie;
        String nazwisko;
        Random r = new Random();
        int plec = r.nextInt(2);
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        String dane = imie+" "+nazwisko;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://mirasbas.pl/zadanie/59/149ba14d0352f9133a371dca827148f1");
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/main/article/div[2]/div/form/div[1]/input")).sendKeys(dane);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/main/article/div[2]/div/form/div[2]/input")).sendKeys(mail);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/main/article/div[2]/div/form/div[3]/label/input")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div/span[2]/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/main/article/div[2]/div/form/div[4]/input")).click();
            Thread.sleep(7000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Energia(String mail, String numer, String kod, String miasto) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        String imie;
        String nazwisko;
        Random r = new Random();
        int plec = r.nextInt(2);
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        String dane = imie + " " + nazwisko;
        String adres = kod + " " + miasto;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mirasbas.pl/zadanie/71/149ba14d0352f9133a371dca827148f1");
        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[1]/div[1]/img")).click();
        } catch (Exception e) {

        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"cn-accept-cookie\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div[1]/span/input")).sendKeys(dane);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div[2]/span/input")).sendKeys(numer);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div[3]/span/input")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div[4]/span/input")).sendKeys(adres);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div[5]/p/span[1]/span/span/label/span")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[2]/div[5]/p/span[2]/span/span/label/span")).click();
        Thread.sleep(1000);
        ScrollBy(driver,"700");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/p[2]/input")).click();
        Thread.sleep(10000);
        driver.quit();
    }

    public static void GData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mirasbas.pl/zadanie/74/149ba14d0352f9133a371dca827148f1");
        Thread.sleep(7000);
        driver.findElement(By.xpath("/html/body/div[1]/header/nav[1]/ul/li[4]/a")).click();
        Thread.sleep(3000);
        ScrollBy(driver,"800");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"trial-av\"]")).click();
        Thread.sleep(20000);
        driver.quit();
    }

    public static void Tauron(String mail, String numer) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        String imie;
        String nazwisko;
        Random r = new Random();
        int plec = r.nextInt(2);
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mirasbas.pl/zadanie/75/149ba14d0352f9133a371dca827148f1");
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[5]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/section[1]/div[5]/div[2]/input")).sendKeys("100");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/section[1]/div[10]/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/section[2]/div[2]/div[2]/div[1]/div[2]/label/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/section[2]/div[6]/div/button[2]")).click();
    }

    public static void Sky() throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "C:\\bot\\geckodriver\\geckodriver.exe");
        String[] panstwa = {"Irlandia","Wielka Brytania","Norwegia","Szwecja","Finlandia","Portugalia","Hiszpania","Andora","Francja","Holandia","Belgia","Luxemburg","Niemcy","Dania","Szwajcaria","Lichtenstein","Włochy","Monako","San Marino","Czechy","Słowacja","Austria","Węgry","Słowenia","Chorwacja","Albania","Macedonia","Bułgaria","Grecja","Estonia","Łotwa","Litwa","Białoruś","Ukraina","Rosja","Islandia"};
        Random r = new Random();
        int i = r.nextInt(panstwa.length-1);
        int dzien = r.nextInt(28);
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://mirasbas.pl/zadanie/5/149ba14d0352f9133a371dca827148f1");
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div[2]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fsc-destination-search\"]")).clear();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"fsc-destination-search\"]")).sendKeys(panstwa[i]);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
//        switch (dzien) {
//            case 0:
//                clickXY(890,834);
//                break;
//            case 1:
//                clickXY(930,834);
//                break;
//            case 2:
//                clickXY(973,834);
//                break;
//            case 3:
//                clickXY(1017,834);
//                break;
//            case 4:
//                clickXY(1060,834);
//                break;
//            case 5:
//                clickXY(1100,834);
//                break;
//            case 6:
//                clickXY(1143,834);
//                break;
//            //===============================
//            case 7:
//                clickXY(890,878);
//                break;
//            case 8:
//                clickXY(930,878);
//                break;
//            case 9:
//                clickXY(973,878);
//                break;
//            case 10:
//                clickXY(1017,878);
//                break;
//            case 11:
//                clickXY(1060,878);
//                break;
//            case 12:
//                clickXY(1100,878);
//                break;
//            case 13:
//                clickXY(1143,878);
//                break;
//            //=================================
//            case 14:
//                clickXY(890,920);
//                break;
//            case 15:
//                clickXY(930,920);
//                break;
//            case 16:
//                clickXY(973,920);
//                break;
//            case 17:
//                clickXY(1017,920);
//                break;
//            case 18:
//                clickXY(1060,920);
//                break;
//            case 19:
//                clickXY(1100,920);
//                break;
//            case 20:
//                clickXY(1143,920);
//                break;
//            //====================================
//            case 21:
//                clickXY(890,962);
//                break;
//            case 22:
//                clickXY(930,962);
//                break;
//            case 24:
//                clickXY(973,962);
//                break;
//            case 25:
//                clickXY(1017,962);
//                break;
//            case 26:
//                clickXY(1060,962);
//                break;
//            case 27:
//                clickXY(1100,962);
//                break;
//            case 28:
//                clickXY(1143,962);
//                break;
//        }

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div/div/form/div[3]/button")).click();

    }
}
