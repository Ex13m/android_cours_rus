package cz.konsalting.www.android_1_lesson_3_home_work.lesson_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
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
    private Button btnClear;
    private Button btnReserv;
    private Button btnRreserv1;

    private StringBuffer sb;
    private float result = 0;
    private float result2 = 0;
    private float resultEnd = 0;


    float dotMarker = 0;
    int firstNumberMarker = 0;
    int lastOprationMarker=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
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
        btnClear = (Button) findViewById(R.id.btnClear);
        btnOff = (Button) findViewById(R.id.btnOff);
        btnReserv = (Button) findViewById(R.id.btnreserv);
        btnRreserv1 = (Button) findViewById(R.id.btnReserv1);

        btnReserv.setEnabled(false);
        btnRreserv1.setEnabled(false);

        calcScreen.setCursorVisible(true);
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
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnX.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnOff.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.btnOne:

                numberCklik('1');
                break;
            case R.id.btnTwo:
                numberCklik('2');
                break;
            case R.id.btnThree:
                numberCklik('3');
                break;
            case R.id.btnFor:
                numberCklik('4');
                break;
            case R.id.btnFive:
                numberCklik('5');
                break;
            case R.id.btnSix:
                numberCklik('6');
                break;
            case R.id.btnSeven:
                numberCklik('7');
                break;
            case R.id.btnEight:
                numberCklik('8');
                break;
            case R.id.btnNine:
                numberCklik('9');
                break;
            case R.id.btnZero:
                numberCklik('0');
                break;
            case R.id.btnPoint:
                dotClik('.');
                break;

            case R.id.btnPlus:

                isNumberMarkerZeroPlus(firstNumberMarker);
                firstNumberMarker=firstNumberMarker+1;
                dotMarker=0;
                lastOprationMarker=1;
                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));
                break;

            case R.id.btnMinus:
                lastOprationMarker=2;
                isNumberMarkerZeroMinus(firstNumberMarker);
                firstNumberMarker=firstNumberMarker+1;
                dotMarker=0;
                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));
                break;

            case R.id.btnX:
                lastOprationMarker=3;
                isNumberMarkerZeroX(firstNumberMarker);
                firstNumberMarker=firstNumberMarker+1;
                dotMarker=0;
                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));
                break;

            case R.id.btnDivide:
                lastOprationMarker=3;
                isNumberMarkerZeroX(firstNumberMarker);
                firstNumberMarker=firstNumberMarker+1;
                dotMarker=0;
                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));
                break;


            case R.id.btnClear:
                sb = sb.delete(0, sb.length());
                result = 0;
                result2 = 0;
                resultEnd = 0;
                dotMarker = 0;
                firstNumberMarker=0;
                calcScreen.setText(sb.toString());
                Toast.makeText(this, "Result canceled " + "" + resultEnd, Toast.LENGTH_SHORT).show();
                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));

                break;

            case R.id.btnEqually:

                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));

                switch (lastOprationMarker){
                    case 0:
                        String eqNothing = String.valueOf(Float.parseFloat(sb.toString()));
                        calcScreen.setText(eqNothing);
                        Toast.makeText(this, "Result is :" + eqNothing, Toast.LENGTH_SHORT).show();
                        sb = sb.delete(0, sb.length());
                        result = 0;
                        result2 = 0;
                        dotMarker = 0;
                        firstNumberMarker=0;
                        break;

                    case 1:
                        String eqPlus = String.valueOf(resultEnd+Float.parseFloat(sb.toString()));
                        calcScreen.setText(eqPlus);
                        Toast.makeText(this, "Result is :" + eqPlus, Toast.LENGTH_SHORT).show();
                        sb = sb.delete(0, sb.length());
                        result = 0;
                        result2 = 0;
                        dotMarker = 0;
                        firstNumberMarker=0;
                        break;
                    case 2:
                        String eqMinus = String.valueOf(resultEnd-Float.parseFloat(sb.toString()));
                        calcScreen.setText(eqMinus);
                        Toast.makeText(this, "Result is :" + eqMinus, Toast.LENGTH_SHORT).show();
                        sb = sb.delete(0, sb.length());
                        result = 0;
                        result2 = 0;
                        dotMarker = 0;
                        firstNumberMarker=0;
                        break;
                    case 3:
                        String eqX = String.valueOf(resultEnd*Float.parseFloat(sb.toString()));
                        calcScreen.setText(eqX);
                        Toast.makeText(this, "Result is :" + eqX, Toast.LENGTH_SHORT).show();
                        sb = sb.delete(0, sb.length());
                        result = 0;
                        result2 = 0;
                        dotMarker = 0;
                        firstNumberMarker=0;
                        break;
                    case 4:
                        String eqD = String.valueOf(resultEnd/Float.parseFloat(sb.toString()));
                        calcScreen.setText(eqD);
                        Toast.makeText(this, "Result is :" + eqD, Toast.LENGTH_SHORT).show();
                        sb = sb.delete(0, sb.length());
                        result = 0;
                        result2 = 0;
                        dotMarker = 0;
                        firstNumberMarker=0;
                        break;



                      }

                        break;

            case R.id.btnOff:
                finish();
        }

    }


    //Метод ввода для стартового числа
    private void numberCklik(char zz) {
            if (firstNumberMarker == 0) {
            if ((sb.length() < 15)) {
                sb.append(zz);
                calcScreen.setText(sb.toString());
                result = Float.parseFloat(sb.toString());
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("number Marker",String.valueOf(firstNumberMarker));

            }
            else {
                Toast.makeText(this, "Max string length is " + getString(R.string.maxScreenLength) + " nubers!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Log.d("number Marker",String.valueOf(firstNumberMarker));
            Log.d("...dot Marker",String.valueOf(dotMarker));
            if ((sb.length() < 15)) {
                sb.append(zz);
                calcScreen.setText(sb.toString());
                result2 = Float.parseFloat(sb.toString());

            } else {
                Toast.makeText(this, "Max string length is " + getString(R.string.maxScreenLength) + " nubers!", Toast.LENGTH_SHORT).show();
            }

        }



    }


    private void dotClik(char zz) {
        Log.d("number Marker",String.valueOf(firstNumberMarker));
        Log.d("...dot Marker",String.valueOf(dotMarker));

        if (firstNumberMarker == 0) {
            if (dotMarker == 0) {
                if ((sb.length() < 15)) {
                    sb.append(zz);
                    calcScreen.setText(sb.toString());
                    result = Float.parseFloat(sb.toString());
                    dotMarker=dotMarker+1;
                    firstNumberMarker=firstNumberMarker+1;
                    Log.d("number Marker",String.valueOf(firstNumberMarker));
                    Log.d("...dot Marker",String.valueOf(dotMarker));

                } else {
                    Toast.makeText(this, "Max string length is " + getString(R.string.maxScreenLength) + " nubers!", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Двойная точка '.' ", Toast.LENGTH_SHORT).show();
            }

        } else {
            Log.d("number Marker",String.valueOf(firstNumberMarker));
            Log.d("---dot Marker",String.valueOf(dotMarker));
            if (dotMarker == 0) {
                if ((sb.length() < 15)) {
                    sb.append(zz);
                    calcScreen.setText(sb.toString());
                    result2 = Float.parseFloat(sb.toString());
                    dotMarker=dotMarker+1;
                    Log.d("---dot Marker",String.valueOf(dotMarker));
                } else {
                    Toast.makeText(this, "Max string length is " + getString(R.string.maxScreenLength) + " nubers!", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Двойная точка '.' ", Toast.LENGTH_SHORT).show();
            }

        }

    }

    private void isNumberMarkerZeroPlus(int cc){

        if (cc == 0) {

            Log.d("result=",String.valueOf(result));
            Log.d("result2=",String.valueOf(result2));
            Log.d("resultEnd=",String.valueOf(resultEnd));
            Log.d("number Marker",String.valueOf(firstNumberMarker));
            Log.d("...dot Marker",String.valueOf(dotMarker));
            if (sb.length() > 0) {

                resultEnd = result;

                sb = sb.delete(0, sb.length());
                String mm = String.valueOf(resultEnd);
                Toast.makeText(this, mm + " + " , Toast.LENGTH_SHORT).show();
                calcScreen.setText(sb);

                Log.d("---dot Marker",String.valueOf(dotMarker));

            } else {
                Toast.makeText(this, "Введите число !", Toast.LENGTH_SHORT).show();
            }

        }else {
            if (sb.length() > 0) {

                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));

                resultEnd = resultEnd+result2;

                sb = sb.delete(0, sb.length());
                String mm = String.valueOf(resultEnd);
                Toast.makeText(this, mm + " + "+" numberMarker" + String.valueOf(firstNumberMarker), Toast.LENGTH_SHORT).show();
                calcScreen.setText(sb);

                Log.d("---dot Marker",String.valueOf(dotMarker));
            } else {
                Toast.makeText(this, "Введите число !", Toast.LENGTH_SHORT).show();
            }


        }


    }
    private void isNumberMarkerZeroMinus(int cc){

        if (cc == 0) {
            Log.d("result=",String.valueOf(result));
            Log.d("result2=",String.valueOf(result2));
            Log.d("resultEnd=",String.valueOf(resultEnd));
            Log.d("number Marker",String.valueOf(firstNumberMarker));
            Log.d("...dot Marker",String.valueOf(dotMarker));
            if (sb.length() > 0) {

                resultEnd = result;

                sb = sb.delete(0, sb.length());
                String mm = String.valueOf(resultEnd);
                Toast.makeText(this, mm + " - " , Toast.LENGTH_SHORT).show();
                calcScreen.setText(sb);

                Log.d("---dot Marker",String.valueOf(dotMarker));

            } else {
                Toast.makeText(this, "Введите число !", Toast.LENGTH_SHORT).show();
            }

        }else {
            if (sb.length() > 0) {

                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));

                resultEnd = resultEnd-result2;

                sb = sb.delete(0, sb.length());
                String mm = String.valueOf(resultEnd);
                Toast.makeText(this, mm + " - ", Toast.LENGTH_SHORT).show();
                calcScreen.setText(sb);

                Log.d("---dot Marker",String.valueOf(dotMarker));
            } else {
                Toast.makeText(this, "Введите число !", Toast.LENGTH_SHORT).show();
            }


        }


    }
    private void isNumberMarkerZeroX(int cc){

        if (cc == 0) {
            Log.d("result=",String.valueOf(result));
            Log.d("result2=",String.valueOf(result2));
            Log.d("resultEnd=",String.valueOf(resultEnd));
            Log.d("number Marker",String.valueOf(firstNumberMarker));
            Log.d("...dot Marker",String.valueOf(dotMarker));
            if (sb.length() > 0) {

                resultEnd = result;

                sb = sb.delete(0, sb.length());
                String mm = String.valueOf(resultEnd);
                Toast.makeText(this, mm + " x " , Toast.LENGTH_SHORT).show();
                calcScreen.setText(sb);

                Log.d("---dot Marker",String.valueOf(dotMarker));

            } else {
                Toast.makeText(this, "Введите число !", Toast.LENGTH_SHORT).show();
            }

        }else {
            if (sb.length() > 0) {

                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));

                resultEnd = resultEnd*result2;

                sb = sb.delete(0, sb.length());
                String mm = String.valueOf(resultEnd);
                Toast.makeText(this, mm + " x ", Toast.LENGTH_SHORT).show();
                calcScreen.setText(sb);

                Log.d("---dot Marker",String.valueOf(dotMarker));
            } else {
                Toast.makeText(this, "Введите число !", Toast.LENGTH_SHORT).show();
            }


        }


    }
    private void isNumberMarkerZeroD(int cc){

        if (cc == 0) {
            Log.d("result=",String.valueOf(result));
            Log.d("result2=",String.valueOf(result2));
            Log.d("resultEnd=",String.valueOf(resultEnd));
            Log.d("number Marker",String.valueOf(firstNumberMarker));
            Log.d("...dot Marker",String.valueOf(dotMarker));
            if (sb.length() > 0) {

                resultEnd = result;

                sb = sb.delete(0, sb.length());
                String mm = String.valueOf(resultEnd);
                Toast.makeText(this, mm + " / " , Toast.LENGTH_SHORT).show();
                calcScreen.setText(sb);

                Log.d("---dot Marker",String.valueOf(dotMarker));

            } else {
                Toast.makeText(this, "Введите число !", Toast.LENGTH_SHORT).show();
            }

        }else {
            if (sb.length() > 0) {

                Log.d("result=",String.valueOf(result));
                Log.d("result2=",String.valueOf(result2));
                Log.d("resultEnd=",String.valueOf(resultEnd));
                Log.d("number Marker",String.valueOf(firstNumberMarker));
                Log.d("...dot Marker",String.valueOf(dotMarker));

                resultEnd = resultEnd/result2;

                sb = sb.delete(0, sb.length());
                String mm = String.valueOf(resultEnd);
                Toast.makeText(this, mm + " / ", Toast.LENGTH_SHORT).show();
                calcScreen.setText(sb);

                Log.d("---dot Marker",String.valueOf(dotMarker));
            } else {
                Toast.makeText(this, "Введите число !", Toast.LENGTH_SHORT).show();
            }


        }


    }
}


