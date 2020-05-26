package com.example.Xmusic.view.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.Xmusic.R;

public class ArtistDetails extends AppCompatActivity {

    TextView tvArtistName, tvArtistCountry, tvTwitter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_details);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvArtistName = findViewById(R.id.artistdetails_tv_name);
        tvArtistCountry = findViewById(R.id.artistdetails_tv_country);
        tvTwitter = findViewById(R.id.artistdetails_tv_twitter);
        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String getArtistName = bundle.getString("detail_artistName");
            String getArtistCountry = bundle.getString("detail_artistCountry");
            String getArtistTwitter = bundle.getString("detail_artistTwitter");

            tvArtistName.setText(getArtistName);
            tvArtistCountry.setText(getArtistCountry);
            tvTwitter.setText(getArtistTwitter);

        } else {
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
