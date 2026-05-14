package com.example.hometask;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText num1, num2;
    private Button summ, substr, multi, divis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        num1 = findViewById(R.id.editNumber1);
        num2 = findViewById(R.id.editNumber2);
        summ = findViewById(R.id.summ);
        substr = findViewById(R.id.subtract);
        multi = findViewById(R.id.multiplicat);
        divis = findViewById(R.id.division);

        summ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());

                result.setText(String.valueOf(number1+number2));
            }
        });

        substr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());

                result.setText(String.valueOf(number1-number2));
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());

                result.setText(String.valueOf(number1*number2));
            }
        });

        divis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());

                if (number2 != 0) result.setText(String.valueOf(number1/number2));
            }
        });
    }
}