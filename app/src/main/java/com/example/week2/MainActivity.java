package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText mEditText;
    TextView mTextView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.editTextTextPersonName);
        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.button);


        //For button setup
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get Value of mEditText
                String inputValue = mEditText.getText().toString();

                //Make toast to display Inputvalue
                Toast.makeText(MainActivity.this,"Hi Again",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,inputValue,Toast.LENGTH_LONG).show();

                mTextView.setText("New Text");
                mTextView.setText("Welcome to SIT305" + inputValue);
            }
        });
    }
}