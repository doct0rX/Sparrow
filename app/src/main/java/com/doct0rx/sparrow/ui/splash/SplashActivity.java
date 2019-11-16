//package com.doct0rx.sparrow.ui.splash;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.PersistableBundle;
//import android.view.WindowManager;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.doct0rx.sparrow.R;
//import com.doct0rx.sparrow.ui.login.LoginActivity;
//
//
//public class SplashActivity extends AppCompatActivity {
//
//    private final int SPLASH_DISPLAY_LENGTH = 3000;    // 3 seconds
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        setContentView(R.layout.activity_splash);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                goToMainActivity();
//            }
//        }, SPLASH_DISPLAY_LENGTH);
//
//    }
//
//    private void goToMainActivity() {
//        Intent mainActivityIntent = new Intent(SplashActivity.this, LoginActivity.class);
//        startActivity(mainActivityIntent);
//        finish();
//    }
//}
