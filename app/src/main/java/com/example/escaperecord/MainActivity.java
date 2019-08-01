package com.example.escaperecord;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentSettings fragmentSettings = new FragmentSettings();
    private FragmentHome fragmentHome = new FragmentHome();
    private FragmentMyRecord fragmentMyRecord = new FragmentMyRecord();
    private FragmentThemes fragmentThemes = new FragmentThemes();


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.mainframe, fragmentHome).commitAllowingStateLoss();
                    break;
                case R.id.navigation_themes:
                    transaction.replace(R.id.mainframe, fragmentThemes).commitAllowingStateLoss();
                    break;
                case R.id.navigation_myrecord:
                    transaction.replace(R.id.mainframe, fragmentMyRecord).commitAllowingStateLoss();
                    break;
                case R.id.navigation_setting:
                    transaction.replace(R.id.mainframe, fragmentSettings).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.mainframe, fragmentHome).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
