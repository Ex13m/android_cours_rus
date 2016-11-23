package cz.konsalting.www.android_1_lesson_3_home_work.lesson_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cz.konsalting.www.android_1_lesson_3_home_work.R;
import cz.konsalting.www.android_1_lesson_3_home_work.lesson_3.Lesson3HomeWorkSecondScreen;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    private EditText calcScreen;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFor;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnZero;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnDivide;
    private Button btnX;
    private Button btnEquals;
    private Button btnPoint;
    private Button btnOff;
    private Button btnReserv;
    private Button btnRreserv1;
    private String result;
    private StringBuffer sb;
    private boolean isContainPoint;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        i = 0;
        sb = new StringBuffer();
        calcScreen = (EditText) findViewById(R.id.calcScreen);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFor = (Button) findViewById(R.id.btnFor);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnX = (Button) findViewById(R.id.btnX);
        btnEquals = (Button) findViewById(R.id.btnEqually);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnOff = (Button) findViewById(R.id.btnOff);
        btnReserv = (Button) findViewById(R.id.btnreserv);
        btnRreserv1 = (Button) findViewById(R.id.btnReserv1);

        btnReserv.setEnabled(false);
        btnRreserv1.setEnabled(false);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFor.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        calcScreen.setCursorVisible(true);

    }


    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.btnOne:
                sb.append(1);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnTwo:
                sb.append(2);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnThree:
                sb.append(3);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnFor:
                sb.append(4);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnFive:
                sb.append(5);
                calcScreen.setText(sb.toString());
            case R.id.btnSix:
                sb.append(6);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnSeven:
                sb.append(7);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnEight:
                sb.append(8);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnNine:
                sb.append(9);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnZero:
                sb.append(0);
                calcScreen.setText(sb.toString());
                break;
            case R.id.btnPoint:
                if (i == 0) {
                    sb.append(".");
                    i++;
                    break;
                } else {
                    Toast.makeText(this, "Двойная точка '.' ", Toast.LENGTH_SHORT).show();
                    break;
                }


        }
    }
}