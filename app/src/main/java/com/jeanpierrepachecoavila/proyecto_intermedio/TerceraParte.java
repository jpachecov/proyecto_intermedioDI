package com.jeanpierrepachecoavila.proyecto_intermedio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class TerceraParte extends Activity {


    private String respuesta7;
    private String respuesta8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_parte);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tercera_parte, menu);
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

    public void terminaFormulario(View view) {

        EditText editable1 = (EditText) findViewById(R.id.texto_cu);
        respuesta7 = editable1.getText().toString();
        EditText editable2 = (EditText) findViewById(R.id.ingresos);
        respuesta8 = editable2.getText().toString();
        if (!respuesta7.isEmpty() && !respuesta8.isEmpty()) {
            Intent myintent = new Intent(TerceraParte.this, FormularioTerminado.class);
            Bundle bundle = getIntent().getExtras();
            myintent.putExtra("respuesta1", bundle.getString("respuesta1"));
            myintent.putExtra("respuesta2", bundle.getString("respuesta2"));
            myintent.putExtra("respuesta3", bundle.getString("respuesta3"));
            myintent.putExtra("respuesta4", bundle.getString("respuesta4"));
            myintent.putExtra("respuesta5", bundle.getString("respuesta5"));
            myintent.putExtra("respuesta6", bundle.getString("respuesta6"));
            myintent.putExtra("respuesta7", respuesta7);
            myintent.putExtra("respuesta8", respuesta8);
            TerceraParte.this.startActivity(myintent);
        } else {

        }
    }

}
