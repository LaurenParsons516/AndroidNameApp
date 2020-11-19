package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
    }

    public void onFirstNameButtonClicked(View v) {
        TextView firstName = this.findViewById(R.id.firstName);
        firstName.setText("Lauren");
    }

    public void onLastNameButtonClicked(View v) {
        TextView lastName = this.findViewById(R.id.lastName);
        lastName.setText("Parsons");
    }
}