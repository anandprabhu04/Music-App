package com.android.example.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use activity_home.xml layout
        setContentView(R.layout.activity_home);

        // Bind the View to music app categories
        TextView now_playing = (TextView) findViewById(R.id.now_playing);
        TextView all_songs = (TextView) findViewById(R.id.all_songs);
        TextView albums = (TextView) findViewById(R.id.albums);
        TextView artists = (TextView) findViewById(R.id.artists);
        TextView play_lists = (TextView) findViewById(R.id.playlists);
        TextView store = (TextView) findViewById(R.id.store);

        // Assign onClick listeners to the TextView
        now_playing.setOnClickListener(this);
        all_songs.setOnClickListener(this);
        albums.setOnClickListener(this);
        artists.setOnClickListener(this);
        play_lists.setOnClickListener(this);
        store.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.now_playing:
                break;
            case R.id.all_songs:
                break;
            case R.id.albums:
                break;
            case R.id.artists:
                break;
            case R.id.playlists:
                break;
            case R.id.store:
                break;
        }
    }
}
