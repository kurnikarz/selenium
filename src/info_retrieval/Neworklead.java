package info_retrieval;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.attribute.standard.RequestingUserName;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Neworklead extends Narzedzia {

    public static void RankomatTravel(String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int kraje = r.nextInt(29);
        int cel = r.nextInt(4);
        int dzienPocz = r.nextInt(28 - 10 + 1) + 10;
        String dzienPocza = String.valueOf(dzienPocz);
        int dzienKoniec = r.nextInt(28) + 1;
        String dzienKonieca = String.valueOf(dzienKoniec);
        if (dzienKoniec < 10)
            dzienKonieca = "0" + dzienKonieca;
        if (dzienPocz < 10)
            dzienPocza = "0" + dzienPocz;
        String poczUbe = dzienPocza + "-" + "07" + "-" + "2019";
        String koniecUbe = dzienKonieca + "-" + "09" + "-" + "2019";
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
        driver.get("http://neworklead.elk.pl/action/3539/uid/122/");

        Thread.sleep(12000);
        Narzedzia.Zmniejsz(3);
        Thread.sleep(1000);
        Narzedzia.clickXY(1073, 809);

        Thread.sleep(10000);
        Narzedzia.clickXY(1292, 1017);
        Thread.sleep(1000);
        Narzedzia.clickXY(486, 575);
        Thread.sleep(8000);
        Narzedzia.clickXY(723, 426);
        Thread.sleep(1000);
        Narzedzia.clickXY(752, 673);
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
        Narzedzia.clickXY(1531, 562);
        Thread.sleep(1000);
        switch (cel) {
            case 0:
                Narzedzia.clickXY(728, 765);
                break;
            case 1:
                Narzedzia.clickXY(728, 892);
                break;
            case 2:
                Narzedzia.clickXY(866, 892);
                break;
            case 3:
                Narzedzia.clickXY(994, 892);
                break;
        }
        Thread.sleep(1000);
        Narzedzia.Zmniejsz(4);
        Thread.sleep(1000);
        Narzedzia.Kopiuj(poczUbe);
        Narzedzia.clickXY(848, 540);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(koniecUbe);
        Thread.sleep(1000);
        Narzedzia.Wklej();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        Narzedzia.clickXY(831, 671);
        Narzedzia.Kopiuj(dataUr);
        Narzedzia.clickXY(819, 701);
        Narzedzia.Wklej();
        Narzedzia.clickXY(819, 735);
        Thread.sleep(1000);
        Narzedzia.clickXY(967, 862);

        Thread.sleep(15000);
        Narzedzia.clickXY(1913, 1009);
        Narzedzia.clickXY(1913, 1009);
        Thread.sleep(1000);
        Narzedzia.clickXY(942, 1039);
        Narzedzia.clickXY(942, 988);
        Thread.sleep(2000);
        Narzedzia.Kopiuj(mail);
        Narzedzia.clickXY(954, 200);
        Narzedzia.Wklej();
        Narzedzia.clickXY(926, 229);
        Narzedzia.clickXY(1026, 285);
        Thread.sleep(8000);
        driver.quit();

    }

    public static void RankomatTravel2(String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int kraje = r.nextInt(29);
        int cel = r.nextInt(4);
        int dzienPocz = r.nextInt(28 - 10 + 1) + 10;
        String dzienPocza = String.valueOf(dzienPocz);
        int dzienKoniec = r.nextInt(28) + 1;
        String dzienKonieca = String.valueOf(dzienKoniec);
        if (dzienKoniec < 10)
            dzienKonieca = "0" + dzienKonieca;
        if (dzienPocz < 10)
            dzienPocza = "0" + dzienPocz;
        String poczUbe = dzienPocza + "-" + "07" + "-" + "2019";
        String koniecUbe = dzienKonieca + "-" + "09" + "-" + "2019";
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
        driver.get("http://neworklead.elk.pl/action/3550/uid/122/");

        Thread.sleep(6000);
        Narzedzia.Zmniejsz(3);
        Thread.sleep(1000);
        Narzedzia.clickXY(1264, 1004);

        Thread.sleep(10000);
        Narzedzia.clickXY(1292, 1017);
        Thread.sleep(1000);
        Narzedzia.clickXY(486, 575);
        Thread.sleep(8000);
        Narzedzia.clickXY(723, 426);
        Thread.sleep(1000);
        Narzedzia.clickXY(752, 673);
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
        Narzedzia.clickXY(1531, 562);
        Thread.sleep(1000);
        switch (cel) {
            case 0:
                Narzedzia.clickXY(728, 765);
                break;
            case 1:
                Narzedzia.clickXY(728, 892);
                break;
            case 2:
                Narzedzia.clickXY(866, 892);
                break;
            case 3:
                Narzedzia.clickXY(994, 892);
                break;
        }
        Thread.sleep(1000);
        Narzedzia.Zmniejsz(4);
        Thread.sleep(1000);
        Narzedzia.Kopiuj(poczUbe);
        Narzedzia.clickXY(848, 540);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(koniecUbe);
        Thread.sleep(1000);
        Narzedzia.Wklej();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        Narzedzia.clickXY(831, 671);
        Narzedzia.Kopiuj(dataUr);
        Narzedzia.clickXY(819, 701);
        Narzedzia.Wklej();
        Narzedzia.clickXY(819, 735);
        Thread.sleep(1000);
        Narzedzia.clickXY(967, 862);

        Thread.sleep(15000);
        Narzedzia.clickXY(1913, 1009);
        Narzedzia.clickXY(1913, 1009);
        Thread.sleep(1000);
        Narzedzia.clickXY(942, 1039);
        Narzedzia.clickXY(942, 988);
        Thread.sleep(2000);
        Narzedzia.Kopiuj(mail);
        Narzedzia.clickXY(954, 200);
        Narzedzia.Wklej();
        Narzedzia.clickXY(926, 229);
        Narzedzia.clickXY(1026, 285);
        Thread.sleep(8000);
        driver.quit();

    }

    public static void VeePeeDaszek(String mail, String ulica, String miasto, String kod) throws InterruptedException, AWTException {
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
            driver.get("http://neworklead.elk.pl/action/3770/uid/122/");

            Thread.sleep(10000);
            clickXY(696, 413);

            Thread.sleep(10000);
            Kopiuj(mail);
            clickXY(453, 450);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(453, 495);
            Thread.sleep(1000);
            Wklej();
            clickXY(370, 546);
            clickXY(370, 575);
            Thread.sleep(1000);
            clickXY(453, 684);

            Thread.sleep(10000);
            clickXY(380, 104);
            Thread.sleep(1000);
            clickXY(412, 233);

            Thread.sleep(6000);
            Kopiuj(imieZenskie[randomImie]);
            clickXY(1109, 493);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwiskoo);
            clickXY(1109, 535);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(ulica);
            clickXY(1109, 632);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(miasto);
            clickXY(1109, 680);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1109, 724);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1109, 770);
            Thread.sleep(1000);
            Wklej();
            clickXY(1109, 823);
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

    public static void VeePeeGwiazdka(String mail, String ulica, String miasto, String kod) throws InterruptedException, AWTException {
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
            driver.get("http://neworklead.elk.pl/action/3761/uid/122/");

            Thread.sleep(10000);
            Zmniejsz(1);
            Thread.sleep(1000);
            clickXY(1300, 1004);

            Thread.sleep(10000);
            Kopiuj(mail);
            clickXY(453, 450);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(453, 495);
            Thread.sleep(1000);
            Wklej();
            clickXY(370, 546);
            clickXY(370, 575);
            Thread.sleep(1000);
            clickXY(453, 684);

            Thread.sleep(10000);
            /*
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
            */
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

    public static void VeePeeStrzalki(String mail, String ulica, String miasto, String kod) throws InterruptedException, AWTException {
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
            driver.get("http://neworklead.elk.pl/action/3763/uid/122/");

            Thread.sleep(10000);
            Kopiuj(mail);
            clickXY(453, 450);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(453, 495);
            Thread.sleep(1000);
            Wklej();
            clickXY(370, 546);
            clickXY(370, 575);
            Thread.sleep(1000);
            clickXY(453, 684);

            Thread.sleep(10000);
            clickXY(380, 104);
            Thread.sleep(1000);
            clickXY(412, 233);

            Thread.sleep(6000);
            Kopiuj(imieZenskie[randomImie]);
            clickXY(1109, 493);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwiskoo);
            clickXY(1109, 535);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(ulica);
            clickXY(1109, 632);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(miasto);
            clickXY(1109, 680);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1109, 724);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1109, 770);
            Thread.sleep(1000);
            Wklej();
            clickXY(1109, 823);
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

    public static void VeePeeMalpa(String mail, String ulica, String miasto, String kod) throws InterruptedException, AWTException {
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
            driver.get("http://neworklead.elk.pl/action/3762/uid/122/");
            Thread.sleep(10000);
            Zmniejsz(1);
            Thread.sleep(1000);
            clickXY(1300, 990);

            Thread.sleep(10000);
            Kopiuj(mail);
            clickXY(453, 450);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(453, 495);
            Thread.sleep(1000);
            Wklej();
            clickXY(370, 546);
            clickXY(370, 575);
            Thread.sleep(1000);
            clickXY(453, 684);

            Thread.sleep(10000);
            clickXY(380, 104);
            Thread.sleep(1000);
            clickXY(412, 233);

            Thread.sleep(6000);
            Kopiuj(imieZenskie[randomImie]);
            clickXY(1109, 493);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwiskoo);
            clickXY(1109, 535);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(ulica);
            clickXY(1109, 632);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(miasto);
            clickXY(1109, 680);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1109, 724);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1109, 770);
            Thread.sleep(1000);
            Wklej();
            clickXY(1109, 823);
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

    public static void VeePeeHasz(String mail, String ulica, String miasto, String kod) throws InterruptedException, AWTException {
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
            driver.get("http://neworklead.elk.pl/action/3772/uid/122/");
            Thread.sleep(10000);
            Zmniejsz(4);
            Thread.sleep(1000);
            clickXY(1150, 882);

            Thread.sleep(10000);
            Kopiuj(mail);
            clickXY(453, 450);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(453, 495);
            Thread.sleep(1000);
            Wklej();
            clickXY(370, 546);
            clickXY(370, 575);
            Thread.sleep(1000);
            clickXY(453, 684);

            Thread.sleep(10000);
            clickXY(380, 104);
            Thread.sleep(1000);
            clickXY(412, 233);

            Thread.sleep(6000);
            Kopiuj(imieZenskie[randomImie]);
            clickXY(1109, 493);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwiskoo);
            clickXY(1109, 535);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(ulica);
            clickXY(1109, 632);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(miasto);
            clickXY(1109, 680);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1109, 724);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1109, 770);
            Thread.sleep(1000);
            Wklej();
            clickXY(1109, 823);
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
            driver.get("http://neworklead.elk.pl/action/3771/uid/122/");
            Thread.sleep(10000);
            Zmniejsz(2);
            Thread.sleep(1000);
            clickXY(983, 931);

            Thread.sleep(10000);
            Kopiuj(mail);
            clickXY(453, 450);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail + "V2");
            clickXY(453, 495);
            Thread.sleep(1000);
            Wklej();
            clickXY(370, 546);
            clickXY(370, 575);
            Thread.sleep(1000);
            clickXY(453, 684);

            Thread.sleep(10000);
            clickXY(380, 104);
            Thread.sleep(1000);
            clickXY(412, 233);

            Thread.sleep(6000);
            Kopiuj(imieZenskie[randomImie]);
            clickXY(1109, 493);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwiskoo);
            clickXY(1109, 535);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(ulica);
            clickXY(1109, 632);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(miasto);
            clickXY(1109, 680);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1109, 724);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(numer);
            clickXY(1109, 770);
            Thread.sleep(1000);
            Wklej();
            clickXY(1109, 823);
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

    public static void PotwierdzVee(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        boolean flaga = false;
        int m = 0;
        Robot robot = new Robot();

        try {
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Oferty']")).click();
            Thread.sleep(4000);
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Veepee']")).click();
                    Thread.sleep(3000);
                    Zmniejsz(1);
                    Thread.sleep(1000);
                    //clickXY(966,983);Thread.sleep(3000);clickXY(966,983);clickXY(966,983);clickXY(966,983);
                    clickXY(966, 983);
                    clickXY(966, 1033);
                    clickXY(984, 989);
                    Thread.sleep(10000);

                    clickXY(380, 104);
                    Thread.sleep(1000);
                    clickXY(412, 233);

                    Thread.sleep(30000);
                    driver.quit();
                    flaga = true;
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(10000);
                }
                m++;
                if (m == 12) {
                    driver.quit();
                    break;
                }
            }
        } catch (Exception f) {
            //driver.quit();
        }

    }

    public static void Galeria21(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
        String imiee = Narzedzia.imieZenskie[randomImie];
        Robot robot = new Robot();
        String nazwiskoo = new String(nazw);
        driver.manage().window().maximize();
        try {
            driver.get("http://neworklead.elk.pl/action/3856/uid/122/");
            Thread.sleep(10000);
            Zmniejsz(5);
            Thread.sleep(1000);
            clickXY(1908, 1026);
            Thread.sleep(1000);
            clickXY(955, 985);

            Thread.sleep(14000);
            clickXY(1895, 91);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_F5);
            Thread.sleep(8000);

            Narzedzia.clickXY(717, 300);  //plec
            Thread.sleep(500);
            Narzedzia.clickXY(744, 381);  //imie
            Narzedzia.Kopiuj(imiee);
            Thread.sleep(500);
            Narzedzia.Wklej();
            Thread.sleep(1000);
            Narzedzia.clickXY(1087, 381); //nazwisko
            Narzedzia.Kopiuj(nazwiskoo);
            Thread.sleep(500);
            Narzedzia.Wklej();
            Thread.sleep(1000);
            Narzedzia.clickXY(744, 467);  //mail
            Narzedzia.Kopiuj(mail);
            Thread.sleep(500);
            Narzedzia.Wklej();
            Thread.sleep(1000);
            Narzedzia.clickXY(1082, 467); //haslo
            Narzedzia.Kopiuj("Gres12");
            Thread.sleep(500);
            Narzedzia.Wklej();
            Narzedzia.Wklej();
            Narzedzia.Wklej();
            Thread.sleep(1000);
            Narzedzia.clickXY(669, 556);
            Narzedzia.Kopiuj(String.valueOf(dzien));
            Thread.sleep(500);
            Narzedzia.Wklej();
            Thread.sleep(1000);
            Narzedzia.clickXY(749, 556);
            Narzedzia.Kopiuj(String.valueOf(miesiac));
            Thread.sleep(500);
            Narzedzia.Wklej();
            Thread.sleep(1000);
            Narzedzia.clickXY(833, 556);
            Narzedzia.Kopiuj(String.valueOf(rok));
            Thread.sleep(500);
            Narzedzia.Wklej();
            Thread.sleep(1000);
            Narzedzia.clickXY(669, 713);
            Thread.sleep(1000);
            Narzedzia.clickXY(1913, 1040);
            Thread.sleep(1000);
            Narzedzia.clickXY(976, 981);
            Thread.sleep(10000);

            Narzedzia.clickXY(953, 374);
            Thread.sleep(3000);
            Narzedzia.clickXY(780, 480);
            Narzedzia.clickXY(860, 480);
            Narzedzia.clickXY(920, 480);
            Thread.sleep(13000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Limango(String mail) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        try {
            driver.get("http://neworklead.elk.pl/action/4306/uid/122/");
            Thread.sleep(15000);
            driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"register_form_email\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"reg\"]")).click();
            Thread.sleep(7000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[text()='Sklep limango.pl']")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()='Potwierdzam rejestrację i chcę otrzymywać newsletter']")).click();

            Thread.sleep(10000);
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"change_password_form_password_first\"]")).sendKeys(mail + "V2");
            driver.findElement(By.xpath("//*[@id=\"change_password_form_password_second\"]")).sendKeys(mail + "V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"change_password_form_save\"]")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[3]/div/a")).click();
            Thread.sleep(10000);
            clickXY(560, 956);
            Thread.sleep(5000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void VeePee(String mail) throws InterruptedException, AWTException {
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        try {
            driver.get("http://neworklead.elk.pl/action/4322/uid/122/");
            Thread.sleep(16000);

            try {
                driver.findElement(By.xpath("//*[@id=\"desktopRegisterWelcome\"]")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[1]/div/a/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"register-form-email\"]")).sendKeys(mail);
                driver.findElement(By.xpath("//*[@id=\"register-password\"]")).sendKeys(mail + "V2");
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[2]/form/div[3]/button/span")).click();
                Thread.sleep(20000);
                driver.quit();

            } catch (Exception e) {

                driver.findElement(By.xpath("//*[@id=\"register-form-email\"]")).sendKeys(mail);
                driver.findElement(By.xpath("//*[@id=\"register-password\"]")).sendKeys(mail + "V2");
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[3]/label/span[2]/span")).click();
                clickXY(79,650);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[4]/label/span[2]/span")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[6]/button/span")).click();
                Thread.sleep(20000);
                driver.quit();

            }
            } catch( Exception e )
        {
            driver.quit();
        }

}

    public static void VeePeeFa(String mail) throws InterruptedException, AWTException {
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        try {
            driver.get("http://neworklead.elk.pl/action/4303/uid/122/");
            Thread.sleep(16000);

            try {

                driver.findElement(By.xpath("//*[@id=\"desktopRegisterWelcome\"]")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[1]/div/a/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"register-form-email\"]")).sendKeys(mail);
                driver.findElement(By.xpath("//*[@id=\"register-password\"]")).sendKeys(mail + "V2");
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div[2]/form/div[3]/button/span")).click();
                Thread.sleep(20000);
                driver.quit();

            } catch (Exception e) {

                driver.findElement(By.xpath("//*[@id=\"register-form-email\"]")).sendKeys(mail);
                driver.findElement(By.xpath("//*[@id=\"register-password\"]")).sendKeys(mail + "V2");
                //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[3]/label/span[2]/span")).click();
                clickXY(79,650);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[4]/label/span[2]/span")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/form/div[6]/button/span")).click();
                Thread.sleep(20000);
                driver.quit();

            }
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Nestle(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int dziecko = r.nextInt(2);
        int plec = r.nextInt(2);
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(10 - 4 + 1) + 4;
        int rokUro = 2019;
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(3 - 1 + 1) + 1;
        int rokSpo = 2020;
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        String dzieckoUrodzone = String.valueOf(rokUro)+"-"+dodajZero(miesUro)+"-"+dodajZero(dzienUro);
        String dzieckoSpodziewane = String.valueOf(rokSpo)+"-"+dodajZero(miesSpo)+"-"+dodajZero(dzienSpo);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4319/uid/122/");
            Thread.sleep(20000);
            try {
                driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[2]/div/div/div")).click();
            } catch (Exception e) {
                clickXY(375,650);
                clickXY(375,650);
                clickXY(375,650);
            }
            Thread.sleep(6000);
            js.executeScript("window.scrollBy(0,700)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail+"V2");
            driver.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail+"V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[4]/div[15]/input")).click();
            Thread.sleep(6000);

            js.executeScript("window.scrollBy(0,-300)");
            Thread.sleep(1000);
            if (dziecko == 0) {
                if (plec == 0) {
                    driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
                    driver.findElement(By.xpath("//*[@id=\"gigya-textbox-121321499907850700_3\"]")).sendKeys(genImieZen());
                }
                else {
                    driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
                    driver.findElement(By.xpath("//*[@id=\"gigya-textbox-121321499907850700_3\"]")).sendKeys(genImieMes());
                }
                js.executeScript("document.getElementById(\"gigya-textbox-92124100465386450_7\").removeAttribute(\"readonly\")");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-92124100465386450_7\"]")).sendKeys(dzieckoUrodzone);
            }
            else {
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-99120253038303700_2\"]")).click();
                if (plec == 0)
                    driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
                else
                    driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
                js.executeScript("document.getElementById(\"gigya-textbox-3594631840390567_4\").removeAttribute(\"readonly\")");
                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-3594631840390567_4\"]")).sendKeys(dzieckoSpodziewane);
            }
            Thread.sleep(1000);
            clickXY(1090,521);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-109994828572319620\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[2]/div[1]/input")).click();
            Thread.sleep(6000);
            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Zdrowy Start w Przyszłość']")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//*[text()='Zweryfikuj adres e-mail']")).click();
                    Thread.sleep(10000);
                    flaga = true;
                    driver.quit();
                } catch (Exception e) {
                    robot.keyPress(KeyEvent.VK_F5);
                    Thread.sleep(10000);
                }
                m++;
                if (m == 4) {
                    driver.quit();
                    break;
                }

            }

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void NestleQuiz(String mail, String odp) throws InterruptedException, AWTException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int dziecko = r.nextInt(2);
        int plec = r.nextInt(2);
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(11 - 7 + 1) + 7;
        int rokUro = 2019;
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(3 - 1 + 1) + 1;
        int rokSpo = 2020;
        int odp1 = r.nextInt(3);
        int odp2 = r.nextInt(3);
        int odp3 = r.nextInt(3);
        int odp4 = r.nextInt(3);
        int odp5 = r.nextInt(3);
        String dzieckoUrodzone = String.valueOf(rokUro)+"-"+dodajZero(miesUro)+"-"+dodajZero(dzienUro);
        String dzieckoSpodziewane = String.valueOf(rokSpo)+"-"+dodajZero(miesSpo)+"-"+dodajZero(dzienSpo);
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
//        try {
            driver.get("http://neworklead.elk.pl/action/4267/uid/122/");
            Thread.sleep(20000);

            try {
                driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[2]/div/div/div")).click();
            } catch (Exception e) {
                clickXY(1400,830);
                clickXY(1400,830);
                clickXY(1400,830);
            }
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/header/div[2]/div/div[3]/div[2]/a")).click();
            Thread.sleep(10000);
            js.executeScript("window.scrollBy(0,700)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail+"V2");
            driver.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail+"V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[4]/div[15]/input")).click();
            Thread.sleep(6000);

            js.executeScript("window.scrollBy(0,-300)");
            Thread.sleep(1000);
            if (plec == 0) {
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-61880958754256200_6\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-121321499907850700_3\"]")).sendKeys(genImieZen());
            }
            else {
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-61880958754256200_5\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-121321499907850700_3\"]")).sendKeys(genImieMes());
            }
            js.executeScript("document.getElementById(\"gigya-textbox-92124100465386450_7\").removeAttribute(\"readonly\")");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-92124100465386450_7\"]")).sendKeys(dzieckoUrodzone);
            Thread.sleep(1000);
            clickXY(1090,521);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-109994828572319620\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[2]/div[1]/input")).click();
            Thread.sleep(6000);
            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Zdrowy Start w Przyszłość']")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()='Zweryfikuj adres e-mail']")).click();

            Thread.sleep(10000);
            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            driver.findElement(By.xpath("/html/body/div[3]/div[10]/div[2]/div/div/div/p[4]/a")).click();
            //clickXY(945,947);
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-16170711382206514\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"gigya-password-5606112194709380\"]")).sendKeys("Mamatata14");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[3]/div[11]/div[1]/div/div/div[2]/div/form/div[6]/div[4]/input")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("//*[@id=\"nav-home\"]")).click();
            Thread.sleep(7000);
            driver.findElement(By.xpath("/html/body/header/div[2]/div/a[2]/img")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--4\"]")).sendKeys("quiz");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--4\"]")).sendKeys(Keys.RETURN);
            Thread.sleep(6000);
            driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[2]/div[1]/div[2]/div/article/a/div/img")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[4]/div/div[2]/div/div/div/div/div[2]/p[3]/a")).click();
            Thread.sleep(7000);
            js.executeScript("window.scrollBy(0,1500)");
            Thread.sleep(1000);
            switch (odp1) {
                case 0:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[1]/div/div[1]/label")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[1]/div/div[2]/label")).click();
                    break;
                case 2:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[1]/div/div[3]/label")).click();
            }
            switch (odp2) {
                case 0:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[2]/div/div[1]/label")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[2]/div/div[2]/label")).click();
                    break;
                case 2:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[2]/div/div[3]/label")).click();
            }
            switch (odp3) {
                case 0:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[3]/div/div[1]/label")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[3]/div/div[2]/label")).click();
                    break;
                case 2:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[3]/div/div[3]/label")).click();
            }
            switch (odp4) {
                case 0:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[4]/div/div[1]/label")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[4]/div/div[2]/label")).click();
                    break;
                case 2:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[4]/div/div[3]/label")).click();
            }
            switch (odp5) {
                case 0:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[5]/div/div[1]/label")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[5]/div/div[2]/label")).click();
                    break;
                case 2:
                    driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[5]/div/div[3]/label")).click();
            }
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,300)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"edit-submitted-delikatne-kaszki-mleczno-ryzowe-nestle\"]")).sendKeys(odp);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[3]/article/div[4]/div/div[2]/div[2]/form/div/div[8]/p/input")).click();
            Thread.sleep(10000);
            driver.quit();


//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void Everyday(WebDriver driver, String mail, String kod, String ulica, String miasto, String odp) throws AWTException, IOException, InterruptedException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int miesiac = r.nextInt(12 - 2 + 1) + 2;
        int rok = r.nextInt(1995 - 1986 + 1) + 1986;
        int dzien = r.nextInt(29) + 1;
        int odp1 = r.nextInt(4);
        int odp2 = r.nextInt(4);
        int odp3 = r.nextInt(3);
        int odp4 = r.nextInt(4);
        int kupon1 = r.nextInt(2);
        int kupon2 = r.nextInt(4);
        int x = 1750;
        int m = 0;
        boolean cookie = false;
        Robot robot = new Robot();
        String roko = String.valueOf(rok);
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\bot\\niewykorzystaneEvery.txt", true));
        WebDriverWait wait = new WebDriverWait(driver, 60);

        //WebElement element = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div[5]/div[1]/div[2]/a"));
        //driver.get("https://www.everydayme.pl/konkurszimowy");
        try {
        zmienKarte(driver);
        Thread.sleep(3000);
        while (!cookie){
            try {
                driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
                cookie = true;
            } catch (Exception e){
                Thread.sleep(5000);
            }

            m++;
            if (m > 10)
                break;


        }
        Thread.sleep(3000);
        ScrollBy(driver, "1000");
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[4]/a[1]")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[4]/a[1]")).click();
        }
        Thread.sleep(10000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(1000);
        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/button"));
        while (!button.isEnabled()) {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/label")).click();
            Thread.sleep(2000);
        }
        button.click();

        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Kobieta \"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko);
        Select miesiacc = new Select(driver.findElement(By.xpath("//*[@id=\"dob\"]/select[1]")));
        miesiacc.selectByIndex(miesiac);
        Select rokk = new Select(driver.findElement(By.xpath("//*[@id=\"dob\"]/select[2]")));
        rokk.selectByValue(roko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"addressPostalCode\"]")).sendKeys(kod);
        driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys("Mamatata14");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)", "");
        try {
            driver.findElement(By.xpath("//*[@id=\" globalOpt_optStatus\"]")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("//*[@id=\" globalOpt_optStatus_1\"]")).click();
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/form/div[11]/button")).click();

        Thread.sleep(25000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"grs_account[shipping_addresses][0][line1]\"]")));
        driver.findElement(By.xpath("//*[@id=\"grs_account[shipping_addresses][0][line1]\"]")).sendKeys(ulica);
        driver.findElement(By.xpath("//*[@id=\"grs_account[shipping_addresses][0][postalarea]\"]")).sendKeys(kod);
        driver.findElement(By.xpath("//*[@id=\"grs_account[shipping_addresses][0][city]\"]")).sendKeys(miasto);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[6]/div/div/form/button")).click();
        Thread.sleep(10000);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[7]/a[2]")));
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[7]/a[2]")).click();
        } catch (Exception e) {
            clickXY(950, 824);
            clickXY(950, 910);
        }
        Thread.sleep(3000);
        switch (odp1) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[1]/div[1]/label[1]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[1]/div[1]/label[2]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[1]/div[1]/label[3]")).click();
                break;
            case 3:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[1]/div[1]/label[4]")).click();
                break;
        }
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[1]/div[2]/button")).click();
        Thread.sleep(2000);
        switch (odp2) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[2]/div[2]/label[1]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[2]/div[2]/label[2]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[2]/div[2]/label[3]")).click();
                break;
            case 3:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[2]/div[2]/label[4]")).click();
                break;

        }
        Thread.sleep(2000);
        switch (odp3) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[3]/div[2]/label[1]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[3]/div[2]/label[2]")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[3]/div[2]/label[3]")).click();
                break;
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/textarea")).sendKeys(odp);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"spq-form\"]/div[2]/div[4]/div[3]/button")).click();
        Thread.sleep(10000);
        ScrollBy(driver, "-700");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/div/div[1]/div/div[1]/ul/li[2]/a")).click();
        Thread.sleep(10000);
        Zmniejsz(5);
        Thread.sleep(1000);
        switch (kupon1) {
            case 0:
                clickXY(927, 920);
                break;
            case 1:
                clickXY(1225, 920);
                break;
        }
        Thread.sleep(20000);
        driver.quit();

        } catch (Exception e) {
            niewykorzystane.append(mail+"\r\n");
            niewykorzystane.close();
            driver.quit();
        }


    }

    public static void Everyday2(WebDriver driver, String mail) throws AWTException, IOException, InterruptedException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int miesiac = r.nextInt(12 - 2 + 1) + 2;
        int rok = r.nextInt(1995 - 1986 + 1) + 1986;
        int dzien = r.nextInt(29) + 1;
        int odp1 = r.nextInt(3);
        int odp2 = r.nextInt(2);
        int odp3 = r.nextInt(4);
        int odp4 = r.nextInt(4);
        int kupon1 = r.nextInt(2);
        int x = 1750;
        int m = 0;
        boolean cookie = false;
        Robot robot = new Robot();
        String roko = String.valueOf(rok);
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\bot\\niewykorzystaneEvery.txt", true));
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        //WebElement element = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div[5]/div[1]/div[2]/a"));
        //driver.get("https://www.everydayme.pl/konkurszimowy");
//        try {
        zmienKarte(driver);
        Thread.sleep(10000);
        while (!cookie){
            try {
                driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
                cookie = true;
            } catch (Exception e){
                Thread.sleep(5000);
            }

            m++;
            if (m > 20)
                break;


        }
        Thread.sleep(3000);
        ScrollBy(driver, "1000");
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[1]/div/div/form/div[3]/div/div/button[1]")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[1]/div/div/form/div[3]/div/div/button[1]")).click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"firstName\"]")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys("Mamatata14");
        Select dzie = new Select(driver.findElement(By.xpath("//*[@id=\"dob\"]/select[1]")));
        dzie.selectByIndex(dzien);
        Select mies = new Select(driver.findElement(By.xpath("//*[@id=\"dob\"]/select[2]")));
        mies.selectByIndex(miesiac);
        Select ro = new Select(driver.findElement(By.xpath("//*[@id=\"dob\"]/select[3]")));
        ro.selectByValue(roko);
        try {
            driver.findElement(By.xpath("//*[@id=\" globalOpt_optStatus_1\"]")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("//*[@id=\" globalOpt_optStatus\"]")).click();
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[1]/div/div/div[2]/div/div[2]/form/div[8]/button")).click();
        try {
            Thread.sleep(2000);
            driver.switchTo().frame(7);
            driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[1]/div[6]/button")).click();
            Thread.sleep(10000);
//            boolean solve = false;
            try {
//                while (!solve) {
                WebElement incorrect = driver.findElement(By.xpath("/html/body/div/div/div[1]"));
                driver.findElement(By.xpath("/html/body/div/div/div[7]/div[2]/div[1]/div[1]/div[6]/button")).click();
                Thread.sleep(5000);
//                    solve = true;
//                }
            } catch (Exception f) {

            }
        } catch (Exception e) {

        }
        Thread.sleep(30000);
        driver.quit();

//        } catch (Exception e) {
//            niewykorzystane.append(mail+"\r\n");
//            niewykorzystane.close();
//            driver.quit();
//        }


    }

    public static void EveryAg(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\bot\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-running-insecure-content");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("http://neworklead.elk.pl/action/5437/uid/122/");

        Thread.sleep(30000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void EveryIbnk(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\bot\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-running-insecure-content");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("http://neworklead.elk.pl/action/5419/uid/122/");
        Thread.sleep(10000);
        clickXY(880,343);

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Pampers(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4690/uid/122/");
            Thread.sleep(10000);
            clickXY(352,358);
            Thread.sleep(20000);

            Dodatkowy.Pampers(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Pampers2(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4691/uid/122/");
            Thread.sleep(20000);
            Dodatkowy.Pampers(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Pampers3(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4692/uid/122/");
            Thread.sleep(20000);
            Dodatkowy.Pampers(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Pampers4(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4693/uid/122/");
            Thread.sleep(20000);
            Dodatkowy.Pampers(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Rossman(String mail, String numer, String kod1, String kod2, String ulica) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Random r = new Random();
        boolean flaga = false;
        int plec = r.nextInt(1);
        String numerDomu = String.valueOf(r.nextInt(40) + 1);
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String miesiac = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1997 - 1977) + 1977);
        String imie;
        String nazwisko;
        if (plec == 0)
        {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

        try {
        driver.get("http://neworklead.elk.pl/action/4808/uid/122/");
        Thread.sleep(7000);
        if (plec == 0)
            driver.findElement(By.xpath("//*[@id=\"gender_female\"]")).click();
        else
            driver.findElement(By.xpath("//*[@id=\"gender_male\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys(kod1);
        driver.findElement(By.xpath("//*[@id=\"zipcode2\"]")).sendKeys(kod2);
        Thread.sleep(1000);
        try {
            Select miasto = new Select(driver.findElement(By.xpath("//*[@id=\"city\"]")));
            miasto.selectByIndex(1);
        } catch (Exception e){
            System.out.println(e);
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"street\"]")).sendKeys(ulica);
        driver.findElement(By.xpath("//*[@id=\"streetnr\"]")).sendKeys(numerDomu);
        driver.findElement(By.xpath("//*[@id=\"tel_number\"]")).sendKeys(numer);
        driver.findElement(By.xpath("//*[@id=\"dayofbirth\"]")).sendKeys(dzien);
        driver.findElement(By.xpath("//*[@id=\"monthofbirth\"]")).sendKeys(miesiac);
        driver.findElement(By.xpath("//*[@id=\"yearofbirth\"]")).sendKeys(rok);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit_reg_full\"]/h4")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"submit_form_layer\"]/h4/span[2]")).click();

        Thread.sleep(10000);
        try {
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_512\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_423\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_156\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select ubezpieczenie = new Select(driver.findElement(By.xpath("//*[@id=\"option_546\"]")));
            ubezpieczenie.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_577\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_542\"]/div/div[2]/div/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_573\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_575\"]/div/div[2]/div/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_571\"]/div/div[2]/div/div[3]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select telefon = new Select(driver.findElement(By.xpath("//*[@id=\"option_579\"]")));
            telefon.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_576\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_574\"]/div/div[2]/div/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select bank = new Select(driver.findElement(By.xpath("//*[@id=\"option_578\"]")));
            bank.selectByIndex(1);
            Thread.sleep(2000);
            Select telewizja = new Select(driver.findElement(By.xpath("//*[@id=\"option_570\"]")));
            telewizja.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_572\"]/div/div[2]/div/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        }

        Thread.sleep(5000);

        try {
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_560\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_562\"]/div/div[2]/div[1]/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_510\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_550\"]/div/div[2]/div[1]/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        }

        Thread.sleep(5000);
        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"folder-5\"]/div[2]")).click();
        Thread.sleep(3000);
        int m = 0;
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Piotr Dobrowolski']")).click();
                flaga = true;
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Potwierdzam email']")).click();

                Thread.sleep(3000);
                zmienKarte(driver);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                Thread.sleep(10000);

            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 13) {
                break;
            }
        }

            driver.quit();



        } catch (Exception e) {
            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"folder-5\"]/div[2]")).click();
            Thread.sleep(3000);
            int m = 0;
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Piotr Dobrowolski']")).click();
                    flaga = true;
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Potwierdzam email']")).click();

                    Thread.sleep(3000);
                    zmienKarte(driver);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                    Thread.sleep(10000);

                } catch (Exception f) {
                    clickXY(85, 52);
                    Thread.sleep(10000);
                }
                m++;
                if (m > 13) {
                    break;
                }
            }

            driver.quit();
        }



    }

    public static void HM(String mail, String numer, String kod1, String kod2, String ulica) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Random r = new Random();
        boolean flaga = false;
        int plec = r.nextInt(1);
        String numerDomu = String.valueOf(r.nextInt(40) + 1);
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String miesiac = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1997 - 1977) + 1977);
        String imie;
        String nazwisko;
        if (plec == 0)
        {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

        try {
        driver.get("http://neworklead.elk.pl/action/4809/uid/122/");
        Thread.sleep(7000);
        if (plec == 0)
            driver.findElement(By.xpath("//*[@id=\"gender_female\"]")).click();
        else
            driver.findElement(By.xpath("//*[@id=\"gender_male\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys(kod1);
        driver.findElement(By.xpath("//*[@id=\"zipcode2\"]")).sendKeys(kod2);
        Thread.sleep(1000);
        try {
            Select miasto = new Select(driver.findElement(By.xpath("//*[@id=\"city\"]")));
            miasto.selectByIndex(1);
        } catch (Exception e){
            System.out.println(e);
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"street\"]")).sendKeys(ulica);
        driver.findElement(By.xpath("//*[@id=\"streetnr\"]")).sendKeys(numerDomu);
        driver.findElement(By.xpath("//*[@id=\"tel_number\"]")).sendKeys(numer);
        driver.findElement(By.xpath("//*[@id=\"dayofbirth\"]")).sendKeys(dzien);
        driver.findElement(By.xpath("//*[@id=\"monthofbirth\"]")).sendKeys(miesiac);
        driver.findElement(By.xpath("//*[@id=\"yearofbirth\"]")).sendKeys(rok);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit_reg_full\"]/h4")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"submit_form_layer\"]/h4/span[2]")).click();

        Thread.sleep(10000);
        try {
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_512\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_423\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_156\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select ubezpieczenie = new Select(driver.findElement(By.xpath("//*[@id=\"option_546\"]")));
            ubezpieczenie.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_577\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_542\"]/div/div[2]/div/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_573\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_575\"]/div/div[2]/div/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_571\"]/div/div[2]/div/div[3]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select telefon = new Select(driver.findElement(By.xpath("//*[@id=\"option_579\"]")));
            telefon.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_576\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_574\"]/div/div[2]/div/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select bank = new Select(driver.findElement(By.xpath("//*[@id=\"option_578\"]")));
            bank.selectByIndex(1);
            Thread.sleep(2000);
            Select telewizja = new Select(driver.findElement(By.xpath("//*[@id=\"option_570\"]")));
            telewizja.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_572\"]/div/div[2]/div/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        }

        Thread.sleep(5000);

        try {
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_560\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_562\"]/div/div[2]/div[1]/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_510\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_550\"]/div/div[2]/div[1]/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        }

        Thread.sleep(5000);
        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"folder-5\"]/div[2]")).click();
        Thread.sleep(3000);
        int m = 0;
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Piotr Dobrowolski']")).click();
                flaga = true;
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Potwierdzam email']")).click();

                Thread.sleep(3000);
                zmienKarte(driver);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                Thread.sleep(10000);

            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 13) {
                break;
            }
        }

            driver.quit();



        } catch (Exception e) {
            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"folder-5\"]/div[2]")).click();
            Thread.sleep(3000);
            int m = 0;
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Piotr Dobrowolski']")).click();
                    flaga = true;
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Potwierdzam email']")).click();

                    Thread.sleep(3000);
                    zmienKarte(driver);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                    Thread.sleep(10000);

                } catch (Exception f) {
                    clickXY(85, 52);
                    Thread.sleep(10000);
                }
                m++;
                if (m > 13) {
                    break;
                }
            }

            driver.quit();
        }



    }

    public static void Ikea(String mail, String numer, String kod1, String kod2, String ulica) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Random r = new Random();
        boolean flaga = false;
        int plec = r.nextInt(1);
        String numerDomu = String.valueOf(r.nextInt(40) + 1);
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String miesiac = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1997 - 1977) + 1977);
        String imie;
        String nazwisko;
        if (plec == 0)
        {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

        try {
        driver.get("http://neworklead.elk.pl/action/4810/uid/122/");
        Thread.sleep(7000);
        if (plec == 0)
            driver.findElement(By.xpath("//*[@id=\"gender_female\"]")).click();
        else
            driver.findElement(By.xpath("//*[@id=\"gender_male\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys(kod1);
        driver.findElement(By.xpath("//*[@id=\"zipcode2\"]")).sendKeys(kod2);
        Thread.sleep(1000);
        try {
            Select miasto = new Select(driver.findElement(By.xpath("//*[@id=\"city\"]")));
            miasto.selectByIndex(1);
        } catch (Exception e){
            System.out.println(e);
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"street\"]")).sendKeys(ulica);
        driver.findElement(By.xpath("//*[@id=\"streetnr\"]")).sendKeys(numerDomu);
        driver.findElement(By.xpath("//*[@id=\"tel_number\"]")).sendKeys(numer);
        driver.findElement(By.xpath("//*[@id=\"dayofbirth\"]")).sendKeys(dzien);
        driver.findElement(By.xpath("//*[@id=\"monthofbirth\"]")).sendKeys(miesiac);
        driver.findElement(By.xpath("//*[@id=\"yearofbirth\"]")).sendKeys(rok);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit_reg_full\"]/h4")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"submit_form_layer\"]/h4/span[2]")).click();

        Thread.sleep(10000);
        try {
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_512\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_423\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_156\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select ubezpieczenie = new Select(driver.findElement(By.xpath("//*[@id=\"option_546\"]")));
            ubezpieczenie.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_577\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_542\"]/div/div[2]/div/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_573\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_575\"]/div/div[2]/div/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_571\"]/div/div[2]/div/div[3]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select telefon = new Select(driver.findElement(By.xpath("//*[@id=\"option_579\"]")));
            telefon.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_576\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_574\"]/div/div[2]/div/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            Select bank = new Select(driver.findElement(By.xpath("//*[@id=\"option_578\"]")));
            bank.selectByIndex(1);
            Thread.sleep(2000);
            Select telewizja = new Select(driver.findElement(By.xpath("//*[@id=\"option_570\"]")));
            telewizja.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_572\"]/div/div[2]/div/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        }

        Thread.sleep(5000);

        try {
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_560\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_562\"]/div/div[2]/div[1]/div[2]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_510\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"campaign_survey_550\"]/div/div[2]/div[1]/div[1]/div/div[2]/label/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
        }

        Thread.sleep(5000);
        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"folder-5\"]/div[2]")).click();
        Thread.sleep(3000);
        int m = 0;
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Piotr Dobrowolski']")).click();
                flaga = true;
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Potwierdzam email']")).click();

                Thread.sleep(3000);
                zmienKarte(driver);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                Thread.sleep(10000);

            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 5) {
                break;
            }
        }

            driver.quit();



        } catch (Exception e) {
            driver.quit();
        }



    }

    public static void Biedronka(String mail, String numer, String kod1, String kod2, String ulica) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Random r = new Random();
        boolean flaga = false;
        int plec = r.nextInt(1);
        String numerDomu = String.valueOf(r.nextInt(40) + 1);
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String miesiac = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1997 - 1977) + 1977);
        String imie;
        String nazwisko;
        if (plec == 0)
        {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

        try {
        driver.get("http://neworklead.elk.pl/action/4811/uid/122/");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"label_answer_2\"]")).click();
        Thread.sleep(3000);
        if (plec == 0)
            driver.findElement(By.xpath("//*[@id=\"label_gender_female\"]")).click();
        else
            driver.findElement(By.xpath("//*[@id=\"label_gender_male\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit_reg_half\"]/span")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"street\"]")).sendKeys(ulica);
        driver.findElement(By.xpath("//*[@id=\"streetnr\"]")).sendKeys(numerDomu);
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys(kod1);
        driver.findElement(By.xpath("//*[@id=\"zipcode2\"]")).sendKeys(kod2);
        Thread.sleep(1000);
        try {
            Select miasto = new Select(driver.findElement(By.xpath("//*[@id=\"city\"]")));
            miasto.selectByIndex(1);
        } catch (Exception e){
            System.out.println(e);
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"tel_number\"]")).sendKeys(numer);
        driver.findElement(By.xpath("//*[@id=\"dayofbirth\"]")).sendKeys(dzien);
        driver.findElement(By.xpath("//*[@id=\"monthofbirth\"]")).sendKeys(miesiac);
        driver.findElement(By.xpath("//*[@id=\"yearofbirth\"]")).sendKeys(rok);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit_reg_full\"]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"submit_form_layer\"]/h4/span[2]")).click();

            Thread.sleep(10000);
            try {
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_512\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_423\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_156\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                Select ubezpieczenie = new Select(driver.findElement(By.xpath("//*[@id=\"option_546\"]")));
                ubezpieczenie.selectByIndex(1);
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_577\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_542\"]/div/div[2]/div/div[2]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_573\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_575\"]/div/div[2]/div/div[1]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_571\"]/div/div[2]/div/div[3]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                Select telefon = new Select(driver.findElement(By.xpath("//*[@id=\"option_579\"]")));
                telefon.selectByIndex(1);
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_576\"]/div/div[2]/div/div[5]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_574\"]/div/div[2]/div/div[2]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                Select bank = new Select(driver.findElement(By.xpath("//*[@id=\"option_578\"]")));
                bank.selectByIndex(1);
                Thread.sleep(2000);
                Select telewizja = new Select(driver.findElement(By.xpath("//*[@id=\"option_570\"]")));
                telewizja.selectByIndex(1);
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_572\"]/div/div[2]/div/div[1]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
            } catch (Exception e){
                driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
            }

            Thread.sleep(5000);

            try {
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_560\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_562\"]/div/div[2]/div[1]/div[2]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_510\"]/div/div[2]/div/div[4]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"campaign_survey_550\"]/div/div[2]/div[1]/div[1]/div/div[2]/label/span")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
            } catch (Exception e) {
                driver.findElement(By.xpath("//*[@id=\"submit_multicoreg\"]")).click();
            }


        Thread.sleep(5000);
        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"folder-5\"]/div[2]")).click();
        Thread.sleep(3000);
        int m = 0;
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Magda Dobrowolska']")).click();
                flaga = true;
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Potwierdzam email']")).click();

                Thread.sleep(3000);
                zmienKarte(driver);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                Thread.sleep(10000);

            } catch (Exception e) {
                clickXY(85, 52);
                Thread.sleep(10000);
            }
            m++;
            if (m > 13) {
                break;
            }
        }

            driver.quit();


        
        } catch (Exception e) {
            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"folder-5\"]/div[2]")).click();
            Thread.sleep(3000);
            int m = 0;
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Magda Dobrowolska']")).click();
                    flaga = true;
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[text()='Potwierdzam email']")).click();

                    Thread.sleep(3000);
                    zmienKarte(driver);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                    Thread.sleep(10000);

                } catch (Exception f) {
                    clickXY(85, 52);
                    Thread.sleep(10000);
                }
                m++;
                if (m > 13) {
                    break;
                }
            }

            driver.quit();
        }
        


    }

    public static void MomondoSamochod(WebDriver driver) throws InterruptedException, AWTException {
        String[] panstwa = {"Irlandia","Wielka Brytania","Norwegia","Szwecja","Finlandia","Portugalia","Hiszpania","Andora","Francja","Holandia","Belgia","Luxemburg","Niemcy","Dania","Szwajcaria","Lichtenstein","Włochy","Monako","San Marino","Czechy","Słowacja","Austria","Węgry","Słowenia","Chorwacja","Albania","Macedonia","Bułgaria","Grecja","Estonia","Łotwa","Litwa","Białoruś","Ukraina","Rosja","Islandia"};
        Random r = new Random();
        int i = r.nextInt(panstwa.length-1);
        Robot robot = new Robot();

        Thread.sleep(15000);
        zmienKarte(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Akceptuj']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div/div[2]/div/nav/ul/li[3]/a/span[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[1]/div[2]/form/div[1]/div[1]/div/div[1]/input")).sendKeys(panstwa[i]);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[1]/div[2]/form/div[2]/button/span")).click();

        Thread.sleep(20000);
        zmienKarte(driver);
        Thread.sleep(1000);
        try {
            var buttons = driver.findElements(By.xpath("//*[text()='Zobacz ofertę']"));
            int button = r.nextInt(buttons.size());
            buttons.get(button).click();
        } catch (Exception e){
            System.out.println("NIE BYŁO");
        }

        Thread.sleep(30000);
        driver.quit();

    }

    public static void MomondoHotel(WebDriver driver) throws InterruptedException, AWTException {
        String[] panstwa = {"Irlandia","Wielka Brytania","Norwegia","Szwecja","Finlandia","Portugalia","Hiszpania","Andora","Francja","Holandia","Belgia","Luxemburg","Niemcy","Dania","Szwajcaria","Lichtenstein","Włochy","Monako","San Marino","Czechy","Słowacja","Austria","Węgry","Słowenia","Chorwacja","Albania","Macedonia","Bułgaria","Grecja","Estonia","Łotwa","Litwa","Białoruś","Ukraina","Rosja","Islandia"};
        Random r = new Random();
        int i = r.nextInt(panstwa.length-1);
        Robot robot = new Robot();

        Thread.sleep(15000);
        zmienKarte(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Akceptuj']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div/div[2]/div/nav/ul/li[2]/a/span[2]")).click();
        Thread.sleep(5000);
        Kopiuj(panstwa[i]);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[1]/form/div[2]/div[1]/div/div[1]/div")).click();
        Thread.sleep(1000);
        Wklej();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[1]/form/div[2]/div[2]/div/button/span")).click();

        Thread.sleep(20000);
        zmienKarte(driver);
        Thread.sleep(1000);
        try {
            var buttons = driver.findElements(By.xpath("//*[text()='Zobacz ofertę']"));
            int button = r.nextInt(buttons.size());
            buttons.get(button).click();
        } catch (Exception e){
            System.out.println("NIE BYŁO");
        }

        Thread.sleep(30000);
        driver.quit();

    }

    public static void MomondoSamolot(WebDriver driver) throws InterruptedException, AWTException {
        String[] panstwa = {"Irlandia","Wielka Brytania","Norwegia","Szwecja","Finlandia","Portugalia","Hiszpania","Andora","Francja","Holandia","Belgia","Luxemburg","Niemcy","Dania","Szwajcaria","Lichtenstein","Włochy","Monako","San Marino","Czechy","Słowacja","Austria","Węgry","Słowenia","Chorwacja","Albania","Macedonia","Bułgaria","Grecja","Estonia","Łotwa","Litwa","Białoruś","Ukraina","Rosja","Islandia"};
        Random r = new Random();
        int i = r.nextInt(panstwa.length-1);
        Robot robot = new Robot();

        Thread.sleep(15000);
        zmienKarte(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[9]/div/div[3]/div/div/div/div/div[1]/div/div[2]/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div/div[2]/div/nav/ul/li[1]/a/span[2]")).click();
        Thread.sleep(5000);
        Kopiuj(panstwa[i]);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[3]/div/div/div")).click();
        Thread.sleep(1000);
        Wklej();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/section[2]/div/div/div[2]/form[1]/div[1]/div/div[2]/button/span")).click();

        Thread.sleep(20000);
        zmienKarte(driver);
        Thread.sleep(1000);
        try {
            //try {
            driver.findElement(By.xpath("/html/body/div[46]/div[3]/div/div/div/button")).click();
            Thread.sleep(2000);
            var buttons = driver.findElements(By.xpath("//*[text()='Zobacz ofertę']"));
            int button = r.nextInt(buttons.size());
            buttons.get(button).click();
            /*
        } catch (Exception e){
            System.out.println("NIE BYŁO");
        }

             */
        } catch (Exception f){
            driver.findElement(By.xpath("/html/body/div[46]/div[3]/div/div/div/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[3]/div/div/div[1]/button/div/div[1]/div[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Sprawdź ceny lotów']")).click();
            Thread.sleep(7000);
            zmienKarte(driver);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[46]/div[3]/div/div/div/button")).click();
            Thread.sleep(2000);
            //try {
            var buttons = driver.findElements(By.xpath("//*[text()='Zobacz ofertę']"));
            int button = r.nextInt(buttons.size());
            buttons.get(button).click();
            /*
        } catch (Exception e){
            System.out.println("NIE BYŁO");
        }
            */
        }


        Thread.sleep(30000);
        driver.quit();

    }

    public static void Momondo22() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4922/uid/122/");
            Thread.sleep(5000);
            clickXY(790,466);
            MomondoHotel(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo24() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4924/uid/122/");
            Thread.sleep(5000);
            clickXY(790,466);
            MomondoSamolot(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo27() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4927/uid/122/");
            Thread.sleep(5000);
            clickXY(525,460);
            MomondoHotel(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo6() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //PRZETESTOWAĆ!
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4926/uid/122/");
            Thread.sleep(500000);
            clickXY(525,460);
            MomondoSamochod(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo29() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //try {
            driver.get("http://neworklead.elk.pl/action/4929/uid/122/");
            Thread.sleep(5000);
            clickXY(525,460);
            MomondoSamolot(driver);
            /*
        } catch (Exception e){
            driver.quit();
        }


             */
    }

    public static void Momondo8() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4930/uid/122/");
            Thread.sleep(5000);
            clickXY(835,482);
            MomondoSamochod(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo33() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4933/uid/122/");
            Thread.sleep(5000);
            clickXY(835,482);
            MomondoSamolot(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo31() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4931/uid/122/");
            Thread.sleep(5000);
            clickXY(835,482);
            MomondoHotel(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo30() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4930/uid/122/");
            Thread.sleep(5000);
            clickXY(835,482);
            MomondoSamochod(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo19() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4919/uid/122/");
            Thread.sleep(5000);
            clickXY(1000,500);
            MomondoSamolot(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo87() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4887/uid/122/");
            Thread.sleep(5000);
            clickXY(1000,500);
            MomondoHotel(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo94() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4894/uid/122/");
            Thread.sleep(5000);
            clickXY(1000,500);
            MomondoSamochod(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Momondo32() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4932/uid/122/");
            Thread.sleep(5000);
            clickXY(840,484);
            MomondoSamochod(driver);
        } catch (Exception e){
            driver.quit();
        }

    }

    public static void Samsung(WebDriver driver, String mail) throws InterruptedException, AWTException, IOException {
        Random r = new Random();
        int plec = r.nextInt(2);
        int wybor1 = r.nextInt(5) + 1;
        int wybor2 = r.nextInt(7 - 3 + 1) + 3;
        String imie = null;
        String nazwisko = null;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        Robot robot = new Robot();
        driver.manage().window().maximize();


//        try {
        Thread.sleep(2000);
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nextClick\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"datacapture_form\"]/div/div[5]/div/div/div/label/span[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nextClick\"]")).click();

        Thread.sleep(2000);
        Select wybierz = new Select(driver.findElement(By.xpath("//*[@id=\"q1\"]")));
        wybierz.selectByIndex(wybor1);
        Thread.sleep(1000);
        Select wybierz2 = new Select(driver.findElement(By.xpath("//*[@id=\"q2\"]")));
        wybierz2.selectByIndex(wybor2);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nextClick\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"datacapture_form\"]/div/div[8]/div/div/div/label/span[2]")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
        Thread.sleep(3000);
        clickXY(444,477);
        Thread.sleep(6000);
        clickXY(760,678);
        Thread.sleep(8000);

//            //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
//            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
        } catch (Exception e) {

        }
        Thread.sleep(3000);
        driver.get("https://poczta.wp.pl/k/#/mails/?label=152");
        Thread.sleep(3000);
        boolean flaga = false;
        int m = 0;
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Samsung']")).click();
                Thread.sleep(4000);
                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/center/div/table[3]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td/a")).click();
                Thread.sleep(3000);
                zmienKarte(driver);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                Thread.sleep(5000);
                flaga = true;
            } catch (Exception e) {
                driver.navigate().refresh();
                Thread.sleep(10000);
            }
            m++;
            if (m > 4) {
                break;
            }

        }
        driver.quit();
//
//        } catch (Exception f) {
//            driver.quit();
//        }

    }

    public static void Cpc(String linkCuk, String linkSamsung) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int wybor = 5;//r.nextInt(10);
        WebDriver driver[] = new ChromeDriver[2];
        for (int i = 1; i< driver.length; i++){
            WebDriver driver1 = new ChromeDriver();
            driver[i] = driver1;
        }

        try {
            //driver[0].manage().window().maximize();
            driver[1].manage().window().maximize();
            //driver[0].get(linkCuk); //CUK
            driver[1].get("http://neworklead.elk.pl/action/5170/uid/122/"); //SAMSUNG PRESALE G
            Thread.sleep(10000);
        /*
        for (int i=0;i<6;i++){
            ScrollBy(driver[0], "3000");
            Thread.sleep(1000);
        }
        */
            try {
                driver[1].findElement(By.xpath("//*[@id=\"truste-consent-button\"]")).click();
            } catch (Exception e){

            }
            Thread.sleep(3000);
            clickXY(1871,148);
            Thread.sleep(3000);
            driver[1].findElement(By.xpath("//*[@id=\"odkup\"]/div/div/div[1]/div/div/a[1]")).click();
            Thread.sleep(10000);
            zmienKarte(driver[1]);
            Thread.sleep(1000);
            driver[1].findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div[1]/div/div[1]/div[4]/a")).click();
            Thread.sleep(10000);
            zmienKarte(driver[1]);
            Thread.sleep(1000);
            driver[1].findElement(By.xpath("//*[@id=\"odkup\"]/div/div/div[1]/div/div/a[1]")).click();
            Thread.sleep(10000);
            zmienKarte(driver[1]);
            Thread.sleep(1000);
            clickXY(1871,148);
            //if (wybor == 5){
        /*
            driver[1].findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/div/div/section/div/div[5]/div[2]/div[2]/div[1]/div/div[1]/a")).click();
            Thread.sleep(10000);
            clickXY(912,880);
            Thread.sleep(2000);
            clickXY(893,592);

         */
            //} else {
            driver[1].findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/div/div/section/div/div[2]/div[3]/div[2]/ul/li[1]/div[1]/label/span[2]/span/span/span[2]")).click();
            Thread.sleep(5000);
            clickXY(682,723);
            //driver[1].findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div/div[2]/div/div[2]/button/span")).click();
            Thread.sleep(3000);
            driver[1].findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div/div[2]/div/div[2]/button")).click();
            Thread.sleep(5000);
            driver[1].findElement(By.xpath("//*[@id=\"content__addon\"]/div/div[2]/div[1]/div/div/div/div[2]/div/a")).click();
            Thread.sleep(5000);
            driver[1].findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div/div[2]/div/div/div[3]/div/a")).click();
            Thread.sleep(6000);
            driver[1].findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div/div[1]/div[1]/div[1]/div/button/i")).click();
            //}

            Thread.sleep(80000);
            //driver[0].quit();
            driver[1].quit();

        } catch (Exception e){
            Thread.sleep(120000);
            driver[1].quit();
        }

    }

    public static void Cola(WebDriver driver, String mail) throws InterruptedException {
        Random r = new Random();
        int plec = r.nextInt(2);
        int dzien = r.nextInt(29)+1;
        int miesiac = r.nextInt(11)+1;
        int rok = r.nextInt(1994 - 1980 + 1) + 1980;
        int kupon = r.nextInt(2);
        boolean flaga = false;
        boolean flaga2 = false;
        boolean flaga3 = false;
        int m = 0;
        int n = 0;
        int k = 0;
        String imie = null;
        String nazwisko = null;
        if (plec == 0){
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

//        try {
            driver.manage().window().maximize();
            Thread.sleep(20000);
            zmienKarte(driver);
            Thread.sleep(1000);

            while (!flaga2) {
                try {
                    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
                    flaga2 = true;
                } catch (Exception e) {
                    Thread.sleep(5000);
                }
                if (n == 4){
                    break;
                }
                n++;
            }
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[6]/div/div[1]/span/a/button/span")).click();
            Thread.sleep(7000);
            driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[9]/div/div/div[1]/p/a/u")).click();
            Thread.sleep(7000);
            while (!flaga3) {
                try {
                    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(imie);
                    driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko);
                    driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
                    driver.findElement(By.xpath("//*[@id=\"birthdate_day\"]")).sendKeys(String.valueOf(dzien));
                    driver.findElement(By.xpath("//*[@id=\"birthdate_month\"]")).sendKeys(String.valueOf(miesiac));
                    driver.findElement(By.xpath("//*[@id=\"birthdate_year\"]")).sendKeys(String.valueOf(rok));
                    driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys(mail+"V2");
                    driver.findElement(By.xpath("//*[@id=\"newPasswordConfirm\"]")).sendKeys(mail+"V2");
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[8]/label/span")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[9]/label/span")).click();
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[10]/label/span")).click();
                    Thread.sleep(1000);
                    driver.switchTo().frame(0);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]")).click();
                    Thread.sleep(5000);
                    for (int i=0;i<5;i++){
                        clickXY(779,808);
                        Thread.sleep(3000);
                    }
                    driver.switchTo().defaultContent();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/button")).click();
                    Thread.sleep(10000);
                    flaga3 = true;
                } catch (Exception e){
                    driver.navigate().refresh();
                    Thread.sleep(6000);
                }
                if (k == 10){
                    break;
                }
                k++;
            }


            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);       //*[@id="nh-modal"]/div/div[2]/div/div/div/button
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
            Thread.sleep(10000);
            while (!flaga) {
                try {
                    try {
                        driver.findElement(By.xpath("//*[@id=\"nh-modal\"]/div/div[2]/div/div/div/div/button")).click();
                        Thread.sleep(3000);
                    } catch (Exception e){
                    }
                    driver.findElement(By.xpath("//*[text()='Prośba o aktywację konta']")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("/html/body/div/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/center/div[2]/table[2]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a")).click();
                    Thread.sleep(10000);
                    zmienKarte(driver);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"signInEmailAddress\"]")).sendKeys(mail);
                    driver.findElement(By.xpath("//*[@id=\"currentPassword\"]")).sendKeys(mail+"V2");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[7]/span/div/div[1]/form/button")).click();
                    Thread.sleep(10000);
                    if (kupon == 0){
                        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[8]/div/div[1]/form/button")).click();
                        Thread.sleep(5000);
                    }
                    flaga = true;
                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(10000);
                }
                if (m == 5) {
                    break;
                }
                m++;
            }
            driver.quit();
/*
        } catch (Exception e){
            driver.quit();
        }


 */





    }

    public static void ColaCon(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://neworklead.elk.pl/action/5423/uid/122/");
        Cola(driver,mail);
    }

    public static void Cola2CC(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://neworklead.elk.pl/action/5424/uid/122/");
        Cola(driver,mail);
    }

    public static void ColaDeb(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://neworklead.elk.pl/action/5425/uid/122/");
        Cola(driver,mail);
    }

    public static void Every1(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:bot\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-running-insecure-content");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/ab886c17d48bb0dbd8fd894a6c05ae89/9979f5fe642390094bd380258035c139/d654be842d14f320ad92ef039fb6aa4c");

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Every2(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\bot\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-running-insecure-content");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/d64986704bbe84edf3772bc467e974cc/3981dac1410407404f36ee3abb8eac61/d654be842d14f320ad92ef039fb6aa4c");

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void EveryAga(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:bot\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-running-insecure-content");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/544dbb011400480fd39a8c701d0ed41a/c274dd993973bc54d01b8649377276d8/d654be842d14f320ad92ef039fb6aa4c");

        Thread.sleep(25000);
        Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
        Thread.sleep(1000);

    }

    public static void Nestle(WebDriver driver, String mail) throws InterruptedException, AWTException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int dziecko = r.nextInt(2);
        int plec = r.nextInt(2);
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(10 - 1 + 1) + 1;
        int rokUro = 2020;
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(6 - 1 + 1) + 1;
        int rokSpo = 2021;
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        String dzieckoUrodzone = String.valueOf(rokUro) + "-" + dodajZero(miesUro) + "-" + dodajZero(dzienUro);
        String dzieckoSpodziewane = String.valueOf(rokSpo) + "-" + dodajZero(miesSpo) + "-" + dodajZero(dzienSpo);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver,10000);

        try {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"dev-popin\"]/div/div[2]/div/div/div[2]/div/div/div"))));
        driver.findElement(By.xpath("//*[@id=\"dev-popin\"]/div/div[2]/div/div/div[2]/div/div/div")).click();
        Thread.sleep(10000);
        Zmniejsz(2);
        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail + "V2");
        driver.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail + "V2");
        Thread.sleep(1000);
        ScrollBy(driver,"700");
        try {
            driver.findElement(By.xpath("//*[@id=\"_evh-ric-c\"]")).click();
        } catch (Exception e) {

        }

        if (dziecko == 0) {
            if (plec == 0) {
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-135031870266671040_8\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-151298633113062270_4\"]")).sendKeys(genImieZen());
            } else {
                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-151298633113062270_4\"]")).sendKeys(genImieMes());
            }
            js.executeScript("document.getElementById(\"gigya-textbox-65513374974246824_9\").removeAttribute(\"readonly\")");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-65513374974246824_9\"]")).sendKeys(dzieckoUrodzone);

            clickXY(1090, 521);
            Thread.sleep(1000);
            clickXY(362,385);
            clickXY(605,670);
        } else {
            driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-87599078661341020_3\"]")).click();
            Thread.sleep(1000);
            if (plec == 0)
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-135031870266671040_7\"]")).click();
            else
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-135031870266671040_8\"]")).click();
            js.executeScript("document.getElementById(\"gigya-textbox-153337984387971650_5\").removeAttribute(\"readonly\")");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-153337984387971650_5\"]")).sendKeys(dzieckoSpodziewane);

            clickXY(1090, 521);
            Thread.sleep(1000);
            clickXY(362,317);
            clickXY(605,605);
        }

        Thread.sleep(5000);


        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
        Thread.sleep(10000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/button")).click();
            } catch (Exception e){
                try {
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/button")).click();
                } catch (Exception f) {
                    try {
                        driver.findElement(By.xpath("/div/div[2]/div/div/div/div/button")).click();
                    } catch (Exception g) {

                    }
                }
            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[text()='Nestlé Baby&me']")).click();
                Thread.sleep(4000);
                ScrollBy(driver,"400");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[text()='Zweryfikuj adres e-mail']")).click();
//                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td[4]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[13]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/a']")).click();
                Thread.sleep(10000);
                flaga = true;
            } catch (Exception e) {
                driver.navigate().refresh();
                Thread.sleep(5000);
            }
            m++;
            if (m > 4) {
                break;
            }

        }
        } catch (Exception e) {
            driver.quit();
        }



    }

    public static void NestleM2B(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
        driver.get("https://neworklead.pl/zadanie/9c28bd0c4260364e48e724610641b267/ea6eac2c6549f21b8b8edc99328f7fa3/d654be842d14f320ad92ef039fb6aa4c");
//            driver.get("https://www.zdrowystartwprzyszlosc.pl/user/register");
        Thread.sleep(5000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        Thread.sleep(1000);
        Nestle(driver, mail);
        Thread.sleep(3000);
        driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void NestleDC(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
        driver.get("https://neworklead.pl/zadanie/384fbc853edf07b2907b023bd8b1915d/145a8ea5008607a8b5ba69b7b96af883/d654be842d14f320ad92ef039fb6aa4c");
//            driver.get("https://www.zdrowystartwprzyszlosc.pl/user/register");
        Thread.sleep(5000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        Thread.sleep(1000);
        Nestle(driver, mail);
        Thread.sleep(3000);
        driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void NestleTAR(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

//        try {
        driver.get("https://neworklead.pl/zadanie/4f461c0912a0f6bdd24df4c6d7419de3/efea389a3f1e8db7e1560f1a309e4ed0/d654be842d14f320ad92ef039fb6aa4c");
//            driver.get("https://www.zdrowystartwprzyszlosc.pl/user/register");
        Thread.sleep(5000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        Thread.sleep(1000);
        Nestle(driver, mail);
        Thread.sleep(3000);
        driver.quit();

//        } catch (Exception e) {
//            driver.quit();
//        }


    }

    public static void EveryTar(String mail, String kod, String ulica, String miasto, String odp) throws AWTException, InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\bot\\niewykorzystaneEvery.txt", true));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-running-insecure-content");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
            driver.get("https://neworklead.pl/zadanie/efa8f23c27110a4797cc2870fbbcda3c/721d330d9f5a88415c8aa24bc5eae235/d654be842d14f320ad92ef039fb6aa4c");

            Thread.sleep(25000);
            Neworklead.Everyday(driver, mail, kod, ulica, miasto, odp);
            Thread.sleep(1000);
        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Enfamil2(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(10) + 1;
        String rokUro = "2020";
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(2) + 1;
        String rokSpo = "2021";
        int dziecko = r.nextInt(2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/60134c33909dfa0d1a75d288fa6bc489/a156cbbb890c0f32f53e6c81018299fc/d654be842d14f320ad92ef039fb6aa4c");

        Thread.sleep(8000);
        zmienKarte(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"_evidon-accept-button\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"field_enroll_first_name\"]")).sendKeys(genImieZen());
        driver.findElement(By.xpath("//*[@id=\"field_enroll_last_name\"]")).sendKeys(genNazwiskoZen());
        driver.findElement(By.xpath("//*[@id=\"field_enroll_email_address\"]")).sendKeys(mail);
        Select dzien = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_day\"]")));
        Select mies = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_month\"]")));
        Select rok = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_year\"]")));
        if (dziecko == 0) {
            dzien.selectByIndex(dzienSpo);
            mies.selectByIndex(miesSpo);
            rok.selectByValue(rokSpo);
        }
        else {
            dzien.selectByIndex(dzienUro);
            mies.selectByIndex(miesUro);
            rok.selectByValue(rokUro);
        }
        driver.findElement(By.xpath("//*[@id=\"field_enroll_agree_terms_personalised_optin\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
        Thread.sleep(6000);
        driver.quit();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void Enfamil(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(10) + 1;
        String rokUro = "2020";
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(2) + 1;
        String rokSpo = "2021";
        int dziecko = r.nextInt(2);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/5e986a588742bd2d47e93a72633eae33/c17cb813f647055ca39ddd6a6567cc15/d654be842d14f320ad92ef039fb6aa4c");

        Thread.sleep(8000);
        clickXY(400,343);
        Thread.sleep(8000);
        zmienKarte(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"_evidon-accept-button\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"field_enroll_first_name\"]")).sendKeys(genImieZen());
        driver.findElement(By.xpath("//*[@id=\"field_enroll_last_name\"]")).sendKeys(genNazwiskoZen());
        driver.findElement(By.xpath("//*[@id=\"field_enroll_email_address\"]")).sendKeys(mail);
        Select dzien = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_day\"]")));
        Select mies = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_month\"]")));
        Select rok = new Select(driver.findElement(By.xpath("//*[@id=\"field_enroll_date_of_birth_year\"]")));
        if (dziecko == 0) {
            dzien.selectByIndex(dzienSpo);
            mies.selectByIndex(miesSpo);
            rok.selectByValue(rokSpo);
        }
        else {
            dzien.selectByIndex(dzienUro);
            mies.selectByIndex(miesUro);
            rok.selectByValue(rokUro);
        }
        driver.findElement(By.xpath("//*[@id=\"field_enroll_agree_terms_personalised_optin\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
        Thread.sleep(6000);
        driver.quit();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }


    public static void Przepis(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/edefbb40bb96a35b2bd3fe75dd5c4543/f37f4e53ed27c445e53be3f527668206/d654be842d14f320ad92ef039fb6aa4c");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"))));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        Thread.sleep(2000);
        try {
            PrzepisPopup(driver);
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[1]/div[1]/input")).click();
            PrzepisPopup(driver);
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[2]/div[1]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[1]")).sendKeys(genImieZen());
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[2]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/a")).click();
            Thread.sleep(6000);
        } catch (Exception e) {
            driver.navigate().refresh();
            Thread.sleep(5000);

            PrzepisPopup(driver);
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[1]/div[1]/input")).click();
            PrzepisPopup(driver);
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[2]/div[1]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[1]")).sendKeys(genImieZen());
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[2]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/a")).click();
            Thread.sleep(6000);
        }
        driver.get("https://www.przepisy.pl/ebook/a11a744b-b4f3-477e-a89a-fed7f21b5d02/zimowa-kuchnia-roslinna-9-smacznych-przepisow-na-rozgrzewajace-dania-z-warzyw");
        Thread.sleep(30000);
        driver.quit();


//        //WP
//        driver.get("http://poczta.wp.pl/");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
//        boolean flaga = false;
//        int m = 0;
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
//        Thread.sleep(5000);
//        try {
//            driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
//        } catch (Exception e) {
//
//        }
//        Thread.sleep(3000);
//        driver.get("https://poczta.wp.pl/k/#/mails/?label=154");
//        Thread.sleep(3000);
//        while (!flaga) {
//            try {
//                driver.findElement(By.xpath("//*[text()='Przepisy.pl']")).click();
//                flaga = true;
//                Thread.sleep(4000);
//                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr[4]/td[2]/div[1]/a")).click();
//                Thread.sleep(10000);
//            } catch (Exception e) {
//                driver.navigate().refresh();
//                Thread.sleep(10000);
//            }
//            m++;
//            if (m > 5) {
//                break;
//            }
//
//        }
//
//        driver.quit();

//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void PrzepisPopup(WebDriver driver) throws InterruptedException {
        boolean flaga = false;
        int m = 0;
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[@id=\"close-icon1\"]/img")).click();
                Thread.sleep(1000);
                flaga = true;

            } catch (Exception e) {
                Thread.sleep(2000);
            }
            m++;
            if (m > 10)
                break;
        }

    }
}
