package com.russian_woodpecker.travis_ci_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = findViewById(R.id.activity_main_et_echo_input);
        final TextView output = findViewById(R.id.activity_main_tv_echo_text);

        Button button = findViewById(R.id.activity_main_btn_echo_send);

        button.setOnClickListener(v -> output.setText(input.getText()));

    }
}
