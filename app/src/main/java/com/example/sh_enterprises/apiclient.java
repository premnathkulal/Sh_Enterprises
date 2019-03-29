package com.example.sh_enterprises;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiclient {
    public static  final  String BASE_URL="http://192.168.225.25/prem/";
    public static Retrofit retrofit = null;

    public  static  Retrofit getApiclient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit;
    }
}

//192.168.43.159