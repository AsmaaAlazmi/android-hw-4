package com.example.gradewizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final   EditText one = findViewById (R.id.editTextTextPersonName1);
        final EditText two = findViewById (R.id.editTextTextPersonName2);
        final EditText three = findViewById (R.id.editTextTextPersonName3);
        final EditText four = findViewById (R.id.editTextTextPersonName4);
        final Button calc = findViewById (R.id.button);
        final Button reset = findViewById (R.id.button2);
        final  TextView grade = findViewById (R.id.grade);



        calc.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String a = one.getText ().toString ();
                String b = two.getText ().toString ();
                String c = three.getText ().toString ();
                String d = four.getText ().toString ();

                double n1 = Double.parseDouble (a);
                double n2 = Double.parseDouble (b);
                double n3 = Double.parseDouble (c);
                double n4 = Double.parseDouble (d);

                double mark = n1+n2+n3+n4;

                if (mark>=90)
                {
                    grade.setText ("A");
                    grade.setTextColor (getResources().getColor(R.color.green) );
                }
                else if (mark>=80)
                {
                    grade.setText ("B");
                    grade.setTextColor (getResources().getColor(R.color.B) );
                }
                else if (mark>=70)
                {
                    grade.setText ("C");
                    grade.setTextColor (getResources().getColor(R.color.C) );
                }
                else if (mark>=60)
                {
                    grade.setText ("D");
                    grade.setTextColor (getResources().getColor(R.color.D) );
                }
                else {  grade.setText ("F");
                    grade.setTextColor (getResources().getColor(R.color.F) );}
        }


        });

        reset.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                one.setText ("");
                four.setText ("");
                three.setText ("");
                two.setText ("");
                grade.setText ("");
            }
        });
    }
}
