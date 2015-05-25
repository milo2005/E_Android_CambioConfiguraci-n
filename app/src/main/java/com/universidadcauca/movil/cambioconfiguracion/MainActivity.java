package com.universidadcauca.movil.cambioconfiguracion;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.universidadcauca.movil.cambioconfiguracion.util.AppUtil;


public class MainActivity extends ActionBarActivity {

    static final String KEY_USR="txt_usr";
    static final String KEY_PASS ="txt_pass";

    EditText usr, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = (EditText) findViewById(R.id.edit_user);
        pass = (EditText) findViewById(R.id.edit_pass);

        usr.setText(AppUtil.usr);
        pass.setText(AppUtil.pass);

        /*if(savedInstanceState!=null){
            String usrS = savedInstanceState.getString(KEY_USR);
            String passS = savedInstanceState.getString(KEY_PASS);

            usr.setText(usrS);
            pass.setText(passS);
        }*/


    }

    /*@Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString(KEY_USR,usr.getText().toString());
        outState.putString(KEY_PASS,pass.getText().toString());

        super.onSaveInstanceState(outState);
    }*/

    @Override
    protected void onDestroy() {
        AppUtil.usr = usr.getText().toString();
        AppUtil.pass = pass.getText().toString();
        super.onDestroy();
    }
}
