package info_retrieval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.Random;

public class Moje extends Narzedzia{
    public static void Kaufland(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


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
            driver.get("https://ad.bluepartner.eu/redirect?partner_id=1171&creation_type=LINK&creation_id=1247");
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

    public static void konkursPampers(String mail, String ulica, String kod1, String kod2, String miasto, String tel) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        try {


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
        driver.get("https://ad.bluepartner.eu/redirect?partner_id=1171&creation_type=LINK&creation_id=1248");
        WebDriverWait wait = new WebDriverWait(driver, 60);
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
            driver.findElement(By.xpath("/html/body/section/div[1]/form/div[1]/div/div/div[1]/label/img")).click();
        } catch (Exception f) {

        }
        Thread.sleep(2000);
        try {
            Select oc = new Select(driver.findElement(By.xpath("/html/body/section/div[1]/form/div[2]/div/div/select")));
            oc.selectByIndex(10);
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
}
