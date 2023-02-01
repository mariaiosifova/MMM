package com.example.mmm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go2(View view) {
        EditText et = findViewById(R.id.editTextTextPersonName);
        String str = et.getText().toString();
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("userName",str);
        startActivityForResult(i,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String str = data.getStringExtra("result");
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}