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
import java.security.spec.ECField;
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

    public static void LimangoTest(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/571d9ab22bb99e9adc5923f5a4cb94a0/85c9a38fb4fe436a4647631faaa0c5a4/d654be842d14f320ad92ef039fb6aa4c");
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

//        } catch (Exception e) {
//            driver.quit();
//        }

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
                clickXY(79, 650);
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
                clickXY(79, 650);
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

    public static void Everyday(WebDriver driver, String mail, String odp) throws AWTException, IOException, InterruptedException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        String[] miesiace = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int miesiac = r.nextInt(miesiace.length);
        int rok = r.nextInt(1995 - 1986 + 1) + 1986;
        int dzien = r.nextInt(29) + 1;
        int odp1 = r.nextInt(3);
        int odp2 = r.nextInt(2);
        int odp3 = r.nextInt(2);
        int odp4 = r.nextInt(4);
        int kupon1 = r.nextInt(2);
        int kupon2 = r.nextInt(4);
        int x = 1750;
        int m = 0;
        boolean cookie = false;
        Robot robot = new Robot();
        String dataUr = String.valueOf(dzien)+" "+miesiace[miesiac]+", "+String.valueOf(rok);
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        WebDriverWait wait = new WebDriverWait(driver, 60);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //WebElement element = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div[5]/div[1]/div[2]/a"));
        //driver.get("https://www.everydayme.pl/konkurszimowy");
        try {
        zmienKarte(driver);
        Thread.sleep(3000);
        while (!cookie) {
            try {
                driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
                cookie = true;
            } catch (Exception e) {
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
            driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/div/div/a")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[4]/a[1]")).click();
        }
        Thread.sleep(15000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/section[1]/div/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/section[2]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/div[2]/section[1]/div/div/input")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/div[2]/section[2]/div[2]/div/input")).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div[1]/div[3]/div/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div[1]/div[1]/button[1]/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div[1]/div[3]/div/div/div[2]/button[4]/span")).click();
        Thread.sleep(1000);
        js.executeScript("document.querySelector('[readonly]').removeAttribute(\"readonly\")");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/div[2]/section[2]/div[2]/div/input")).click();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_DELETE);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/div[2]/section[2]/div[2]/div/input")).sendKeys(dataUr);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div[2]/button/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/div[2]/section[3]/div/div/input")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/div[2]/section[4]/div[2]/div/input")).sendKeys(mail+"V2");
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[2]/section/div[1]")).click();

        Thread.sleep(2000);
        switch (odp1) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[1]/div[2]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[2]/div[2]")).click();
                break;
            case 2:                         ////*[@id="scrollContainer"]/section/div[1]/div/section[2]/section/section/div/div[3]/div[2]
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[3]/div[2]")).click();
                break;
        }
        Thread.sleep(2000);
        switch (odp2) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[1]/div/span/div[2]")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[2]/div/span/div[2]")).click();
                break;
        }
        Thread.sleep(2000);
        clickXY(1260,756);
        Thread.sleep(1000);
        try {
            switch (odp3) {
                case 0:
                    driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[4]/div")).click();
                    break;
                case 1:
                    driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[3]/div")).click();
                    break;
            }
        } catch (Exception e) {

        }

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div/div[2]/textarea[2]")).sendKeys(odp);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[2]/section/div[1]")).click();

        Thread.sleep(30000);
        driver.get("https://www.everydayme.pl/oferty");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/label/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/ul/li[1]/div/div/div[1]/div/div[3]/div[3]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/ul/li[2]/div/div/div[1]/div/div[3]/div[3]/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/button[2]")).click();
        Thread.sleep(30000);
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
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        //WebElement element = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div[5]/div[1]/div[2]/a"));
        //driver.get("https://www.everydayme.pl/konkurszimowy");
//        try {
        zmienKarte(driver);
        Thread.sleep(3000);
        while (!cookie) {
            try {
                driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
                cookie = true;
            } catch (Exception e) {
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

    public static void Everyday3(WebDriver driver, String mail, String kod, String ulica, String miasto, String odp) throws AWTException, IOException, InterruptedException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        //24 Apr, 1997
        int miesiacIndex = r.nextInt(12);
        String[] miesiac = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int rok = r.nextInt(1995 - 1986 + 1) + 1986;
        int dzien = r.nextInt(29) + 1;
        int odp1 = r.nextInt(4);
        int odp2 = r.nextInt(4);
        int odp3 = r.nextInt(3);
        int odp4 = r.nextInt(4);
        int kupon1 = r.nextInt(2);
        int kupon2 = r.nextInt(2);
        int x = 1750;
        int m = 0;
        boolean cookie = false;
        Robot robot = new Robot();
        String roko = String.valueOf(rok);
        Writer niewykorzystane = new BufferedWriter(new FileWriter("C:\\Users\\Artur\\Desktop\\klikanie\\niewykorzystaneEvery.txt", true));
        WebDriverWait wait = new WebDriverWait(driver, 60);

        //WebElement element = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div[5]/div[1]/div[2]/a"));
        //driver.get("https://www.everydayme.pl/konkurszimowy");
//        try {
        zmienKarte(driver);
        Thread.sleep(3000);
        while (!cookie) {
            try {
                driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
                cookie = true;
            } catch (Exception e) {
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
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[6]/div/div/a")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[4]/a[1]")).click();
        }
        Thread.sleep(10000);
//        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/button"));
//        while (!button.isEnabled()) {
//            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/label")).click();
//            Thread.sleep(2000);
//        }
//        button.click();
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/section[1]/div/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/section[2]")).click();
        Thread.sleep(1000000);

//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/div[2]/section[1]/div/div/input")).sendKeys(imie);
//        Select miesiacc = new Select(driver.findElement(By.xpath("//*[@id=\"dob\"]/select[1]")));
//        miesiacc.selectByIndex(miesiac);
//        Select rokk = new Select(driver.findElement(By.xpath("//*[@id=\"dob\"]/select[2]")));
//        rokk.selectByValue(roko);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"addressPostalCode\"]")).sendKeys(kod);
//        driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(mail);
//        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys("Mamatata14");
//        Thread.sleep(1000);
//        clickXY(x, 1012);
//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)", "");
//        try {
//            driver.findElement(By.xpath("//*[@id=\" globalOpt_optStatus\"]")).click();
//        } catch (Exception e) {
//            driver.findElement(By.xpath("//*[@id=\" globalOpt_optStatus_1\"]")).click();
//        }
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/form/div[11]/button")).click();

        //

        Thread.sleep(25000);
        switch (odp1) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[1]/div")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[2]/div")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[3]/div")).click();
                break;
            case 3:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[4]/div")).click();
                break;
        }
        Thread.sleep(2000);
        switch (odp2) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[1]/div")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[2]/div")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[3]/div")).click();
                break;
            case 3:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[5]/div")).click();
                break;

        }
        Thread.sleep(2000);
        switch (odp3) {
            case 0:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[1]/div")).click();
                break;
            case 1:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[2]/div")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div[3]/div")).click();
                break;
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[1]/div/section[2]/section/section/div/div/input")).sendKeys(odp);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"scrollContainer\"]/section/div[2]/section/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div[2]/nav/ol/li[4]/div/a")).click();
        Thread.sleep(5000);
        Zmniejsz(5);
        Thread.sleep(1000);
        switch (kupon1) {
            case 0:
                clickXY(876, 693);
                break;
            case 1:
                clickXY(1153, 693);
                break;
        }
        switch (kupon2) {
            case 0:
                clickXY(876, 844);
                break;
            case 1:
                clickXY(1153, 844);
                break;
        }
        Thread.sleep(10000);
        driver.quit();

//        } catch (Exception e) {
//            niewykorzystane.append(mail+"\r\n");
//            niewykorzystane.close();
//            driver.quit();
//        }


    }


    public static void Pampers(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");   //LIMIT 100
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("http://neworklead.elk.pl/action/4690/uid/122/");
            Thread.sleep(10000);
            clickXY(352, 358);
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
        if (plec == 0) {
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
            } catch (Exception e) {
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
            } catch (Exception e) {
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
        if (plec == 0) {
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
            } catch (Exception e) {
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
            } catch (Exception e) {
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
        if (plec == 0) {
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
            } catch (Exception e) {
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
            } catch (Exception e) {
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
        if (plec == 0) {
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
            } catch (Exception e) {
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
            } catch (Exception e) {
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
        String[] panstwa = {"Irlandia", "Wielka Brytania", "Norwegia", "Szwecja", "Finlandia", "Portugalia", "Hiszpania", "Andora", "Francja", "Holandia", "Belgia", "Luxemburg", "Niemcy", "Dania", "Szwajcaria", "Lichtenstein", "Włochy", "Monako", "San Marino", "Czechy", "Słowacja", "Austria", "Węgry", "Słowenia", "Chorwacja", "Albania", "Macedonia", "Bułgaria", "Grecja", "Estonia", "Łotwa", "Litwa", "Białoruś", "Ukraina", "Rosja", "Islandia"};
        Random r = new Random();
        int i = r.nextInt(panstwa.length - 1);
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
        } catch (Exception e) {
            System.out.println("NIE BYŁO");
        }

        Thread.sleep(30000);
        driver.quit();

    }

    public static void MomondoHotel(WebDriver driver) throws InterruptedException, AWTException {
        String[] panstwa = {"Irlandia", "Wielka Brytania", "Norwegia", "Szwecja", "Finlandia", "Portugalia", "Hiszpania", "Andora", "Francja", "Holandia", "Belgia", "Luxemburg", "Niemcy", "Dania", "Szwajcaria", "Lichtenstein", "Włochy", "Monako", "San Marino", "Czechy", "Słowacja", "Austria", "Węgry", "Słowenia", "Chorwacja", "Albania", "Macedonia", "Bułgaria", "Grecja", "Estonia", "Łotwa", "Litwa", "Białoruś", "Ukraina", "Rosja", "Islandia"};
        Random r = new Random();
        int i = r.nextInt(panstwa.length - 1);
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
        } catch (Exception e) {
            System.out.println("NIE BYŁO");
        }

        Thread.sleep(30000);
        driver.quit();

    }

    public static void MomondoSamolot(WebDriver driver) throws InterruptedException, AWTException {
        String[] panstwa = {"Irlandia", "Wielka Brytania", "Norwegia", "Szwecja", "Finlandia", "Portugalia", "Hiszpania", "Andora", "Francja", "Holandia", "Belgia", "Luxemburg", "Niemcy", "Dania", "Szwajcaria", "Lichtenstein", "Włochy", "Monako", "San Marino", "Czechy", "Słowacja", "Austria", "Węgry", "Słowenia", "Chorwacja", "Albania", "Macedonia", "Bułgaria", "Grecja", "Estonia", "Łotwa", "Litwa", "Białoruś", "Ukraina", "Rosja", "Islandia"};
        Random r = new Random();
        int i = r.nextInt(panstwa.length - 1);
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
        } catch (Exception f) {
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
            clickXY(790, 466);
            MomondoHotel(driver);
        } catch (Exception e) {
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
            clickXY(790, 466);
            MomondoSamolot(driver);
        } catch (Exception e) {
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
            clickXY(525, 460);
            MomondoHotel(driver);
        } catch (Exception e) {
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
            clickXY(525, 460);
            MomondoSamochod(driver);
        } catch (Exception e) {
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
        clickXY(525, 460);
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
            clickXY(835, 482);
            MomondoSamochod(driver);
        } catch (Exception e) {
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
            clickXY(835, 482);
            MomondoSamolot(driver);
        } catch (Exception e) {
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
            clickXY(835, 482);
            MomondoHotel(driver);
        } catch (Exception e) {
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
            clickXY(835, 482);
            MomondoSamochod(driver);
        } catch (Exception e) {
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
            clickXY(1000, 500);
            MomondoSamolot(driver);
        } catch (Exception e) {
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
            clickXY(1000, 500);
            MomondoHotel(driver);
        } catch (Exception e) {
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
            clickXY(1000, 500);
            MomondoSamochod(driver);
        } catch (Exception e) {
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
            clickXY(840, 484);
            MomondoSamochod(driver);
        } catch (Exception e) {
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
        clickXY(632, 890);
        Thread.sleep(6000);
        clickXY(950, 700);
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

    public static void Samsung2(String mail) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Random r = new Random();
        int plec = r.nextInt(2);
        int wybor1 = r.nextInt(4);
        int wybor2 = r.nextInt(4);
        String imie = null;
        String nazwisko = null;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        driver.manage().window().maximize();


        try {
            driver.get("http://neworklead.elk.pl/action/5182/uid/122/");
            /*
            //driver.get("https://www.samsung.com/pl/unpacked/");
            Thread.sleep(30000);
            try {
                driver.findElement(By.xpath("//*[@id=\"truste-consent-button\"]")).click();
            } catch (Exception e){

            }
            Thread.sleep(2000);
            ScrollBy(driver,"1000");
            driver.switchTo().frame(0);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]/div/div/input")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            try {
                Select urzadzenie = new Select(driver.findElement(By.xpath("//*[@id=\"q1\"]")));
                urzadzenie.selectByIndex(wybor1);
                Thread.sleep(1000);
                Select urzadzenie2 = new Select(driver.findElement(By.xpath("//*[@id=\"q2\"]")));
                urzadzenie2.selectByIndex(wybor2);
            } catch (Exception e){

            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"datacapture_form\"]/div/div[8]/div/div/label/span[3]")).click();
            driver.findElement(By.xpath("//*[@id=\"datacapture_form\"]/div/div[9]/div/div/label/span[2]")).click();
            Thread.sleep(1000);
            driver.switchTo().frame(0);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]")).click();
            Thread.sleep(3000);
            clickXY(660,582);
            Thread.sleep(3000);
            for (int i=0;i<3;i++){
                clickXY(663,432);
                Thread.sleep(3000);
            }
            Thread.sleep(3000);
            clickXY(950,432);
            Thread.sleep(10000);
        */
            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
            //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(15000);
            boolean flaga = false;
            int m = 0;
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Oferty']")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//*[text()='Samsung']")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/center/div/table[3]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td/a")).click();
                    Thread.sleep(3000);
                    zmienKarte(driver);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/p/a")).click();
                    Thread.sleep(10000);
                    flaga = true;
                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(10000);
                }
                m++;
                if (m > 2) {
                    break;
                }

            }
            driver.quit();

        } catch (Exception f) {
            driver.quit();
        }

    }

    public static void Cpc(String linkCuk, String linkSamsung) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int wybor = 5;//r.nextInt(10);
        WebDriver driver[] = new ChromeDriver[2];
        for (int i = 1; i < driver.length; i++) {
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
            } catch (Exception e) {

            }
            Thread.sleep(3000);
            clickXY(1871, 148);
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
            clickXY(1871, 148);
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
            clickXY(682, 723);
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

        } catch (Exception e) {
            Thread.sleep(120000);
            driver[1].quit();
        }

    }

    public static void Cola(WebDriver driver, String mail) throws InterruptedException {
        Random r = new Random();
        int plec = r.nextInt(2);
        int dzien = r.nextInt(29) + 1;
        int miesiac = r.nextInt(11) + 1;
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
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

        try {
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
                if (n == 4) {
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
                    driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys(mail + "V2");
                    driver.findElement(By.xpath("//*[@id=\"newPasswordConfirm\"]")).sendKeys(mail + "V2");
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[8]/label/span")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[9]/label/span")).click();
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/div[10]/label/span")).click();
                    Thread.sleep(1000);
                    driver.switchTo().frame(0);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]")).click();
                    Thread.sleep(5000);
                    for (int i = 0; i < 5; i++) {
                        clickXY(965, 1028);
                        Thread.sleep(3000);
                    }
                    driver.switchTo().defaultContent();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/span/div/div[1]/form/button")).click();
                    Thread.sleep(10000);
                    flaga3 = true;
                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(6000);
                }
                if (k == 10) {
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
            Thread.sleep(5000);
            try {
                driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
            } catch (Exception e) {

            }
            Thread.sleep(3000);
            while (!flaga) {
                try {
                    try {
                        driver.findElement(By.xpath("//*[@id=\"nh-modal\"]/div/div[2]/div/div/div/div/button")).click();
                        Thread.sleep(3000);
                    } catch (Exception e) {
                    }
                    driver.findElement(By.xpath("//*[text()='Prośba o aktywację konta']")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("/html/body/div/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/center/div[2]/table[2]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a")).click();
                    Thread.sleep(10000);
                    zmienKarte(driver);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"signInEmailAddress\"]")).sendKeys(mail);
                    driver.findElement(By.xpath("//*[@id=\"currentPassword\"]")).sendKeys(mail + "V2");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[7]/span/div/div[1]/form/button")).click();
                    Thread.sleep(10000);
                    if (kupon == 0) {
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

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void ColaCon(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://neworklead.elk.pl/action/5423/uid/122/");
        Cola(driver, mail);
    }

    public static void Cola2CC(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://neworklead.elk.pl/action/5424/uid/122/");
        Cola(driver, mail);
    }

    public static void ColaDeb(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://neworklead.elk.pl/action/5425/uid/122/");
        Cola(driver, mail);
    }

    public static void Nestle(WebDriver driver, String mail) throws InterruptedException, AWTException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int dziecko = r.nextInt(2);
        int plec = r.nextInt(2);
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(12 - 1 + 1) + 1;
        int rokUro = 2020;
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(11 - 5 + 1) + 5;
        int rokSpo = 2021;
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        String dzieckoUrodzone = String.valueOf(rokUro) + "-" + dodajZero(miesUro) + "-" + dodajZero(dzienUro);
        String dzieckoSpodziewane = String.valueOf(rokSpo) + "-" + dodajZero(miesSpo) + "-" + dodajZero(dzienSpo);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 10000);

//        try {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]"))));
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko);
        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail + "V2");
        driver.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail + "V2");
        Thread.sleep(500);
        ScrollBy(driver, "1200");
        Thread.sleep(1000);

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
        } else {
            driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-87599078661341020_3\"]")).click();
            if (plec == 0)
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-135031870266671040_7\"]")).click();
            else
                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-135031870266671040_8\"]")).click();
            js.executeScript("document.getElementById(\"gigya-textbox-153337984387971650_5\").removeAttribute(\"readonly\")");
            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-153337984387971650_5\"]")).sendKeys(dzieckoSpodziewane);
        }
        Thread.sleep(1000);
        clickXY(1400, 740);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-63592377505834030\"]")).click();
        Thread.sleep(1000);
        ScrollBy(driver,"500");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mbf-registration-one-step-form\"]/div[4]/div[24]/input")).click();
        Thread.sleep(5000);


        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
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
                driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/button")).click();
            } catch (Exception e) {
                try {
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/button")).click();
                } catch (Exception f) {
                    try {
                        driver.findElement(By.xpath("/div/div[2]/div/div/div/div/button")).click();
                    } catch (Exception g) {

                    }
                }
            }

            try {
                driver.findElement(By.xpath("//*[text()='Nestlé Baby&me']")).click();
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[text()='Zweryfikuj adres e-mail']")).click();
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
//        } catch (Exception e) {
//            driver.quit();
//        }


    }

    public static void NestleInt(WebDriver driver, String mail) throws InterruptedException, AWTException {
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();
        Random r = new Random();
        int dziecko = r.nextInt(2);
        int plec = r.nextInt(2);
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(12 - 1 + 1) + 1;
        int rokUro = 2020;
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(11 - 5 + 1) + 5;
        int rokSpo = 2021;
        int m = 0;
        boolean flaga = false;
        Robot robot = new Robot();
        String dzieckoUrodzone = String.valueOf(rokUro) + "-" + dodajZero(miesUro) + "-" + dodajZero(dzienUro);
        String dzieckoSpodziewane = String.valueOf(rokSpo) + "-" + dodajZero(miesSpo) + "-" + dodajZero(dzienSpo);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 10000);

//        try {
//        Thread.sleep(2000);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]"))));
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-86190741038286000\"]")).sendKeys(imie);
//        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-98147042545906400\"]")).sendKeys(nazwisko);
//        driver.findElement(By.xpath("//*[@id=\"gigya-textbox-32672274042894692\"]")).sendKeys(mail);
//        driver.findElement(By.xpath("//*[@id=\"gigya-password-40553674254645060\"]")).sendKeys(mail + "V2");
//        driver.findElement(By.xpath("//*[@id=\"gigya-password-49311983690159380\"]")).sendKeys(mail + "V2");
//        Thread.sleep(500);
//        ScrollBy(driver, "1200");
//        Thread.sleep(1000);
//
//        if (dziecko == 0) {
//            if (plec == 0) {
//                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-135031870266671040_8\"]")).click();
//                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-151298633113062270_4\"]")).sendKeys(genImieZen());
//            } else {
//                driver.findElement(By.xpath("//*[@id=\"gigya-textbox-151298633113062270_4\"]")).sendKeys(genImieMes());
//            }
//            js.executeScript("document.getElementById(\"gigya-textbox-65513374974246824_9\").removeAttribute(\"readonly\")");
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-65513374974246824_9\"]")).sendKeys(dzieckoUrodzone);
//        } else {
//            driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-87599078661341020_3\"]")).click();
//            if (plec == 0)
//                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-135031870266671040_7\"]")).click();
//            else
//                driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-1-135031870266671040_8\"]")).click();
//            js.executeScript("document.getElementById(\"gigya-textbox-153337984387971650_5\").removeAttribute(\"readonly\")");
//            driver.findElement(By.xpath("//*[@id=\"gigya-textbox-153337984387971650_5\"]")).sendKeys(dzieckoSpodziewane);
//        }
//        Thread.sleep(1000);
//        clickXY(1400, 740);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"gigya-multiChoice-0-63592377505834030\"]")).click();
//        Thread.sleep(1000);
//        ScrollBy(driver,"500");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"mbf-registration-one-step-form\"]/div[4]/div[24]/input")).click();
//        Thread.sleep(5000);


        //INTERIA
        driver.get("https://poczta.interia.pl/logowanie/");
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/button[3]")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("/html/body/div[3]/div[2]/button[3]")).click();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"sitebar\"]/form/button")).click();

        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("//*[@id=\"tel\"]")).sendKeys("698389667");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[2]/div/div[2]/form/div[3]/button[1]")).click();
        } catch (Exception e) {

        }
        Thread.sleep(3000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Nestlé Baby&me']")).click();
                Thread.sleep(3000);
                driver.switchTo().frame(1);
                driver.findElement(By.xpath("//*[text()='Zweryfikuj adres e-mail']")).click();
                driver.findElement(By.xpath("//*[text()='Zweryfikuj adres e-mail']")).click();
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
//        } catch (Exception e) {
//            driver.quit();
//        }


    }

    public static void NestleMB(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        try {
        driver.get("https://neworklead.pl/zadanie/f0ac5f0b10eb516b13d7668dffc9d080/f01407d6df5471acaba030aa4e7556d7/d654be842d14f320ad92ef039fb6aa4c");
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
            driver.get("https://neworklead.pl/zadanie/819aaa14ffc24d920906b0ee284c42c4/9b9279ad926f49c53260295ba2a86bb4/d654be842d14f320ad92ef039fb6aa4c");
//            driver.get("https://www.zdrowystartwprzyszlosc.pl/user/register");
            Thread.sleep(5000);

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            NestleInt(driver, mail);
            Thread.sleep(3000);
            driver.quit();

//        } catch (Exception e) {
//            driver.quit();
//        }


    }

    public static void NestleDC(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

//        try {
        driver.get("https://neworklead.pl/zadanie/fef72eb10fcc0185b9624f04388033c2/4fdeeab470f4bc1155f348fd3997b94c/d654be842d14f320ad92ef039fb6aa4c");
//            driver.get("https://www.zdrowystartwprzyszlosc.pl/user/register");
        Thread.sleep(5000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        Thread.sleep(1000);
        NestleInt(driver, mail);
        Thread.sleep(3000);
        driver.quit();

//        } catch (Exception e) {
//            driver.quit();
//        }


    }

    public static void Enfamil(WebDriver driver, String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int dzienUro = r.nextInt(29) + 1;
        int miesUro = r.nextInt(12 - 7) + 7;
        String rokUro = "2020";
        int dzienSpo = r.nextInt(29) + 1;
        int miesSpo = r.nextInt(11 - 6) + 6;
        String rokSpo = "2021";
        int dziecko = r.nextInt(5 - 3 + 1) + 3;
        try {

        Thread.sleep(1000);
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
        } else {
            dzien.selectByIndex(dzienUro);
            mies.selectByIndex(miesUro);
            rok.selectByValue(rokUro);
        }
        driver.findElement(By.xpath("//*[@id=\"field_enroll_agree_terms_personalised_optin\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
        Thread.sleep(12000);
        driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Dekoral(WebDriver driver, String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[3]/div[1]/button[1]"))));
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/button[1]")).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div[1]/button[1]"))));
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/button[1]")).click();
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div/p[2]/a")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/form/div/div[1]/div[2]/input"))));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/form/div/div[1]/div[2]/input")).sendKeys(imie);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys(nazwisko);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/form/div/div[5]/div[2]/input")).sendKeys(mail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/form/div/div[10]/div[2]/button")).click();
        Thread.sleep(6000);

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
//        while (!flaga) {
//            try {
//                driver.findElement(By.xpath("//*[text()='bimago. witaj']")).click();
//                flaga = true;
//                Thread.sleep(4000);
//                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/div[2]/div/div/div/div/div/div/div/div/a/span")).click();
//                Thread.sleep(5000);
//            } catch (Exception e) {
//                driver.navigate().refresh();
//                Thread.sleep(10000);
//            }
//            m++;
//            if (m > 8) {
//                driver.quit();
//                break;
//            }
//
//        }
//
        driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Limango(WebDriver driver, String mail) throws InterruptedException, AWTException {

        try {
            driver.findElement(By.xpath("//*[@id=\"uc-btn-accept-banner\"]")).click();
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
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
            Thread.sleep(5000);
            try {
                driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
            } catch (Exception e) {
                try {
                    driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[6]/button")).click();
                } catch (Exception f) {

                }
            }
            Thread.sleep(3000);
            boolean flaga = false;
            int m = 0;
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Sklep limango.pl']")).click();
                    flaga = true;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//*[text()='Potwierdzam rejestrację i chcę otrzymywać newsletter']")).click();
                    Thread.sleep(5000);
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
                    Thread.sleep(5000);
                    driver.quit();

                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(3000);
                }
                m++;
                if (m > 5) {
                    break;

                }
            }
        } catch (Exception e) {
            driver.quit();
        }
        driver.quit();

    }

    public static void Limango(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
        driver.get("https://neworklead.pl/zadanie/571d9ab22bb99e9adc5923f5a4cb94a0/85c9a38fb4fe436a4647631faaa0c5a4/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(7000);
        Limango(driver, mail);
        } catch (Exception e) {
            driver.quit();
        }

    }


    public static void EnfamilDBL(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
            driver.get("https://neworklead.pl/zadanie/dcc054c2b5f4d19922fdc6bc0afda388/fbfe4712449bf5d565be39ce21d93692/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(6000);
            Neworklead.Enfamil(driver, mail);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void gwEnfamil(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/5491ecf29ac8c4ff62b23cf90dc2f278/cf9715d4c0dcfaa58f38b7e3e861cee6/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Neworklead.Enfamil(driver, mail);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void strzEnfamil(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/90fa16b3880053bac81563e212ec25c0/71b8ba7b222d4533f5006fa782ebc201/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Neworklead.Enfamil(driver, mail);
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
        try {
            driver.get("https://neworklead.pl/zadanie/83f165af4cd69f2364f0e169014a25a6/6b52a4ff350425aa8743d00cacee0a82/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(3000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"))));
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[1]/div[1]/input")).click();
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[2]/div[1]/input")).click();
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[1]")).sendKeys(genImieZen());
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[2]")).sendKeys(mail);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/a")).click();
                Thread.sleep(6000);
            } catch (Exception e) {
                driver.navigate().refresh();
                Thread.sleep(5000);

                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[1]/div[1]/input")).click();
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[2]/div[1]/input")).click();
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[1]")).sendKeys(genImieZen());
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[2]")).sendKeys(mail);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/a")).click();
                Thread.sleep(6000);
            }
//        driver.get("https://www.przepisy.pl/ebook/a11a744b-b4f3-477e-a89a-fed7f21b5d02/zimowa-kuchnia-roslinna-9-smacznych-przepisow-na-rozgrzewajace-dania-z-warzyw");
//        Thread.sleep(5000);
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

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void PrzepisErr(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/ab98c45593742f16d17679392bec87ef/b5cb98f6e2dce96c34d02e4390343979/d654be842d14f320ad92ef039fb6aa4c");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"))));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[1]/div[1]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[2]/div[1]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[1]")).sendKeys(genImieZen());
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[2]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/a")).click();
            Thread.sleep(6000);
        } catch (Exception e) {
            driver.navigate().refresh();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[1]/div[1]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[2]/div[1]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[1]")).sendKeys(genImieZen());
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/input[2]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"modalDownloadEbook\"]/div/div/div/div/div[2]/div[4]/a")).click();
            Thread.sleep(6000);
        }
//        driver.get("https://www.przepisy.pl/ebook/a11a744b-b4f3-477e-a89a-fed7f21b5d02/zimowa-kuchnia-roslinna-9-smacznych-przepisow-na-rozgrzewajace-dania-z-warzyw");
//        Thread.sleep(5000);
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

    public static void BiedronkaDada(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int dzien = r.nextInt(28) + 1;
        int mies = r.nextInt(12 - 9 + 1) + 9;
        String rok = "2020";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("user-data-dir=C:\\Users\\Artur\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile 192");
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.get("chrome://settings/clearBrowserData");
//        driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);

//        driver.get("https://neworklead.pl/zadanie/d46993d225d229228d86631cbd88337d/c72ca1f3ac3ae497c224f0d1135c6a94/d654be842d14f320ad92ef039fb6aa4c");
        driver.get("https://www.dadaclub.pl/signup?utm_campaign=21-518-5-009_Dada_Club&utm_source=Banner&utm_medium=Light_Reaction");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cookies_accepted\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password1\"]")).sendKeys(mail + "V2");
        driver.findElement(By.xpath("//*[@id=\"password2\"]")).sendKeys(mail + "V2");
        Select dzie = new Select(driver.findElement(By.xpath("//*[@id=\"childBirthday1\"]")));
        dzie.selectByIndex(dzien);
        Select mie = new Select(driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[1]/div/div[1]/select[2]")));
        mie.selectByIndex(mies);
        Select ro = new Select(driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[1]/div/div[1]/select[3]")));
        ro.selectByValue(rok);
        driver.findElement(By.xpath("//*[@id=\"childFirstName1\"]")).sendKeys(genImieMes());
        driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[2]/div[2]/div[1]/div[1]/label")).click();
//        driver.findElement(By.xpath("//*[@id=\"register\"]/div[5]/div/div[1]/div[1]/label")).click();
        clickXY(760, 1016);
        driver.findElement(By.xpath("//*[@id=\"register\"]/div[5]/div/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"register\"]/div[5]/div/div[3]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"register\"]/div[5]/div/div[4]/div[1]/label")).click();
        Thread.sleep(500);
        ScrollBy(driver, "1300");
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
        Thread.sleep(3000);
        for (int i = 0; i < 5; i++) {
            clickXY(840, 1012);
            Thread.sleep(3000);
        }
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        boolean flaga = false;
        int m = 0;
        Thread.sleep(3000);
        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
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
                driver.findElement(By.xpath("//*[text()='Dada Club']")).click();
                Thread.sleep(4000);
                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/font/a/font/b")).click();
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
        driver.quit();
    }

    public static void BimagoK1D(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();
//        try {
            driver.get("https://neworklead.pl/zadanie/5be038ba6fff2dcd3cbff884f977cde6/96e04f69256bfa42997ae2867b3400cc/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"notice-cookie-block\"]/div/div/button")))).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"newsletter-cms\"]")).sendKeys(mail);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"newsletter-cms-form-submit-button\"]")).click();
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"confirm-newsletter\"]/div[2]/h3"))));
            Thread.sleep(1000);


            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            boolean flaga = false;
            int m = 0;
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
                    driver.findElement(By.xpath("//*[text()='bimago. witaj']")).click();
                    flaga = true;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/div[2]/div/div/div/div/div/div/div/div/a/span")).click();
                    Thread.sleep(5000);
                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(10000);
                }
                m++;
                if (m > 8) {
                    driver.quit();
                    break;
                }

            }

            driver.quit();

//        } catch (Exception e) {
//            driver.quit();
//        }

    }


    public static void BimagoK1M(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/be0aaa442a7d45d187e29751ca1dff33/a11a83242fe517088b7dd5dca22cbb61/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"notice-cookie-block\"]/div/div/button")))).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"newsletter-cms\"]")).sendKeys(mail);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"newsletter-cms-form-submit-button\"]")).click();
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"confirm-newsletter\"]/div[2]/h3"))));
            Thread.sleep(1000);


            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            boolean flaga = false;
            int m = 0;
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
                    driver.findElement(By.xpath("//*[text()='bimago. witaj']")).click();
                    flaga = true;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/div[2]/div/div/div/div/div/div/div/div/a/span")).click();
                    Thread.sleep(5000);
                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(10000);
                }
                m++;
                if (m > 8) {
                    driver.quit();
                    break;
                }

            }

            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Arkadia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/9a8b6a54d3f267a68766f611908e0e8d/1df2d88df7e754f871d1c3cea9b52b06/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.ArkadiaFF(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void aArkadia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/cc189e7b0b86db415a95a68f483bad0a/cb1dbdccb80748fc1c6988d3aebd5901/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            Zmniejsz(4);
            Thread.sleep(1000);
            ScrollBy(driver, "5000");
            Thread.sleep(1000);
            clickXY(550, 160);
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.ArkadiaFF(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void LKArkadia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/8ea06b31faee27c890b66d2ef6236208/175c97afc45483a39c89ee33a1feb28a/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            clickXY(955, 570);
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.ArkadiaFF(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void gwArkadia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/c769fa15443d36ec2f5b3e04dbc38759/b397d47d64292331b465febd29700ed6/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            clickXY(1170, 940);
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.ArkadiaFF(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Galeria(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/fe6ab074e3701a236d74acc457bd7ba9/00b3e347b6d8d7f5abcde1e26a7d352d/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.Galeria(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void aGaleria(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/fb26a328cc07f251b2b3d457094051c9/14b7141adc6b59ab9a0229bdbb75c8c4/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            Zmniejsz(4);
            Thread.sleep(1000);
            ScrollBy(driver, "5000");
            Thread.sleep(1000);
            clickXY(550, 580);
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.Galeria(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void gwGaleria(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/3f3fb2566a6c4a5cf6ac9e23736765e7/aff645a70ee6ccea31ee52d3d9ae5c2e/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            Zmniejsz(6);
            Thread.sleep(1000);
            clickXY(1030, 875);
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.Galeria(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Wroclawia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/98b1c49ab3b23e346c194126b9d8fa0d/9dcbd7938b87f2b58b5c938a1f9f37d9/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.Wroclavia(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void aWroclawia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/b672094b0fa7af3d0a39468e9a2896e0/1fab9c05db744fa5f6bcc8346e4b3272/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            Zmniejsz(4);
            Thread.sleep(1000);
            ScrollBy(driver, "5000");
            Thread.sleep(1000);
            clickXY(550, 800);
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.Wroclavia(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void gwWroclawia(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/15ac6d7508bb6d27aef3adfeb109310a/ef6572a38c25ed43f3cf10d65c0b1ab8/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(10000);
            Zmniejsz(6);
            Thread.sleep(1000);
            clickXY(1030, 670);
            Thread.sleep(10000);
            zmienKarte(driver);
            Narzedzia.Wroclavia(driver, mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Bgz(String tel, String mail) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);

//        try {
            driver.get("https://neworklead.pl/zadanie/ce97ad1763a632ad98948ffd3eaad88a/c82954baf19cd5e4ae6a1c287b05e072/d654be842d14f320ad92ef039fb6aa4c");
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]"))));
            driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"input_imie\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"input_nazwisko\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"input_telefonKom\"]")).sendKeys(tel);
            driver.findElement(By.xpath("//*[@id=\"input_email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"checkbox_zgoda_all\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"button_Wyslij\"]")).click();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void aBgzkz(String tel, String mail) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);

//        try {
            driver.get("https://neworklead.pl/zadanie/9589cb05313c31e27f0f8d5297776eea/384bb812b527c2143e01fc95ad3fbd44/d654be842d14f320ad92ef039fb6aa4c");
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]"))));
            driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"input_imie\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"input_nazwisko\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"input_telefonKom\"]")).sendKeys(tel);
            driver.findElement(By.xpath("//*[@id=\"input_email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"checkbox_zgoda_all\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"button_Wyslij\"]")).click();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void aBgzkg(String tel, String mail) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);

//        try {
            driver.get("https://neworklead.pl/zadanie/74dd8f3ecefeabcb8cd1a71b1a3892d7/a6ee2b08c7a7d40d8339d5a4c083353e/d654be842d14f320ad92ef039fb6aa4c");
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]"))));
            driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"input_imie\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"input_nazwisko\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"input_telefonKom\"]")).sendKeys(tel);
            driver.findElement(By.xpath("//*[@id=\"input_email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"checkbox_zgoda_all\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"button_Wyslij\"]")).click();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void lkBgz(String tel, String mail) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);

//        try {
            driver.get("https://neworklead.pl/zadanie/c5fbc71074cbf00b7ba1584af6f2c0ce/703b5cde4f98a2d054fd48ecb00104b7/d654be842d14f320ad92ef039fb6aa4c");
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]"))));
            driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"input_imie\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"input_nazwisko\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"input_telefonKom\"]")).sendKeys(tel);
            driver.findElement(By.xpath("//*[@id=\"input_email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"checkbox_zgoda_all\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"button_Wyslij\"]")).click();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void lkBgzkg(String tel, String mail) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int plec = r.nextInt(2);
        String imie;
        String nazwisko;
        if (plec == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);

//        try {
            driver.get("https://neworklead.pl/zadanie/2d0e8f22e0892f4f3e3fedfd913631e4/d8b8754675fd19ba070faa19732c7641/d654be842d14f320ad92ef039fb6aa4c");
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]"))));
            driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/p[2]/button[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"input_imie\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"input_nazwisko\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"input_telefonKom\"]")).sendKeys(tel);
            driver.findElement(By.xpath("//*[@id=\"input_email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"checkbox_zgoda_all\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"button_Wyslij\"]")).click();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void Dekoral(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
        driver.get("https://neworklead.pl/zadanie/ed04ab10260b9bbafb58e54455fdc81f/41b0e7abc3547a43234a4905625c1797/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Dekoral(driver, mail);
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void DekoralMail(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://neworklead.pl/zadanie/2f1fcfb4765b75731c3633607b5e4629/402a8b60be53613d3c8eae7672d58a29/d654be842d14f320ad92ef039fb6aa4c");
            Thread.sleep(6000);
            Dekoral(driver, mail);
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Letty(WebDriver driver, String mail) throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, 60);

//        try {
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div[3]/div"))));
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div[3]/div")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"tmp-coutry-chouse\"]/div[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[2]/div/div[1]/div/div[3]/div[2]/div[1]/div/div[2]/div[2]/form/div[2]/ul/li[16]/span")).click();
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div/div[6]/form/div[1]/input"))));
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div/div[6]/form/div[1]/input")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div/div[6]/form/div[3]/input")).sendKeys(mail+"V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div/div[6]/form/div[4]/button")).click();
            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"location-submit-button\"]"))));
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"location-submit-button\"]")).click();
            Thread.sleep(5000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        boolean flaga = false;
        int m = 0;
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
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='LetyShops']")).click();
                flaga = true;
                Thread.sleep(4000);
                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr[3]/td/table/tbody/tr/td/p[3]/a")).click();
                Thread.sleep(1000);
                zmienKarte(driver);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                Thread.sleep(10000);
            } catch (Exception e) {
                driver.navigate().refresh();
                Thread.sleep(10000);
            }
            m++;
            if (m > 10) {
                driver.quit();
                break;
            }

        }

        driver.quit();
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void Letty(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/a649d85796d9d35569a69a0e817daea9/dea9073957a161f9e7c9f45dcc2cf5fd/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Letty(driver, mail);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void LettyHash(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/3ab90b42d05142635cb8a8a7e2e44fbf/4e8c1979b43b284a7f4697a346092526/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Letty(driver, mail);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void aLetty(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/196c0ad2a58ca67712567d4bbca67212/97dbfca6074ec2c77f859cd1b83228aa/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        clickXY(330,545);
        Thread.sleep(3000);
        zmienKarte(driver);
        Letty(driver, mail);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void lkLetty(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/96c7b066372f39f0e66baa0876a7afa9/320c45cde2bc338eda9e984a1c7db31a/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        clickXY(1242,986);
        Thread.sleep(3000);
        zmienKarte(driver);
        Letty(driver, mail);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void Iphone(WebDriver driver, String mail, String ulica, String kod1, String kod2, String miasto) throws InterruptedException, AWTException {
        Random r = new Random();
        int imiee = r.nextInt(2);
        int ubez = r.nextInt(12);
        boolean flaga = false;
        int m = 0;
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String mies = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1990 - 1980 + 1) + 1980);
        String numer = String.valueOf(r.nextInt(70) + 1);
        String imie;
        String nazwisko;
        String tel = genNumer();
        if (imiee == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

//        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"1\"]/div[2]"))));
            driver.findElement(By.xpath("//*[@id=\"1\"]/div[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"2\"]/div[2]")).click();
            Thread.sleep(6000);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"email_field\"]"))));
            driver.findElement(By.xpath("//*[@id=\"email_field\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"name_field\"]")).sendKeys(imie);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]")).click();

            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"surname_field\"]"))));
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
            try {
                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[1]/div[2]/div[1]/label/img")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                Select ubezpieczenie = new Select(driver.findElement(By.xpath("//*[@id=\"q_SAMOCHOD_OC_AC\"]")));
                ubezpieczenie.selectByIndex(ubez);
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_630\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_639\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_640\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_622\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_644\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_649\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div[2]/div[1]/input")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_674\"]")).click();
            } catch (Exception f) {
                try {
                    driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div[2]/div[1]/input")).click();
                } catch (Exception g) {

                }
            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"poll_submit\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(5000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
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
                    driver.findElement(By.xpath("//*[text()='Rewelacja Gift']")).click();
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
//        } catch (Exception e) {
//            driver.quit();
//        }



    }

    public static void Kaufland(WebDriver driver, String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        Random r = new Random();
        int imiee = r.nextInt(2);
        int ubez = r.nextInt(12);
        boolean flaga = false;
        int m = 0;
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String mies = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1990 - 1980 + 1) + 1980);
        String numer = String.valueOf(r.nextInt(70) + 1);
        String numer2;
        int numer22 = r.nextInt(2);
        if (numer22 == 0)
            numer2 = String.valueOf(r.nextInt(30) + 1);
        else
            numer2 = "";
        String imie;
        String nazwisko;
        if (imiee == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

//        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"1\"]/div[2]"))));
            driver.findElement(By.xpath("//*[@id=\"1\"]/div[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"2\"]/div[2]")).click();
            Thread.sleep(6000);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"email_field\"]"))));
            driver.findElement(By.xpath("//*[@id=\"email_field\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"name_field\"]")).sendKeys(imie);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]")).click();

            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"surname_field\"]"))));
            driver.findElement(By.xpath("//*[@id=\"surname_field\"]")).sendKeys(nazwisko);
            driver.findElement(By.xpath("//*[@id=\"street_field\"]")).sendKeys(ulica);
            driver.findElement(By.xpath("//*[@id=\"building_no_field\"]")).sendKeys(numer);
            driver.findElement(By.xpath("//*[@id=\"apartment_no_field\"]")).sendKeys(numer2);
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
            try {
                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[1]/div[2]/div[1]/label/img")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                Select ubezpieczenie = new Select(driver.findElement(By.xpath("//*[@id=\"q_SAMOCHOD_OC_AC\"]")));
                ubezpieczenie.selectByIndex(ubez);
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_630\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_639\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_640\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_622\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_644\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_649\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div[2]/div[1]/input")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"ans_674\"]")).click();
            } catch (Exception f) {
                try {
                    driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div[2]/div[1]/input")).click();
                } catch (Exception g) {

                }
            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[1]/div/div/div[1]/label/img")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[8]/div/div/div[3]/input")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div/div/div[4]/input")).click();
            } catch (Exception f) {

            }
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@id=\"poll_submit\"]")).click();
            } catch (Exception f) {

            }
            Thread.sleep(5000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
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
                    Thread.sleep(2000);
                    try {
                        driver.findElement(By.xpath("//*[text()='Kupuj z głową']")).click();
                    } catch (Exception f) {
                        driver.get("https://poczta.wp.pl/k/#/mails/?label=5");
                        Thread.sleep(3000);
                        driver.findElement(By.xpath("//*[text()='Kupuj z głową']")).click();
                    }
                    flaga = true;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr[5]/td/a/img")).click();
                    Thread.sleep(3000);
                    zmienKarte(driver);
                    try {
                        driver.findElement(By.xpath("//*[text()='Przejdź na stronę']")).click();
                    } catch (Exception e) {

                    }
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
//        } catch (Exception e) {
//            driver.quit();
//        }



    }

    public static void Zabka(WebDriver driver, String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        Random r = new Random();
        int imiee = r.nextInt(2);
        int ubez = r.nextInt(12);
        boolean flaga = false;
        int m = 0;
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String mies = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1990 - 1980 + 1) + 1980);
        String dataUr = rok+"-"+mies+"-"+dzien;
        String numer = String.valueOf(r.nextInt(70) + 1);
        String imie;
        String nazwisko;
        if (imiee == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

//        try {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[1]/div/a"))));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/div[1]/div[1]/div/div[2]/input")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"form__userDateOfBirth\"]")).sendKeys(dataUr);
        Select zwrot = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/div[1]/div[2]/div[2]/div[2]/select")));
        if (imiee == 0)
            zwrot.selectByValue("Pani");
        else
            zwrot.selectByValue("Pan");
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/div[1]/div[3]/div[1]/div[2]/input")).sendKeys(imie);
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/div[1]/div[3]/div[2]/div[2]/input")).sendKeys(nazwisko);
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/div[1]/div[4]/div[1]/div[2]/input")).sendKeys(tel);
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/div[1]/div[4]/div[2]/div[2]/input")).sendKeys(kod1+"-"+kod2);
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/div[1]/div[5]/div/div[2]/input")).sendKeys(miasto);
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/div[1]/div[6]/div/div[2]/input")).sendKeys(ulica+" "+numer);
        driver.findElement(By.xpath("//*[@id=\"form__marketingAgreements\"]/div[1]/label/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"form__marketingAgreements\"]/div[3]/label/input[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/form/input")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[1]/div/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[3]/div/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[4]/div/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[5]/div/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[6]/div/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[7]/div/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[8]/div/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[4]/div/div[9]/div/div[2]/div[2]/div/a[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"coregistration-step__submit-button\"]")).click();

        Thread.sleep(5000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
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
                driver.findElement(By.xpath("//*[text()='Cashbackrabat.pl']")).click();
                flaga = true;
                Thread.sleep(4000);
                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table[4]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();
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
//        } catch (Exception e) {
//            driver.quit();
//        }



    }

    public static void Rossman(WebDriver driver, String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        Random r = new Random();
        int imiee = r.nextInt(2);
        int ubez = r.nextInt(12);
        boolean flaga = false;
        int m = 0;
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String mies = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1995 - 1987 + 1) + 1987);
        String dataUr = rok+"-"+mies+"-"+dzien;
        String numer = String.valueOf(r.nextInt(70) + 1);
        String imie;
        String nazwisko;
        if (imiee == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

//        try {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"start\"]"))));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"start\"]")).click();
        Thread.sleep(2000);
        if (imiee == 0)
            driver.findElement(By.xpath("//*[@id=\"1\"]/div[1]")).click();
        else
            driver.findElement(By.xpath("//*[@id=\"1\"]/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"2\"]/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"3\"]/div[1]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"closelink\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email_field\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"name_field\"]")).sendKeys(imie);
        driver.findElement(By.xpath("//*[@id=\"agreements-content\"]/div[3]/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"agreements-content\"]/div[3]/div[2]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"agreements-content\"]/div[3]/div[3]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"agreements-content\"]/div[3]/div[4]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"agreements-content\"]/div[3]/div[5]/label/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]")).click();

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
        try {
            driver.findElement(By.xpath("/html/body/section/div[1]/form/div[1]/div[2]/div[1]/label/img")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            Select ubezpieczenie = new Select(driver.findElement(By.xpath("//*[@id=\"q_SAMOCHOD_OC_AC\"]")));
            ubezpieczenie.selectByIndex(ubez);
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"ans_630\"]")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"ans_639\"]")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"ans_640\"]")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"ans_622\"]")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"ans_644\"]")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"ans_649\"]")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div[2]/div[1]/input")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"ans_674\"]")).click();
        } catch (Exception f) {
            try {
                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div[2]/div[1]/input")).click();
            } catch (Exception g) {

            }
        }
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//*[@id=\"poll_submit\"]")).click();
        } catch (Exception f) {

        }
        Thread.sleep(5000);

        //WP
        driver.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
        //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("//*[@id=\"agreements\"]/div[6]/button")).click();
        } catch (Exception e) {

        }
        Thread.sleep(3000);
        driver.get("https://poczta.wp.pl/k/#/mails/?label=5");
        Thread.sleep(3000);
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='Zgarnij-kosmetyki.co.pl']")).click();
                flaga = true;
                Thread.sleep(4000);
                driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr[5]/td/a/img")).click();
                Thread.sleep(2000);
                zmienKarte(driver);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
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
//        } catch (Exception e) {
//            driver.quit();
//        }



    }

    public static void konkursPampers(WebDriver driver, String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        Random r = new Random();
        int imiee = r.nextInt(2);
        int ubez = r.nextInt(12);
        boolean flaga = false;
        int m = 0;
        String dzien = String.valueOf(r.nextInt(29) + 1);
        String mies = String.valueOf(r.nextInt(11) + 1);
        String rok = String.valueOf(r.nextInt(1995 - 1985 + 1) + 1985);
        String numer = String.valueOf(r.nextInt(70) + 1);
        String imie;
        String nazwisko;
        if (imiee == 0) {
            imie = genImieZen();
            nazwisko = genNazwiskoZen();
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }

//        try {
//            WebDriverWait wait = new WebDriverWait(driver, 60);
//            driver.findElement(By.xpath("//*[@id=\"email_field\"]")).sendKeys(mail);
//            driver.findElement(By.xpath("//*[@id=\"name_field\"]")).sendKeys(imie);
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//*[@id=\"btn-confirm\"]")).click();
//
//            Thread.sleep(3000);
//            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"surname_field\"]"))));
//            driver.findElement(By.xpath("//*[@id=\"surname_field\"]")).sendKeys(nazwisko);
//            driver.findElement(By.xpath("//*[@id=\"street_field\"]")).sendKeys(ulica);
//            driver.findElement(By.xpath("//*[@id=\"building_no_field\"]")).sendKeys(numer);
//            driver.findElement(By.xpath("//*[@id=\"postal-1\"]")).sendKeys(kod1);
//            driver.findElement(By.xpath("//*[@id=\"postal-2\"]")).sendKeys(kod2);
//            driver.findElement(By.xpath("//*[@id=\"town_field\"]")).sendKeys(miasto);
//            driver.findElement(By.xpath("//*[@id=\"select-day\"]")).sendKeys(dzien);
//            driver.findElement(By.xpath("//*[@id=\"select-month\"]")).sendKeys(mies);
//            driver.findElement(By.xpath("//*[@id=\"select-year\"]")).sendKeys(rok);
//            driver.findElement(By.xpath("//*[@id=\"phone_field\"]")).sendKeys(tel);
//            driver.findElement(By.xpath("//*[@id=\"type_card_field\"]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//*[@id=\"btn-next\"]")).click();
//
//            Thread.sleep(5000);
//            try {
//                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[1]/div[2]/div[1]/label/img")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                Select ubezpieczenie = new Select(driver.findElement(By.xpath("//*[@id=\"q_SAMOCHOD_OC_AC\"]")));
//                ubezpieczenie.selectByIndex(ubez);
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("//*[@id=\"ans_630\"]")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("//*[@id=\"ans_639\"]")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("//*[@id=\"ans_640\"]")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("//*[@id=\"ans_622\"]")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("//*[@id=\"ans_644\"]")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("//*[@id=\"ans_649\"]")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div[2]/div[1]/input")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("//*[@id=\"ans_674\"]")).click();
//            } catch (Exception f) {
//                try {
//                    driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div[2]/div[1]/input")).click();
//                } catch (Exception g) {
//
//                }
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[1]/div/div/div[1]/label/img")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                Select oc = new Select(driver.findElement(By.xpath("/html/body/section/div[1]/form/div[2]/div/div/select"));
//                oc.selectByIndex(10);
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[8]/div/div/div[3]/input")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("/html/body/section/div[1]/form/div[9]/div/div/div[4]/input")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(By.xpath("//*[@id=\"poll_submit\"]")).click();
//            } catch (Exception f) {
//
//            }
//            Thread.sleep(5000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2020");
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
                    try {
                        driver.findElement(By.xpath("//*[text()='Wesołe maluszki']")).click();
                    } catch (Exception e) {
                        driver.get("https://poczta.wp.pl/k/#/mails/?label=5");
                        Thread.sleep(3000);
                        driver.findElement(By.xpath("//*[text()='Wesołe maluszki']")).click();
                    }
                    flaga = true;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table/tbody/tr[5]/td/a/img")).click();
                    Thread.sleep(2000);
                    zmienKarte(driver);
                    driver.findElement(By.xpath("//*[text()='Przejdź na stronę']")).click();
                    Thread.sleep(10000);

                } catch (Exception e) {
                    driver.navigate().refresh();
                    Thread.sleep(10000);
                }
                m++;
                if (m > 5) {
                    break;
                }
                driver.get("https://poczta.wp.pl/k/#/mails/?label=1");
            }
            driver.quit();
//        } catch (Exception e) {
//            driver.quit();
//        }



    }

    public static void gwIphone(String mail, String ulica, String kod1, String kod2, String miasto) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/0ec939cecd6cc74961f8cd3cb4424a4c/0f20d4d20e18c10dc035929975468d09/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Iphone(driver, mail,ulica, kod1,kod2,miasto);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void lkIphone(String mail, String ulica, String kod1, String kod2, String miasto) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/1d0c7d9bf9a041fb356d41982e213a32/a4f335b496d6e7c02b602d49b9a19d9a/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Iphone(driver, mail,ulica, kod1,kod2,miasto);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void aIphone(String mail, String ulica, String kod1, String kod2, String miasto) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/d71692c8af9caca6c58d74696a6dd9d7/5a58b32daa40e1cede7e0bcfe2753d59/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Iphone(driver, mail,ulica, kod1,kod2,miasto);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void aKaufland(String mail, String ulica, String kod1, String kod2, String miasto, String numer) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/e865f8be04d73eb75915496ba6e33cff/9faa3a6298cf18732f8ee1b6458b7f0e/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Kaufland(driver, mail,ulica, kod1,kod2,miasto,numer);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void lkKaufland(String mail, String ulica, String kod1, String kod2, String miasto, String numer) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/cb25419a907eb50e3f967500b8aa9d45/f42e7d09b263440e79113b090a2afcd5/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Kaufland(driver, mail,ulica, kod1,kod2,miasto,numer);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void gwKaufland(String mail, String ulica, String kod1, String kod2, String miasto, String numer) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {
        driver.get("https://neworklead.pl/zadanie/9dbdd0b22b6024c36040d32d11e29286/00d2550d3eb0d6bb17870f974e87c333/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Kaufland(driver, mail,ulica, kod1,kod2,miasto,numer);
//        } catch (Exception e) {
//            driver.quit();
//        }

    }

    public static void aPampers(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/26f0777aa53bc9b3ce987ef1d1d8561a/029e759d3a6fafed3566928b9f2032ce/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        konkursPampers(driver, mail,ulica,kod1,kod2,miasto,tel);

    }

    public static void lkPampers(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/e58af4cc1072cefc2a2bc5ad48c6bfa7/623abaf3f80a9233a80a1094d8b088b9/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        konkursPampers(driver, mail,ulica,kod1,kod2,miasto,tel);

    }

    public static void gwPampers(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/bde951ce2ee07c6183eab40d557bfade/b5efee9d073d9671ad27058a4d1368da/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        konkursPampers(driver, mail,ulica,kod1,kod2,miasto,tel);

    }

    public static void aZabka(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/1aa6b9119a95dd338938a2695166f029/c359f21b13682ec4f716f1f1875d6a78/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Zabka(driver, mail,ulica,kod1,kod2,miasto,tel);

    }

    public static void lkZabka(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/610e9d712141c52f2e3003d7f4d2b101/7bd7361e6ce1fea345ce385731609f52/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Zabka(driver, mail,ulica,kod1,kod2,miasto,tel);

    }

    public static void gwZabka(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/1c36702e80605932ab76109fe268ee0d/079fbdd6ec51b60aa7705f76ac956350/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Zabka(driver, mail,ulica,kod1,kod2,miasto,tel);

    }

    public static void aRossman(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/2a9ce189a3f1a2332733e3f1024e8a83/2f37fa89fd2f906ae1baf35d2c48edf4/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Rossman(driver, mail,ulica,kod1,kod2,miasto, tel);

    }

    public static void lkRossman(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/e5b4790f3767416f60d4086929d1ad52/72dd07c48dcea5c6ff2ce728c569fcb6/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Rossman(driver, mail,ulica,kod1,kod2,miasto, tel);

    }

    public static void gwRossman(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/120eb33630eb7958efe96fcf230a5bd3/45fced5122f316d2d5123c5d1afb2821/d654be842d14f320ad92ef039fb6aa4c");
        Thread.sleep(6000);
        Rossman(driver, mail,ulica,kod1,kod2,miasto, tel);

    }

    public static void EveryDD(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/695a22ce9d707573217fbb0f9594d4f6/b4e3d0ccbfcb8694caae6b5fe18c60c1/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void strzEveryTar(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/31eb18afa660af614c2e8026b8019c7b/262a2dbebf8a9ab6b5e29f4a3bde2bae/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void strzEveryDC(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/766757eb8b7e1c1a9a0c3bf5aa922207/56e214d6cebc48951ecaf8e519c5265b/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void strzEveryAF(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/ea79978b6d7c79ef013187a1611a9d3b/80f7dcfdfdea534a0875d520cad01223/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void EveryTAR(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/b4e73b4222f071e582f0a37f459640df/c63e8ec1bd0531f3458108bfa75b0c76/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void Every2Cpl(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/4da339431f5ffa38df6387479a19356a/8004328cb41edd6adaccf4c7b3a7b05c/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void aEvery1(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/8a85450a18241028e5008078075cc94c/3a286d57b7c27232c4949b0ed00f8141/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void gwEveryAF(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/37839c9829e4ab5374c715e0e79f7e7f/cbc6b8a70fb6f5fb478c53fafb9b761f/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void gwEveryDD(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/b87f13fd1265ff3a8af1eeb29f82a9f7/2410ac85f6df6f53bc6c7946eae4ae42/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void aEvery2CPL(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/0f2903e2d635751383fcf3e4d5673e15/5bbd6baa47357756839a002e3b072af2/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }

    public static void gwEvery2CPL(String mail, String odp) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://neworklead.pl/zadanie/56549c5f48a7fef87bff27dec4b0a1a8/9c366d0c3ef0c199116187b91f3db181/d654be842d14f320ad92ef039fb6aa4c");
//        driver.get("https://www.everydayme.pl/dom-i-ogrod/dom/wiosenne-porzadki");
        Thread.sleep(6000);
        Neworklead.Everyday(driver,mail,odp);
    }
}
