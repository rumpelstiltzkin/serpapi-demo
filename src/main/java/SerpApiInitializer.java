import com.serpapi.client.SerpApiAsyncClient;
import com.serpapi.client.SerpApiAsyncRestClient;
import com.serpapi.client.SerpApiSyncClient;
import com.serpapi.exceptions.SerpApiException;
import com.serpapi.model.responses.LocationsResponse;

import java.io.IOException;

/**
 * Created by:
 * User: Anand Ganesh
 * Date: 7/22/21
 * Time: 10:31 PM
 */
public class SerpApiInitializer {
    public static void main(String[] args) throws SerpApiException, IOException {
        SerpApiSyncClient serpApiSyncClient = new SerpApiSyncClient();
        LocationsResponse locationsResponse = serpApiSyncClient.locations("San Jose", 10);
        System.out.println(locationsResponse.getJsonArray().toString());
        serpApiSyncClient.close();
    }
}
