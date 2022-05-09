package com.generali.burritoorderingservice;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.util.Assert;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class BurritoOrderingServiceApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    /**
     *
     * @throws Exception
     */
    @Test
    public void testBurritoGet() throws Exception{
        HttpUriRequest request = new HttpGet( "http://localhost:" + port + "/orders/34545" );
        HttpResponse response = HttpClientBuilder.create().build().execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        Assert.isTrue(statusCode==200);
    }

    //TODO: Implement
    @Test
    public void testPostBurrito() throws Exception{

    }

}
