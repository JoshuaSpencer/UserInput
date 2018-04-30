package com.example.a614002.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name, email, favoriteNumber;

    EditText nameInput;
    EditText emailInput;
    Spinner favoriteNumberInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText)findViewById(R.id.nameInput);
        emailInput = (EditText)findViewById(R.id.emailInput);
        favoriteNumberInput = (Spinner) findViewById(R.id.favoriteNumberInput);

        ArrayAdapter<String> numberAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.numbers));
        numberAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        favoriteNumberInput.setAdapter(numberAdapter);


        submitButton = (Button)findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                favoriteNumber = favoriteNumberInput.getSelectedItem().toString();

                showToast(name);
                showToast(email);
                showToast(favoriteNumber);
            }
        });

    }
    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
