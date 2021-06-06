package net.abk.a10118367_yanuartisyadwiputra_uts.view;

//6 Juni 2021 22:56
//10118367 - Yanuar Tisya Dwi Putra - IF9

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import net.abk.a10118367_yanuartisyadwiputra_uts.R;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView buttomNavigationView = findViewById(R.id.bottom_navigation);

        buttomNavigationView.setSelectedItemId(R.id.Profile);

        buttomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.Main:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Profile:
                        startActivity(new Intent(getApplicationContext()
                                ,Profile.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.info:
                        startActivity(new Intent(getApplicationContext()
                                , Info.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }
}