package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    /**
     * This method is called when the SpotifySteamer button is clicked.
     */
    public void spotifySteamer(View view) {
        Toast.makeText(this, "This button will launch my Spotify Steamer App", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the ScoreApp button is clicked.
     */
    public void scoreApp(View view) {
        Toast.makeText(this, "This button will launch my Score App", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the LibraryApp button is clicked.
     */
    public void libraryApp(View view) {
        Toast.makeText(this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the builditBigger button is clicked.
     */
    public void builditBigger(View view) {
        Toast.makeText(this, "This button will launch my Build it Bigger App", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the xyzReader button is clicked.
     */
    public void xyzReader(View view) {
        Toast.makeText(this, "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the capstone:My Own App button is clicked.
     */
    public void capstoneApp(View view) {
        Toast.makeText(this, "This button will launch my capstone:My Own App", Toast.LENGTH_SHORT).show();
    }
}
