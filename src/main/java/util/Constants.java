package util;


import com.github.javafaker.Faker;

public class Constants {
    public static final String URL = "https://bookcart.azurewebsites.net/";
    public static final String FIRST_NAME = "Petre";
    public static final String LAST_NAME = "Mihut";
    public static final String LOGIN_USER_NAME = "mihutc321";
    public static final String REGISTER_USER_NAME = generateUserName();
    public static final String PASSWORD1 = "Mihut123$#@!";

    public static final String CONFIRM_PASSWORD = "Mihut123$#@!";
    public static final String ADDRESS1 = "USA-California nr 43";
    public static final String ADDRESS2 = "USA-California nr 43";
    public static final String PIN = "321234";
    public static final String STATE = "California";

    public static String generateUserName() {
        Faker faker = new Faker();
        return faker.name().username();
    }
}
