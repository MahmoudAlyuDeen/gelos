package com.afterapps.jokesdisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class JokesActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "jokeExtra";

    TextView mJokesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        String joke = getIntent().getStringExtra(JOKE_EXTRA);
        mJokesTextView = (TextView) findViewById(R.id.jokes_text_view);
        if (joke == null || mJokesTextView == null) {
            Toast.makeText(this, R.string.error_loading, Toast.LENGTH_SHORT).show();
            finish();
            return;
        }
        mJokesTextView.setText(joke);
    }
}
