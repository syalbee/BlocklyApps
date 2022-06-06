package com.example.blocklyapps;


import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.JavascriptInterface;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WebBlockly extends AppCompatActivity {
    public static  final String webUrl = "http://192.168.43.37/ble/blockly_custom.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_blockly);

        WebViewFragment webViewFragment = new WebViewFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, webViewFragment).commit();
    }

}