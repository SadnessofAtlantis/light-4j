package com.networknt.server;

import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

/**
 * Created by steve on 03/02/17.
 */
public class DummyTrustManager implements X509TrustManager {

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[] {};
    }

    public void checkClientTrusted(X509Certificate[] certs, String authType) {
    }

    public void checkServerTrusted(X509Certificate[] certs, String authType) {
    }
}
