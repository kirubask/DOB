package com.example.dob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usm;
    EditText usy;
    EditText tm;
    EditText ty;

    TextView resview;
    Button resbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        usm = findViewById(R.id.dobmonth);
        usy = findViewById(R.id.dobyear);
        tm = findViewById(R.id.tmonth);
        ty = findViewById(R.id.tyear);
        resview=findViewById(R.id.resultview);
        resbut = findViewById(R.id.resultclick);


        resbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String uy = usy.getText().toString();
                String uom = usm.getText().toString();
                String tom = tm.getText().toString();
                String toy = ty.getText().toString();

                if (uy.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter the year", Toast.LENGTH_SHORT).show();
                } else if (uy.compareTo(String.valueOf(toy)) > 0) {
                    Toast.makeText(MainActivity.this, "year should ne less than current year", Toast.LENGTH_SHORT).show();
                }
                else{

                    int myAge = Integer.parseInt(toy) - Integer.parseInt(uy);

                    int myMonth = Integer.parseInt(tom) - Integer.parseInt(uom);
                    resview.setText(myAge+"years"+","+myMonth+"months");

                }

            }
        });
    }


}
