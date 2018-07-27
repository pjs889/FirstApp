package com.pjs889.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {
        Intent myintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myintent);
    }

    public void onButton2Clicked(View view) {
        Intent myintent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-1000-1000"));
        startActivity(myintent);
    }


    public void onButton3Clikcked(View view) {
        Intent Intent=new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(Intent);
    }
}
