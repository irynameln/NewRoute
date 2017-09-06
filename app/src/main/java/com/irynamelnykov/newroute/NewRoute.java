package com.irynamelnykov.newroute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewRoute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_route);
    }
    public void goToLocations(View view) {
        Intent nextPage = new Intent(NewRoute.this, Addresses.class);
        startActivity(nextPage);
    }
}
