package com.example.blocklyapps;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    private Context context;
    public WebAppInterface(Context context){
        this.context = context;
    }

    @JavascriptInterface
    public void showToast(String data){
        Log.d("Pesan", data);
        Toast.makeText(context, data, Toast.LENGTH_LONG).show();
    }
}
