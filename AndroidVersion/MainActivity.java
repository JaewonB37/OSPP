package com.example.androidversion;

import static java.sql.Types.NULL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoQ, rdoR, rdoS;
    Button btnOK, btnExit, btnReset;
    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("좋아하는 안드로이드 버전은?");

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);

        text2 = (TextView) findViewById((R.id.Text2));
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoQ = (RadioButton) findViewById(R.id.RdoQ);
        rdoR = (RadioButton) findViewById(R.id.RdoR);
        rdoS = (RadioButton) findViewById(R.id.RdoS);

        btnOK = (Button) findViewById(R.id.BtnOK);
        imgAndroid = (ImageView) findViewById((R.id.ImgAndroid));

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(chkAgree.isChecked() == true){
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    btnOK.setVisibility(android.view.View.VISIBLE);
                    imgAndroid.setVisibility(android.view.View.VISIBLE);
                    btnExit.setVisibility(android.view.View.VISIBLE);
                    btnReset.setVisibility(android.view.View.VISIBLE);
                }
                else{
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgAndroid.setVisibility(View.INVISIBLE);
                    btnExit.setVisibility(android.view.View.INVISIBLE);
                    btnReset.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                switch(rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoQ:
                        imgAndroid.setImageResource(R.drawable.q);
                        break;
                    case R.id.RdoR:
                        imgAndroid.setImageResource(R.drawable.r);
                        break;
                    case R.id.RdoS:
                        imgAndroid.setImageResource(R.drawable.s);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "버전 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnExit = (Button) findViewById(R.id.BtnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnReset = (Button) findViewById(R.id.BtnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkAgree.setChecked(false);
                text2.setVisibility(android.view.View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                btnOK.setVisibility(View.INVISIBLE);
                imgAndroid.setVisibility(View.INVISIBLE);
                btnExit.setVisibility(android.view.View.INVISIBLE);
                btnReset.setVisibility(android.view.View.INVISIBLE);

                ((RadioButton) findViewById(R.id.RdoQ)).setChecked(false);
                ((RadioButton) findViewById(R.id.RdoR)).setChecked(false);
                ((RadioButton) findViewById(R.id.RdoS)).setChecked(false);
                imgAndroid.setImageResource(0);
            }
        });
    }
}