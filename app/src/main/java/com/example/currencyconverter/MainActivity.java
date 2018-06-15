package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertClick (View view){
        EditText amountEditText = findViewById(R.id.textId);
        Double amountRupees = Double.parseDouble(amountEditText.getText().toString());
        Double dollarAmount = amountRupees * 0.015;

        Toast.makeText(MainActivity.this, "$ " + String.format("%.2f",dollarAmount),Toast.LENGTH_LONG).show();

        Log.i("amount",amountEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
