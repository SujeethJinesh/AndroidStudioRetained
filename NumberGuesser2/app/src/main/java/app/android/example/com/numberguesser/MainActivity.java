package app.android.example.com.numberguesser;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText userResponse = (EditText) findViewById(R.id.responseText);

        userResponse.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    switch (keyCode) {
                        case KeyEvent.KEYCODE_ENTER:
                            Random rand = new Random();

                            int ourNum = rand.nextInt(4) + 1;

                            TextView tv = (TextView) findViewById(R.id.para_text);
                            MediaPlayer mp = createMediaPlayer();

                            if (userResponse.getText().toString().equals(Integer.toString(ourNum))) {
                                tv.setText("You guessed it!");
                                mp.start();
                            } else {
                                tv.setText("Try again!");
                                userResponse.setText("");
                                userResponse.setHint(Integer.toString(ourNum));
                            }
                            return true;
                        default:
                            break;
                    }
                }
                return false;
            }
        });

    }

    public MediaPlayer createMediaPlayer() {
        return MediaPlayer.create(this, R.raw.sound);
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

    public void submitMethod(View view) {
        EditText response = (EditText) findViewById(R.id.responseText);
        Random rand = new Random();

        int ourNum = rand.nextInt(10) + 1;

        TextView tv = (TextView) findViewById(R.id.para_text);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);

        if (response.toString().equals(Integer.toString(ourNum))) {
            tv.setText("You guessed it!");
            mp.start();
        } else {
            tv.setText("Try again!");
            response.setText("");
        }
    }

}
