package com.example.sh_enterprises;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("login.php")
    Call<user> performUserLogin(@Query("email") String email, @Query("password") String password);

    @GET("addcart.php")
    Call<cart_add> performCart(@Query("p1") String p1, @Query("p2") String p2, @Query("p3") String p3, @Query("p4") String p4);

}
