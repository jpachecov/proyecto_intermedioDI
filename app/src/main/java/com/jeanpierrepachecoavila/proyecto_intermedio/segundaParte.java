package com.jeanpierrepachecoavila.proyecto_intermedio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class segundaParte extends Activity {

    private String respuesta4;
    private String respuesta5;
    private String respuesta6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_segunda_parte);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_segunda_parte, menu);
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

    public void lanza3de3(View view) {

        EditText editable = (EditText) findViewById(R.id.dinero);
        respuesta4 = editable.getText().toString();

        Spinner desp1 = (Spinner) findViewById(R.id.desp1);
        respuesta5 = desp1.getSelectedItem().toString();

        Spinner desp2 = (Spinner) findViewById(R.id.desp2);
        respuesta6 = desp2.getSelectedItem().toString();

        if (!respuesta4.isEmpty() && respuesta5 != null && respuesta6 != null) {
            Intent myintent = new Intent(segundaParte.this, terceraParte.class);
            Bundle bundle = getIntent().getExtras();
            myintent.putExtra("respuesta1", bundle.getString("respuesta1"));
            myintent.putExtra("respuesta2", bundle.getString("respuesta2"));
            myintent.putExtra("respuesta3", bundle.getString("respuesta3"));
            myintent.putExtra("respuesta4", respuesta4);
            myintent.putExtra("respuesta5", respuesta5);
            myintent.putExtra("respuesta6", respuesta6);
            segundaParte.this.startActivity(myintent);
        } else {

        }
    }
}
