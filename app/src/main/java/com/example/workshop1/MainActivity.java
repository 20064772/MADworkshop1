package com.example.workshop1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input1;
        EditText input2;
        Button add;
        Button subtract;
        Button multiply;
        Button divide;
        TextView result;


        input1 = (EditText) findViewById(R.id.numberInput1);
        input2 = (EditText)  findViewById(R.id.numberInput2);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        result = (TextView) findViewById(R.id.result);




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable editable = input1.getText();
                String str1 = editable.toString();
                editable = input2.getText();
                String str2 = editable.toString();

                if (str1.isEmpty() || str2.isEmpty()){
                    result.setText("Please Enter 2 numbers");
                }
                else{

                double inputNumber1 = Double.parseDouble(str1);
                double inputNumber2 = Double.parseDouble(str2);

                double numberResult = inputNumber1 + inputNumber2;
                result.setText(Double.toString(numberResult));
                }

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable editable = input1.getText();
                String str1 = editable.toString();
                editable = input2.getText();
                String str2 = editable.toString();

                if (str1.isEmpty() || str2.isEmpty()) {
                    result.setText("Please Enter 2 numbers");
                } else {

                    double inputNumber1 = Double.parseDouble(str1);
                    double inputNumber2 = Double.parseDouble(str2);

                    double numberResult = inputNumber1 - inputNumber2;
                    result.setText(Double.toString(numberResult));
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Editable editable = input1.getText();
                String str1 = editable.toString();
                editable = input2.getText();
                String str2 = editable.toString();

                if (str1.isEmpty() || str2.isEmpty()) {
                    result.setText("Please Enter 2 numbers");
                } else {

                    double inputNumber1 = Double.parseDouble(str1);
                    double inputNumber2 = Double.parseDouble(str2);

                    double numberResult = inputNumber1 * inputNumber2;
                    result.setText(Double.toString(numberResult));
                }

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable editable = input1.getText();
                String str1 = editable.toString();
                editable = input2.getText();
                String str2 = editable.toString();

                if (str1.isEmpty() || str2.isEmpty()) {
                    result.setText("Please Enter 2 numbers");
                } else {

                    double inputNumber1 = Double.parseDouble(str1);
                    double inputNumber2 = Double.parseDouble(str2);

                    double numberResult = inputNumber1 / inputNumber2;
                    result.setText(Double.toString(numberResult));
                }

            }
        });
    }
}