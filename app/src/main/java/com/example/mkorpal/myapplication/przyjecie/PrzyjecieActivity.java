package com.example.mkorpal.myapplication.przyjecie;

/**
 * Created by m.korpal on 05.09.2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mkorpal.myapplication.R;


public class PrzyjecieActivity extends Activity {
// Declare references

    Button button;
   public Button button1;
    TextView dateview;



   /* EditText userInput;
    EditText kodInput, iloscInput;
    TextView recordsTextView;
    MyDBHandler dbHandler; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wyplzwrotlinwe1);

        //AKTUALNA DATA Z SYSTEMU
        /*
        Date = (TextView) findViewById(R.id.dateview);
        String Date= DateFormat.getDateTimeInstance().format(new Date());

        dateview.setText(Date);*/


    }
    public void Rejestracja03(View view){
        Intent rej1=new Intent(this,PrzyjeciestartActivity.class);
        startActivity(rej1);
    }

    public void Podglad03(View view){
        Intent pod1=new Intent(this,podgladActivityprzyjecie.class);
        startActivity(pod1);
    }
    public void Eksportuj(View view){


    }

}
