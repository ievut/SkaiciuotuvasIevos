package com.example.skaiciuotuvasievos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button  mygtukas0, mygtukas1, mygtukas2, mygtukas3, mygtukas4, mygtukas5,
            mygtukas6, mygtukas7, mygtukas8, mygtukas9, mygtukasKabl,
            mygtukasPlius, mygtukasMinus, mygtukasDalinti, mygtukasDauginti, mygtukasLygu,
            mygtukasTrinti;

    EditText redaguokTeksta;

    float pirmasSk, antrasSk;

    boolean sudetis, atimtis, daugyba, dalyba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mygtukas0 = (Button) findViewById(R.id.mygtukas0);
        mygtukas1 = (Button) findViewById(R.id.mygtukas1);
        mygtukas2 = (Button) findViewById(R.id.mygtukas2);
        mygtukas3 = (Button) findViewById(R.id.mygtukas3);
        mygtukas4 = (Button) findViewById(R.id.mygtukas4);
        mygtukas5 = (Button) findViewById(R.id.mygtukas5);
        mygtukas6 = (Button) findViewById(R.id.mygtukas6);
        mygtukas7 = (Button) findViewById(R.id.mygtukas7);
        mygtukas8 = (Button) findViewById(R.id.mygtukas8);
        mygtukas9 = (Button) findViewById(R.id.mygtukas9);
        mygtukasKabl = (Button) findViewById(R.id.mygtukasKabl);
        mygtukasPlius = (Button) findViewById(R.id.mygtukasPlius);
        mygtukasMinus = (Button) findViewById(R.id.mygtukasMinus);
        mygtukasDalinti = (Button) findViewById(R.id.mygtukasDalinti);
        mygtukasDauginti = (Button) findViewById(R.id.mygtukasDauginti);
        mygtukasLygu = (Button) findViewById(R.id.mygtukasLygu);
        mygtukasTrinti =(Button) findViewById(R.id.mygtukasTrinti);
        redaguokTeksta = (EditText) findViewById(R.id.edt1);

//apsirasom kiekviena skaiciu mygtuka ir jo grazinama reiksme
        mygtukas0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "0");
            }
        });
        mygtukas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "1");
            }
        });
        mygtukas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "2");
            }
        });
        mygtukas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "3");
            }
        });
        mygtukas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "4");
            }
        });
        mygtukas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "5");
            }
        });
        mygtukas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "6");
            }
        });
        mygtukas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "7");
            }
        });
        mygtukas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "8");
            }
        });
        mygtukas9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redaguokTeksta.setText(redaguokTeksta.getText() + "9");
            }
        });
//apsirasom kiekviena veiksmu mygtuka ir kaip jo grazinama reiksme priskiriam tarpa
        mygtukasPlius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (redaguokTeksta == null) {
                    redaguokTeksta.setText("");
                } else {
                    pirmasSk = Float.parseFloat(redaguokTeksta.getText() + "");
                    sudetis = true;
                    redaguokTeksta.setText(null);
                }
            }
        });
        mygtukasMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (redaguokTeksta == null) {
                    redaguokTeksta.setText("");
                } else {
                    pirmasSk = Float.parseFloat(redaguokTeksta.getText() + "");
                    atimtis = true;
                    redaguokTeksta.setText(null);
                }
            }
        });
        mygtukasDalinti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (redaguokTeksta == null) {
                    redaguokTeksta.setText("");
                } else {
                    pirmasSk = Float.parseFloat(redaguokTeksta.getText() + "");
                    dalyba = true;
                    redaguokTeksta.setText(null);
                }
            }
        });
        mygtukasDauginti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (redaguokTeksta == null) {
                    redaguokTeksta.setText("");
                } else {
                    pirmasSk = Float.parseFloat(redaguokTeksta.getText() + "");
                    daugyba = true;
                    redaguokTeksta.setText(null);
                }
            }
        });

//aprasom ka daro lygu mygtukas ir pateikiam aritmetinius veiksmus bei grazinamas reiksmes
        mygtukasLygu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                antrasSk = Float.parseFloat(redaguokTeksta.getText() + "");

                if (sudetis == true) {
                    redaguokTeksta.setText(pirmasSk + antrasSk + "");
                    sudetis = false;
                }

                if (atimtis == true) {
                    redaguokTeksta.setText(pirmasSk - antrasSk + "");
                    atimtis = false;
                }

                if (daugyba == true) {
                    redaguokTeksta.setText(pirmasSk * antrasSk + "");
                    daugyba = false;
                }

                if (dalyba == true) {
                    redaguokTeksta.setText(pirmasSk / antrasSk + "");
                    dalyba = false;
                }
            }
        });

        mygtukasTrinti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redaguokTeksta.setText("");
            }
        });

        mygtukasKabl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redaguokTeksta.setText(redaguokTeksta.getText() + ".");
            }
        });
    }
}