package com.example.sh_enterprises;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class prefConfig {
    private SharedPreferences sharedPreferences;
    private Context context;

    public prefConfig(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.pref_file),context.MODE_PRIVATE);
    }

    public void wrightLogin(boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getString(R.string.pref_login_status),status);
        editor.commit();
    }

    public boolean readLogin(){
        return  sharedPreferences.getBoolean(context.getString(R.string.pref_login_status),false);
    }

    public  void writeName(String name){
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(context.getString(R.string.pref_user_name),name);
        edit.commit();
    }

    public  String readName(){
        return  sharedPreferences.getString(context.getString(R.string.pref_user_name),"user");
    }


    public  void writeEmail(String email){
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(context.getString(R.string.pref_user_email),email);
        edit.commit();
    }

    public  String readEmail(){
        return  sharedPreferences.getString(context.getString(R.string.pref_user_email),"user");
    }


    public void displyToast(String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
