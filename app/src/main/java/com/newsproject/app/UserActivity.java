package com.newsproject.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class UserActivity extends Activity {

    private TextView user_emailView;
    private TextView user_nameView;
    private TextView user_phoneView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        user_emailView = (TextView) findViewById(R.id.email);
        user_nameView = (TextView) findViewById(R.id.name);
        user_phoneView = (TextView) findViewById(R.id.phone);

        Intent intent = getIntent();

        if (intent != null) {

            user_emailView.setText(intent.getStringExtra("user_email"));
            user_nameView.setText(intent.getStringExtra("user_name"));
            user_phoneView.setText(intent.getStringExtra("user_phone"));
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.user, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
