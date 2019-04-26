package com.e.dictionaryapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dictionaryapp.R;

public class AddCountry extends AppCompatActivity {

EditText etCountry,getCapital;
Button btnAddCountry;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_country);

        etCountry=findViewById(R.id.etCountry);
        getCapital=findViewById(R.id.etCapital);
        btnAddCountry=findViewById(R.id.btnCountry);
        btnAddCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

            }
        }




