package com.example.pz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        btn = (Button) findViewById(R.id.button);

        View.OnClickListener btnOcl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("")){
                    text.setText("Hello World!");
                } else{
                    text.setText("");
                }


            }
        };

        btn.setOnClickListener(btnOcl);

    }
}