package com.cookandroid.and0719_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView Textresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);
        btnAdd = findViewById(R.id.BtnAdd);
        btnSub = findViewById(R.id.BtnSub);
        btnMul = findViewById(R.id.BtnMul);
        btnDiv = findViewById(R.id.BtnDiv);
        Textresult = findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int reusult = num1 + num2;
                Textresult.setText("계산결과 : " + reusult);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int reusult = num1 - num2;
                Textresult.setText("계산결과 : " + reusult);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int reusult = num1 * num2;
                Textresult.setText("계산결과 : " + reusult);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int reusult = num1 / num2;
                Textresult.setText("계산결과 : " + reusult);
            }
        });

    }
}
