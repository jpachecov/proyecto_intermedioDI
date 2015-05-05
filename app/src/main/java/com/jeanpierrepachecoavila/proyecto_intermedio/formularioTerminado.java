package com.jeanpierrepachecoavila.proyecto_intermedio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class formularioTerminado extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();

        System.out.println(bundle.getString("respuesta1"));
        System.out.println(bundle.getString("respuesta2"));
        System.out.println(bundle.getString("respuesta3"));

        System.out.println(bundle.getString("respuesta4"));
        System.out.println(bundle.getString("respuesta5"));
        System.out.println(bundle.getString("respuesta6"));
        System.out.println(bundle.getString("respuesta7"));
        System.out.println(bundle.getString("respuesta8"));

        setContentView(R.layout.activity_formulario_terminado);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_formulario_terminado, menu);
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
