package com.example.julio.my_app_correction;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

  //  private MediaPlayer np;
  //  private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     btnRegister = (Button) findViewById(R.id.btnRegister);
   //     btnRegister.setOnClickListener(new View.OnClickListener(){
   //         @Override
   //         public void onClick(View view){
   //             np = MediaPlayer.create(MainActivity.this,R.raw.julio);
   //             np.start();
   //         }

   //     });

    }
    public void registro(View view)
    {
       Intent registros = new Intent(this,MainActivity2.class);
        startActivity(registros);
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
}
