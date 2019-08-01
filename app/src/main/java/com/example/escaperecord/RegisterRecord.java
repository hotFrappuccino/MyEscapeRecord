package com.example.escaperecord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;

public class RegisterRecord extends AppCompatActivity {
    private ImageView esimage;
    private EditText themename, esdate, estime, espercent, hintnote, eshint, esbest, esworst;
    private RatingBar esrank;
    private RadioGroup esyorn;
    private RadioButton success, fail;
    private Button registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_record);

        esimage = (ImageView)findViewById(R.id.esimage);
        hintnote = (EditText)findViewById(R.id.hintnote);
        eshint = (EditText)findViewById(R.id.eshint);
        registerbtn =(Button)findViewById(R.id.registerbtn);


        hintnote.setVisibility(View.INVISIBLE);

        eshint.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                int hintsu = Integer.parseInt(eshint.getText().toString());
                if (hintsu == 0) {
                    hintnote.setVisibility(View.INVISIBLE);
                } else {
                    hintnote.setVisibility(View.VISIBLE);
                }
            }
        });
        registerbtn.setOnClickListener((view)->{

        });

    }
}
