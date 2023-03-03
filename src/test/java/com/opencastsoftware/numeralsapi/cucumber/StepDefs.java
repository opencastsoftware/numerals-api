package com.opencastsoftware.numeralsapi.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StepDefs {

    private int convertableInt;
    private final String BASE_URL = "http://localhost:8080/convert/";
    private CloseableHttpResponse latestResponse;

    @Given("^I want a Roman Numeral for (\\d+)$")
    public void i_want_a_Roman_Numeral_for(int numberToConvertToNumeral) {
        // Write code here that turns the phrase above into concrete actions
        this.convertableInt = numberToConvertToNumeral;
    }

    @When("^I get the numeral$")
    public void i_get_the_numeral() {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(BASE_URL + String.valueOf(convertableInt));
        try {
            CloseableHttpResponse httpResponse = httpclient.execute(httpget);
            latestResponse = httpResponse;
        } catch (IOException e) {
            fail("Error recieved fropm localhost", e);
        }
    }

    @Then("^I get \"([^\"]*)\"$")
    public void iGet(String expectedNumeral) throws Throwable {
        assertEquals(expectedNumeral, new BasicResponseHandler().handleResponse(latestResponse));
    }
}
