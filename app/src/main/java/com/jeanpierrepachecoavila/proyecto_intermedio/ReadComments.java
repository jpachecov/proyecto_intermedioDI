package com.jeanpierrepachecoavila.proyecto_intermedio;

/**
 * Created by caenhiro on 6/05/15.
 */

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by Ramiro on 25/01/2015.
 */
public class ReadComments extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // note that use read_comments.xml instead of our single_post.xml
        setContentView(R.layout.activity_llena_formulario);
    }
}
