package com.example.folfo93.appfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnimagen(View v){
        Intent i = new Intent(getBaseContext(),Main2Activity.class);
        startActivity(i);

    }
}
