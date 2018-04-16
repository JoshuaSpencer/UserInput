package com.example.a614002.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name, email;
    int favoriteNumber;

    EditText nameInput;
    EditText emailInput;
    EditText favoriteNumberInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText)findViewById(R.id.nameInput);
        emailInput = (EditText)findViewById(R.id.emailInput);
        favoriteNumberInput = (EditText)findViewById(R.id.favoriteNumberInput);

        submitButton = (Button)findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                favoriteNumber = Integer.valueOf(favoriteNumberInput.getText().toString());

                showToast(name);
                showToast(email);
                showToast(String.valueOf(favoriteNumber));
            }
        });

    }
    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
