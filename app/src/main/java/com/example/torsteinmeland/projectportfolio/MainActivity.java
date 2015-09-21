package com.example.torsteinmeland.projectportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sendMessage(View view) {
        final int resId= getToastIdFromButtonId(view.getId());
        final CharSequence text = getApplicationContext().getText(resId);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    private int getToastIdFromButtonId(final int btnId) {
        switch (btnId) {
            case R.id.btn_spotify_streamer:
                return R.string.toast_spotify_streamer;
            case R.id.btn_scores:
                return R.string.toast_scores;
            case R.id.btn_library:
                return R.string.toast_library;
            case R.id.btn_xyz:
                return R.string.toast_xyz;
            case R.id.btn_capstone:
                return R.string.toast_capstone;
            default:
                return R.string.toast_unknown_app;
        }
    }
}
