package com.example.Xmusic.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.Xmusic.view.fragment.ArtistFragment;
import com.example.Xmusic.R;
import com.example.Xmusic.view.fragment.FavFragment;
import com.example.Xmusic.view.fragment.TrackFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = new TrackFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.activitymain_bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        loadFragment(selectedFragment);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_bottomnav_album:
                selectedFragment = new TrackFragment();
                break;
            case R.id.menu_bottomnav_home:
                selectedFragment = new ArtistFragment();
                break;
            case R.id.menu_bottomnav_fav:
                selectedFragment = new FavFragment();
                break;
        }
        return loadFragment(selectedFragment);
    }

    private boolean loadFragment(Fragment selectedFragment) {
        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.activitymain_cont, selectedFragment).commit();
            return true;
        }
        return false;
    }
}
