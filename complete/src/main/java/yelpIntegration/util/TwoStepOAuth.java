package yelpIntegration.util;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

/**
 * Created by bryantcason on 7/6/16.
 */
public class TwoStepOAuth extends DefaultApi10a {

    public String getRequestTokenEndpoint() {
        return null;
    }

    public String getAccessTokenEndpoint() {
        return null;
    }

    public String getAuthorizationUrl(Token token) {
        return null;
    }
}
