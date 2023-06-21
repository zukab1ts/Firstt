package DataObject;

import static Utils.ChromeRunner.driver;

public  interface LoginData {
    String
    incorrectEmailData = "swtester@gmail.com",
    incorrectPasswordData = "12341234",
    correctEmailData = "zukabitsadze@gmail.com",

     expectedTitle = "Spotify",
     actualTitle = driver.getTitle();

}
