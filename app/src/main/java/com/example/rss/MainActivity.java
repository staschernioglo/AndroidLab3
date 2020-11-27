package com.example.rss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ArrayList<String> rssLinks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRediff = findViewById(R.id.btnBlocnot);
        Button btnCinemaBlend = findViewById(R.id.btnJurnal);
        btnRediff.setOnClickListener(this);
        btnCinemaBlend.setOnClickListener(this);

        rssLinks.add("https://feedfry.com/rss/11eb30ade4df988ab3aab22bd29e7ec9");
        rssLinks.add("https://feedfry.com/rss/11eb30ad968f8b90a369dc66b7eefaba");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnBlocnot:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(0)));
                break;

            case R.id.btnJurnal:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;
        }
    }
}
