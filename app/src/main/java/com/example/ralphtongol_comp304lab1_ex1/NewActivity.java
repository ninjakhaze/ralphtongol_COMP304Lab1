package com.example.ralphtongol_comp304lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView textView = findViewById(R.id.AIActivity);
        textView.setText("\t\tAIActivity:\n" +
                "\t\t\t\tonCreate executed\n" +
                "\t\t\t\tonStart executed");
    }
}