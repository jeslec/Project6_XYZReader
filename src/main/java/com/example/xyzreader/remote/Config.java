package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            // Images were not getting downloaded, changed from https to http as suggested by user:
            // https://discussions.udacity.com/t/volley-not-loading-images-from-https-on-device/37286
            url = new URL("http://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
