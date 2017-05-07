package com.example.aryadanuprengga.animalium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Front extends AppCompatActivity {
    EditText nama,pass;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        nama=(EditText)findViewById(R.id.edit1);
        pass=(EditText)findViewById(R.id.edit2);
        button=(Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((nama.getText().toString().equals("arya"))&&(pass.getText().toString().equals("arya"))) {
                    Intent i = new Intent(Front.this, MainActivity.class);
                    i.putExtra("NAMA", nama.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}
