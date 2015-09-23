package com.example.torsteinmeland.projectportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast currentToast= null;

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

    public void sendMessage(View view) {
        final int resId= getToastIdFromButtonId(view.getId());
        final CharSequence text = getApplicationContext().getText(resId);
        if(currentToast!=null){
            currentToast.cancel();
        }
        currentToast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        currentToast.show();
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
