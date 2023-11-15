package com.example.lab1_aleeyaahmad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editTextText);
        resetButton = (Button) findViewById(R.id.resetButton);
    }
    public void displayText(View view) {
        String text = etName.getText().toString();

        tvMessage.setText("Welcome! " + text);

        Toast toast = Toast.makeText(this, "WELCOME", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void resetText(View view) {
        etName.getText().clear();
        tvMessage.setText("Name cleared");
        Toast toast = Toast.makeText(this, "Name cleared", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetText3434(View view) {
        etName.getText().clear();
        tvMessage.setText("Name cleared");
        Toast toast = Toast.makeText(this, "Name cleared", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void resetText34(View view) {
        etName.getText().clear();
        tvMessage.setText("Name cleared");
        Toast toast = Toast.makeText(this, "Name cleared", Toast.LENGTH_SHORT);
        toast.show();

}}