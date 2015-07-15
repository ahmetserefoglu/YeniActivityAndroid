package com.example.ahmet.yeni_ekran_odev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        final Button btn = (Button) findViewById(R.id.gecis);
        final EditText kuladi = (EditText) findViewById(R.id.kadi);
        final EditText pasword = (EditText) findViewById(R.id.pass);
        final TextView text=(TextView)findViewById(R.id.textView4);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MyActivity.this, Ikinci.class);
                    if (kuladi.getText().toString().equals("ahmet") && pasword.getText().toString().equals("1234")) {
                        startActivity(intent);
                    }

                    /*else
                    {
                        Intent intent1 = new Intent(MyActivity.this, asd.class);
                        startActivity(intent1);
                        text.setText("yanlis girdiniz");


                    }*/
                }



            });
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
