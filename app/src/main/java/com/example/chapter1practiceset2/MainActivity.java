package com.example.chapter1practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText text1, text2;
TextView result;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
text1=findViewById(R.id.editTextNumber1);
text2=findViewById(R.id.editTextNumber2);
button=findViewById(R.id.button);
result=findViewById(R.id.editTextNumber4);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int sum=Integer.parseInt(text1.getText().toString())+Integer.parseInt(text2.getText().toString());
        result.setText("Sum is "+sum);
    }
});

    }
}