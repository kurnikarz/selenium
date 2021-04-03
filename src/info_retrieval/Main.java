package info_retrieval;

import net.bytebuddy.dynamic.Transformer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.util.ArrayList;


public class Main extends Narzedzia {

    public static void interia() throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        Writer maile = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\everyInt.txt", true));
        Writer botowe = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\botowe.txt", true));
        ChromeOptions options = new ChromeOptions();
        String profil = "113";
        int j = 0;
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        boolean flaga = true;
        boolean flaga2 = true;
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile " + profil);
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));

        String imie = genImieZen();
        String nazwiwsko = genNazwiskoZen();
        int dzien = r.nextInt(29) + 1;
        String cyfra1 = String.valueOf(r.nextInt(9));
        String cyfra2 = String.valueOf(r.nextInt(9));

        try {
            ChromeDriver driver = new ChromeDriver(options);
            Robot robot = new Robot();
            driver.manage().window().maximize();
            driver.get("https://konto-pocztowe.interia.pl/#/nowe-konto/darmowe");
            Thread.sleep(5000);
            //                try {
            //                    driver.switchTo().frame(5);
            //                    //driver.findElement(By.xpath("//*[@id=\"reset-button\"]")).click();
            //                    //clickXY(85, 52);
            //                    Thread.sleep(2000);
            //                    while (true) {
            //                        Thread.sleep(1000);
            //                        String znak = scan.nextLine();
            //                        if (znak.equals("q")) {
            //                            break;
            //                        }
            //                    }
            //
            //                } catch (Exception e) {
            //                    System.out.println(e);
            //                }
            /*
            while (true) {
                Thread.sleep(1000);
                String znak = scan.nextLine();
                if (znak.equals("q")) {
                    break;
                }
            }

        while (flaga){
            clickXY(876,679);
            //driver.findElement(By.xpath("//*[@id=\"solver-button\"]")).click();
            Thread.sleep(2000);
            try {
                driver.switchTo().frame(5);
                driver.findElement(By.xpath("//*[@id=\"reset-button\"]")).click();
                clickXY(85, 52);
                Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println(e);
                flaga = false;
            }
        }

         */

            driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(imie);
            driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys(nazwiwsko);
            driver.findElement(By.xpath("//*[@id=\"birthdayDay\"]")).sendKeys(String.valueOf(dzien));
            driver.findElement(By.xpath("//*[@id=\"mainApp\"]/div/div/div/div/div[2]/div/form/div[1]/div[3]/div[2]/label")).click();
            //Thread.sleep(1000);
            clickXY(712, 480);
            driver.findElement(By.xpath("//*[@id=\"birthdayYear\"]")).sendKeys("1990");
            driver.findElement(By.xpath("//*[@id=\"mainApp\"]/div/div/div/div/div[2]/div/form/div[1]/div[4]/div[1]")).click();
            //Thread.sleep(1000);
            clickXY(1082, 544);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(cyfra1 + cyfra2);
            String mail = driver.findElement(By.xpath("//*[@id=\"login\"]")).getAttribute("value") + "@interia.pl";
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mrcbuch123");
            driver.findElement(By.xpath("//*[@id=\"rePassword\"]")).sendKeys("Mrcbuch123");
            driver.findElement(By.xpath("//*[@id=\"mainApp\"]/div/div/div/div/div[2]/div/form/div[2]/div[1]/div[1]/label/div/div")).click();
            //driver.findElement(By.xpath("//*[text()='Załóż darmowe konto']")).click();
            clickXY(969, 1002);
            maile.append(mail + "\r\n");
            botowe.append(mail + "\r\n");
            maile.close();
            botowe.close();
            Thread.sleep(15000);
            driver.quit();
        } catch (Exception f) {
            System.out.println("ERROR INTERIA");
        }

    }

    public static void Maile(String mail) throws InterruptedException {
        FirefoxDriver firefox = new FirefoxDriver();
        firefox.manage().window().maximize();

        firefox.get("http://poczta.wp.pl/");
        Thread.sleep(3000);
        firefox.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
        firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        //firefox.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("szczyt2019");
        Thread.sleep(1000);
        firefox.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(2000);
        firefox.findElement(By.xpath("//*[text()='Oferty']")).click();
    }

    public static void Spacja() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Robot robot2 = new Robot();
        Thread.sleep(10000);
        while (true) {
            robot.keyPress(KeyEvent.VK_SPACE);
            Thread.sleep(2000);
        }

    }

    public static void test(int dzien, int mies, int rok) {
        String dataUr;
        if (dzien < 10 && mies < 10)
            dataUr = "0" + dzien + "/0" + mies + "/" + rok;
        else if (dzien < 10)
            dataUr = "0" + dzien + "/" + mies + "/" + rok;
        else if (mies < 10)
            dataUr = dzien + "/0" + mies + "/" + rok;
        else
            dataUr = dzien + "/" + mies + "/" + rok;
        System.out.println(dataUr);
    }

    public static String test2(int mies, int rok) {
        String dataUr;
        if (mies < 10)
            dataUr = "0" + mies + "/" + rok;
        else
            dataUr = mies + "/" + rok;
        return dataUr;
    }

    public static void testCaptcha() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        boolean flaga = true;
        WebElement blad;
        int i = 0;
        Robot robot = new Robot();
        //options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
        options.addExtensions(new File("C:\\botPythonn\\captcha.crx"));
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.get("https://www.nivea.pl/o-nas/nasza-firma/newsletter");
        Thread.sleep(3000);
        String mainWin = driver.getWindowHandle();
        Narzedzia.ScrollBy(driver, "700");
        Thread.sleep(1000);

        while (flaga) {
            driver.switchTo().frame(0);
            driver.findElement(By.xpath("//*[@id=\"rc-anchor-container\"]")).click();
            driver.switchTo().window(mainWin);
            Thread.sleep(2000);
            Narzedzia.clickXY(826, 898);
            Thread.sleep(10000);
            driver.switchTo().frame(1);
            try {
                driver.findElement(By.xpath("//span[@aria-checked=\"true\"]"));
                flaga = false;
            } catch (Exception e) {
                robot.keyPress(KeyEvent.VK_F5);
                robot.keyRelease(KeyEvent.VK_F5);
                Thread.sleep(4000);
            }
        }

    }

    public static void testCaptcha2() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        boolean flaga = true;
        WebElement blad;
        int i = 0;
        Robot robot = new Robot();
        options.addExtensions(new File("C:\\botPythonn\\captcha.crx"));
        //options.addArguments("--disable-web-security");
        //options.addArguments("--allow-running-insecure-content");
        //options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
        //Map<String, Object> prefs = new HashMap<String, Object>();
        //prefs.put("profile.default_content_settings.popups", 0);
        //options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        /*
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("dumcio.97@wp.pl");
        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Passwd\"]")));
        driver.findElement(By.xpath("//*[@id=\"Passwd\"]")).sendKeys("MrcbucHv2.0");
        driver.findElement(By.xpath("//*[@id=\"signIn\"]")).click();
        */
        //driver.get("https://patrickhlauke.github.io/recaptcha/");

    }

    public static void ecoin(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://ecoinofficial.org/referral/934a3w0");
            Thread.sleep(10000);
            driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button")).click();
            Thread.sleep(2000);
            Narzedzia.ScrollBy(driver, "200");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/div/div[1]/div[2]/a/b")).click();
            Thread.sleep(7000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"email-signup-button\"]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"signupFName\"]")).sendKeys(Narzedzia.genImieMes());
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"signupLName\"]")).sendKeys(Narzedzia.genNazwisko());
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"signupEmail\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(mail + "V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/div/input")).sendKeys(mail + "V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"agree\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[7]/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
            Thread.sleep(5000);

            //WP
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"folder-5\"]/div[2]")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[text()='ECoin']")).click();
            Thread.sleep(4000);
            Narzedzia.ScrollBy(driver, "400");
            Thread.sleep(1000);
            Narzedzia.clickXY(966, 940);
            Narzedzia.clickXY(966, 880);
            Thread.sleep(4000);
            zmienKarte(driver);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/button")).click();
            Thread.sleep(5000);
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }

    }

    public static void pobierzIp() throws IOException, InterruptedException {
        Writer ip = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\ip.txt", true));
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.whatismyip.com/");
        Thread.sleep(7000);
        String ipp = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div[1]/div[1]/div/ul/li[1]")).getText();
        ip.append(ipp + ";");
        ip.close();
        Thread.sleep(1000);
        driver.quit();
    }

    public static void sprawdzMail(String mail, String haslo) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        Writer zablokowane = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\zablokowane.txt", true));
        Writer niezablokowane = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\niezablokowane.txt", true));
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("http://poczta.wp.pl/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(haslo);
            Thread.sleep(1000);
            //driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
            Narzedzia.clickXY(347, 600);
            Thread.sleep(2000);
            WebElement elem = driver.findElement(By.xpath("//*[text()='Oferty']"));
            niezablokowane.append(mail + ";");
            niezablokowane.close();
        } catch (Exception e) {
            zablokowane.append(mail + ";");
            zablokowane.close();
        }
        driver.quit();
    }

    public static void zrobScreena(int i, String mail) throws AWTException, IOException {
        final long serialVersionUID = 1L;
        Robot r = new Robot();

        // It saves screenshot to desired path
        String path = "C:\\Users\\dumci\\Desktop\\klikanie\\posty\\screeny\\" + mail + "\\" + i + ".jpg";

        // Used to get ScreenSize and capture image
        Rectangle capture =
                new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage Image = r.createScreenCapture(capture);
        ImageIO.write(Image, "jpg", new File(path));
        System.out.println("Screenshot saved");
    }

    public static void dodajPost(String mail, String post, String profil, int a, int b) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile " + profil);
        options.addArguments("--disable-notifications");
        Writer linki = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\posty\\screeny\\" + mail + "\\linki.txt", true));
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        List<String> grupy = new ArrayList<>();
        grupy.add("https://www.facebook.com/groups/125548817802832/");  //0-
        grupy.add("https://www.facebook.com/groups/1740657925950542/");//1
        grupy.add("https://www.facebook.com/groups/1715869212053509/");//2
        grupy.add("https://www.facebook.com/groups/1622951457992792/");//3
        grupy.add("https://www.facebook.com/groups/1478777662423430/");//4-
        grupy.add("https://www.facebook.com/groups/1442053002718329/");//5
        grupy.add("https://www.facebook.com/groups/1303356579748916/");//6-
        grupy.add("https://www.facebook.com/groups/794811483876118/");//7-
        grupy.add("https://www.facebook.com/groups/531288753733140/"); //8
        grupy.add("https://www.facebook.com/groups/505718296215064/");//9-
        grupy.add("https://www.facebook.com/groups/426282497555531/");//10
        grupy.add("https://www.facebook.com/groups/408111472862824/");//11-
        grupy.add("https://www.facebook.com/groups/389679508482812/");//12
        grupy.add("https://www.facebook.com/groups/351384515297725/");//13-
        grupy.add("https://www.facebook.com/groups/319514972052497/");//14-
        grupy.add("https://www.facebook.com/groups/270165996779362/");    //OCZEKUJACE 15
        grupy.add("https://www.facebook.com/groups/181436575590022/");//16
        grupy.add("https://www.facebook.com/groups/172681430256680/");//17
        grupy.add("https://www.facebook.com/groups/932562780136151/");//18
        grupy.add("https://www.facebook.com/groups/197656314112177");//19
        grupy.add("https://www.facebook.com/groups/381018519002791/");//20
        grupy.add("https://www.facebook.com/groups/1932167580368778/");//21-
        grupy.add("https://www.facebook.com/groups/1781838958705367/");//22
        grupy.add("https://www.facebook.com/groups/1483378875270025/");//23-
        grupy.add("https://www.facebook.com/groups/1481353345440772/");//24-
        grupy.add("https://www.facebook.com/groups/pieniadzezinternetu/");//25
        grupy.add("https://www.facebook.com/groups/1149026795123144/");//26 //warszawa
        grupy.add("https://www.facebook.com/groups/864759733686026/");//27 //poznan
        grupy.add("https://www.facebook.com/groups/688755227963589/");//28-
        grupy.add("https://www.facebook.com/groups/210289873049520/");//29
        grupy.add("https://www.facebook.com/groups/544747138926998/");//30-
        grupy.add("https://www.facebook.com/groups/zarabianie.praca.biznes.online/");//31
        grupy.add("https://www.facebook.com/groups/pracaonline24/");//32
        grupy.add("https://www.facebook.com/groups/470108560157347/");//33
        grupy.add("https://www.facebook.com/groups/316265375706455/");//34-
        grupy.add("https://www.facebook.com/groups/InternetowaPraca/");//35-
        grupy.add("https://www.facebook.com/groups/315509495130995/");//36-
        grupy.add("https://www.facebook.com/groups/298670413999878/");//37-
        grupy.add("https://www.facebook.com/groups/2935674523171777/");//38-
        grupy.add("https://www.facebook.com/groups/636328313209736/");//39
        driver.manage().window().maximize();
        driver.get("https://pl-pl.facebook.com/login/");
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(mail + "V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        } catch (Exception e) {
            System.out.println("ZALOGOWANA");
        }


        for (int i = a; i < b; i++) {
            try {
                driver.findElement(By.xpath("//*[text()='Twoje konto zostało zablokowane']")).click();
                System.out.println("ZABLOKOWANE");
                driver.quit();
                break;
            } catch (Exception e) {
                System.out.println("la");
            }

            try {
                Thread.sleep(2000);
                driver.get(grupy.get(i));
                Thread.sleep(3000);
                try {
                    driver.findElement(By.xpath("//*[text()='Napisz post']")).click();
                } catch (Exception f) {
                    driver.findElement(By.xpath("//*[text()='Rozpocznij dyskusję']")).click();
                }
                Narzedzia.Kopiuj(post);
                Thread.sleep(3000);
                clickXY(694, 642);
                clickXY(750, 642);
                Thread.sleep(1000);
                Narzedzia.Wklej();
                Thread.sleep(3000);
                Narzedzia.ScrollBy(driver, "300");
                Thread.sleep(1000);

                try {
                    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/div")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div[2]/div/table/tbody/tr[1]/td[1]/div/div/span/a/div[2]")).click();
                }
                Thread.sleep(5000);
                Narzedzia.Kopiuj("C:\\Users\\dumci\\Desktop\\klikanie\\posty\\klos.jpg");
                Thread.sleep(1000);
                Narzedzia.Wklej();
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_ENTER);
                Thread.sleep(20000);

                driver.findElement(By.xpath("//*[text()='Opublikuj']")).click();
                Thread.sleep(1000);
                clickXY(962, 498);
                Thread.sleep(10000);
                ScrollBy(driver, "-15000");
                Thread.sleep(1000);
                //Thread.sleep(1000000);
                driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[2]/div/span/span/a/abbr/span")).click();
                //driver.findElement(By.xpath("//div[2]/div[1]/div[3]/div[3]/div/div/div/div/a")).click();  //ZDJECIE
                //driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[3]/div/div")).click();
                //driver.findElement(By.className("timestampContent")).click();
                Thread.sleep(10000);
                zrobScreena(i, mail);
                linki.append(driver.getCurrentUrl() + "\r\n");
            } catch (Exception e) {
                try {
                    Thread.sleep(5000);
                } catch (Exception d) {
                    System.out.println("====================== " + grupy.get(i) + " ===================");
                }
            }


        }
        linki.close();
        driver.quit();

    }

    public static void potwierdzEvery(String mail) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        boolean flaga = false;
        int m = 0;
        Random r = new Random();
        int kupon1 = r.nextInt(4);
        int kupon2 = r.nextInt(4);

        driver.get("http://poczta.interia.pl/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/button[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mrcbuch2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"sitebar\"]/form/button")).click();

        Thread.sleep(6000);
        try {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/form/div[2]/input")).sendKeys("lakunka@wp.pl");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/form/fieldset/button[1]")).click();
        } catch (Exception e) {
            Thread.sleep(1000);
        }
        try {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]")).click();
        } catch (Exception e) {
            Thread.sleep(1000);
        }
        while (!flaga) {
            try {
                driver.findElement(By.xpath("//*[text()='EverydayMe']")).click();
                flaga = true;
                Thread.sleep(4000);
                driver.switchTo().frame(1);
                driver.findElement(By.xpath("//*[text()='Do dzieła']")).click();
                //driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[6]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/a/strong")).click();
                //clickXY(1263,657);
                Thread.sleep(2000);
                zmienKarte(driver);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div[1]/div/div[1]/ul/li[2]/a")).click();
                Thread.sleep(10000);
                Zmniejsz(5);
                Thread.sleep(1000);
                switch (kupon1) {
                    case 0:
                        clickXY(924, 865);
                        break;
                    case 1:
                        clickXY(1222, 865);
                        break;
                    case 2:
                        clickXY(924, 1020);
                        break;
                    case 3:
                        clickXY(1222, 1020);
                        break;

                }
                Thread.sleep(5000);
                switch (kupon2) {
                    case 0:
                        clickXY(924, 865);
                        break;
                    case 1:
                        clickXY(1222, 865);
                        break;
                    case 2:
                        clickXY(924, 1020);
                        break;
                    case 3:
                        clickXY(1222, 1020);
                        break;
                }
                Thread.sleep(10000);
                driver.quit();
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


    }

    public static void dodajPostLepak(String mail, String haslo, String post, int a, int b) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));
        /*
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Googlehttps://www.facebook.com/groups/172681430256680/\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile "+profil);
         */
        options.addArguments("--disable-notifications");
        Writer linki = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\posty\\screeny\\" + mail + "\\linki.txt", true));
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        String[] grupy = new String[100];
        grupy[0] = "https://www.facebook.com/groups/197656314112177/";
        grupy[1] = "https://www.facebook.com/groups/298229136881926/";
        grupy[2] = "https://www.facebook.com/groups/mlmstylzycia/";
        grupy[3] = "https://www.facebook.com/groups/822032214568755/";
        grupy[4] = "https://www.facebook.com/groups/pasywnezarabianie/";
        grupy[5] = "https://www.facebook.com/groups/181436575590022/";
        grupy[6] = "https://www.facebook.com/groups/inwestorzyiinwestycje/";
        grupy[7] = "https://www.facebook.com/groups/zarabiajwnecie/";
        grupy[8] = "https://www.facebook.com/groups/410873349362708/";
        grupy[9] = "https://www.facebook.com/groups/270165996779362/";
        grupy[10] = "https://www.facebook.com/groups/389679508482812/";
        grupy[11] = "https://www.facebook.com/groups/531288753733140/";
        grupy[12] = "https://www.facebook.com/groups/pracawmlm/";
        grupy[13] = "https://www.facebook.com/groups/168679147406607/";
        grupy[14] = "https://www.facebook.com/groups/yeahcoachpl/";
        grupy[15] = "https://www.facebook.com/groups/381018519002791/";
        grupy[16] = "https://www.facebook.com/groups/pracaonline24/";
        grupy[17] = "https://www.facebook.com/groups/pieniadzezinternetu/";
        grupy[18] = "https://www.facebook.com/groups/210289873049520/";
        grupy[19] = "https://www.facebook.com/groups/pracazarabianie/";
        grupy[20] = "https://www.facebook.com/groups/zarabianieinternet/";
        grupy[21] = "https://www.facebook.com/groups/519298171753298/";
        grupy[22] = "https://www.facebook.com/groups/PracaBezSzefa/";
        grupy[23] = "https://www.facebook.com/groups/934587176605807/";
        grupy[24] = "https://www.facebook.com/groups/920488634709636/";
        grupy[25] = "https://www.facebook.com/groups/1895279054050554/";
        grupy[26] = "https://www.facebook.com/groups/zarabianie.praca.internet/";
        grupy[27] = "https://www.facebook.com/groups/1622951457992792/";
        grupy[28] = "https://www.facebook.com/groups/1781838958705367/";
        grupy[29] = "https://www.facebook.com/groups/172681430256680/";
        grupy[30] = "https://www.facebook.com/groups/zarabianie.praca.biznes.online/"; //TU
        grupy[31] = "https://www.facebook.com/groups/ZarabianiePrzezInternet/";
        grupy[32] = "https://www.facebook.com/groups/kryptorodzina/";
        grupy[33] = "https://www.facebook.com/groups/MLM.w.POLSCE/";
        grupy[34] = "https://www.facebook.com/groups/932562780136151/";
        grupy[35] = "https://www.facebook.com/groups/zarabianiewinternecie24h/";
        grupy[36] = "https://www.facebook.com/groups/114051159156931/";
        grupy[37] = "https://www.facebook.com/groups/4139968925/";
        grupy[38] = "https://www.facebook.com/groups/322192781615024/";
        grupy[39] = "https://www.facebook.com/groups/636328313209736/";
        grupy[42] = "https://www.facebook.com/groups/470108560157347/";
        grupy[43] = "https://www.facebook.com/groups/316265375706455/";
        grupy[44] = "https://www.facebook.com/groups/InternetowaPraca/";
        //===========================MOJE
        grupy[45] = "https://www.facebook.com/groups/1478777662423430/";
        grupy[46] = "https://www.facebook.com/groups/1303356579748916/";
        grupy[47] = "https://www.facebook.com/groups/794811483876118/";
        grupy[48] = "https://www.facebook.com/groups/505718296215064/";
        grupy[49] = "https://www.facebook.com/groups/408111472862824/";
        grupy[50] = "https://www.facebook.com/groups/351384515297725/";
        grupy[51] = "https://www.facebook.com/groups/319514972052497/";
        grupy[52] = "https://www.facebook.com/groups/1932167580368778/";
        grupy[53] = "https://www.facebook.com/groups/1483378875270025/";
        grupy[54] = "https://www.facebook.com/groups/1481353345440772/";
        grupy[55] = "https://www.facebook.com/groups/688755227963589/";
        grupy[56] = "https://www.facebook.com/groups/544747138926998/";
        grupy[57] = "https://www.facebook.com/groups/316265375706455/";
        grupy[58] = "https://www.facebook.com/groups/InternetowaPraca/";
        grupy[59] = "https://www.facebook.com/groups/315509495130995/";
        grupy[60] = "https://www.facebook.com/groups/298670413999878/";
        grupy[61] = "https://www.facebook.com/groups/2935674523171777/";
        driver.manage().window().maximize();
        driver.get("https://pl-pl.facebook.com/login/");
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(haslo);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        } catch (Exception e) {
            System.out.println("ZALOGOWANA");
        }


        for (int i = a; i < b; i++) {
            try {
                driver.findElement(By.xpath("//*[text()='Twoje konto zostało zablokowane']")).click();
                System.out.println("ZABLOKOWANE");
                driver.quit();
                break;
            } catch (Exception e) {
                System.out.println("la");
            }

            try {
                Thread.sleep(2000);
                driver.get(grupy[i]);
                Thread.sleep(3000);
                try {
                    driver.findElement(By.xpath("//*[text()='Napisz post']")).click();
                } catch (Exception f) {
                    driver.findElement(By.xpath("//*[text()='Rozpocznij dyskusję']")).click();
                }
                Narzedzia.Kopiuj(post);
                Thread.sleep(3000);
                clickXY(694, 642);
                clickXY(750, 642);
                Thread.sleep(1000);
                Narzedzia.Wklej();
                Thread.sleep(3000);
                Narzedzia.ScrollBy(driver, "300");
                Thread.sleep(1000);
                    /*
                    try {
                        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/div")).click();
                    } catch (Exception e) {
                        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div[2]/div/table/tbody/tr[1]/td[1]/div/div/span/a/div[2]")).click();
                    }
                    Thread.sleep(5000);
                    Narzedzia.Kopiuj("C:\\Users\\dumci\\Desktop\\klikanie\\posty\\klos.jpg");
                    Thread.sleep(1000);
                    Narzedzia.Wklej();
                    Thread.sleep(1000);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    Thread.sleep(17000);
                    */
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Opublikuj']")).click();
                Thread.sleep(1000);
                clickXY(962, 498);
                Thread.sleep(10000);
                ScrollBy(driver, "-15000");
                Thread.sleep(1000);
                //Thread.sleep(1000000);
                driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[2]/div/span/span/a/abbr/span")).click();
                //driver.findElement(By.xpath("//div[2]/div[1]/div[3]/div[3]/div/div/div/div/a")).click();  //ZDJECIE
                //driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[3]/div/div")).click();
                //driver.findElement(By.className("timestampContent")).click();
                Thread.sleep(8000);
                clickXY(1520, 517);
                Thread.sleep(1000);
                zrobScreena(i, mail);
                linki.append(driver.getCurrentUrl() + "\r\n");
            } catch (Exception e) {
                try {
                    driver.findElement(By.xpath("//*[text()='Dołacz do grupy']")).click();
                    Thread.sleep(5000);
                } catch (Exception d) {
                    System.out.println("====================== " + grupy[i] + " ===================");
                }
            }


        }
        linki.close();
        driver.quit();

    }

    public static void dodajPostLepakNowy(String profil, String mail, String haslo, String post, int a, int b, boolean flaga) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\bot\\captcha.crx"));
        options.addExtensions(new File("C:\\bot\\buster.crx"));

        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile " + profil);

        options.addArguments("--disable-notifications");
        Writer linki = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\posty\\screeny\\" + mail + "\\linki.txt", true));
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        String[] grupy = new String[70];
        String[] grupy2 = new String[70];
        grupy[0] = "https://www.facebook.com/groups/197656314112177/";
        grupy[1] = "https://www.facebook.com/groups/298229136881926/";
        grupy[2] = "https://www.facebook.com/groups/mlmstylzycia/";	//blok
        grupy[3] = "https://www.facebook.com/groups/822032214568755/";
        grupy[4] = "https://www.facebook.com/groups/pasywnezarabianie/";
        grupy[5] = "https://www.facebook.com/groups/181436575590022/";
        grupy[6] = "https://www.facebook.com/groups/inwestorzyiinwestycje/";	//blok
        grupy[7] = "https://www.facebook.com/groups/1506859882734317/";
        grupy[8] = "https://www.facebook.com/groups/1774831656147098/";
        grupy[9] = "https://www.facebook.com/groups/995656560478126/";
        grupy[10] = "https://www.facebook.com/groups/389679508482812/";
        grupy[11] = "https://www.facebook.com/groups/531288753733140/";	//akceptacja
        grupy[12] = "https://www.facebook.com/groups/pracawmlm/";	//blok
        grupy[13] = "https://www.facebook.com/groups/331639100303519/";
        grupy[14] = "https://www.facebook.com/groups/301376787777395/";
        grupy[15] = "https://www.facebook.com/groups/381018519002791/";
        grupy[16] = "https://www.facebook.com/groups/pracaonline24/";
        grupy[17] = "https://www.facebook.com/groups/341616220426009/";
        grupy[18] = "https://www.facebook.com/groups/210289873049520/";
        grupy[19] = "https://www.facebook.com/groups/pracazarabianie/";
        grupy[20] = "https://www.facebook.com/groups/zarabianieinternet/";
        grupy[21] = "https://www.facebook.com/groups/519298171753298/";
        grupy[22] = "https://www.facebook.com/groups/PracaBezSzefa/";
        grupy[23] = "https://www.facebook.com/groups/934587176605807/";
        grupy[24] = "https://www.facebook.com/groups/OgloszeniaBiznesowe/";
        grupy[25] = "https://www.facebook.com/groups/272308946449620/";
        grupy[26] = "https://www.facebook.com/groups/zarabianie.praca.internet/";
        grupy[27] = "https://www.facebook.com/groups/1622951457992792/";
        grupy[28] = "https://www.facebook.com/groups/1781838958705367/";
        grupy[29] = "https://www.facebook.com/groups/172681430256680/";
        grupy[30] = "https://www.facebook.com/groups/zarabianie.praca.biznes.online/"; //TU
        grupy[31] = "https://www.facebook.com/groups/ZarabianiePrzezInternet/";
        grupy[32] = "https://www.facebook.com/groups/kryptorodzina/";
        grupy[33] = "https://www.facebook.com/groups/265129344197314/";
        grupy[34] = "https://www.facebook.com/groups/1855184641179253/";    //blok
        grupy[35] = "https://www.facebook.com/groups/zarabianiewinternecie24h/";    //blok
        grupy[36] = "https://www.facebook.com/groups/114051159156931/";
        grupy[37] = "https://www.facebook.com/groups/4139968925/";
        grupy[38] = "https://www.facebook.com/groups/322192781615024/";
        grupy[39] = "https://www.facebook.com/groups/636328313209736/";    //blok
        grupy[42] = "https://www.facebook.com/groups/470108560157347/";    //blok
        grupy[43] = "https://www.facebook.com/groups/316265375706455/";    //blok
        grupy[44] = "https://www.facebook.com/groups/InternetowaPraca/";    //blok
        //===========================MOJE
        grupy[45] = "https://www.facebook.com/groups/1478777662423430/";
        grupy[46] = "https://www.facebook.com/groups/1303356579748916/";    //blook
        grupy[47] = "https://www.facebook.com/groups/794811483876118/";    //DYSKUSJA
        grupy[48] = "https://www.facebook.com/groups/505718296215064/";
        grupy[49] = "https://www.facebook.com/groups/408111472862824/";    //blok
        grupy[50] = "https://www.facebook.com/groups/351384515297725/";    //blok
        grupy[51] = "https://www.facebook.com/groups/319514972052497/";
        grupy[52] = "https://www.facebook.com/groups/1932167580368778/";
        grupy[53] = "https://www.facebook.com/groups/1483378875270025/";
        grupy[54] = "https://www.facebook.com/groups/1481353345440772/";    //DYSKUSJA
        grupy[55] = "https://www.facebook.com/groups/688755227963589/";		//APCEKPTACJA
        grupy[56] = "https://www.facebook.com/groups/544747138926998/";    //blok
        grupy[57] = "https://www.facebook.com/groups/316265375706455/";    //blok
        grupy[58] = "https://www.facebook.com/groups/InternetowaPraca/";    //blok
        grupy[59] = "https://www.facebook.com/groups/315509495130995/";
        grupy[60] = "https://www.facebook.com/groups/298670413999878/";
        grupy[61] = "https://www.facebook.com/groups/2935674523171777/";	//AKCEPTACJA

        grupy2[0] = "https://www.facebook.com/groups/ZarabiamWInternecie24/";
        grupy2[1] = "https://www.facebook.com/groups/1738614476385924/";
        grupy2[2] = "https://www.facebook.com/groups/1755764568010980/";
        grupy2[3] = "https://www.facebook.com/groups/1062892473755654/";
        grupy2[4] = "https://www.facebook.com/groups/275239426452519/";
        grupy2[5] = "https://www.facebook.com/groups/525083377540133/";	//dyskusja
        grupy2[6] = "https://www.facebook.com/groups/489737711047141/";
        grupy2[7] = "https://www.facebook.com/groups/1430880976978615/";
        grupy2[8] = "https://www.facebook.com/groups/1094254027714610/";	//akceptacja
        grupy2[9] = "https://www.facebook.com/groups/216664798801356/";
        grupy2[10] = "https://www.facebook.com/groups/592252047798369/";
        grupy2[11] = "https://www.facebook.com/groups/1825732451077240/";
        grupy2[12] = "https://www.facebook.com/groups/370561153055562/";
        grupy2[13] = "https://www.facebook.com/groups/228459925434152/";
        grupy2[14] = "https://www.facebook.com/groups/935964903461625/";	//nie mozna wystawic postu
        grupy2[15] = "https://www.facebook.com/groups/348871858855980/";
        grupy2[16] = "https://www.facebook.com/groups/praca.siedlce/";
        grupy2[17] = "https://www.facebook.com/groups/254200585111377/";	//akceptacja
        grupy2[18] = "https://www.facebook.com/groups/587449044732733/";
        grupy2[19] = "https://www.facebook.com/groups/140934702697559/";
        grupy2[20] = "https://www.facebook.com/groups/723051031543696/";
        grupy2[21] = "https://www.facebook.com/groups/zarabiamwinternecieUK/";
        grupy2[22] = "https://www.facebook.com/groups/1652386318160820/";
        grupy2[23] = "https://www.facebook.com/groups/553406364833950/";
        grupy2[24] = "https://www.facebook.com/groups/328630974620800/";
        grupy2[25] = "https://www.facebook.com/groups/401862109918110/";
        grupy2[26] = "https://www.facebook.com/groups/zarabianieprzezneta/";	//akceptacja
        grupy2[27] = "https://www.facebook.com/groups/1450613121819428/";
        grupy2[28] = "https://www.facebook.com/groups/682480818432113/";
        grupy2[29] = "https://www.facebook.com/groups/1269496053078983/";
        grupy2[30] = "https://www.facebook.com/groups/730288703762088/";
        grupy2[31] = "https://www.facebook.com/groups/304611164084232/";	//akceptacja
        grupy2[32] = "https://www.facebook.com/groups/grupawsparciamlm/";	//dyskusja
        grupy2[33] = "https://www.facebook.com/groups/1707876736106783/";
        grupy2[34] = "https://www.facebook.com/groups/293083300801332/";
        grupy2[35] = "https://www.facebook.com/groups/368105106970944/";	//akceptacja
        grupy2[36] = "https://www.facebook.com/groups/603093386381123/";
        grupy2[37] = "https://www.facebook.com/groups/281402322004801/";
        grupy2[38] = "https://www.facebook.com/groups/736793290304625/";	//nie mozna post
        grupy2[39] = "https://www.facebook.com/groups/SpelniajMarzenia/";	//akceptacja
        grupy2[40] = "https://www.facebook.com/groups/419672628799764/";
        grupy2[41] = "https://www.facebook.com/groups/112506316105896/";
        grupy2[42] = "https://www.facebook.com/groups/as.polska.polski/";
        grupy2[43] = "https://www.facebook.com/groups/1411493178930704/";
        grupy2[44] = "https://www.facebook.com/groups/260347977466204/";	//dyskusja
        grupy2[45] = "https://www.facebook.com/groups/260986967296826/";
        grupy2[46] = "https://www.facebook.com/groups/173392000759936/";
        grupy2[47] = "https://www.facebook.com/groups/837024419659515/";
        grupy2[48] = "https://www.facebook.com/groups/933677930171662/";
        grupy2[49] = "https://www.facebook.com/groups/1880353255553576/";	//akceptacja
        grupy2[50] = "https://www.facebook.com/groups/292714161260017/";
        grupy2[51] = "https://www.facebook.com/groups/482209278847962/";
        grupy2[52] = "https://www.facebook.com/groups/976057992777858/";	//nie mozna dac posta

        JavascriptExecutor js = (JavascriptExecutor) driver;	
        driver.manage().window().maximize();
        driver.get("https://pl-pl.facebook.com/login/");
        Thread.sleep(3000);

        try {
            try {
                driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
                Thread.sleep(2000);
            } catch (Exception e) {

            }
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys(mail);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[2]/input")).sendKeys(haslo);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")).click();

        } catch (Exception e) {
            System.out.println("ZALOGOWANA");
        }


        for (int i = a; i < b; i++) {
            try {
                Thread.sleep(2000);
                if (flaga)
                    driver.get(grupy[i]);
                else
                    driver.get(grupy2[i]);
                Thread.sleep(3000);
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[4]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div[1]/span")).click();
                Thread.sleep(3000);
                Narzedzia.Kopiuj(post);
                clickXY(915, 500);
                Thread.sleep(1000);
                Narzedzia.Wklej();
                Thread.sleep(2000);
//                ZDJECIE =======================
                Kopiuj("C:\\Users\\dumci\\Desktop\\klikanie\\posty\\klos.jpg");
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/form/div/div[1]/div/div/div[1]/div[3]/div[1]/div[2]/div[2]/span/div/div/div[1]/div/div/div[1]/i" +
                        "")).click();
                Thread.sleep(2000);
                Wklej();
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_ENTER);
                Thread.sleep(3000);

                driver.findElement(By.xpath("//*[text()='Opublikuj']")).click();
                Thread.sleep(5000);
                try {
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[4]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/span/span/span[2]/span/a/span/span/span[2]")).click();
                } catch (Exception e) {
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[4]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/span/span/span[2]/span")).click();
                }

                Thread.sleep(5000);
                zrobScreena(i, mail);
                linki.append(driver.getCurrentUrl() + "\r\n");


            } catch (Exception e) {
                try {
                    driver.findElement(By.xpath("//*[text()='Dołacz do grupy']")).click();
                    Thread.sleep(5000);
                } catch (Exception d) {
                    System.out.println("====================== " + grupy[i] + " ===================");
                }
            }


        }
        linki.close();
        driver.quit();

    }

    public static void poprawGrupe(String profil) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile " + profil);
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        List<String> grupy = new ArrayList<>();
        grupy.add("https://www.facebook.com/groups/298229136881926/");
        grupy.add("https://www.facebook.com/groups/mlmstylzycia/");
        grupy.add("https://www.facebook.com/groups/pasywnezarabianie/");
        grupy.add("https://www.facebook.com/groups/inwestorzyiinwestycje/");
        grupy.add("https://www.facebook.com/groups/519298171753298/");

        for (int i = 0; i < grupy.size(); i++) {
            try {
                driver.get(grupy.get(i));
                Thread.sleep(3000);
                driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[3]/a")).click();
                Thread.sleep(2000);
                if (grupy.get(i) == "https://www.facebook.com/groups/298229136881926/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("rozumiem");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy.get(i) == "https://www.facebook.com/groups/mlmstylzycia/") {
                    driver.findElement(By.xpath("/html/body/div[16]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("zrobione");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy.get(i) == "https://www.facebook.com/groups/pasywnezarabianie/") {
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/div/div[1]/div[1]/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[5]/div[2]/div/div/div[1]/div[1]/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[6]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy.get(i) == "https://www.facebook.com/groups/inwestorzyiinwestycje/") {
                    driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("nie");
                    driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/span/textarea")).sendKeys("nie");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy.get(i) == "https://www.facebook.com/groups/519298171753298/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("ponieważ szukam pracy online");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                }
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("NIE");
            }

        }
        driver.quit();
    }

    public static void sprawdzGrupe(String mail) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        Writer niedolaczone = new BufferedWriter(new FileWriter("C:\\Users\\dumci\\Desktop\\klikanie\\" + mail + ".txt", true));
        Robot robot = new Robot();
        String[] grupy = new String[45];
        grupy[0] = "https://www.facebook.com/groups/125548817802832/";
        grupy[1] = "https://www.facebook.com/groups/1570795726299278/";
        grupy[2] = "https://www.facebook.com/groups/1606955026051559";
        grupy[3] = "https://www.facebook.com/groups/1764049867255940/";
        grupy[4] = "https://www.facebook.com/groups/1740657925950542/";
        grupy[5] = "https://www.facebook.com/groups/1715869212053509/";
        grupy[5] = "https://www.facebook.com/groups/1659769224298606/";
        grupy[6] = "https://www.facebook.com/groups/1622951457992792/";
        grupy[7] = "https://www.facebook.com/groups/1478777662423430/";
        grupy[8] = "https://www.facebook.com/groups/1442053002718329/";
        grupy[9] = "https://www.facebook.com/groups/1731454403742658/";
        grupy[10] = "https://www.facebook.com/groups/1309249022596054/";
        grupy[11] = "https://www.facebook.com/groups/1303356579748916/";
        grupy[12] = "https://www.facebook.com/groups/1008127719282719/";
        grupy[13] = "https://www.facebook.com/groups/854004074659978/";
        grupy[14] = "https://www.facebook.com/groups/809783852435874/";
        grupy[15] = "https://www.facebook.com/groups/808549515842925/";
        grupy[16] = "https://www.facebook.com/groups/794811483876118/";
        grupy[17] = "https://www.facebook.com/groups/778296025884628/";
        grupy[18] = "https://www.facebook.com/groups/695397610568606/";
        grupy[19] = "https://www.facebook.com/groups/540350133012925/";
        grupy[20] = "https://www.facebook.com/groups/531288753733140/";
        grupy[21] = "https://www.facebook.com/groups/505718296215064/";
        grupy[22] = "https://www.facebook.com/groups/477565072307531/";
        grupy[23] = "https://www.facebook.com/groups/426282497555531/";
        grupy[24] = "https://www.facebook.com/groups/409112686230138/";
        grupy[25] = "https://www.facebook.com/groups/408111472862824/";
        grupy[26] = "https://www.facebook.com/groups/389679508482812/";
        grupy[27] = "https://www.facebook.com/groups/378318846318979/";
        grupy[28] = "https://www.facebook.com/groups/351384515297725/";
        grupy[29] = "https://www.facebook.com/groups/319514972052497/";
        grupy[30] = "https://www.facebook.com/groups/295627300568974/";
        grupy[31] = "https://www.facebook.com/groups/270165996779362/";
        grupy[32] = "https://www.facebook.com/groups/222544894613213/";
        grupy[33] = "https://www.facebook.com/groups/208321705846755/";
        grupy[34] = "https://www.facebook.com/groups/181436575590022/";
        grupy[35] = "https://www.facebook.com/groups/172681430256680/";
        grupy[36] = "https://www.facebook.com/groups/169758150287082/";
        grupy[37] = "https://www.facebook.com/groups/144214276428563/";
        grupy[38] = "https://www.facebook.com/groups/932562780136151/";
        grupy[39] = "https://www.facebook.com/groups/1754524728151510/";
        driver.manage().window().maximize();

        driver.get("https://pl-pl.facebook.com/login/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(mail + "V2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();

        for (int i = 19; i < 33; i++) {
            Thread.sleep(2000);
            driver.get(grupy[i]);
            Thread.sleep(3000);
            try {
                try {
                    driver.findElement(By.xpath("//*[text()='Napisz post']")).click();
                } catch (Exception f) {
                    driver.findElement(By.xpath("//*[text()='Rozpocznij dyskusję']")).click();
                }
            } catch (Exception e) {
                niedolaczone.append(grupy[i] + ";");
            }
        }
        niedolaczone.close();

    }

    public static void dolaczDoGrupy(String mail, String profil) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile " + profil);
        LocalDate data = LocalDate.now();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        String[] grupy = new String[100];
        grupy[0] = "https://www.facebook.com/groups/125548817802832/";
        grupy[1] = "https://www.facebook.com/groups/1570795726299278/";
        grupy[2] = "https://www.facebook.com/groups/1606955026051559";
        grupy[3] = "https://www.facebook.com/groups/1764049867255940/";
        grupy[4] = "https://www.facebook.com/groups/1740657925950542/";
        grupy[5] = "https://www.facebook.com/groups/1715869212053509/";
        grupy[5] = "https://www.facebook.com/groups/1659769224298606/";
        grupy[6] = "https://www.facebook.com/groups/1622951457992792/";
        grupy[7] = "https://www.facebook.com/groups/1478777662423430/";
        grupy[8] = "https://www.facebook.com/groups/1442053002718329/";
        grupy[9] = "https://www.facebook.com/groups/1731454403742658/";
        grupy[10] = "https://www.facebook.com/groups/1309249022596054/";
        grupy[11] = "https://www.facebook.com/groups/1303356579748916/";
        grupy[12] = "https://www.facebook.com/groups/1008127719282719/";
        grupy[13] = "https://www.facebook.com/groups/854004074659978/";
        grupy[14] = "https://www.facebook.com/groups/809783852435874/";
        grupy[15] = "https://www.facebook.com/groups/808549515842925/";
        grupy[16] = "https://www.facebook.com/groups/794811483876118/";
        grupy[17] = "https://www.facebook.com/groups/778296025884628/";
        grupy[18] = "https://www.facebook.com/groups/695397610568606/";
        grupy[19] = "https://www.facebook.com/groups/540350133012925/";
        grupy[20] = "https://www.facebook.com/groups/531288753733140/";
        grupy[21] = "https://www.facebook.com/groups/505718296215064/";
        grupy[22] = "https://www.facebook.com/groups/477565072307531/";
        grupy[23] = "https://www.facebook.com/groups/426282497555531/";
        grupy[24] = "https://www.facebook.com/groups/409112686230138/";
        grupy[25] = "https://www.facebook.com/groups/408111472862824/";
        grupy[26] = "https://www.facebook.com/groups/389679508482812/";
        grupy[27] = "https://www.facebook.com/groups/378318846318979/";
        grupy[28] = "https://www.facebook.com/groups/351384515297725/";
        grupy[29] = "https://www.facebook.com/groups/319514972052497/";
        grupy[30] = "https://www.facebook.com/groups/295627300568974/";
        grupy[31] = "https://www.facebook.com/groups/270165996779362/";
        grupy[32] = "https://www.facebook.com/groups/222544894613213/";
        grupy[33] = "https://www.facebook.com/groups/208321705846755/";
        grupy[34] = "https://www.facebook.com/groups/181436575590022/";
        grupy[35] = "https://www.facebook.com/groups/172681430256680/";
        grupy[36] = "https://www.facebook.com/groups/169758150287082/";
        grupy[37] = "https://www.facebook.com/groups/144214276428563/";
        grupy[38] = "https://www.facebook.com/groups/932562780136151/";
        grupy[39] = "https://www.facebook.com/groups/1754524728151510/";
        //===============================================================
        grupy[40] = "https://www.facebook.com/groups/1579660672149952/";
        grupy[41] = "https://www.facebook.com/groups/1572941836312675/";
        grupy[42] = "https://www.facebook.com/groups/870510806373486/";
        grupy[43] = "https://www.facebook.com/groups/880012362162586/";
        grupy[44] = "https://www.facebook.com/groups/581697198536166/";
        grupy[45] = "https://www.facebook.com/groups/575459339202696/";
        grupy[46] = "https://www.facebook.com/groups/470892019739734/";
        grupy[47] = "https://www.facebook.com/groups/389866961186981/";
        grupy[48] = "https://www.facebook.com/groups/555697394768926/";
        grupy[49] = "https://www.facebook.com/groups/381018519002791/";
        grupy[50] = "https://www.facebook.com/groups/216088472226388/";
        grupy[51] = "https://www.facebook.com/groups/1932167580368778/";
        grupy[52] = "https://www.facebook.com/groups/1781838958705367/";
        grupy[53] = "https://www.facebook.com/groups/1483378875270025/";
        grupy[54] = "https://www.facebook.com/groups/1481353345440772/";
        grupy[55] = "https://www.facebook.com/groups/1329991887146992/";
        grupy[56] = "https://www.facebook.com/groups/1149026795123144/";
        grupy[57] = "https://www.facebook.com/groups/864759733686026/";
        grupy[58] = "https://www.facebook.com/groups/688755227963589/";
        grupy[59] = "https://www.facebook.com/groups/640618349404104/";
        grupy[60] = "https://www.facebook.com/groups/544747138926998/";
        driver.manage().window().maximize();

        try {
            driver.get("https://pl-pl.facebook.com/login/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(mail + "V2");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        } catch (Exception e) {
            System.out.println("ZALOGOWANY");
        }


        for (int i = 0; i < 20; i++) {
            try {
                driver.findElement(By.xpath("//*[text()='Twoje konto zostało zablokowane']")).click();
                System.out.println("ZABLOKOWANE");
                driver.quit();
                break;
            } catch (Exception e) {
                System.out.println("la");
            }

            try {
                Thread.sleep(2000);
                driver.get(grupy[i]);
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Dołącz do grupy']")).click();
                Thread.sleep(5000);
                if (grupy[i] == "https://www.facebook.com/groups/125548817802832/") {
                    Narzedzia.clickXY(940, 450);
                    Narzedzia.Kopiuj("ok");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1442053002718329/") {
                    clickXY(728, 400);
                    clickXY(728, 526);
                    clickXY(728, 645);
                    clickXY(728, 743);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1570795726299278/") {
                    Narzedzia.clickXY(940, 450);
                    Narzedzia.Kopiuj("ok");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1764049867255940/") {
                    Narzedzia.clickXY(940, 570);
                    Narzedzia.Kopiuj("ok");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1715869212053509/") {
                    Narzedzia.clickXY(940, 490);
                    Narzedzia.Kopiuj("ok");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1303356579748916/") {
                    Narzedzia.clickXY(940, 490);
                    Narzedzia.Kopiuj("ok");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1008127719282719/") {
                    Narzedzia.clickXY(940, 470);
                    Narzedzia.Kopiuj("tak");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/809783852435874/") {
                    Narzedzia.clickXY(940, 502);
                    Narzedzia.Kopiuj(data.toString());
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    Kopiuj("tak");
                    clickXY(940, 620);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/540350133012925/") {
                    Narzedzia.clickXY(940, 400);
                    Narzedzia.Kopiuj("na terenie europy");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/409112686230138/") {
                    Narzedzia.clickXY(940, 502);
                    Narzedzia.Kopiuj("ponieważ szukam pracy za granicą");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    Kopiuj("bo jest lepsze wynagrodzenie");
                    clickXY(940, 620);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/408111472862824/") {
                    Narzedzia.clickXY(940, 546);
                    Narzedzia.Kopiuj("tak");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/208321705846755/") {
                    Narzedzia.clickXY(940, 487);
                    Narzedzia.Kopiuj("rozumiem");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1754524728151510/") {
                    Narzedzia.clickXY(940, 470);
                    Narzedzia.Kopiuj("rozumiem");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/575459339202696/") {
                    Narzedzia.clickXY(940, 382);
                    Narzedzia.Kopiuj("rozumiem");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    Kopiuj("ok");
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/470892019739734/") {
                    Narzedzia.clickXY(940, 473);
                    Narzedzia.Kopiuj("ponad 2 lata");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    Kopiuj("chcę dodać swoje ogłoszenie i przeglądać inne");
                    clickXY(940, 1000);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/389866961186981/") {
                    Narzedzia.clickXY(940, 440);
                    Narzedzia.Kopiuj("tak będę");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    Kopiuj("spróbuję");
                    clickXY(940, 625);
                    Thread.sleep(1000);
                    Wklej();
                    Kopiuj("rozumiem");
                    clickXY(940, 813);
                    Thread.sleep(1000);
                    Wklej();
                    clickXY(726, 901);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/216088472226388/") {
                    Narzedzia.clickXY(940, 400);
                    Narzedzia.Kopiuj("tak");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    Kopiuj("szukam pracy");
                    clickXY(940, 511);
                    Thread.sleep(1000);
                    Wklej();
                    Kopiuj("nie chcę");
                    clickXY(940, 641);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/544747138926998/") {
                    Narzedzia.clickXY(940, 450);
                    Narzedzia.Kopiuj("poszukuje");
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    Kopiuj("w Polsce");
                    clickXY(940, 576);
                    Thread.sleep(1000);
                    Wklej();
                    Kopiuj("2");
                    clickXY(940, 718);
                    Thread.sleep(1000);
                    Wklej();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/351384515297725/") {
                    clickXY(727, 264);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1659769224298606/") {
                    clickXY(728, 565);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                }
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("====================== " + grupy[i] + " =================");
            }

        }
        driver.quit();

    }

    public static void dolaczDoGrupyPoczatek(String mail, String haslo) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        /*
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile "+profil);

         */
        LocalDate data = LocalDate.now();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        String[] grupy = new String[100];
        grupy[0] = "https://www.facebook.com/groups/esingle";
        grupy[1] = "https://www.facebook.com/groups/SingleSzukamPartnera/";
        grupy[2] = "https://www.facebook.com/groups/ZakochajmySzczecin";
        grupy[3] = "https://www.facebook.com/groups/779803685436670";
        grupy[4] = "https://www.facebook.com/groups/1638108599742339/";
        grupy[5] = "https://www.facebook.com/groups/randkiwsieci/";
        grupy[5] = "https://www.facebook.com/groups/1951008294932277/";
        grupy[6] = "https://www.facebook.com/groups/443818016228381/";
        grupy[7] = "https://www.facebook.com/groups/577232589129313/";
        grupy[9] = "https://www.facebook.com/groups/ChetnieKogosPoznam/";
        grupy[10] = "https://www.facebook.com/groups/randkionline/";
        grupy[11] = "https://www.facebook.com/groups/1583819578552649/";
        driver.manage().window().maximize();

        try {
            driver.get("https://pl-pl.facebook.com/login/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(haslo);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        } catch (Exception e) {
            System.out.println("ZALOGOWANY");
        }


        for (int i = 0; i < grupy.length; i++) {
            try {
                driver.findElement(By.xpath("//*[text()='Twoje konto zostało zablokowane']")).click();
                System.out.println("ZABLOKOWANE");
                driver.quit();
                break;
            } catch (Exception e) {
                //System.out.println("la");
            }

            try {
                Thread.sleep(2000);
                driver.get(grupy[i]);
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Dołącz do grupy']")).click();
                Thread.sleep(5000);

                if (grupy[i] == "https://www.facebook.com/groups/esingle") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("tak");
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/span/textarea")).sendKeys("tak");
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[5]/div[2]/div/div/div[2]/div[1]/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[6]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/779803685436670") {
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1638108599742339/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/randkiwsieci/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("tak");
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/span/textarea")).sendKeys("tak");
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[5]/div[2]/div/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[5]/div[3]/div/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1951008294932277/") {
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("tak");
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/443818016228381/") {
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("tak");
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/577232589129313/") {
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("żeby poznań nowe ciekawe osoby");
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[5]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/ChetnieKogosPoznam/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/1583819578552649/") {
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("rozumiem");
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/span/textarea")).sendKeys("mam 26 lat i jestem z poznania");
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[5]/div[2]/div/span/textarea")).sendKeys("szukam nowych osobowości");
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[6]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                }
                Thread.sleep(3000);
            } catch (Exception e) {
                //System.out.println("====================== "+grupy[i]+" =================");
            }

        }
        driver.quit();

    }

    public static void dolaczDoGrupyLepak(String mail, String haslo, int a, int b) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        /*
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile "+profil);

         */
        LocalDate data = LocalDate.now();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("prefs", prefs);
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();
        String[] grupy = new String[100];
        grupy[0] = "https://www.facebook.com/groups/197656314112177/";
        grupy[1] = "https://www.facebook.com/groups/298229136881926/";
        grupy[2] = "https://www.facebook.com/groups/mlmstylzycia/";
        grupy[3] = "https://www.facebook.com/groups/822032214568755/";
        grupy[4] = "https://www.facebook.com/groups/pasywnezarabianie/";
        grupy[5] = "https://www.facebook.com/groups/181436575590022/";
        grupy[6] = "https://www.facebook.com/groups/inwestorzyiinwestycje/";
        grupy[7] = "https://www.facebook.com/groups/zarabiajwnecie/";
        grupy[8] = "https://www.facebook.com/groups/410873349362708/";
        grupy[9] = "https://www.facebook.com/groups/270165996779362/";
        grupy[10] = "https://www.facebook.com/groups/389679508482812/";
        grupy[11] = "https://www.facebook.com/groups/531288753733140/";
        grupy[12] = "https://www.facebook.com/groups/pracawmlm/";
        grupy[13] = "https://www.facebook.com/groups/168679147406607/";
        grupy[14] = "https://www.facebook.com/groups/yeahcoachpl/";
        grupy[15] = "https://www.facebook.com/groups/381018519002791/";
        grupy[16] = "https://www.facebook.com/groups/pracaonline24/";
        grupy[17] = "https://www.facebook.com/groups/pieniadzezinternetu/";
        grupy[18] = "https://www.facebook.com/groups/210289873049520/";
        grupy[19] = "https://www.facebook.com/groups/pracazarabianie/";
        grupy[20] = "https://www.facebook.com/groups/zarabianieinternet/";
        grupy[21] = "https://www.facebook.com/groups/519298171753298/";
        grupy[22] = "https://www.facebook.com/groups/PracaBezSzefa/";
        grupy[23] = "https://www.facebook.com/groups/934587176605807/";
        grupy[24] = "https://www.facebook.com/groups/920488634709636/";
        grupy[25] = "https://www.facebook.com/groups/1895279054050554/";
        grupy[26] = "https://www.facebook.com/groups/zarabianie.praca.internet/";
        grupy[27] = "https://www.facebook.com/groups/1622951457992792/";
        grupy[28] = "https://www.facebook.com/groups/1781838958705367/";
        grupy[29] = "https://www.facebook.com/groups/172681430256680/";
        grupy[30] = "https://www.facebook.com/groups/zarabianie.praca.biznes.online/";
        grupy[31] = "https://www.facebook.com/groups/ZarabianiePrzezInternet/";
        grupy[32] = "https://www.facebook.com/groups/kryptorodzina/";
        grupy[33] = "https://www.facebook.com/groups/MLM.w.POLSCE/";
        grupy[34] = "https://www.facebook.com/groups/932562780136151/";
        grupy[35] = "https://www.facebook.com/groups/zarabianiewinternecie24h/";
        grupy[36] = "https://www.facebook.com/groups/114051159156931/";
        grupy[37] = "https://www.facebook.com/groups/4139968925/";
        grupy[38] = "https://www.facebook.com/groups/322192781615024/";
        grupy[39] = "https://www.facebook.com/groups/636328313209736/";
        grupy[42] = "https://www.facebook.com/groups/470108560157347/";
        grupy[43] = "https://www.facebook.com/groups/316265375706455/";
        grupy[44] = "https://www.facebook.com/groups/InternetowaPraca/";
        //===========================MOJE
        grupy[45] = "https://www.facebook.com/groups/1478777662423430/";
        grupy[46] = "https://www.facebook.com/groups/1303356579748916/";
        grupy[47] = "https://www.facebook.com/groups/794811483876118/";
        grupy[48] = "https://www.facebook.com/groups/505718296215064/";
        grupy[49] = "https://www.facebook.com/groups/408111472862824/";
        grupy[50] = "https://www.facebook.com/groups/351384515297725/";
        grupy[51] = "https://www.facebook.com/groups/319514972052497/";
        grupy[52] = "https://www.facebook.com/groups/1932167580368778/";
        grupy[53] = "https://www.facebook.com/groups/1483378875270025/";
        grupy[54] = "https://www.facebook.com/groups/1481353345440772/"; //-----
        grupy[55] = "https://www.facebook.com/groups/688755227963589/";
        grupy[56] = "https://www.facebook.com/groups/544747138926998/";
        grupy[57] = "https://www.facebook.com/groups/316265375706455/";
        grupy[58] = "https://www.facebook.com/groups/InternetowaPraca/";
        grupy[59] = "https://www.facebook.com/groups/315509495130995/";
        grupy[60] = "https://www.facebook.com/groups/298670413999878/";
        grupy[61] = "https://www.facebook.com/groups/2935674523171777/";
        driver.manage().window().maximize();

        try {
            driver.get("https://pl-pl.facebook.com/login/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(haslo);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        } catch (Exception e) {
            System.out.println("ZALOGOWANY");
        }

        for (int i = a; i < b; i++) {
            try {
                driver.findElement(By.xpath("//*[text()='Twoje konto zostało zablokowane']")).click();
                System.out.println("ZABLOKOWANE");
                driver.quit();
                break;
            } catch (Exception e) {
                System.out.println("la");
            }

            try {
                Thread.sleep(2000);
                driver.get(grupy[i]);
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Dołącz do grupy']")).click();
                Thread.sleep(5000);

                //0-10
                if (grupy[i] == "https://www.facebook.com/groups/mlmstylzycia/") {
                    driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("oki");
                    driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/span/textarea")).sendKeys("oki");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/pasywnezarabianie/") {
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/div/div[1]/div[1]/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[5]/div[2]/div/div/div[1]/div[1]/div/input")).click();
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[6]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/inwestorzyiinwestycje/") {
                    driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("nie");
                    driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/span/textarea")).sendKeys("nie");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/410873349362708/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                }

                //10-20
                else if (grupy[i] == "https://www.facebook.com/groups/pracawmlm/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("szukam współpracy");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/381018519002791/") {
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("oki");
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/pracaonline24/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("szukam pracy online");
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                }

                //20-30
                else if (grupy[i] == "https://www.facebook.com/groups/519298171753298/") {
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("mam nowe konto założone w 2k20.. :/ chcę dołączyć ponieważ szukam zarobku w internecie");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/PracaBezSzefa/") {
                    driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("oki");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/zarabianie.praca.internet/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("oki");
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[2]/div/span/textarea")).sendKeys("chcę");
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[5]/div[2]/div/span/textarea")).sendKeys("no pewnie że tak !");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                }

                //30-40
                else if (grupy[i] == "https://www.facebook.com/groups/zarabianie.praca.biznes.online/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("tak");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                }

                //40-45
                else if (grupy[i] == "https://www.facebook.com/groups/470108560157347/") {
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("polska");
                    driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[1]/div[2]/div/input")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                } else if (grupy[i] == "https://www.facebook.com/groups/316265375706455/") {
                    driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/span/textarea")).sendKeys("szukam pracy");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[text()='Wyślij']")).click();
                }

                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("====================== " + grupy[i] + " =================");
            }

        }
        driver.quit();


    }

    public static void klos() throws InterruptedException, AWTException, IOException {
        String post = "Byłem już tutaj pogromcą smoków, gwałcicielem niewiast, złodziejem, oszustem i kilka innych epitetów mógłbym przytoczyć...\n" +
                "Prawda jest taka, że od kilku lat ujawniam te Wasze scamy i próby naciągnięcia kolejnych jeleni na te Wasze cudowne biznesy.\n" +
                "Jedna z moich największych akcji słynna już na całą Polskę z recacly Botem gdzie włożyłem 13.000zł tylko po to aby pokazać jak ten syf działa! Mało co mnie tu nie zlinczowali wtedy a dziś gdzie jesteście?\n" +
                "Jak tam RB działa? No właśnie nie działa i to od dawna! Wideo z całej akcji na moim Blogu:\n" +
                "\n" +
                "Miroslawklos .pl (Bez spacji przed kropką bo FB tnie zasięgi)\n" +
                "\n" +
                "Była nie mniej słynna na całą Polskę Madzia ze Szczecina! Wariatka, chora kobieta lub jak nie którzy twierdzą nieszczęśliwie zakochana we mnie kobieta. Która w desperacji zgłaszała mnie do Urzędu Skarbowego. Na policję i prokuraturę oraz molestowała mentalnie gdzie się tylko da ;) O Niej też materiał i to nie jeden znajdziecie na moim blogu lub kanale youtube.\n" +
                "Były wyjazdy w bardziej i mniej egzotyczne miejsca. Ibiza za 30.000zł w tydzień. Pokoje kinowe za 2 razy więcej... No cóż ja po prostu lubię zarabiać pieniądze a jeszcze bardziej je wydawać.\n" +
                "Wiem, że jak tylko to widzicie to zżera Was od środka jakie to gówniane życie na etacie macie! Też kiedyś takie miałem i dziś zarabiam w biznesie, który stworzyłem sam od podstaw. Oraz pomagam innym odmienić swoje życie. \n" +
                "Zapraszam na mojego bloga lub do kontaktu do mnie drogą mailową. Na samym FB nie odpisuje zresztą nikt Wam nie odpisze w komentarzu. Są to tylko osoby, które pracują dla mnie.\n" +
                "\n" +
                "Napisz a pomogę!\n" +
                "\n" +
                "dishar82@gmail.com\n" +
                "\n" +
                "Biznes oparty na produktach cyfrowych wysyłanych mailowo. Na portalach aukcyjnych jak Allegro, Ebay etc..\n" +
                "\n" +
                "Pozdrawiam!\n" +
                "Mirek!\n" +
                "P.S. Falę hejtu i żali możecie wylać poniżej. Wybaczcie, że nie odczytam ;)\n" +
                "\n" +
                "https://www.youtube.com/c/MiroslawKlos";

        String fb[] = {"henryka.tenerowicz@o2.pl", "zuzanna-krzysztofowicz@o2.pl", "kowazofi@interia.pl", "filikra@interia.pl", "kajeszu@interia.pl"};
        String profil[] = {"155", "160", "166", "167", "168"};

        for (int i = 0; i < fb.length; i++) {
            dodajPost(fb[i], post, profil[i], 0, 12);
            System.out.println(i);
            System.out.println(fb[i]);
            Koniec.RestarHujawei();
        }

        for (int i = 0; i < fb.length; i++) {
            dodajPost(fb[i], post, profil[i], 12, 24);
            System.out.println(i);
            System.out.println(fb[i]);
            Koniec.RestarHujawei();
        }

        for (int i = 0; i < fb.length; i++) {
            dodajPost(fb[i], post, profil[i], 24, 36);
            System.out.println(i);
            System.out.println(fb[i]);
            Koniec.RestarHujawei();
        }

        for (int i = 0; i < fb.length; i++) {
            dodajPost(fb[i], post, profil[i], 36, 48);
            System.out.println(i);
            System.out.println(fb[i]);
            Koniec.RestarHujawei();
        }

        for (int i = 0; i < fb.length; i++) {
            dodajPost(fb[i], post, profil[i], 48, 55);
            System.out.println(i);
            System.out.println(fb[i]);
            Koniec.RestarHujawei();
        }
    }

    public static void lajkuj(String mail, String haslo) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        /*
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile "+profil);

         */
        options.addArguments("--disable-notifications");
        List<String> fp = new ArrayList<>();
        fp.add("https://www.facebook.com/kwejk.fan/");
        fp.add("https://www.facebook.com/Besty-1785427888436513/");
        fp.add("https://www.facebook.com/JBZDY/");
        fp.add("https://www.facebook.com/Demotywatorypl-241350696040123/");
        fp.add("https://www.facebook.com/bezuzytecznapl/");
        fp.add("https://www.facebook.com/Januszeinformatykipl/");
        fp.add("https://www.facebook.com/prawicowyinternet/");
        fp.add("https://www.facebook.com/thememesss/");
        fp.add("https://www.facebook.com/Cebula-ze-Zrzutkapl-2209015402703108/");
        fp.add("https://www.facebook.com/Czarny-Humor-229016610512011/");
        fp.add("https://www.facebook.com/Cypis-Solo-563145503821285");
        fp.add("https://www.facebook.com/rozbojnikalibaba/");
        fp.add("https://www.facebook.com/PopekMonster/");
        fp.add("https://www.facebook.com/fanimuzykidiscopolo/");
        fp.add("https://www.facebook.com/Pizda-Anio%C5%82a-1751870498186102");
        fp.add("https://www.facebook.com/zubr/");
        fp.add("https://www.facebook.com/tyskie/");
        fp.add("https://www.facebook.com/Zoladkowa/");
        fp.add("https://www.facebook.com/rockmoda/");
        fp.add("https://www.facebook.com/modafb/");
        fp.add("https://www.facebook.com/URODAkosmetyki");
        fp.add("https://www.facebook.com/drMonikaLelonkiewicz/");
        fp.add("https://www.facebook.com/Konie-225135044167349/");
        fp.add("https://www.facebook.com/kotlownia/");
        fp.add("https://www.facebook.com/officialpsy/");
        fp.add("https://www.facebook.com/tylkomuzyka/");
        fp.add("https://www.facebook.com/magdagessler.official");
        fp.add("https://www.facebook.com/perfectblogpersonal/");
        fp.add("https://www.facebook.com/Perfect/");
        fp.add("https://www.facebook.com/andrzejduda/");
        fp.add("https://www.facebook.com/POLSKA-63158540912/");
        fp.add("https://www.facebook.com/PolicjaPL/");
        fp.add("https://www.facebook.com/polskazachwyca/"); //33
        fp.add("https://www.facebook.com/youtube/"); //34
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://pl-pl.facebook.com/login/");
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(haslo);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        } catch (Exception e) {
            System.out.println("ZALOGOWANA");
        }

        try {
            for (int i = 0; i < fp.size(); i++) {
                try {
                    driver.findElement(By.xpath("//*[text()='Jeszcze kilka kroków do zalogowania']")).click();
                    System.out.println("ZABLOKOWANE");
                    driver.quit();
                    break;
                } catch (Exception e) {
                    System.out.println("la");
                }

                Thread.sleep(2000);
                driver.get(fp.get(i));
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[text()='Lubię to!']")).click();
            }
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }


    }

    public static void testGrup(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile 39");
        WebDriver driver = new ChromeDriver(options);
        driver.get(url);
    }

    public static void testPost(String mail, String post, String profil) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile " + profil);
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);

        for (int i = 0; i < 20; i++) {
            driver.get("https://www.facebook.com/groups/125548817802832/");
            Thread.sleep(3000);
            try {
                driver.findElement(By.xpath("//*[text()='Napisz post']")).click();
            } catch (Exception f) {
                driver.findElement(By.xpath("//*[text()='Rozpocznij dyskusję']")).click();
            }
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/div")).click();
            Thread.sleep(5000);
        }


    }

    public static void scrollujFejsa(String mail, String profil) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Random r = new Random();
        int lajk = r.nextInt(2);
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile " + profil);
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        Robot robot = new Robot();

        driver.get("https://pl-pl.facebook.com/login/");
        Thread.sleep(5000);
        for (int i = 0; i < 300; i++) {
            ScrollBy(driver, "500");
            /*
            if (lajk == 0) {
                try {
                    driver.findElement(By.xpath("//*[text()='Lubię to!']")).click();
                } catch (Exception e) {
                    ScrollBy(driver,"1500");
                }

            }

             */
            Thread.sleep(3000);
        }
    }

    public static void wylacz() throws InterruptedException, IOException {
        System.out.println("======================KONIEC==============");
        System.out.println("======================KONIEC==============");
        System.out.println("======================KONIEC==============");
        Thread.sleep(300000);
        Runtime runtime = Runtime.getRuntime();
        Thread.sleep(2000);
        Process proc2 = runtime.exec("shutdown /s /t 0");
        System.exit(0);
    }

    public static void theCrims() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bot\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\dumci\\AppData\\Local\\Google\\Chrome\\User Data\\");
        options.addArguments("profile-directory=Profile " + "113");
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 10000);

        try {
            driver.get("https://www.thecrims.com/newspaper#/robberies");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"loginform\"]/button")).click();
            Thread.sleep(5000);
        } catch (Exception e) {

        }

        driver.findElement(By.xpath("//*[@id=\"menu-robbery\"]")).click();
        Thread.sleep(3000);

        Select robber = new Select(driver.findElement(By.xpath("//*[@id=\"singlerobbery-select-robbery\"]")));
        robber.selectByIndex(12);
        driver.findElement(By.xpath("//*[@id=\"full\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"singlerobbery-rob\"]")).click();
        Thread.sleep(3000);

        driver.get("https://www.thecrims.com/newspaper#/nightlife/nightclub");
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/div[2]/ul[2]/li[1]/div/div[2]/button")).click();
        } catch (Exception e) {
            try {
                driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/div[2]/ul[3]/li[1]/div/div[2]/button")).click();
            } catch (Exception f) {
                driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/div[2]/ul[4]/li[1]/div/div[2]/button")).click();
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/table[2]/tbody/tr/td[4]/button")).click();
        Thread.sleep(1000);
        Thread.sleep(7000);

        for (; ; ) {
            driver.findElement(By.xpath("//*[@id=\"menu-robbery\"]")).click();
            Thread.sleep(3000);

            Select robber2 = new Select(driver.findElement(By.xpath("//*[@id=\"singlerobbery-select-robbery\"]")));
            robber2.selectByIndex(12);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"singlerobbery-rob\"]")).click();
            Thread.sleep(3000);

            driver.get("https://www.thecrims.com/newspaper#/nightlife/nightclub");
            Thread.sleep(3000);
            try {
                driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/div[2]/ul[2]/li[1]/div/div[2]/button")).click();
            } catch (Exception e) {
                try {
                    try {
                        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/div[2]/ul[3]/li[1]/div/div[2]/button")).click();
                    } catch (Exception g) {
                        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/div[2]/ul[2]/li[1]/div/div[2]/button")).click();
                    }
                } catch (Exception f) {
                    driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/div[2]/ul[4]/li[1]/div/div[2]/button")).click();
                }
            }
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/table[2]/tbody/tr/td[4]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/div[2]/div/div[3]/div[2]/button")).click();
            Thread.sleep(2000);
        }


    }

    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        Scanner kod = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\kod.txt"));
        Scanner cola = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\cola.txt"));
        Scanner loginy = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\loginy.txt"));
        Scanner nestle3 = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\nestle3.txt"));
        Scanner pam = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\pam.txt"));
        Scanner kodVe = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\kody.txt"));
        Scanner kodEn = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\kodyEn.txt"));
        Scanner kodPam = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\kodyPam.txt"));
        Scanner kodPam2 = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\kodyPam2.txt"));
        Scanner miastoVe = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\miasto.txt"));
        Scanner miastoEn = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\miastoEn.txt"));
        Scanner miastoPam = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\miastoPam.txt"));
        Scanner ulicaVe = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\ulica.txt"));
        Scanner ulicaPam = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\VeePee\\ulicaPam.txt"));
        Scanner arkadia = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\arkadia.txt"));
        Scanner arkadia2 = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\arkadia2.txt"));
        Scanner arkadia3 = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\arkadia3.txt"));
        Scanner arkadia4 = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\arkadia4.txt"));
        Scanner limango = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\limango.txt"));
        Scanner travelist = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\travelist.txt"));
        Scanner pampers = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\pampers.txt"));
        Scanner pampers2 = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\pampers2.txt"));
        Scanner lidl = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\lidl.txt"));
        Scanner ecoin = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\ecoin.txt"));
        Scanner potwierdzlidl = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\potwierdzlidl.txt"));
        Scanner cu = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\cu.txt"));
        Scanner numerKon = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\numerKon.txt"));
        Scanner mailKon = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\konkursy.txt"));
        Scanner spartoo = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\spartoo.txt"));
        Scanner samsung = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\samsung.txt"));
        Scanner enfamil = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\enfamil.txt"));
        Scanner miasto = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\miasto.txt"));
        Scanner numer = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\numerHei.txt"));
        Scanner edison = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\edison.txt"));
        Scanner numPam = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\numPam.txt"));
        Scanner numEn = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\numEn.txt"));
        Scanner news = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\news.txt"));
        Scanner przepisy = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\przepisy.txt"));
        Scanner biedronka = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\biedronka.txt"));
        Scanner bimago = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\bimago.txt"));
        Scanner bgz = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\bgz.txt"));
        Scanner bgzNum = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\bgzNum.txt"));
        Scanner dekoral = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\dekoral.txt"));
        Scanner letty = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\letty.txt"));

        Scanner every = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\every.txt"));
        Scanner everyInt = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\everyInt.txt"));
        //Scanner chili = new Scanner(new File("C:\\Users\\dumci\\Desktop\\klikanie\\chili.txt"));
        PrintWriter blad = new PrintWriter("C:\\Users\\dumci\\Desktop\\klikanie\\blad.txt");
        String kodd[] = new String[43785];
        String mail;
        String mailEv;
        String ulicaVee;
        String kodVee;
        String kodVee2;
        String miastoVee;
        String mailArk;
        String ulicaAv;
        List<String> odp = new ArrayList<>();
        String[] maileArk = new String[80];

        //Co najchętniej robisz ze swoją rodziną w czasie Bożego Narodzenia? ?
        odp.add("Jemy wspólną kolację wigilijną i śpiewamy kolędy");
        odp.add("Dzielimy się opłatkiem i składamy sobie życzenia");
        odp.add("Wspólnie czytamy ulubione książki naszych dzieci");
        odp.add("Wychodzimy razem na długie rodzinne spacery");
        odp.add("Gramy razem w różne gry planszowe");
        odp.add("Oglądamy wspólnie filmy familijne, rozrywkowe lub bajki");
        odp.add("Wspólnie śpiewamy kolędy");
        odp.add("Odwiedzamy naszych znajomych i zabieramy nasze dzieci");
        odp.add("Wspólnie całą rodziną idziemy do kina");
        odp.add("Idziemy do kina z rodziną i przyjaciółmi");
        odp.add("Oglądamy nasze stare zdjęcia z rodzinnego albumu");
        odp.add("Oglądamy śmieszne filmiki na youtube");
        odp.add("Chodzimy razem po kościołach i oglądamy przepiękne szopki");
        odp.add("Robimy sobię listę marzeń na nowy rok, każdy swoją");
        odp.add("Całą rodziną idziemy na lodowisko");
        odp.add("Całą rodziną oraz ze znajomymi idziemy na lodowisko");
        odp.add("Planujemy sobie wspólny weekendowy wypad");
        odp.add("Udajemy się na koncert piosenki dziecięcej");
        odp.add("W wigilię wspólnie ubieramy choinkę");
        odp.add("Moje dzieci pomagają mi gdy przygotowuję kolację wigilijną");
        odp.add("Jak jest ładna pogoda udajemy się całą rodziną na rodzinny spacer");
        odp.add("Często odwiedza nas wujek z rodziną i świętujemy razem");
        odp.add("Wyjeżdżamy gdzieś do rodziny na święta"); //23


        String mail2;
        String mail3;
        String post = "Uwaga!\n" +
                "\n" +
                "Post od Pana Miroslawa Klos, którego gorąco polecam.\n" +
                "\n" +
                "Witajcie nazywam się Miroslaw Klos a posty które widzicie są wstawiane przez osoby, które pracują dla mnie. Płacę najwięcej w Polsce za taką robotę ale dziś nie o tym...\n" +
                "W internecie zarabiam od wielu lat i to z powodzeniem. Prowadzę Bloga jak i kanał na youtubie gdzie skutecznie obnażam te wszystkie bzdury i scamy jakie widzicie tu na co dzień.\n" +
                "Może dlatego mało lubiany jestem w pewnych gronach ;)\n" +
                "Był słynny na całą polskę program RB gdzie włożyłem 12.000zł tylko po to aby pokazać jak działa ten syf. Film macie na moim kanale gdzie prowadziłem psychologiczną zagrywkę z całym supportem.\n" +
                "Czy zarobiłem? Sprawdźcie sami! \n" +
                "Była też słynna Madzia ze Szczecina czyli wariatka a jak nie którzy twierdzą zakochana we mnie chora kobieta. Która zgłaszała mnie masowo na policję, prokuraturę czy do US. Filmy z przygód z tą wariatką również na moim kanale!\n" +
                "\n" +
                "Prowadzę w tej chwili już kilka biznesów online ale głównym jest sprzedaż gier komputerowych w formie cyfrowej. Które wysyłamy do klienta mailowo. NIC sami nie kupujemy do puki sami nie sprzedamy.\n" +
                "Jedną grę bierzemy za 20zł i sprzedajemy cały czas generując stały zysk na portalach aukcyjnych na całym świecie.\n" +
                "Współpracuje ze mną wiele osób i jeżeli masz ochotę to zapraszam na Bloga gdzie możesz zapoznać się ze wszystkim.\n" +
                "\n" +
                "Blog:  Miroslawklos .pl  (Bez spacji bo FB tnie zasięgi)\n" +
                "\n" +
                "Na koniec dwa słowa do tych wszystkich dzbanów co biegają za mną od dobrych 5 lat! Kolejny rok dobiega końca a Wy kolejny rok swojego życia poświęcacie na promocje mojej osoby ;)\n" +
                "Dziękuje za wszelkie komentarze, których co prawda nie czytam ale zawsze podbijają one posty!\n" +
                "Po części to dzięki Wam mam te pokoje kinowe, karty za grube tysiące czy wyjazdy na moją ukochaną Ibizę jak w inne miejsca na świecie.\n" +
                "Wielu z Was już wyjaśniłem w moich filmach. Wielu pewnie jeszcze wyjaśnię....\n" +
                "\n" +
                "Masz pytania? Napisz do mnie na maila:\n" +
                "Dishar82@gmail.com\n" +
                "\n" +
                "Zapraszam do współpracy!\n" +
                "Mirek";

        String fb[] = {"dumcio.97@wp.pl","ewa1dymkowska@gmail.com"};
        String[] profil = {"113","194",};
        int j = 6;
        String num;
        String num2;
        String num3;
        String miastEn;
        String koEn;

        for (int i=1;i<=80;i++) {
            mail = letty.nextLine();
            if (i%2==0)
                Neworklead.aLetty(mail);
            else
                Neworklead.lkLetty(mail);
            if (i<13) {
                mail2 = nestle3.nextLine();
                if (i<4)
                    Neworklead.NestleMB(mail2);
                else if (i<9)
                    Neworklead.NestleTAR(mail2);
                else
                    Neworklead.NestleDC(mail2);
            }
            System.out.println(i);
            System.out.println(mail);
            Koniec.Restart();
        }

        try {


        } catch (Exception e) {
            blad.println(e);
            blad.close();
            System.out.println("=============ERROR===============");
            System.out.println("=============ERROR===============");
            System.out.println("=============ERROR===============");
            wylacz();
        }
//        dodajPostLepakNowy(profil[0],fb[0],"",post,8,55,false);
//        Koniec.Restart();
//        dodajPostLepakNowy(profil[1],fb[1],"",post,0,62,true);

//        wylacz();
    }
}
