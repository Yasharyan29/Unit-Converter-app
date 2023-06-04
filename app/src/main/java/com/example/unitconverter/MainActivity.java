package com.example.unitconverter;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView4);
        editText = findViewById(R.id.editTextText);
//        button.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
////                Toast.makeText(getApplicationContext(),"The Button has been clicked", Toast.LENGTH_SHORT).show();
//               String s =  editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView.setText("The corressponding value in pounds is" + pound);
//            }
//        }); 

    }
    public void calculate(View view){
        String s =  editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textView.setText("The corressponding value in pounds is" + pound);
    }
}