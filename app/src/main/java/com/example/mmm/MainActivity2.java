package com.example.mmm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        str = i.getStringExtra("userName");
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void exit(View view) {
        Intent i=new Intent();
        str = "Привет "+str;
        i.putExtra("result",str);
        setResult(1,i);
        finish();
    }
}