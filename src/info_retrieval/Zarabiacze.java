package info_retrieval;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class Zarabiacze extends Narzedzia {

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
        Narzedzia.clickXY(1428, 153);
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
        driver.findElement(By.xpath("//*[@id=\"registerPassword\"]")).sendKeys(mail + "V2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"registerButton\"]")).click();
        Thread.sleep(5000);
        for (int i = 0; i < 7; i++) {
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
                Narzedzia.clickXY(490, 760);
                break;
            case 1:
                Narzedzia.clickXY(800, 760);
                break;
            case 2:
                Narzedzia.clickXY(110, 760);
                break;
            case 3:
                Narzedzia.clickXY(1420, 760);
                break;
        }
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"AddItem\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/a[2]")).click();
        Thread.sleep(10000);
        driver.quit();

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
        String dataUr = dzien + "." + mies + "." + "rok";
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        driver.get("https://zarabiacze.pl/action/896/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(8000);
        Narzedzia.clickXY(1382, 197);

        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[2]/div[1]/input")).sendKeys(mail + "V2");
        if (plec == 0) {
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys(Narzedzia.imieZenskie[imieZenskie]);
            Thread.sleep(1000);
            char[] nazw = Narzedzia.nazwisko[randomNazwisko].toCharArray();
            if (nazw[nazw.length - 1] == 'i')
                nazw[nazw.length - 1] = 'a';
            String nazwisko1 = new String(nazw);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[4]/input")).sendKeys(nazwisko1);
        } else {
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys(Narzedzia.imieMeskie[imieMeskie]);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/main/div/div/div/div/div/div[2]/div/form/div[4]/input")).sendKeys(Narzedzia.nazwisko[randomNazwisko]);
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
        for (int i = 0; i < 5; i++)
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(10000);
        driver.quit();
    }

    public static void Vipiphone(String mail, String kod, String ulica, String miasto) throws InterruptedException, AWTException {
        Random r = new Random();
        int imieZenskie = r.nextInt(153);
        int imieMeskie = r.nextInt(229);
        int randomNazwisko = r.nextInt(199);
        int plec = r.nextInt(2);
        int dzien = r.nextInt(29) + 1;
        int mies = r.nextInt(11) + 1;
        int rok = r.nextInt(1998 - 1980 + 1) + 1980;
        String dataUr = dzien + "." + mies + "." + "rok";
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        driver.get("https://zarabiacze.pl/action/900/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(8000);
        driver.findElement(By.xpath("/html/body/div[2]/button")).click();
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
        if (plec == 0) {
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[1]/div[1]/div[1]/div/div[1]/label")).click();
            driver.findElement(By.xpath("//*[@id=\"prenom\"]")).sendKeys(Narzedzia.imieMeskie[imieMeskie]);
            driver.findElement(By.xpath("//*[@id=\"nom\"]")).sendKeys(Narzedzia.nazwisko[randomNazwisko]);
        } else {
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[1]/div[1]/div[1]/div/div[2]/label")).click();
            driver.findElement(By.xpath("//*[@id=\"prenom\"]")).sendKeys(Narzedzia.imieZenskie[imieZenskie]);
            char[] nazw = Narzedzia.nazwisko[randomNazwisko].toCharArray();
            if (nazw[nazw.length - 1] == 'i')
                nazw[nazw.length - 1] = 'a';
            String nazwisko1 = new String(nazw);
            driver.findElement(By.xpath("//*[@id=\"nom\"]")).sendKeys(nazwisko1);
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        Select dzienUro = new Select(driver.findElement(By.xpath("//*[@id=\"jour\"]")));
        Thread.sleep(1000);
        dzienUro.selectByValue(String.valueOf(dzien));
        Select miesUro = new Select(driver.findElement(By.xpath("//*[@id=\"mois\"]")));
        Thread.sleep(1000);
        miesUro.selectByValue(String.valueOf(mies));
        Select rokUro = new Select(driver.findElement(By.xpath("//*[@id=\"annee\"]")));
        Thread.sleep(1000);
        rokUro.selectByValue(String.valueOf(rok));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"code_postal\"]")).sendKeys(kod);
        driver.findElement(By.xpath("//*[@id=\"adresse\"]")).sendKeys(ulica);
        driver.findElement(By.xpath("//*[@id=\"ville\"]")).sendKeys(miasto);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ville\"]")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[1]/div[2]/button")).click();

        Thread.sleep(8000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1000);
        /*
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mrcbuch123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div/div/div/div/form/div/div[3]/div/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div/div/div/div/form/div/div[4]/button")).click();
        Thread.sleep(1000);

        Narzedzia.clickXY(605,196);
        Narzedzia.Kopiuj(mail);
        Thread.sleep(500);
        Narzedzia.Wklej();
        Narzedzia.clickXY(947,196);
        Narzedzia.Kopiuj("Mrcbuch123");
        Thread.sleep(500);
        Narzedzia.Wklej();
        Narzedzia.clickXY(486,297);
        Narzedzia.clickXY(486,277);
        Narzedzia.clickXY(1267,196);
        Thread.sleep(20000);
        */
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/a")).click();
        Thread.sleep(8000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/a")).click();
        Thread.sleep(8000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/a")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    public static void Rankomat(String tel) throws InterruptedException, AWTException {
        Random r = new Random();
        int imieZenskie = r.nextInt(153);
        int imieMeskie = r.nextInt(229);
        int randomNazwisko = r.nextInt(199);
        int plec = r.nextInt(2);
        int dzien = r.nextInt(29) + 1;
        int mies = r.nextInt(11) + 1;
        int rok = r.nextInt(1998 - 1980 + 1) + 1980;
        int rokProdukcji = r.nextInt(10);
        int markaAudi = r.nextInt(6);
        int rodzajPaliwa = r.nextInt(3);
        int pojemnoscSilnika = r.nextInt(3);
        int dzienUbe = r.nextInt(29) + 1;
        int miesiacUbe = r.nextInt(11) + 1;
        String dataUbe = dzienUbe + miesiacUbe + "2019";
        String dataUr = dzien + "." + mies + "." + "rok";
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        driver.get("https://zarabiacze.pl/action/897/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(7000);
        //driver.findElement(By.xpath("/html/body/section[2]/section[1]/section[3]/div/div/div[1]/a")).click();
        Narzedzia.clickXY(503, 616);
        Thread.sleep(9000);
        switch (0) {
            case 0:
                Select rokP1 = new Select(driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[1]/section/section/div[1]/div[2]/div/div[1]/div/div/rank-select/div/div/div[1]")));
                Thread.sleep(1000);
                rokP1.selectByValue("1985");
                Thread.sleep(1000);
                Select marka = new Select(driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[1]/section/section/div[2]/div[2]/div/div[1]/div/div/rank-select")));
                Thread.sleep(1000);
                marka.selectByValue("Audi");
                Thread.sleep(1000);
                Select model = new Select(driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[1]/section/section/div[3]/div[2]/div/div[1]/div/div/rank-select")));
                Thread.sleep(1000);
                model.selectByIndex(markaAudi);
                Thread.sleep(1000);
                Select rodzaj = new Select(driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[1]/section/section/div[4]/div[2]/div/div[1]/div/div/rank-select")));
                Thread.sleep(1000);
                rodzaj.selectByIndex(rodzajPaliwa);
                Select pojemnosc = new Select(driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[1]/section/section/div[5]/div[2]/div/div[1]/div/div/rank-select")));
                Thread.sleep(1000);
                pojemnosc.selectByIndex(pojemnoscSilnika);
                Thread.sleep(1000);
                Select drzwi = new Select(driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[1]/section/section/div[6]/div[2]/div/div[1]/div/div/rank-select")));
                Thread.sleep(1000);
                drzwi.selectByIndex(0);
                Thread.sleep(1000);
                Select wersja = new Select(driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[1]/section/section/div[7]/div[2]/div/div[1]/div/div/rank-select")));
                Thread.sleep(1000);
                wersja.selectByIndex(0);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[1]/section/section/div[10]/div[2]/div/div[1]/div/rank-datepicker/div/div[1]/input[1]")).sendKeys(dataUbe);
                Thread.sleep(1000);
                Narzedzia.clickXY(1700, 418);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/rank-form/section[3]/section/div/div[1]/div[1]/div/div[2]/div/div[1]/div/label")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/section[2]/main/section/form[2]/div/div[2]/button")).click();
                Thread.sleep(3000);
        }
    }

    public static void RankomatTravel(String mail) throws InterruptedException, AWTException {
        Random r = new Random();
        int kraje = r.nextInt(29);
        int cel = r.nextInt(4);
        int dzienPocz = r.nextInt(28 - 20 + 1) + 20;
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
        driver.get("https://zarabiacze.pl/action/899/66d8eb8b90df0ee2fe42c70f6140d3c9");
        /*
        Thread.sleep(12000);
        Narzedzia.Zmniejsz(3);
        Narzedzia.clickXY(1244,1010);
        */
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
        int dzienPocz = r.nextInt(28 - 20 + 1) + 20;
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
        driver.get("https://zarabiacze.pl/action/904/66d8eb8b90df0ee2fe42c70f6140d3c9");

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

    public static void TmobilePremium(String numer) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/832/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(13000);
        Narzedzia.clickXY(1643, 997);
        Narzedzia.clickXY(845, 644);
        Thread.sleep(3000);
        Narzedzia.clickXY(654, 674);
        Thread.sleep(3000);
        Narzedzia.Kopiuj(numer);
        Narzedzia.clickXY(928, 512);
        Narzedzia.Wklej();
        Narzedzia.clickXY(741, 614);
        Narzedzia.clickXY(741, 689);
        Thread.sleep(1000);
        Narzedzia.clickXY(937, 764);
        Thread.sleep(8000);
        driver.quit();

    }

    public static void TmobilePremium2(String numer) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/886/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(13000);
        Narzedzia.clickXY(1643, 997);
        Narzedzia.clickXY(845, 644);
        Thread.sleep(3000);
        Narzedzia.clickXY(654, 674);
        Thread.sleep(3000);
        Narzedzia.Kopiuj(numer);
        Narzedzia.clickXY(928, 512);
        Narzedzia.Wklej();
        Narzedzia.clickXY(741, 614);
        Narzedzia.clickXY(741, 689);
        Thread.sleep(1000);
        Narzedzia.clickXY(937, 764);
        Thread.sleep(8000);
        driver.quit();

    }

    public static void Tmobile3(String numer) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/876/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(13000);
        Narzedzia.clickXY(1643, 997);
        Narzedzia.clickXY(845, 644);
        Thread.sleep(3000);
        Narzedzia.clickXY(654, 674);
        Thread.sleep(3000);
        Narzedzia.Kopiuj(numer);
        Narzedzia.clickXY(928, 512);
        Narzedzia.Wklej();
        Narzedzia.clickXY(741, 614);
        Narzedzia.clickXY(741, 689);
        Thread.sleep(1000);
        Narzedzia.clickXY(937, 764);
        Thread.sleep(8000);
        driver.quit();

    }

    public static void Tmobile(String numer, String url) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        driver.manage().window().maximize();
        driver.get(url);

        Thread.sleep(13000);
        Narzedzia.clickXY(1643, 997);
        Narzedzia.clickXY(845, 644);
        Thread.sleep(3000);
        Narzedzia.clickXY(654, 674);
        Thread.sleep(3000);
        Narzedzia.Kopiuj(numer);
        Narzedzia.clickXY(928, 512);
        Narzedzia.Wklej();
        Narzedzia.clickXY(741, 614);
        Thread.sleep(1000);
        Narzedzia.clickXY(741, 689);
        Thread.sleep(1000);
        Narzedzia.clickXY(937, 764);
        Thread.sleep(8000);
        driver.quit();

    }

    public static void Tauron(String mail, String miasto, String kod, String tel, String imie, String nazwisko, String odpowiedz) throws InterruptedException, AWTException {
        Random r = new Random();
        int dzien = r.nextInt(29) + 1;
        int mies = r.nextInt(11) + 1;
        int rok = r.nextInt(1998 - 1980 + 1) + 1980;
        int kiedy = r.nextInt(3);
        int jaki = r.nextInt(5);
        int jaki2 = r.nextInt(7);
        int jakiR = r.nextInt(2);
        String dataUr = dzien + "." + mies + "." + "rok";
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Robot robot = new Robot();
        driver.get("https://zarabiacze.pl/action/673/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(7000);
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/ul/div[1]/div/p[4]/a")).click();
        Thread.sleep(3000);
        Narzedzia.clickXY(650, 714);
        Narzedzia.clickXY(650, 714);
        Narzedzia.clickXY(650, 714);
        Thread.sleep(2000);
        Narzedzia.Zmniejsz(4);
        Thread.sleep(2000);
        switch (kiedy) {
            case 0:
                Narzedzia.clickXY(878, 518);
                break;
            case 1:
                Narzedzia.clickXY(878, 544);
                break;
            case 2:
                Narzedzia.clickXY(878, 567);
                break;
        }
        Thread.sleep(2000);
        switch (jaki) {
            case 0:
                Narzedzia.clickXY(878, 603);
                break;
            case 1:
                Narzedzia.clickXY(878, 627);
                break;
            case 2:
                Narzedzia.clickXY(878, 655);
                break;
            case 3:
                Narzedzia.clickXY(1034, 603);
                break;
            case 4:
                Narzedzia.clickXY(1033, 627);
                break;
        }
        Thread.sleep(2000);
        switch (jakiR) {
            case 0:
                Narzedzia.clickXY(878, 685);
                break;
            case 1:
                Narzedzia.clickXY(878, 713);
                break;
        }
        Thread.sleep(2000);
        Narzedzia.clickXY(878, 797);
        Thread.sleep(2000);
        switch (jaki2) {
            case 0:
                Narzedzia.clickXY(878, 855);
                break;
            case 1:
                Narzedzia.clickXY(878, 882);
                break;
            case 2:
                Narzedzia.clickXY(878, 912);
                break;
            case 3:
                Narzedzia.clickXY(878, 933);
                break;
            case 4:
                Narzedzia.clickXY(1033, 857);
                break;
            case 5:
                Narzedzia.clickXY(1034, 881);
                break;
            case 6:
                Narzedzia.clickXY(1033, 909);
                break;
        }
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);

        Narzedzia.Kopiuj(imie);
        Thread.sleep(2000);
        Narzedzia.clickXY(881, 829);
        Thread.sleep(2000);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(nazwisko);
        Thread.sleep(2000);
        Narzedzia.clickXY(988, 829);
        Thread.sleep(2000);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(tel);
        Thread.sleep(2000);
        Narzedzia.clickXY(881, 859);
        Thread.sleep(2000);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(mail);
        Thread.sleep(2000);
        Narzedzia.clickXY(881, 885);
        Thread.sleep(2000);
        Narzedzia.Wklej();
        Narzedzia.Kopiuj(miasto);
        Thread.sleep(2000);
        Narzedzia.clickXY(881, 913);
        Thread.sleep(2000);
        Narzedzia.Wklej();
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        Narzedzia.Kopiuj(kod);
        Thread.sleep(2000);
        Narzedzia.clickXY(881, 936);
        Thread.sleep(2000);
        Narzedzia.Wklej();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(2000);
        Narzedzia.Kopiuj(odpowiedz);
        Thread.sleep(2000);
        Narzedzia.clickXY(881, 253);
        Thread.sleep(2000);
        Narzedzia.Wklej();
        Thread.sleep(1000);

        Narzedzia.clickXY(693, 387);
        Thread.sleep(1000);
        Narzedzia.clickXY(693, 429);
        Thread.sleep(1000);
        Narzedzia.clickXY(693, 492);
        Thread.sleep(1000);
        Narzedzia.clickXY(693, 572);
        Thread.sleep(1000);
        Narzedzia.clickXY(693, 632);
        Thread.sleep(1000);
        Narzedzia.clickXY(693, 706);
        Thread.sleep(1000);
        Narzedzia.clickXY(693, 789);
        Thread.sleep(1000);
        Narzedzia.clickXY(693, 839);

        Thread.sleep(1000);
        Narzedzia.clickXY(693, 961);
        Thread.sleep(1000);
        Narzedzia.clickXY(1196, 993);
        Thread.sleep(10000);
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
        } else {
            imie = genImieMes();
            nazwisko = genNazwisko();
        }
        driver.manage().window().maximize();
        driver.get("https://zarabiacze.pl/action/911/66d8eb8b90df0ee2fe42c70f6140d3c9");

        Thread.sleep(8000);
        Kopiuj(mail);
        clickXY(1283, 540);
        Thread.sleep(1000);
        Wklej();
        Kopiuj(mail + "V2");
        clickXY(1283, 605);
        Thread.sleep(1000);
        Wklej();
        clickXY(1165, 662);
        clickXY(1165, 707);
        clickXY(1341, 810);
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
        try {
            driver.findElement(By.xpath("//*[text()='Walutomat.pl']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div[1]/nh-html-compile/div/div/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr/td/a")).click();

            Thread.sleep(7000);
            clickXY(955, 450);
            Thread.sleep(3000);
            clickXY(765, 306);
            Thread.sleep(2000);
            Kopiuj(imie);
            clickXY(780, 392);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwisko);
            clickXY(1014, 392);
            Thread.sleep(1000);
            Wklej();
            clickXY(835, 457);
            Thread.sleep(1000);
            clickXY(898, 530);
            Thread.sleep(1000);
            clickXY(898, 530);
            Thread.sleep(1000);
            clickXY(911, 602);

            Kopiuj(adres);
            clickXY(780, 716);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(776, 790);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(miasto);
            clickXY(932, 790);
            Thread.sleep(1000);
            Wklej();
            clickXY(1076, 790);
            Thread.sleep(1000);
            clickXY(1103, 867);
            Thread.sleep(1000);
            clickXY(944, 1010);

            Thread.sleep(3000);
            robot.mouseMove(1912, 408);
            Thread.sleep(1000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(1912, 712);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(1000);
            clickXY(774, 369);
            clickXY(774, 536);
            clickXY(774, 753);
            clickXY(774, 882);
            Thread.sleep(1000);
            clickXY(945, 946);

            Thread.sleep(4000);
            clickXY(111, 267);
            Thread.sleep(1000);
            clickXY(79, 330);
            Thread.sleep(20000);
            clickXY(105, 470);
            Thread.sleep(1000);
            clickXY(110, 560);
            Thread.sleep(30000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }
    }

    public static void Got(String mail, String login, String url) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get(url);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"registerEmail\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(mail);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"registerPlayNow\"]")).click();
            Thread.sleep(6000);
            driver.quit();

            clickXY(630, 1068);
            Kopiuj(mail);
            Thread.sleep(2000);
            clickXY(1056, 454);
            Thread.sleep(1000);
            Wklej();
            clickXY(1056, 504);
            Thread.sleep(1000);
            Wklej();
            clickXY(1056, 558);
            Thread.sleep(1000);
            clickXY(1056, 558);

            Thread.sleep(8000);
            clickXY(484, 826);
            Thread.sleep(35000);

            clickXY(491, 823);
            Thread.sleep(156);
            clickXY(491, 823);
            Thread.sleep(1144);
            clickXY(491, 823);
            Thread.sleep(125);
            clickXY(491, 823);
            Thread.sleep(976);
            clickXY(491, 823);
            Thread.sleep(104);
            clickXY(491, 823);
            Thread.sleep(1988);
            clickXY(491, 823);
            Thread.sleep(44);
            clickXY(491, 823);
            Thread.sleep(1364);
            clickXY(491, 823);
            Thread.sleep(89);
            clickXY(491, 823);
            Thread.sleep(928);
            clickXY(491, 823);
            Thread.sleep(132);
            clickXY(491, 823);
            Thread.sleep(996);
            clickXY(491, 823);
            Thread.sleep(108);
            clickXY(491, 823);
            Thread.sleep(1068);
            clickXY(491, 823);
            Thread.sleep(112);
            clickXY(491, 823);
            Thread.sleep(960);
            clickXY(491, 823);
            Thread.sleep(68);
            clickXY(491, 823);
            Thread.sleep(2284);
            clickXY(491, 823);
            Thread.sleep(109);
            clickXY(491, 823);
            Thread.sleep(3104);
            clickXY(471, 585);
            Thread.sleep(64);
            clickXY(471, 585);
            Thread.sleep(2177);
            clickXY(471, 585);
            Thread.sleep(88);
            clickXY(471, 585);
            Thread.sleep(2312);
            clickXY(1581, 888);
            Thread.sleep(60);
            clickXY(1581, 888);
            Thread.sleep(1980);
            clickXY(1581, 888);
            Thread.sleep(92);
            clickXY(1581, 888);
            Thread.sleep(1756);
            clickXY(1581, 888);
            Thread.sleep(72);
            clickXY(1581, 888);
            Thread.sleep(1460);
            clickXY(1581, 888);
            Thread.sleep(68);
            clickXY(1581, 888);
            Thread.sleep(1436);
            clickXY(1581, 888);
            Thread.sleep(65);
            clickXY(1581, 888);
            Thread.sleep(2888);
            clickXY(1876, 74);
            Thread.sleep(72);
            clickXY(1876, 74);
            Thread.sleep(3292);
            clickXY(918, 549);
            Thread.sleep(72);
            clickXY(918, 549);
            Thread.sleep(2345);
            clickXY(1362, 845);
            Thread.sleep(60);
            clickXY(1362, 845);
            Thread.sleep(2236);
            clickXY(300, 274);
            Thread.sleep(76);
            clickXY(300, 274);
            /* tu ZMIENIŁEM BYŁO 4785*/
            Thread.sleep(2785);
            clickXY(575, 562);
            Thread.sleep(56);
            clickXY(575, 562);
            Thread.sleep(2500);
            clickXY(980, 558);
            Thread.sleep(64);
            clickXY(980, 558);
            Thread.sleep(2380);
            clickXY(1372, 849);
            Thread.sleep(64);
            clickXY(1372, 849);
            Thread.sleep(2848);
            clickXY(312, 279);
            Thread.sleep(72);
            clickXY(312, 279);
            Thread.sleep(4342);
            clickXY(581, 474);
            Thread.sleep(72);
            clickXY(581, 474);
            Thread.sleep(2405);
            clickXY(987, 568);
            Thread.sleep(51);
            clickXY(987, 568);
            Thread.sleep(2216);
            clickXY(965, 245);
            Thread.sleep(56);
            clickXY(965, 245);
            Thread.sleep(2269);
            clickXY(622, 562);
            Thread.sleep(64);
            clickXY(622, 562);
            Thread.sleep(2724);
            clickXY(1358, 842);
            Thread.sleep(80);
            clickXY(1358, 842);
            Thread.sleep(2084);
            clickXY(1358, 842);
            Thread.sleep(60);
            clickXY(1358, 842);
            Thread.sleep(1496);
            clickXY(1358, 842);
            Thread.sleep(77);
            clickXY(1358, 842);
            Thread.sleep(2532);
            clickXY(1145, 430);
            Thread.sleep(48);
            clickXY(1145, 430);
            Thread.sleep(2144);
            clickXY(963, 837);
            Thread.sleep(68);
            clickXY(963, 837);
            Thread.sleep(3453);
            clickXY(1756, 439);
            Thread.sleep(56);
            clickXY(1756, 439);
            Thread.sleep(2120);
            clickXY(1386, 365);
            Thread.sleep(88);
            clickXY(1386, 365);
            /*TU ZMIENIŁEM BYŁO 4488*/
            Thread.sleep(2488);
            clickXY(1274, 432);
            Thread.sleep(60);
            clickXY(1274, 432);
            Thread.sleep(2033);
            clickXY(1382, 367);
            Thread.sleep(47);
            clickXY(1382, 367);
            Thread.sleep(1854);
            clickXY(1375, 368);
            Thread.sleep(60);
            clickXY(1375, 368);
            Thread.sleep(2284);
            clickXY(960, 550);
            Thread.sleep(60);
            clickXY(960, 550);
            Thread.sleep(2128);
            clickXY(1359, 844);
            Thread.sleep(72);
            clickXY(1359, 844);
            /*TU ZMIENIŁEM BYŁO 6681*/
            Thread.sleep(3681);
            clickXY(782, 791);
            Thread.sleep(32);
            clickXY(782, 791);
            Thread.sleep(4176);
            clickXY(1776, 468);
            Thread.sleep(66);
            clickXY(1776, 468);
            Thread.sleep(2043);
            clickXY(1393, 366);
            Thread.sleep(68);
            clickXY(1393, 366);
            Thread.sleep(3032);
            clickXY(1393, 366);
            Thread.sleep(60);
            clickXY(1393, 366);
            Thread.sleep(2381);
            clickXY(810, 703);
            Thread.sleep(72);
            clickXY(810, 703);
            Thread.sleep(2104);
            clickXY(810, 703);
            Thread.sleep(80);
            clickXY(810, 703);
            Thread.sleep(2012);
            clickXY(958, 838);
            Thread.sleep(56);
            clickXY(958, 838);
            Thread.sleep(3332);
            clickXY(958, 838);
            Thread.sleep(80);
            clickXY(958, 838);
            Thread.sleep(1444);
            clickXY(958, 838);
            Thread.sleep(72);
            clickXY(958, 838);
            Thread.sleep(3150);
            clickXY(958, 838);
            Thread.sleep(56);
            clickXY(958, 838);
            Thread.sleep(1392);
            clickXY(958, 838);
            Thread.sleep(60);
            clickXY(958, 838);
            Thread.sleep(2152);
            clickXY(958, 838);
            Thread.sleep(80);
            clickXY(958, 838);
            Thread.sleep(3020);
            clickXY(812, 419);
            Thread.sleep(84);
            clickXY(812, 419);
            Thread.sleep(1344);
            clickXY(812, 419);
            Thread.sleep(72);
            clickXY(812, 419);
            Thread.sleep(2501);
            clickXY(812, 419);
            Thread.sleep(76);
            clickXY(812, 419);
            Thread.sleep(1520);
            clickXY(812, 419);
            Thread.sleep(80);
            clickXY(812, 419);
            Thread.sleep(3029);
            clickXY(1251, 767);
            Thread.sleep(64);
            clickXY(1251, 767);
            Thread.sleep(1740);
            clickXY(1269, 817);
            Thread.sleep(108);
            clickXY(1269, 817);
            Thread.sleep(7457);
            clickXY(957, 769);
            Thread.sleep(72);
            clickXY(957, 769);
            Thread.sleep(12326);
            clickXY(957, 769);
            Thread.sleep(92);
            clickXY(957, 769);
            Thread.sleep(1628);
            clickXY(957, 769);
            Thread.sleep(76);
            clickXY(957, 769);
            Thread.sleep(2521);
            clickXY(959, 678);
            Thread.sleep(51);
            clickXY(959, 678);
            Thread.sleep(2052);
            clickXY(737, 405);
            Thread.sleep(64);
            clickXY(737, 405);
            Thread.sleep(1973);
            clickXY(1165, 851);
            Thread.sleep(60);
            clickXY(1165, 851);
            Thread.sleep(3528);
            clickXY(1165, 851);
            Thread.sleep(48);
            clickXY(1165, 851);
            Thread.sleep(6145);
            clickXY(1757, 461);
            Thread.sleep(76);
            clickXY(1757, 461);
            Thread.sleep(2501);
            clickXY(1398, 363);
            Thread.sleep(76);
            clickXY(1398, 363);
            Thread.sleep(4128);
            clickXY(1398, 363);
            Thread.sleep(72);
            clickXY(1398, 363);
            Thread.sleep(3908);
            clickXY(1398, 363);
            Thread.sleep(64);
            clickXY(1398, 363);
            Thread.sleep(2726);
            clickXY(1385, 812);
            Thread.sleep(68);
            clickXY(1385, 812);
            Thread.sleep(8108);
            clickXY(1830, 104);
            Thread.sleep(84);
            clickXY(1830, 104);
            Thread.sleep(3000);
            clickXY(1830, 104);
            Thread.sleep(104);
            clickXY(1830, 104);
            Thread.sleep(2969);
            clickXY(468, 576);
            Thread.sleep(48);
            clickXY(468, 576);
            Thread.sleep(3377);
            clickXY(1586, 889);
            Thread.sleep(64);
            clickXY(1586, 889);
            Thread.sleep(2032);
            clickXY(1586, 889);
            Thread.sleep(48);
            clickXY(1586, 889);
            Thread.sleep(2976);
            clickXY(1881, 74);
            Thread.sleep(64);
            clickXY(1881, 74);
            Thread.sleep(2201);
            clickXY(1781, 432);
            Thread.sleep(88);
            clickXY(1781, 432);
            Thread.sleep(2224);
            clickXY(1399, 369);
            Thread.sleep(72);
            clickXY(1399, 369);
            Thread.sleep(3028);
            clickXY(980, 541);
            Thread.sleep(68);
            clickXY(980, 541);
            Thread.sleep(2272);
            clickXY(1369, 860);
            Thread.sleep(48);
            clickXY(1369, 860);
            Thread.sleep(2658);
            clickXY(304, 274);
            Thread.sleep(60);
            clickXY(304, 274);
            Thread.sleep(3856);
            clickXY(304, 274);
            Thread.sleep(96);
            clickXY(304, 274);
            Thread.sleep(8033);
            clickXY(304, 274);
            Thread.sleep(112);
            clickXY(304, 274);
            Thread.sleep(2640);
            clickXY(922, 522);
            Thread.sleep(64);
            clickXY(922, 522);
            Thread.sleep(2033);
            clickXY(1121, 850);
            Thread.sleep(64);
            clickXY(1121, 850);
            Thread.sleep(3676);
            clickXY(1121, 850);
            Thread.sleep(68);
            clickXY(1121, 850);
            Thread.sleep(2212);
            clickXY(1763, 450);
            Thread.sleep(60);
            clickXY(1763, 450);
            Thread.sleep(4305);
            clickXY(1386, 373);
            Thread.sleep(76);
            clickXY(1386, 373);
            Thread.sleep(5648);
            clickXY(1386, 373);
            Thread.sleep(88);
            clickXY(1386, 373);
            Thread.sleep(3498);
            clickXY(1453, 238);
            Thread.sleep(80);
            clickXY(1453, 238);
            Thread.sleep(2436);
            clickXY(1454, 238);
            Thread.sleep(56);
            clickXY(1454, 238);
            Thread.sleep(1716);
            clickXY(1454, 238);
            Thread.sleep(56);
            clickXY(1454, 238);
            Thread.sleep(3084);
            clickXY(1423, 336);
            Thread.sleep(64);
            clickXY(1423, 336);
            /*TU ZMIENIŁEM BYŁO 9486*/
            Thread.sleep(4486);
            clickXY(1423, 336);
            Thread.sleep(52);
            clickXY(1423, 336);
            Thread.sleep(1624);
            clickXY(1423, 336);
            Thread.sleep(60);
            clickXY(1423, 336);
            Thread.sleep(2549);
            clickXY(1623, 213);
            Thread.sleep(55);
            clickXY(1623, 213);
            Thread.sleep(3269);
            clickXY(1358, 554);
            Thread.sleep(60);
            clickXY(1358, 554);
            Thread.sleep(2780);
            clickXY(993, 436);
            Thread.sleep(84);
            clickXY(993, 436);
            Thread.sleep(1784);
            clickXY(1350, 557);
            Thread.sleep(72);
            clickXY(1350, 557);
            Thread.sleep(2733);
            clickXY(1499, 212);
            Thread.sleep(68);
            clickXY(1499, 212);
            Thread.sleep(3989);

            clickXY(1507, 339);
            Thread.sleep(1000);
            clickXY(1507, 339);
            Thread.sleep(1000);
            clickXY(1884, 996);
            Kopiuj(login);
            Thread.sleep(2000);
            clickXY(1884, 996);
            Thread.sleep(2000);
            clickXY(1083, 740);
            Thread.sleep(2000);
            Wklej();
            Thread.sleep(1000);
            clickXY(1083, 613);
            clickXY(1083, 613);
            clickXY(1083, 613);
            Thread.sleep(4000);

            clickXY(1896, 17);
            Thread.sleep(3000);
            clickXY(1511, 243);
            Thread.sleep(1000);
            clickXY(1429, 560);
            Thread.sleep(10000);
            clickXY(630, 1068);
            clickXY(630, 1068);

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Got4lvl(String mail, String login, String url) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get(url);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"registerEmail\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(mail);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"registerPlayNow\"]")).click();
            Thread.sleep(6000);
            driver.quit();

            clickXY(630, 1068);
            Kopiuj(mail);
            Thread.sleep(2000);
            clickXY(1056, 454);
            Thread.sleep(1000);
            Wklej();
            clickXY(1056, 504);
            Thread.sleep(1000);
            Wklej();
            clickXY(1056, 558);
            Thread.sleep(1000);
            clickXY(1056, 558);

            Thread.sleep(8000);
            clickXY(484, 826);
            Thread.sleep(35000);

            Thread.sleep(1027);
            clickXY(1192, 621);
            Thread.sleep(59);
            clickXY(1192, 621);
            Thread.sleep(953);
            clickXY(1192, 621);
            Thread.sleep(64);
            clickXY(1192, 621);
            Thread.sleep(1424);
            clickXY(1192, 621);
            Thread.sleep(60);
            clickXY(1192, 621);
            Thread.sleep(1248);
            clickXY(1192, 621);
            Thread.sleep(60);
            clickXY(1192, 621);
            Thread.sleep(1056);
            clickXY(1192, 621);
            Thread.sleep(28);
            clickXY(1192, 621);
            Thread.sleep(952);
            clickXY(1192, 621);
            Thread.sleep(40);
            clickXY(1192, 621);
            Thread.sleep(984);
            clickXY(1192, 621);
            Thread.sleep(48);
            clickXY(1192, 621);
            Thread.sleep(1012);
            clickXY(1192, 621);
            Thread.sleep(56);
            clickXY(1192, 621);
            Thread.sleep(5077);
            clickXY(1192, 621);
            Thread.sleep(64);
            clickXY(1192, 621);
            Thread.sleep(3281);
            clickXY(469, 582);
            Thread.sleep(68);
            clickXY(469, 582);
            Thread.sleep(1980);
            clickXY(469, 582);
            Thread.sleep(88);
            clickXY(469, 582);
            Thread.sleep(2464);
            clickXY(1582, 890);
            Thread.sleep(64);
            clickXY(1582, 890);
            Thread.sleep(1752);
            clickXY(1582, 890);
            Thread.sleep(76);
            clickXY(1582, 890);
            Thread.sleep(2021);
            clickXY(1582, 890);
            Thread.sleep(72);
            clickXY(1582, 890);
            Thread.sleep(1352);
            clickXY(1582, 890);
            Thread.sleep(44);
            clickXY(1582, 890);
            Thread.sleep(1120);
            clickXY(1582, 890);
            Thread.sleep(80);
            clickXY(1582, 890);
            Thread.sleep(2928);
            clickXY(1882, 71);
            Thread.sleep(60);
            clickXY(1882, 71);
            Thread.sleep(2472);
            clickXY(928, 556);
            Thread.sleep(72);
            clickXY(928, 556);
            Thread.sleep(2226);
            clickXY(1369, 845);
            Thread.sleep(71);
            clickXY(1369, 845);
            Thread.sleep(7165);
            clickXY(1369, 845);
            Thread.sleep(80);
            clickXY(1369, 845);
            Thread.sleep(2184);
            clickXY(993, 553);
            Thread.sleep(80);
            clickXY(993, 553);
            Thread.sleep(1888);
            clickXY(1357, 846);
            Thread.sleep(64);
            clickXY(1357, 846);
            Thread.sleep(2137);
            clickXY(304, 278);
            Thread.sleep(64);
            clickXY(304, 278);
            Thread.sleep(3633);
            clickXY(738, 545);
            Thread.sleep(56);
            clickXY(738, 545);
            Thread.sleep(1956);
            clickXY(1001, 581);
            Thread.sleep(76);
            clickXY(1001, 581);
            Thread.sleep(1888);
            clickXY(974, 239);
            Thread.sleep(88);
            clickXY(974, 239);
            Thread.sleep(1776);
            clickXY(605, 634);
            Thread.sleep(80);
            clickXY(605, 634);
            Thread.sleep(2449);
            clickXY(1339, 845);
            Thread.sleep(72);
            clickXY(1339, 845);
            Thread.sleep(1852);
            clickXY(1339, 845);
            Thread.sleep(68);
            clickXY(1339, 845);
            Thread.sleep(1588);
            clickXY(1339, 845);
            Thread.sleep(56);
            clickXY(1339, 845);
            Thread.sleep(2020);
            clickXY(1166, 431);
            Thread.sleep(72);
            clickXY(1166, 431);
            Thread.sleep(1768);
            clickXY(958, 840);
            Thread.sleep(64);
            clickXY(957, 841);
            Thread.sleep(2862);
            clickXY(1778, 455);
            Thread.sleep(64);
            clickXY(1778, 455);
            Thread.sleep(1916);
            clickXY(1387, 368);
            Thread.sleep(76);
            clickXY(1387, 368);
            Thread.sleep(3012);
            clickXY(1387, 368);
            Thread.sleep(64);
            clickXY(1387, 368);
            Thread.sleep(1192);
            clickXY(1387, 368);
            Thread.sleep(60);
            clickXY(1387, 368);
            Thread.sleep(1720);
            clickXY(1387, 368);
            Thread.sleep(72);
            clickXY(1387, 368);
            Thread.sleep(2048);
            clickXY(965, 549);
            Thread.sleep(80);
            clickXY(965, 549);
            Thread.sleep(2309);
            clickXY(1375, 853);
            Thread.sleep(60);
            clickXY(1375, 853);
            Thread.sleep(2613);
            clickXY(316, 283);
            Thread.sleep(60);
            clickXY(314, 284);
            Thread.sleep(3016);
            clickXY(847, 576);
            Thread.sleep(80);
            clickXY(847, 576);
            Thread.sleep(3948);
            clickXY(1780, 444);
            Thread.sleep(68);
            clickXY(1780, 444);
            Thread.sleep(1901);
            clickXY(1383, 367);
            Thread.sleep(44);
            clickXY(1383, 367);
            Thread.sleep(2792);
            clickXY(1383, 367);
            Thread.sleep(60);
            clickXY(1383, 367);
            Thread.sleep(2032);
            clickXY(803, 700);
            Thread.sleep(40);
            clickXY(803, 700);
            Thread.sleep(1732);
            clickXY(803, 700);
            Thread.sleep(28);
            clickXY(803, 700);
            Thread.sleep(1405);
            clickXY(945, 848);
            Thread.sleep(76);
            clickXY(945, 848);
            Thread.sleep(2729);
            clickXY(945, 848);
            Thread.sleep(67);
            clickXY(945, 848);
            Thread.sleep(1073);
            clickXY(945, 848);
            Thread.sleep(43);
            clickXY(945, 848);
            Thread.sleep(1165);
            clickXY(947, 841);
            Thread.sleep(84);
            clickXY(947, 841);
            Thread.sleep(1188);
            clickXY(947, 841);
            Thread.sleep(56);
            clickXY(947, 841);
            Thread.sleep(896);
            clickXY(947, 841);
            Thread.sleep(72);
            clickXY(947, 841);
            Thread.sleep(1032);
            clickXY(947, 841);
            Thread.sleep(60);
            clickXY(947, 841);
            Thread.sleep(1748);
            clickXY(746, 417);
            Thread.sleep(52);
            clickXY(746, 417);
            Thread.sleep(924);
            clickXY(746, 417);
            Thread.sleep(72);
            clickXY(746, 417);
            Thread.sleep(3260);
            clickXY(1249, 762);
            Thread.sleep(88);
            clickXY(1249, 762);
            Thread.sleep(888);
            clickXY(1249, 762);
            Thread.sleep(65);
            clickXY(1249, 762);
            Thread.sleep(924);
            clickXY(1249, 762);
            Thread.sleep(88);
            clickXY(1249, 762);
            Thread.sleep(837);
            clickXY(1249, 762);
            Thread.sleep(88);
            clickXY(1249, 762);
            Thread.sleep(992);
            clickXY(1247, 819);
            Thread.sleep(72);
            clickXY(1247, 819);
            Thread.sleep(6376);
            clickXY(957, 767);
            Thread.sleep(72);
            clickXY(957, 767);
            Thread.sleep(8217);
            clickXY(957, 767);
            Thread.sleep(68);
            clickXY(957, 767);
            Thread.sleep(2881);
            clickXY(988, 759);
            Thread.sleep(52);
            clickXY(988, 759);
            Thread.sleep(1240);
            clickXY(988, 759);
            Thread.sleep(68);
            clickXY(988, 759);
            Thread.sleep(2301);
            clickXY(970, 673);
            Thread.sleep(52);
            clickXY(970, 673);
            Thread.sleep(2240);
            clickXY(709, 402);
            Thread.sleep(76);
            clickXY(709, 402);
            Thread.sleep(2060);
            clickXY(1168, 852);
            Thread.sleep(60);
            clickXY(1168, 852);
            Thread.sleep(3688);
            clickXY(1168, 852);
            Thread.sleep(96);
            clickXY(1168, 852);
            Thread.sleep(5082);
            clickXY(1767, 435);
            Thread.sleep(64);
            clickXY(1767, 435);
            Thread.sleep(2300);
            clickXY(1396, 358);
            Thread.sleep(76);
            clickXY(1396, 358);
            Thread.sleep(3264);
            clickXY(1396, 358);
            Thread.sleep(112);
            clickXY(1396, 358);
            Thread.sleep(3448);
            clickXY(1396, 358);
            Thread.sleep(84);
            clickXY(1396, 358);
            Thread.sleep(1677);
            clickXY(1382, 813);
            Thread.sleep(80);
            clickXY(1382, 813);
            Thread.sleep(7753);
            clickXY(1843, 107);
            Thread.sleep(72);
            clickXY(1843, 107);
            Thread.sleep(1880);
            clickXY(1843, 106);
            Thread.sleep(56);
            clickXY(1843, 106);
            Thread.sleep(2713);
            clickXY(470, 577);
            Thread.sleep(64);
            clickXY(470, 577);
            Thread.sleep(2528);
            clickXY(1589, 893);
            Thread.sleep(68);
            clickXY(1589, 893);
            Thread.sleep(1752);
            clickXY(1589, 893);
            Thread.sleep(64);
            clickXY(1589, 893);
            Thread.sleep(2112);
            clickXY(1872, 71);
            Thread.sleep(56);
            clickXY(1872, 71);
            Thread.sleep(1784);
            clickXY(1750, 463);
            Thread.sleep(64);
            clickXY(1750, 463);
            Thread.sleep(1633);
            clickXY(1393, 369);
            Thread.sleep(56);
            clickXY(1393, 369);
            Thread.sleep(2477);
            clickXY(969, 550);
            Thread.sleep(72);
            clickXY(969, 550);
            Thread.sleep(1612);
            clickXY(1383, 838);
            Thread.sleep(72);
            clickXY(1383, 838);
            Thread.sleep(1937);
            clickXY(310, 285);
            Thread.sleep(71);
            clickXY(310, 285);
            Thread.sleep(3000);
            clickXY(673, 833);
            Thread.sleep(72);
            clickXY(673, 833);
            Thread.sleep(1173);
            clickXY(673, 833);
            Thread.sleep(59);
            clickXY(673, 833);
            Thread.sleep(2313);
            clickXY(673, 833);
            Thread.sleep(80);
            clickXY(673, 833);
            Thread.sleep(2264);
            clickXY(945, 511);
            Thread.sleep(112);
            clickXY(945, 511);
            Thread.sleep(1560);
            clickXY(1179, 841);
            Thread.sleep(72);
            clickXY(1179, 841);
            Thread.sleep(3497);
            clickXY(1116, 823);
            Thread.sleep(64);
            clickXY(1116, 823);
            Thread.sleep(1852);
            clickXY(1750, 444);
            Thread.sleep(40);
            clickXY(1750, 444);
            Thread.sleep(2217);
            clickXY(1377, 359);
            Thread.sleep(64);
            clickXY(1377, 359);
            Thread.sleep(3920);
            clickXY(1377, 359);
            Thread.sleep(72);
            clickXY(1377, 359);
            Thread.sleep(1704);
            clickXY(1377, 359);
            Thread.sleep(68);
            clickXY(1377, 359);
            Thread.sleep(1308);
            clickXY(1377, 359);
            Thread.sleep(64);
            clickXY(1377, 359);
            Thread.sleep(1104);
            clickXY(1377, 359);
            Thread.sleep(56);
            clickXY(1377, 359);
            Thread.sleep(2793);
            clickXY(1377, 359);
            Thread.sleep(73);
            clickXY(1377, 359);
            Thread.sleep(4108);
            clickXY(1377, 359);
            Thread.sleep(76);
            clickXY(1377, 359);
            Thread.sleep(2348);
            clickXY(1377, 359);
            Thread.sleep(56);
            clickXY(1377, 359);
            Thread.sleep(1144);
            clickXY(1377, 359);
            Thread.sleep(32);
            clickXY(1377, 359);
            Thread.sleep(2096);
            clickXY(1618, 219);
            Thread.sleep(72);
            clickXY(1618, 219);
            Thread.sleep(3029);
            clickXY(1358, 542);
            Thread.sleep(76);
            clickXY(1358, 542);
            Thread.sleep(3208);
            clickXY(1494, 212);
            Thread.sleep(48);
            clickXY(1494, 212);
            Thread.sleep(4577);
            clickXY(1741, 457);
            Thread.sleep(60);
            clickXY(1741, 457);
            Thread.sleep(2308);
            clickXY(1741, 457);
            Thread.sleep(96);
            clickXY(1741, 457);
            Thread.sleep(1985);
            clickXY(1381, 361);
            Thread.sleep(80);
            clickXY(1381, 361);
            Thread.sleep(2748);
            clickXY(922, 539);
            Thread.sleep(52);
            clickXY(922, 539);
            Thread.sleep(2192);
            clickXY(1184, 236);
            Thread.sleep(48);
            clickXY(1184, 236);
            Thread.sleep(1992);
            clickXY(1320, 633);
            Thread.sleep(56);
            clickXY(1320, 633);
            Thread.sleep(1833);
            clickXY(1390, 851);
            Thread.sleep(72);
            clickXY(1390, 851);
            Thread.sleep(1709);
            clickXY(1384, 850);
            Thread.sleep(56);
            clickXY(1384, 850);
            Thread.sleep(5688);
            clickXY(1462, 236);
            Thread.sleep(72);
            clickXY(1462, 236);
            Thread.sleep(1956);
            clickXY(1761, 448);
            Thread.sleep(36);
            clickXY(1761, 448);
            Thread.sleep(1772);
            clickXY(1371, 365);
            Thread.sleep(49);
            clickXY(1371, 365);
            Thread.sleep(1824);
            clickXY(1371, 365);
            Thread.sleep(44);
            clickXY(1371, 365);
            Thread.sleep(2060);
            clickXY(996, 551);
            Thread.sleep(40);
            clickXY(996, 551);
            Thread.sleep(1600);
            clickXY(996, 551);
            Thread.sleep(28);
            clickXY(996, 551);
            Thread.sleep(2757);
            clickXY(1173, 843);
            Thread.sleep(56);
            clickXY(1173, 843);
            Thread.sleep(4581);
            clickXY(1772, 453);
            Thread.sleep(64);
            clickXY(1772, 453);
            Thread.sleep(1720);
            clickXY(1400, 369);
            Thread.sleep(64);
            clickXY(1400, 369);
            Thread.sleep(1680);
            clickXY(1400, 369);
            Thread.sleep(80);
            clickXY(1400, 369);
            Thread.sleep(2356);
            clickXY(1000, 570);
            Thread.sleep(72);
            clickXY(1000, 570);
            Thread.sleep(2016);
            clickXY(944, 234);
            Thread.sleep(72);
            clickXY(944, 234);
            Thread.sleep(2076);
            clickXY(1069, 593);
            Thread.sleep(76);
            clickXY(1069, 593);
            Thread.sleep(2042);
            clickXY(1337, 837);
            Thread.sleep(71);
            clickXY(1337, 837);
            Thread.sleep(1729);
            clickXY(1428, 330);
            Thread.sleep(56);
            clickXY(1428, 330);
            Thread.sleep(2208);
            clickXY(1000, 787);
            Thread.sleep(64);
            clickXY(996, 789);
            Thread.sleep(2472);
            clickXY(1188, 846);
            Thread.sleep(56);
            clickXY(1188, 846);
            Thread.sleep(1976);
            clickXY(1136, 672);
            Thread.sleep(40);
            clickXY(1136, 672);
            Thread.sleep(4397);
            clickXY(1457, 235);
            Thread.sleep(60);
            clickXY(1457, 235);
            Thread.sleep(2236);
            clickXY(1773, 450);
            Thread.sleep(20);
            clickXY(1773, 450);
            Thread.sleep(1825);
            clickXY(1372, 371);
            Thread.sleep(48);
            clickXY(1372, 371);
            Thread.sleep(2048);
            clickXY(1372, 371);
            Thread.sleep(72);
            clickXY(1372, 371);
            Thread.sleep(2096);
            clickXY(1002, 465);
            Thread.sleep(72);
            clickXY(1002, 465);
            Thread.sleep(1896);
            clickXY(950, 840);
            Thread.sleep(52);
            clickXY(950, 840);
            Thread.sleep(2897);
            clickXY(962, 849);
            Thread.sleep(60);
            clickXY(962, 849);
            Thread.sleep(2100);
            clickXY(752, 416);
            Thread.sleep(64);
            clickXY(752, 416);
            Thread.sleep(2500);
            clickXY(1266, 830);
            Thread.sleep(44);
            clickXY(1266, 830);
            Thread.sleep(3325);
            clickXY(967, 848);
            Thread.sleep(61);
            clickXY(967, 848);
            Thread.sleep(10812);
            clickXY(975, 770);
            Thread.sleep(64);
            clickXY(975, 770);
            Thread.sleep(5326);
            clickXY(1784, 456);
            Thread.sleep(64);
            clickXY(1784, 456);
            Thread.sleep(4320);
            clickXY(1366, 368);
            Thread.sleep(68);
            clickXY(1366, 368);
            Thread.sleep(3968);
            clickXY(1366, 368);
            Thread.sleep(72);
            clickXY(1366, 368);
            Thread.sleep(4245);
            clickXY(1420, 367);
            Thread.sleep(156);
            clickXY(1422, 365);
            Thread.sleep(18658);
            clickXY(1395, 810);
            Thread.sleep(68);
            clickXY(1395, 810);
            Thread.sleep(2249);
            clickXY(1386, 814);
            Thread.sleep(80);
            clickXY(1386, 814);
            Thread.sleep(6353);
            clickXY(1386, 814);
            Thread.sleep(216);
            clickXY(1386, 814);
            Thread.sleep(14538);
            clickXY(1386, 814);
            Thread.sleep(84);
            clickXY(1386, 814);
            Thread.sleep(204);
            clickXY(1386, 814);
            Thread.sleep(88);
            clickXY(1386, 814);
            Thread.sleep(200);
            clickXY(1386, 814);
            Thread.sleep(141);
            clickXY(1386, 814);
            Thread.sleep(25535);
            clickXY(1386, 814);
            Thread.sleep(188);
            clickXY(1386, 814);
            Thread.sleep(168);
            clickXY(1386, 814);
            Thread.sleep(196);
            clickXY(1386, 814);
            Thread.sleep(3898);
            clickXY(1876, 95);
            Thread.sleep(78);
            clickXY(1876, 95);

            clickXY(1884, 996);
            Kopiuj(login);
            Thread.sleep(2000);
            clickXY(1884, 996);
            Thread.sleep(2000);
            clickXY(1083, 740);
            Thread.sleep(2000);
            Wklej();
            Thread.sleep(1000);
            clickXY(1083, 613);
            clickXY(1083, 613);
            clickXY(1083, 613);
            Thread.sleep(4000);

            clickXY(1896, 17);
            Thread.sleep(3000);
            clickXY(1511, 243);
            Thread.sleep(1000);
            clickXY(1429, 560);
            Thread.sleep(10000);
            clickXY(630, 1068);
            clickXY(630, 1068);

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void GotReje(String mail, String url) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get(url);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"registerEmail\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(mail);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"registerPlayNow\"]")).click();
            Thread.sleep(6000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Got2(String mail, String login) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://zarabiacze.pl/action/906/66d8eb8b90df0ee2fe42c70f6140d3c9");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"registerEmail\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(mail);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"registerPlayNow\"]")).click();
            Thread.sleep(6000);
            driver.quit();

            clickXY(630, 1068);
            Kopiuj(mail);
            Thread.sleep(2000);
            clickXY(1056, 454);
            Thread.sleep(1000);
            Wklej();
            clickXY(1056, 504);
            Thread.sleep(1000);
            Wklej();
            clickXY(1056, 558);
            Thread.sleep(1000);
            clickXY(1056, 558);

            Thread.sleep(8000);
            clickXY(484, 826);
            Thread.sleep(35000);

            clickXY(491, 823);
            Thread.sleep(156);
            clickXY(491, 823);
            Thread.sleep(1144);
            clickXY(491, 823);
            Thread.sleep(125);
            clickXY(491, 823);
            Thread.sleep(976);
            clickXY(491, 823);
            Thread.sleep(104);
            clickXY(491, 823);
            Thread.sleep(1988);
            clickXY(491, 823);
            Thread.sleep(44);
            clickXY(491, 823);
            Thread.sleep(1364);
            clickXY(491, 823);
            Thread.sleep(89);
            clickXY(491, 823);
            Thread.sleep(928);
            clickXY(491, 823);
            Thread.sleep(132);
            clickXY(491, 823);
            Thread.sleep(996);
            clickXY(491, 823);
            Thread.sleep(108);
            clickXY(491, 823);
            Thread.sleep(1068);
            clickXY(491, 823);
            Thread.sleep(112);
            clickXY(491, 823);
            Thread.sleep(960);
            clickXY(491, 823);
            Thread.sleep(68);
            clickXY(491, 823);
            Thread.sleep(2284);
            clickXY(491, 823);
            Thread.sleep(109);
            clickXY(491, 823);
            Thread.sleep(3104);
            clickXY(471, 585);
            Thread.sleep(64);
            clickXY(471, 585);
            Thread.sleep(2177);
            clickXY(471, 585);
            Thread.sleep(88);
            clickXY(471, 585);
            Thread.sleep(2312);
            clickXY(1581, 888);
            Thread.sleep(60);
            clickXY(1581, 888);
            Thread.sleep(1980);
            clickXY(1581, 888);
            Thread.sleep(92);
            clickXY(1581, 888);
            Thread.sleep(1756);
            clickXY(1581, 888);
            Thread.sleep(72);
            clickXY(1581, 888);
            Thread.sleep(1460);
            clickXY(1581, 888);
            Thread.sleep(68);
            clickXY(1581, 888);
            Thread.sleep(1436);
            clickXY(1581, 888);
            Thread.sleep(65);
            clickXY(1581, 888);
            Thread.sleep(2888);
            clickXY(1876, 74);
            Thread.sleep(72);
            clickXY(1876, 74);
            Thread.sleep(3292);
            clickXY(918, 549);
            Thread.sleep(72);
            clickXY(918, 549);
            Thread.sleep(2345);
            clickXY(1362, 845);
            Thread.sleep(60);
            clickXY(1362, 845);
            Thread.sleep(2236);
            clickXY(300, 274);
            Thread.sleep(76);
            clickXY(300, 274);
            /* tu ZMIENIŁEM BYŁO 4785*/
            Thread.sleep(2785);
            clickXY(575, 562);
            Thread.sleep(56);
            clickXY(575, 562);
            Thread.sleep(2500);
            clickXY(980, 558);
            Thread.sleep(64);
            clickXY(980, 558);
            Thread.sleep(2380);
            clickXY(1372, 849);
            Thread.sleep(64);
            clickXY(1372, 849);
            Thread.sleep(2848);
            clickXY(312, 279);
            Thread.sleep(72);
            clickXY(312, 279);
            Thread.sleep(4342);
            clickXY(581, 474);
            Thread.sleep(72);
            clickXY(581, 474);
            Thread.sleep(2405);
            clickXY(987, 568);
            Thread.sleep(51);
            clickXY(987, 568);
            Thread.sleep(2216);
            clickXY(965, 245);
            Thread.sleep(56);
            clickXY(965, 245);
            Thread.sleep(2269);
            clickXY(622, 562);
            Thread.sleep(64);
            clickXY(622, 562);
            Thread.sleep(2724);
            clickXY(1358, 842);
            Thread.sleep(80);
            clickXY(1358, 842);
            Thread.sleep(2084);
            clickXY(1358, 842);
            Thread.sleep(60);
            clickXY(1358, 842);
            Thread.sleep(1496);
            clickXY(1358, 842);
            Thread.sleep(77);
            clickXY(1358, 842);
            Thread.sleep(2532);
            clickXY(1145, 430);
            Thread.sleep(48);
            clickXY(1145, 430);
            Thread.sleep(2144);
            clickXY(963, 837);
            Thread.sleep(68);
            clickXY(963, 837);
            Thread.sleep(3453);
            clickXY(1756, 439);
            Thread.sleep(56);
            clickXY(1756, 439);
            Thread.sleep(2120);
            clickXY(1386, 365);
            Thread.sleep(88);
            clickXY(1386, 365);
            /*TU ZMIENIŁEM BYŁO 4488*/
            Thread.sleep(2488);
            clickXY(1274, 432);
            Thread.sleep(60);
            clickXY(1274, 432);
            Thread.sleep(2033);
            clickXY(1382, 367);
            Thread.sleep(47);
            clickXY(1382, 367);
            Thread.sleep(1854);
            clickXY(1375, 368);
            Thread.sleep(60);
            clickXY(1375, 368);
            Thread.sleep(2284);
            clickXY(960, 550);
            Thread.sleep(60);
            clickXY(960, 550);
            Thread.sleep(2128);
            clickXY(1359, 844);
            Thread.sleep(72);
            clickXY(1359, 844);
            /*TU ZMIENIŁEM BYŁO 6681*/
            Thread.sleep(3681);
            clickXY(782, 791);
            Thread.sleep(32);
            clickXY(782, 791);
            Thread.sleep(4176);
            clickXY(1776, 468);
            Thread.sleep(66);
            clickXY(1776, 468);
            Thread.sleep(2043);
            clickXY(1393, 366);
            Thread.sleep(68);
            clickXY(1393, 366);
            Thread.sleep(3032);
            clickXY(1393, 366);
            Thread.sleep(60);
            clickXY(1393, 366);
            Thread.sleep(2381);
            clickXY(810, 703);
            Thread.sleep(72);
            clickXY(810, 703);
            Thread.sleep(2104);
            clickXY(810, 703);
            Thread.sleep(80);
            clickXY(810, 703);
            Thread.sleep(2012);
            clickXY(958, 838);
            Thread.sleep(56);
            clickXY(958, 838);
            Thread.sleep(3332);
            clickXY(958, 838);
            Thread.sleep(80);
            clickXY(958, 838);
            Thread.sleep(1444);
            clickXY(958, 838);
            Thread.sleep(72);
            clickXY(958, 838);
            Thread.sleep(3150);
            clickXY(958, 838);
            Thread.sleep(56);
            clickXY(958, 838);
            Thread.sleep(1392);
            clickXY(958, 838);
            Thread.sleep(60);
            clickXY(958, 838);
            Thread.sleep(2152);
            clickXY(958, 838);
            Thread.sleep(80);
            clickXY(958, 838);
            Thread.sleep(3020);
            clickXY(812, 419);
            Thread.sleep(84);
            clickXY(812, 419);
            Thread.sleep(1344);
            clickXY(812, 419);
            Thread.sleep(72);
            clickXY(812, 419);
            Thread.sleep(2501);
            clickXY(812, 419);
            Thread.sleep(76);
            clickXY(812, 419);
            Thread.sleep(1520);
            clickXY(812, 419);
            Thread.sleep(80);
            clickXY(812, 419);
            Thread.sleep(3029);
            clickXY(1251, 767);
            Thread.sleep(64);
            clickXY(1251, 767);
            Thread.sleep(1740);
            clickXY(1269, 817);
            Thread.sleep(108);
            clickXY(1269, 817);
            Thread.sleep(7457);
            clickXY(957, 769);
            Thread.sleep(72);
            clickXY(957, 769);
            Thread.sleep(12326);
            clickXY(957, 769);
            Thread.sleep(92);
            clickXY(957, 769);
            Thread.sleep(1628);
            clickXY(957, 769);
            Thread.sleep(76);
            clickXY(957, 769);
            Thread.sleep(2521);
            clickXY(959, 678);
            Thread.sleep(51);
            clickXY(959, 678);
            Thread.sleep(2052);
            clickXY(737, 405);
            Thread.sleep(64);
            clickXY(737, 405);
            Thread.sleep(1973);
            clickXY(1165, 851);
            Thread.sleep(60);
            clickXY(1165, 851);
            Thread.sleep(3528);
            clickXY(1165, 851);
            Thread.sleep(48);
            clickXY(1165, 851);
            Thread.sleep(6145);
            clickXY(1757, 461);
            Thread.sleep(76);
            clickXY(1757, 461);
            Thread.sleep(2501);
            clickXY(1398, 363);
            Thread.sleep(76);
            clickXY(1398, 363);
            Thread.sleep(4128);
            clickXY(1398, 363);
            Thread.sleep(72);
            clickXY(1398, 363);
            Thread.sleep(3908);
            clickXY(1398, 363);
            Thread.sleep(64);
            clickXY(1398, 363);
            Thread.sleep(2726);
            clickXY(1385, 812);
            Thread.sleep(68);
            clickXY(1385, 812);
            Thread.sleep(8108);
            clickXY(1830, 104);
            Thread.sleep(84);
            clickXY(1830, 104);
            Thread.sleep(3000);
            clickXY(1830, 104);
            Thread.sleep(104);
            clickXY(1830, 104);
            Thread.sleep(2969);
            clickXY(468, 576);
            Thread.sleep(48);
            clickXY(468, 576);
            Thread.sleep(3377);
            clickXY(1586, 889);
            Thread.sleep(64);
            clickXY(1586, 889);
            Thread.sleep(2032);
            clickXY(1586, 889);
            Thread.sleep(48);
            clickXY(1586, 889);
            Thread.sleep(2976);
            clickXY(1881, 74);
            Thread.sleep(64);
            clickXY(1881, 74);
            Thread.sleep(2201);
            clickXY(1781, 432);
            Thread.sleep(88);
            clickXY(1781, 432);
            Thread.sleep(2224);
            clickXY(1399, 369);
            Thread.sleep(72);
            clickXY(1399, 369);
            Thread.sleep(3028);
            clickXY(980, 541);
            Thread.sleep(68);
            clickXY(980, 541);
            Thread.sleep(2272);
            clickXY(1369, 860);
            Thread.sleep(48);
            clickXY(1369, 860);
            Thread.sleep(2658);
            clickXY(304, 274);
            Thread.sleep(60);
            clickXY(304, 274);
            Thread.sleep(3856);
            clickXY(304, 274);
            Thread.sleep(96);
            clickXY(304, 274);
            Thread.sleep(8033);
            clickXY(304, 274);
            Thread.sleep(112);
            clickXY(304, 274);
            Thread.sleep(2640);
            clickXY(922, 522);
            Thread.sleep(64);
            clickXY(922, 522);
            Thread.sleep(2033);
            clickXY(1121, 850);
            Thread.sleep(64);
            clickXY(1121, 850);
            Thread.sleep(3676);
            clickXY(1121, 850);
            Thread.sleep(68);
            clickXY(1121, 850);
            Thread.sleep(2212);
            clickXY(1763, 450);
            Thread.sleep(60);
            clickXY(1763, 450);
            Thread.sleep(4305);
            clickXY(1386, 373);
            Thread.sleep(76);
            clickXY(1386, 373);
            Thread.sleep(5648);
            clickXY(1386, 373);
            Thread.sleep(88);
            clickXY(1386, 373);
            Thread.sleep(3498);
            clickXY(1453, 238);
            Thread.sleep(80);
            clickXY(1453, 238);
            Thread.sleep(2436);
            clickXY(1454, 238);
            Thread.sleep(56);
            clickXY(1454, 238);
            Thread.sleep(1716);
            clickXY(1454, 238);
            Thread.sleep(56);
            clickXY(1454, 238);
            Thread.sleep(3084);
            clickXY(1423, 336);
            Thread.sleep(64);
            clickXY(1423, 336);
            /*TU ZMIENIŁEM BYŁO 9486*/
            Thread.sleep(4486);
            clickXY(1423, 336);
            Thread.sleep(52);
            clickXY(1423, 336);
            Thread.sleep(1624);
            clickXY(1423, 336);
            Thread.sleep(60);
            clickXY(1423, 336);
            Thread.sleep(2549);
            clickXY(1623, 213);
            Thread.sleep(55);
            clickXY(1623, 213);
            Thread.sleep(3269);
            clickXY(1358, 554);
            Thread.sleep(60);
            clickXY(1358, 554);
            Thread.sleep(2780);
            clickXY(993, 436);
            Thread.sleep(84);
            clickXY(993, 436);
            Thread.sleep(1784);
            clickXY(1350, 557);
            Thread.sleep(72);
            clickXY(1350, 557);
            Thread.sleep(2733);
            clickXY(1499, 212);
            Thread.sleep(68);
            clickXY(1499, 212);
            Thread.sleep(3989);

            clickXY(1507, 339);
            Thread.sleep(1000);
            clickXY(1507, 339);
            Thread.sleep(1000);
            clickXY(1884, 996);
            Kopiuj(login);
            Thread.sleep(2000);
            clickXY(1884, 996);
            Thread.sleep(2000);
            clickXY(1083, 740);
            Thread.sleep(2000);
            Wklej();
            Thread.sleep(1000);
            clickXY(1083, 613);
            clickXY(1083, 613);
            clickXY(1083, 613);
            Thread.sleep(4000);

            clickXY(1896, 17);
            Thread.sleep(3000);
            clickXY(1511, 243);
            Thread.sleep(1000);
            clickXY(1429, 560);
            Thread.sleep(10000);

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Got2Reje(String mail) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://zarabiacze.pl/action/906/66d8eb8b90df0ee2fe42c70f6140d3c9");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"registerEmail\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(mail);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"registerPlayNow\"]")).click();
            Thread.sleep(6000);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void wejdzGot(String mail) throws AWTException, InterruptedException {
        clickXY(630, 1068);
        Kopiuj(mail);
        Thread.sleep(2000);
        clickXY(1056, 454);
        Thread.sleep(1000);
        Wklej();
        clickXY(1056, 504);
        clickXY(1056, 504);
        Thread.sleep(1000);
        Wklej();
        clickXY(1056, 558);
        Thread.sleep(1000);
        clickXY(1056, 558);

        Thread.sleep(8000);
        clickXY(1415, 450);
        Thread.sleep(35000);

        clickXY(1454, 213);
        clickXY(1454, 213);
        clickXY(1454, 213);
        Thread.sleep(1000);
        clickXY(1200, 690);
        Thread.sleep(2000);
        clickXY(1700, 548);
        Thread.sleep(2000);
        clickXY(1700, 548);

        Thread.sleep(2000);
        clickXY(302, 282);
        Thread.sleep(2053);
        clickXY(304, 285);
        Thread.sleep(2080);
        clickXY(988, 560);
        Thread.sleep(1924);
        clickXY(988, 560);
        Thread.sleep(1828);
        clickXY(1163, 844);
        Thread.sleep(4809);
        clickXY(1768, 447);
        Thread.sleep(1640);
        clickXY(1382, 360);
        Thread.sleep(1761);
        clickXY(1452, 246);

        Thread.sleep(3422);
        clickXY(1900, 12);
        Thread.sleep(3652);
        clickXY(1437, 392);
        Thread.sleep(2228);
        clickXY(1546, 240);
        Thread.sleep(1736);
        clickXY(1436, 556);
        Thread.sleep(8000);
        clickXY(630, 1068);
        clickXY(630, 1068);
    }

    public static void VeePee(String mail, String ulica, String miasto, String kod) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.gecko.driver", "E:\\bot\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random r = new Random();
        int randomNazwisko = r.nextInt(199);
        int randomImie = r.nextInt(152);
        char[] nazw = Narzedzia.nazwisko[randomNazwisko].toCharArray();
        if (nazw[nazw.length - 1] == 'i')
            nazw[nazw.length - 1] = 'a';
        String nazwiskoo = new String(nazw);
        Robot robot = new Robot();
        String numer = genNumer();
        driver.manage().window().maximize();

        try {
            driver.get("https://zarabiacze.pl/action/921/66d8eb8b90df0ee2fe42c70f6140d3c9");
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"register-form-email\"]")).click();
            Thread.sleep(1000);
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
            Runtime runtime = Runtime.getRuntime();
            Thread.sleep(6000);
            Process proc2 = runtime.exec("shutdown /s /t 0");
            System.exit(0);
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
                Thread.sleep(14000);
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

    public static void AvonPremium(String mail, String tel, String kod, String miasto, String ulica, String num) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Robot robot = new Robot();
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();

        driver.manage().window().maximize();
        try {
            driver.get("https://zarabiacze.pl/action/898/66d8eb8b90df0ee2fe42c70f6140d3c9");
            Thread.sleep(3000);
            clickXY(1791, 1025);
            Kopiuj(imie);
            clickXY(1500, 240);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwisko);
            clickXY(1500, 320);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail);
            clickXY(1500, 385);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(tel);
            clickXY(1500, 457);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1500, 532);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(miasto);
            clickXY(1500, 605);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(ulica);
            clickXY(1500, 675);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(num);
            clickXY(1500, 745);
            Thread.sleep(1000);
            Wklej();
            clickXY(1263, 891);
            clickXY(1263, 925);
            Thread.sleep(1000);
            clickXY(1494, 1043);

            Thread.sleep(10000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void AvonPremium2(String mail, String tel, String kod, String miasto, String ulica, String num) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Robot robot = new Robot();
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();

        driver.manage().window().maximize();
        try {
            driver.get("https://zarabiacze.pl/action/902/66d8eb8b90df0ee2fe42c70f6140d3c9");
            Thread.sleep(3000);
            clickXY(1791, 1025);
            Kopiuj(imie);
            clickXY(1500, 240);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwisko);
            clickXY(1500, 320);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail);
            clickXY(1500, 385);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(tel);
            clickXY(1500, 457);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1500, 532);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(miasto);
            clickXY(1500, 605);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(ulica);
            clickXY(1500, 675);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(num);
            clickXY(1500, 745);
            Thread.sleep(1000);
            Wklej();
            clickXY(1263, 891);
            clickXY(1263, 925);
            Thread.sleep(1000);
            clickXY(1494, 1043);

            Thread.sleep(10000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Avon(String mail, String tel, String kod, String miasto, String ulica, String num) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Robot robot = new Robot();
        String imie = genImieZen();
        String nazwisko = genNazwiskoZen();

        driver.manage().window().maximize();
        try {
            driver.get("https://zarabiacze.pl/action/919/66d8eb8b90df0ee2fe42c70f6140d3c9");
            Thread.sleep(3000);
            clickXY(1791, 1025);
            Kopiuj(imie);
            clickXY(1500, 240);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(nazwisko);
            clickXY(1500, 320);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(mail);
            clickXY(1500, 385);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(tel);
            clickXY(1500, 457);
            Thread.sleep(1000);
            Wklej();
            Kopiuj(kod);
            clickXY(1500, 532);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(miasto);
            clickXY(1500, 605);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(ulica);
            clickXY(1500, 675);
            Thread.sleep(1000);
            Wklej();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            Kopiuj(num);
            clickXY(1500, 745);
            Thread.sleep(1000);
            Wklej();
            clickXY(1263, 891);
            clickXY(1263, 925);
            Thread.sleep(1000);
            clickXY(1494, 1043);

            Thread.sleep(10000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Arkadia(String mail) {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        Random r = new Random();
        int dzien = r.nextInt(28) + 1;
        int miesiac = r.nextInt(11) + 1;
        int rok = r.nextInt(1994 - 1976 + 1) + 1976;
        ChromeDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String winHandleBefore = driver.getWindowHandle();
        driver.manage().window().maximize();
        try {
            driver.get("https://zarabiacze.pl/action/958/66d8eb8b90df0ee2fe42c70f6140d3c9");
            Thread.sleep(10000);
            Zmniejsz(2);
            clickXY(1285, 1000);

            Thread.sleep(7000);
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
//            Narzedzia.Arkadia(driver, mail);
            //Narzedzia.potwierdzArkadia(driver,mail);
            driver.quit();

        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void Mtu(String kod, String tel, String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Random rand = new Random();
        int r = rand.nextInt(2001 - 1988 + 1) + 1988;
        int przebie = rand.nextInt(7) + 1;
        String dataUr = null;
        int rokUr = rand.nextInt(1996 - 1980 + 1) + 1980;

        int miesUr = rand.nextInt(12 - 1 + 1) + 1;
        int dzienUr = rand.nextInt(29 - 1 + 1) + 1;

        int rokUz = rand.nextInt(2016 - 2003 + 1) + 2003;
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
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        WebDriver firefox = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) firefox;
        try {
            firefox.manage().window().maximize();
            firefox.get(url);
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
            rokUzy.selectByValue(String.valueOf(rokUz));
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
            Thread.sleep(1000);

            js.executeScript("arguments[0].scrollIntoView();", firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[3]/div/div[2]/app-input/div/div[1]/div[2]/input")));
            Thread.sleep(1000);
            firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-accordion[3]/div/div[2]/app-input/div/div[1]/div[2]/input")).sendKeys(tel);
            firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-dynamic-clause/div[2]/div[1]/div[1]/app-input-checkbox/div/div/div")).click();
            Thread.sleep(3000);
            firefox.findElement(By.xpath("/html/body/app-root/div[1]/div/div[1]/app-vehicle/div/app-footer-navigation/div/div")).click();
            Thread.sleep(15000);
            firefox.quit();
        } catch (Exception e) {
            firefox.quit();
        }


    }

    public static void Spartoo(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
        boolean flaga = false;
        int m = 0;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://zarabiacze.pl/action/511/66d8eb8b90df0ee2fe42c70f6140d3c9");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"spartooCookies\"]/div/div[2]/a")).click();
            Thread.sleep(2000);
            ScrollBy(driver, "20000");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"newsletter_footer\"]/div[3]/span[1]")).click();

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
            driver.findElement(By.xpath("//*[text()='Oferty']")).click();
            Thread.sleep(4000);
            while (!flaga) {
                try {
                    driver.findElement(By.xpath("//*[text()='Enzo ze Spartoo.pl']")).click();
                    flaga = true;
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[2]/nh-app-view/div/div/div/div[1]/div/div/nh-show-item/div/div/div/div/nh-html-compile/div/div/div/table[2]/tbody/tr[2]/td[2]/p/a")).click();
                    Thread.sleep(2000);
                    zmienKarte(driver);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
                    Thread.sleep(10000);
                    driver.quit();
                } catch (Exception e) {
                    clickXY(85, 52);
                    Thread.sleep(10000);
                }
                m++;
                if (m > 5) {
                    break;
                }
            }
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void Edison(String mail, String tel) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\bot\\chromedriver\\chromedriver.exe");
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

        driver.get("https://zarabiacze.pl/action/969/66d8eb8b90df0ee2fe42c70f6140d3c9");
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
}
