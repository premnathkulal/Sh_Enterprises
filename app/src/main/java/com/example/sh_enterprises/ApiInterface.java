package com.example.sh_enterprises;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("login.php")
    Call<user> performUserLogin(@Query("email") String email, @Query("password") String password);
}
