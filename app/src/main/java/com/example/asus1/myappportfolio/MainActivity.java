package com.example.asus1.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final Toast toast;
        final Button moviesButton = (Button) findViewById(R.id.movies_button);
        Button scoresButton = (Button) findViewById(R.id.scores_button);
        final Button libraryButton = (Button) findViewById(R.id.library_button);
        Button builditButton = (Button) findViewById(R.id.buildIt_button);
        Button xyzButton = (Button) findViewById(R.id.xyz_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        final String moviesClickText = getResources().getString(R.string.movies_click_text);
        final String scoresClickText = getResources().getString(R.string.scores_click_text);
        final String libraryClickText = getResources().getString(R.string.library_click_text);
        final String buildItClickText = getResources().getString(R.string.build_click_text);
        final String xyzClickText = getResources().getString(R.string.xyz_click_text);
        final String capstoneClickText = getResources().getString(R.string.capstone_click_text);

        final Toast moviesToast = Toast.makeText(getApplicationContext(),moviesClickText , Toast.LENGTH_SHORT);
        final Toast scoresToast = Toast.makeText(getApplicationContext(),scoresClickText , Toast.LENGTH_SHORT);
        final Toast libraryToast = Toast.makeText(getApplicationContext(),libraryClickText, Toast.LENGTH_SHORT);
        final Toast builditToast = Toast.makeText(getApplicationContext(),buildItClickText, Toast.LENGTH_SHORT);
        final Toast xyzToast = Toast.makeText(getApplicationContext(),xyzClickText, Toast.LENGTH_SHORT);
        final Toast capstoneToast = Toast.makeText(getApplicationContext(),capstoneClickText, Toast.LENGTH_SHORT);

        Context context = getApplicationContext();

        moviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelExistingToasts(new ArrayList<>(Arrays.asList(scoresToast, libraryToast, builditToast, xyzToast, capstoneToast)));
                moviesToast.show();
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelExistingToasts(new ArrayList<>(Arrays.asList(moviesToast,libraryToast,builditToast,xyzToast,capstoneToast)));
                scoresToast.show();
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelExistingToasts(new ArrayList<>(Arrays.asList(moviesToast,scoresToast,builditToast,xyzToast,capstoneToast)));
                libraryToast.show();
            }
        });

        builditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelExistingToasts(new ArrayList<>(Arrays.asList(moviesToast,scoresToast,libraryToast,xyzToast,capstoneToast)));
                builditToast.show();
            }
        });

        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelExistingToasts(new ArrayList<>(Arrays.asList(moviesToast,scoresToast,libraryToast,builditToast,capstoneToast)));
                xyzToast.show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelExistingToasts(new ArrayList<>(Arrays.asList(moviesToast,scoresToast,libraryToast,builditToast,xyzToast)));
                capstoneToast.show();
            }
        });
     }

    // If a toast is in progress and another button is pressed, cancel the existing toast to display the new toast
    public void cancelExistingToasts(ArrayList<Toast> currentToastList){
        for(Toast t:currentToastList){
            if(t!=null){
                t.cancel();
            }
        }
    }

}

