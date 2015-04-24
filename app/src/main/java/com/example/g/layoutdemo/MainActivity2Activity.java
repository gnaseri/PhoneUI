package com.example.g.layoutdemo;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;



public class MainActivity2Activity extends ActionBarActivity {


    TextView textWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        textWelcome = (TextView) findViewById(R.id.textWelcome);

        String stringWelcome = getResources().getString(R.string.welcome_to_insight);

        SpannableString spannaWelcome = new SpannableString(stringWelcome);
        spannaWelcome.setSpan (new BackgroundColorSpan(Color.WHITE), 0, stringWelcome.length(), 0);

        textWelcome.setText(spannaWelcome);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
