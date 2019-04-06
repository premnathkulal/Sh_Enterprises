package com.example.sh_enterprises;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("login.php")
    Call<user> performUserLogin(@Query("email") String email, @Query("password") String password);

    @GET("addcart.php")
    Call<cart_add> performCart(@Query("p1") String p1, @Query("p2") String p2, @Query("p3") String p3, @Query("p4") int p4, @Query("p5") int p5);

    @GET("cart_update.php")
    Call<cart_add> performCart_update(@Query("p1") String p1, @Query("p2") String p2, @Query("p3") int p3);

    @GET("cancel_cart.php")
    Call<cart_add> performCancel_Cart(@Query("p1") String p1, @Query("p2") String p2, @Query("p3") String p3);

}
