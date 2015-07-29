package com.example.ksiapi.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


public class Second_act extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_act);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_act, menu);
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

    public void thirt_act(View view) {
        Intent intent = new Intent(this, Third_act.class);
        startActivity(intent);
    }
    public void select_language(View view){
        boolean checkBoxState = ((CheckBox)view).isChecked();
        TextView selectTextView = (TextView)findViewById(R.id.showStatus);
        switch (view.getId()){
            case R.id.checkEng:
                if (checkBoxState){
                     selectTextView.setText("English");
                }
                break;
            case R.id.checkRu:
                if(checkBoxState){
                    selectTextView.setText("Russian");
                }else{
                }
                break;
        }
    }
}
