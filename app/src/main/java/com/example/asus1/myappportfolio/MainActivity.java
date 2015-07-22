package com.example.asus1.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toast toast;
        Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        Button scoresButton = (Button) findViewById(R.id.scores_button);
        Button libraryButton = (Button) findViewById(R.id.library_button);
        Button builditButton = (Button) findViewById(R.id.buildIt_button);
        Button xyzButton = (Button) findViewById(R.id.xyz_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        final String spotifyClickText = "This opens up the spotify app!";
        final String scoresClickText = "This opens up the scores app!";
        final String libraryClickText = "This opens up the library app!";
        final String buildItClickText = "This opens up the build it app!";
        final String xyzClickText = "This opens up the xyz app!";
        final String capstoneClickText = "This opens up the capstone app!";

        final Toast spotifyToast = Toast.makeText(getApplicationContext(),spotifyClickText , Toast.LENGTH_SHORT);
        final Toast scoresToast = Toast.makeText(getApplicationContext(),scoresClickText , Toast.LENGTH_SHORT);
        final Toast libraryToast = Toast.makeText(getApplicationContext(),libraryClickText, Toast.LENGTH_SHORT);
        final Toast builditToast = Toast.makeText(getApplicationContext(),buildItClickText, Toast.LENGTH_SHORT);
        final Toast xyzToast = Toast.makeText(getApplicationContext(),xyzClickText, Toast.LENGTH_SHORT);
        final Toast capstoneToast = Toast.makeText(getApplicationContext(),capstoneClickText, Toast.LENGTH_SHORT);

        Context context = getApplicationContext();

        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spotifyToast.show();
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoresToast.show();
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                libraryToast.show();
            }
        });

        builditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builditToast.show();
            }
        });

        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xyzToast.show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capstoneToast.show();
            }
        });

     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

