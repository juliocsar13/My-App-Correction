package com.example.julio.my_app_correction;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

/*    private MediaPlayer np;
    private Button btnPrimerRegister;

*/
    Animation lineTranslate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacion_pruebas);
        ImageView image = (ImageView) findViewById(R.id.image_animation);
        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.line_translate);
        image.startAnimation(animacion);
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
        // automatically handle clicks on the Home/Up bu     tton, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
    }
        return super.onOptionsItemSelected(item);
    }
}