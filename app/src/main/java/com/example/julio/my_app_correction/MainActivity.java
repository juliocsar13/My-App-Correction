package com.example.julio.my_app_correction;


import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;


public class MainActivity extends Activity {




    /*    private MediaPlayer np;
        private Button btnPrimerRegister;
    */
  /*  Animation lineTranslate;
    ListView lista;
    String[] personas = {
            "pablo",
            "ramiro",
            "vilma",
            "canela",
            "tito",
            "nicolas",
            "maira",
            "pepita",
            "honguito"
    };
*/
    private EditText mUsername, mPassword;
    private Drawable error_indicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_error_edit);

        error_indicator = getResources().getDrawable(R.drawable.food_ratingbar_full_filled);
        int left = 0;
        int top = 0;
        int right =error_indicator.getIntrinsicHeight();
        int bottom = error_indicator.getIntrinsicWidth();

        error_indicator.setBounds(new Rect(left, top, right, bottom));

        mUsername = (EditText) findViewById(R.id.editText1_set_error);
        mPassword = (EditText) findViewById(R.id.email_set_error);

        // Called when user type in EditText
        mUsername.addTextChangedListener(new InputValidator(mUsername));
        mPassword.addTextChangedListener(new InputValidator(mPassword));

        // Called when an action is performed on the EditText
        mUsername.setOnEditorActionListener(new EmptyTextListener(mUsername));
        mPassword.setOnEditorActionListener(new EmptyTextListener(mPassword));
    }

    private class InputValidator implements TextWatcher {
        private EditText et;

        private InputValidator(EditText editText) {
            this.et = editText;
        }

        @Override
        public void afterTextChanged(Editable s) {

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before,
                                  int count) {
            if (s.length() != 0) {
                switch (et.getId()) {
                    case R.id.editText1_set_error: {
                        if (!Pattern.matches("^[a-z]{1,16}$", s)) {
                            et.setError("Oops! Username must have only a-z");
                        }
                    }
                    break;

                    case R.id.email_set_error: {
                        if (!Pattern.matches("^[a-zA-Z]{1,16}$", s)) {
                            et.setError("Oops! Password must have only a-z and A-Z");
                        }
                    }
                    break;
                }
            }
        }
    }

    private class EmptyTextListener implements EditText.OnEditorActionListener {
        private EditText et;

        public EmptyTextListener(EditText editText) {
            this.et = editText;
        }

        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            if (actionId == EditorInfo.IME_ACTION_NEXT) {
                // Called when user press Next button on the soft keyboard

                if (et.getText().toString().equals(""))
                    et.setError("Oops! empty.", error_indicator);
            }
            return false;
        }
    }

/*
        editText = (EditText) findViewById(R.id.editText1);
        editEmail= (EditText) findViewById(R.id.email);

        String str= editText.getText().toString();

*/
/*
        lista = (ListView) findViewById(R.id.listView);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, personas);

        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "posicion " + (i+1) + personas[i], Toast.LENGTH_SHORT).show();
            }
        });*/
/*
    public void btnClick(View v)
    {
        if(editText.getText().length()==0)
        {
            editText.setError(CharSequence "error",Drawable,isChangingConfigurations() );
        }
    }
*/

        /*ImageView image = (ImageView) findViewById(R.id.image_animation);
        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.line_translate);
        image.startAnimation(animacion);*/

     //   SlidingUpPanelLayout slidingPanel = (SlidingUpPanelLayout) findViewById (R.id.sliding_panel); slidingPanel.hidePanel ();
     /*   EditText edit= (EditText) findViewById(R.id.edit2);
        edit.setEnabled(true);*/

  /*      btnPrimerRegister = (Button) findViewById(R.id.btnRegister);
        btnPrimerRegister.setOnClickListener(new View.OnClickListener() {

            @Override
                public void onClick(View view) {
                    Intent registro =new Intent(getApplicationContext(),MainActivity2.class);
                    np = MediaPlayer.create(MainActivity.this, R.raw.julio);
                    np.start();
                    startActivity(registro);
            }
        });*/



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