package com.jeanpierrepachecoavila.proyecto_intermedio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;


public class Llena_formulario extends Activity {


    private String respuesta1;
    private String respuesta2;
    private String respuesta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llena_formulario);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_llena_formulario, menu);
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

    public void radioButtonPressed(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.arrebatado:
                if (checked)
                    respuesta1 = "arrebatado";
                break;
            case R.id.flexible:
                if (checked)
                    respuesta1 = "flexible";
                break;
            case R.id.tranquilo:
                if (checked)
                    respuesta1 = "tranquilo";
                break;
            case R.id.dificil:
                if (checked)
                    respuesta1 = "dificil";
                break;
        }

    }
    public void lanza2de3(View view){

        Spinner desplegable = (Spinner) findViewById(R.id.tiempo_libre);
        respuesta2 = desplegable.getSelectedItem().toString();

        EditText editable = (EditText) findViewById(R.id.Respuesta);
        respuesta3 = editable.getText().toString();

        if (respuesta1 != null && respuesta2 != null && !respuesta3.isEmpty()) {
            Intent myIntent = new Intent(Llena_formulario.this, SegundaParte.class);
            myIntent.putExtra("respuesta1", respuesta1); //Optional parameters
            myIntent.putExtra("respuesta2", respuesta2);
            myIntent.putExtra("respuesta3", respuesta3);
            Llena_formulario.this.startActivity(myIntent);
        } else {

        }

    }
}
