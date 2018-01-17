package com.example.android.array;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ArrayList variables
        final TextView txtNumber1 = (TextView) findViewById(R.id.txtNumber1);
        final TextView txtNumber2 = (TextView) findViewById(R.id.txtNumber2);
        final TextView txtNumber3 = (TextView) findViewById(R.id.txtNumber3);
        final TextView txtNumber4 = (TextView) findViewById(R.id.txtNumber4);
        final TextView txtLength = (TextView) findViewById(R.id.txtLength);

        Button btnAppend = (Button) findViewById(R.id.btnAppend);

        // Making an ArrayList

        final ArrayList<String> numbers = new ArrayList<String>();

        numbers.add(0, "One");
        numbers.add(1, "Tow");
        numbers.add(2, "Three");
        numbers.add(3, "Four");

        btnAppend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber1.setText(numbers.get(0) + " Hi num 1 :)");
                txtNumber2.setText(numbers.get(1) + " Hi num 2 :)");
                txtNumber3.setText(numbers.get(2) + " Hi num 3 :)");
                txtNumber4.setText(numbers.get(3) + " Hi num 4 :)");
                txtLength.setText(numbers.size() + "");


                // Array variables

                final TextView txtnumber1A = (TextView) findViewById(R.id.txtNumber1A);
                final TextView txtnumber2A = (TextView) findViewById(R.id.txtNumber1A);
                final TextView txtnumber3A = (TextView) findViewById(R.id.txtNumber1A);
                final TextView txtnumber4A = (TextView) findViewById(R.id.txtNumber1A);
                final TextView txtLengthArray = (TextView) findViewById(R.id.txtLengthArray);

                final Button btnAppendA = (Button) findViewById(R.id.btnAppendA);


                // Making an Array

                final String word[] = new String[4];

                word[0] = "One From Array";
                word[1] = "Two From Array";
                word[2] = "Three From Array";
                word[3] = "Four From Array";

                btnAppendA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        txtnumber1A.setText(word[0]);
                        txtnumber2A.setText(word[1]);
                        txtnumber3A.setText(word[2]);
                        txtnumber4A.setText(word[3]);
                        txtLengthArray.setText(word.length + "");


                    }
                });

            }
        });
    }


}
