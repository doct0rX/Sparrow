package com.doct0rx.sparrow.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.doct0rx.sparrow.R;
import com.doct0rx.sparrow.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.nextButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startLoginActivity = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(startLoginActivity);
            }
        });
    }
}
