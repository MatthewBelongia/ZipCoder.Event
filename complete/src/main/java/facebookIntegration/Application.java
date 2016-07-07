package facebookIntegration;

import com.beust.jcommander.JCommander;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import yelpIntegration.util.YelpAPI;

import static yelpIntegration.util.YelpAPI.queryAPI;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final String CONSUMER_KEY = "DTIAMGukH_VE_Zqjveb23Q";
        final String CONSUMER_SECRET = "lgE5dlOTYdosCjDfb42zkzpZ_Lg";
        final String TOKEN = "xQvQWx1jw6h0t7joQcQTsqRHgUuT_25t";
        final String TOKEN_SECRET = "_3VVZ2aX7-hZazaROpLS_NazZEE";

        SpringApplication.run(Application.class, args);

        YelpAPI.YelpAPICLI yelpApiCli = new YelpAPI.YelpAPICLI();
        new JCommander(yelpApiCli, args);
        YelpAPI yelpApi = new YelpAPI(CONSUMER_KEY, CONSUMER_SECRET, TOKEN, TOKEN_SECRET);
        queryAPI(yelpApi, yelpApiCli);
    }

}

