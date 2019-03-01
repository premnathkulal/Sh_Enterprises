package com.example.sh_enterprises;

import com.google.gson.annotations.SerializedName;

public class user {

    @SerializedName("response")
    private String Response;

    @SerializedName("name")
    private String Name;

    @SerializedName("email")
    private String Email;

    public String getResponse() {
        return Response;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

}
