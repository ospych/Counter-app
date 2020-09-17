package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int quantity = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void count(View view){
        if (quantity == 1000){
            Toast.makeText(this,"Quantity must be less than 1000", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void reset(View view){
        quantity = 0;
        displayQuantity(quantity);
    }

    private void displayQuantity(int number){
        TextView textView = (TextView) findViewById(R.id.count_text);
        textView.setText(String.format("%04d", number));
    }
}