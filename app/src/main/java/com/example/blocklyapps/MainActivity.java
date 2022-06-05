package com.example.blocklyapps;

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

    public void scanBT(View view) {
        Intent intent = new Intent(this,BtList.class);
        startActivity(intent);
    }

    public void webApp(View view) {
        Intent intent = new Intent(this, WebBlockly.class);
        startActivity(intent);
    }
}