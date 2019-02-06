package com.example.model;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private LinearLayout gotologin;
    private LinearLayout gotoRegister;
    private MaterialButton regBtn;
    private MaterialButton loginBtn;
    private TextInputEditText nameInput;
    private TextView textLog;
    private TextView textReg;
    private TextInputEditText regAddres;
    private TextInputEditText regMobno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getIds();

        //Changing button Bar layout
        gotoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameInput.setVisibility(View.VISIBLE);
                gotoRegister.setBackground(getDrawable(R.drawable.button_styling_right_rev));
                gotologin.setBackground(getDrawable(R.drawable.button_styling_left_rev));
                textLog.setTextColor(getResources().getColor(R.color.greenColor));
                textReg.setTextColor(getResources().getColor(R.color.whiteColor));
                loginBtn.setVisibility(View.INVISIBLE);
                regBtn.setVisibility(View.VISIBLE);
                regAddres.setVisibility(View.VISIBLE);
                regMobno.setVisibility(View.VISIBLE);

            }
        });

        gotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameInput.setVisibility(View.GONE);
                gotologin.setBackground(getDrawable(R.drawable.button_styling_left));
                gotoRegister.setBackground(getDrawable(R.drawable.button_styling_right));
                textLog.setTextColor(getResources().getColor(R.color.whiteColor));
                textReg.setTextColor(getResources().getColor(R.color.greenColor));
                loginBtn.setVisibility(View.VISIBLE);
                regBtn.setVisibility(View.INVISIBLE);
                regAddres.setVisibility(View.GONE);
                regMobno.setVisibility(View.GONE);
            }
        });

    }

    public void getIds(){

        gotologin = (LinearLayout)findViewById(R.id.goto_login);
        gotoRegister = (LinearLayout)findViewById(R.id.gotoregister);
        regBtn = (MaterialButton)findViewById(R.id.regBtn);
        loginBtn = (MaterialButton)findViewById(R.id.loginBtn);
        nameInput = (TextInputEditText)findViewById(R.id.reg_name);
        textLog= (TextView)findViewById(R.id.textLogin);
        textReg=(TextView)findViewById(R.id.textReg);
        regAddres=(TextInputEditText)findViewById(R.id.reg_address);
        regMobno=(TextInputEditText)findViewById(R.id.reg_mobno);
    }
}
