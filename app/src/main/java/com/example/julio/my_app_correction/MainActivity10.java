package com.example.julio.my_app_correction;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TextView.OnEditorActionListener;


public class MainActivity10 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity10);

        EditText sendEditText = (EditText) findViewById(R.id.editText1);

        // set focus and show keyboard
        sendEditText.requestFocus();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        sendEditText.setOnEditorActionListener(new MainActivityOnEditorActionListener());
        EditText searchEditText = (EditText) findViewById(R.id.editText2);
        searchEditText.setOnEditorActionListener(new MainActivityOnEditorActionListener());
        EditText customEditText = (EditText) findViewById(R.id.editText3);
        customEditText.setOnEditorActionListener(new MainActivityOnEditorActionListener());

    }
    class MainActivityOnEditorActionListener implements OnEditorActionListener
    {
        @Override
        public boolean onEditorAction(TextView textView, int actionId, KeyEvent event)
        {
            boolean action = false;
            int stringId = -1;
            switch (actionId)
            {
                case EditorInfo.IME_ACTION_SEND:
                    stringId = R.string.send;
                    break;
                case EditorInfo.IME_ACTION_SEARCH:
                    stringId = R.string.search;
                    break;
                case R.id.action_custom:
                case EditorInfo.IME_ACTION_UNSPECIFIED:
                    stringId = R.string.custom;
                    break;
                default:
                    break;
            }
            if (stringId != -1)
            {
                // hide keyboard
                InputMethodManager inputMethodManager = (InputMethodManager) textView.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);

                Toast.makeText(MainActivity10.this, stringId, Toast.LENGTH_SHORT).show();
                action = true;
            }
            return action;
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity10, menu);
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
