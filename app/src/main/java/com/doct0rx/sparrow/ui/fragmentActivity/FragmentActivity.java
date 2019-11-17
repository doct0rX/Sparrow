package com.doct0rx.sparrow.ui.fragmentActivity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.doct0rx.sparrow.R;
import com.doct0rx.sparrow.ui.fragments.AccountFragment;
import com.doct0rx.sparrow.ui.fragments.FeedFragment;
import com.doct0rx.sparrow.ui.fragments.MakeYourWayFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class FragmentActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FeedFragment()).commit();

        navigationView = findViewById(R.id.bottom_navigation);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                switch (menuItem.getItemId()){
                    case R.id.nav_feed:
                        fragment = new FeedFragment();
                        break;

                    case R.id.nav_map:
                        fragment = new MakeYourWayFragment();
                        break;
                    case R.id.nav_account:
                        fragment = new AccountFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Objects.requireNonNull(fragment)).commit();
                return true;
            }
        });

    }
}
