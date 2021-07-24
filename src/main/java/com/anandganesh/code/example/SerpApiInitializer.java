package com.anandganesh.code.example;

import com.serpapi.client.SerpApiSyncClient;
import com.serpapi.exceptions.SerpApiException;
import com.serpapi.model.responses.LocationsResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by:
 * User: Anand Ganesh
 * Date: 7/22/21
 * Time: 10:31 PM
 */
@SpringBootApplication(scanBasePackages = {"com.anandganesh.code"})
public class SerpApiInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SerpApiInitializer.class, args);
    }
}