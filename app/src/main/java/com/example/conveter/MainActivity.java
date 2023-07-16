package com.example.conveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        ed1=findViewById(R.id.txtamount);
        sp1=findViewById(R.id.spfrom);
        sp2=findViewById(R.id.spto);
        b1=findViewById(R.id.btn1);

        String[] from ={"USD"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to ={"INDIAN RUPESS","SRILANKAN RUPESS","ENGLAND POUND","CANADA DOLLER","JAPANESE YEN","RUSSIAN RUBLES"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;
                Double amount=Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "INDIAN RUPESS")
                {
                    tot = amount * 82.78;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "SRILANKAN RUPESS")
                {
                    tot = amount * 363.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "ENGLAND POUND")
                {
                    tot = amount * 0.83;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "CANADA DOLLER")
                {
                    tot = amount * 1.35;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "JAPANESE YEN")
                {
                    tot = amount * 130.55;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "RUSSIAN RUBLES")
                {
                    tot = amount * 71.49;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}