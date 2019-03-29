package com.example.sh_enterprises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Login extends AppCompatActivity implements LoginFragment.OnLoginFormActivityListener {

    public void logi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new LoginFragment()).addToBackStack(null).commit();
    }


    public static  prefConfig pcg;
    public static ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        pcg = new prefConfig(this);

        apiInterface = apiclient.getApiclient().create(ApiInterface.class);

        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }

            if (pcg.readLogin()) {
                Intent i = new Intent(this, Home_page.class);
                startActivity(i);
            } else {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new LoginFragment()).commit();

            }
        }
    }

    @Override
    public void performLogin(String name, String email) {
        pcg.writeName(name);
        pcg.writeEmail(email);

        Intent i = new Intent(this,Home_page.class);
        startActivity(i);
    }
}
