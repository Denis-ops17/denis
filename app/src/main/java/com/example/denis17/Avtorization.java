package com.example.denis17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Avtorization extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtorization);

        button = (Button) findViewById(R.id.button);

    }
    public void onLoading(View view){
    Intent intent = new Intent(Avtorization.this, Menur.class);
    startActivity(intent);
    }
}