package com.doct0rx.sparrow.ui.feedsActivities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.doct0rx.sparrow.R;

public class FeedActivity extends AppCompatActivity {

    private TextClock tClock;
    private TextView tView;
    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        tClock = findViewById(R.id.textClock1);
        tView = findViewById(R.id.textview1);
        btn = findViewById(R.id.btnGet);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tView.setText("Time: " + tClock.getText());
            }
        });
    }
}
