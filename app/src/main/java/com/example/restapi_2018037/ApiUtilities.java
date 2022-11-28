package com.example.restapi_2018037;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    private static Retrofit retrofit=null;
    public static ApiInterface getApiInterface()
    {
        if (retrofit==null)
        {
            retrofit = new
                    Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverter Factory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
