package com.example.fundacioncuervo.redimencionaimagen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    SeekBar seekBar;
    private int iWidth = 65;
    private int iHeight = 52;
    float density;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        density = displayMetrics.densityDpi;

        imagen = (ImageView) findViewById(R.id.imagen);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progrees, boolean fromUser)
            {
                float ancho = (progrees + iWidth) * density / 160;
                float alto = (progrees + iHeight) * density / 160;
                imagen.getLayoutParams().height = (int)alto;
                imagen.getLayoutParams().width = (int)ancho;
                imagen.requestLayout();

        if(progrees==0)
    Toast.makeText(getApplicationContext(),"Estoy en el principio",Toast.LENGTH_LONG).show();
                else if(progrees==10)
                    Toast.makeText(getApplicationContext(),"Estoy en el Final",Toast.LENGTH_LONG).show();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }


        });

        }

 }











