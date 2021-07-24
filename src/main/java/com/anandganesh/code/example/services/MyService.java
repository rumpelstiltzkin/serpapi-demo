package com.anandganesh.code.example.services;

import com.serpapi.client.SerpApiSyncClient;
import com.serpapi.exceptions.SerpApiException;
import com.serpapi.model.responses.LocationsResponse;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by:
 * User: Anand Ganesh
 * Date: 7/24/21
 * Time: 11:52 AM
 */
@Service
public class MyService {
    private final SerpApiSyncClient serpApiSyncClient = new SerpApiSyncClient();

    public MyService() throws SerpApiException {
        LocationsResponse locationsResponse = serpApiSyncClient.locations("San Jose", 10);
        System.out.println(locationsResponse.getJsonArray().toString());
    }

    @PreDestroy
    public void preDestroy() throws IOException {
        serpApiSyncClient.close();
    }
}
