package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textInput1;
    private EditText textInput2;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput1 = findViewById(R.id.editTextNumber1);
        textInput2 = findViewById(R.id.editTextNumber2);
        textOutput = findViewById(R.id.textViewOutput);
    }

    public void addCalculation(View view)   {

        float n1 = Float.parseFloat(textInput1.getText().toString());
        float n2 = Float.parseFloat(textInput2.getText().toString());
        float result = (n1 + n2);
        textOutput.setText("Result: " + result);
    }

    public void subCalculation(View view)   {
        float n1, n2, result;

        n1 = Float.parseFloat(textInput1.getText().toString());
        n2 = Float.parseFloat(textInput2.getText().toString());
        result = (n1 - n2);
        textOutput.setText("Result: " + result);
    }

    public void divCalculation(View view)   {
        float n1, n2, result;

        n1 = Float.parseFloat(textInput1.getText().toString());
        n2 = Float.parseFloat(textInput2.getText().toString());
        result = (n1 / n2);
        textOutput.setText("Result: " + result);
    }

    public void multiCalculation(View view)   {
        float n1, n2, result;

        n1 = Float.parseFloat(textInput1.getText().toString());
        n2 = Float.parseFloat(textInput2.getText().toString());
        result = (n1 * n2);
        textOutput.setText("Result: " + result);
    }

}