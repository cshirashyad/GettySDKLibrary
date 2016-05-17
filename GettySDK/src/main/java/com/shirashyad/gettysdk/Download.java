package com.shirashyad.gettysdk;

import java.util.Hashtable;
import java.util.Map;

public class Download {
    private String MustSpecifyAtLeastOneImageIdMessage = "Must specify at least one image id.";
    private String AutoDownloadString = "auto_download";
    private String DownloadsPathString = "/downloads/";
    private String FalseString = "false";

    private String baseUrl;
    private Credentials credentials;
    private String assetId;

    private Download(Credentials credentials, String baseUrl)
    {
        this.credentials = credentials;
        this.baseUrl = baseUrl;
    }

    public static Download GetInstance(Credentials credentials, String baseUrl)
    {
        return new Download(credentials, baseUrl);
    }

    public Download WithId(String val)
    {
        assetId = val;
        return this;
    }

    public String ExecuteAsync() throws com.shirashyad.gettysdk.SdkException {
        if (assetId == null || assetId.length() == 0)
        {
            throw new com.shirashyad.gettysdk.SdkException(MustSpecifyAtLeastOneImageIdMessage);
        }
        com.shirashyad.gettysdk.WebHelper helper = new com.shirashyad.gettysdk.WebHelper(credentials, baseUrl);

        Map<String,String> queryParameters = new Hashtable<String, String>();

         queryParameters.put(AutoDownloadString, FalseString);

        return (helper.PostQuery(queryParameters, DownloadsPathString +  assetId));
    }
}
