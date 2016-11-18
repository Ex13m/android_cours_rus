package cz.konsalting.www.android_1_lesson_3_home_work;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     private TextView testTextBtnClick;
     private Button btnTextLesson1 ;
     private Button btnTextLesson2 ;
     private Button btnTextLesson3 ;
     private Button btnTextLesson4 ;
     private Button btnTextLesson5 ;
     private Button btnTextLesson6 ;
     private Button btnTextLesson7 ;
     private Button btnTextLesson8 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testTextBtnClick = (TextView) findViewById(R.id.testTextBtnClick);
        btnTextLesson1 = (Button) findViewById(R.id.btnTextLesson1);
        btnTextLesson2 = (Button) findViewById(R.id.btnTextLesson2);
        btnTextLesson3 = (Button) findViewById(R.id.btnTextLesson3);
        btnTextLesson4 = (Button) findViewById(R.id.btnTextLesson4);
        btnTextLesson5 = (Button) findViewById(R.id.btnTextLesson5);
        btnTextLesson6 = (Button) findViewById(R.id.btnTextLesson6);
        btnTextLesson7 = (Button) findViewById(R.id.btnTextLesson7);
        btnTextLesson8 = (Button) findViewById(R.id.btnTextLesson8);

        btnTextLesson1.setOnClickListener(this);
        btnTextLesson2.setOnClickListener(this);
        btnTextLesson3.setOnClickListener(this);
        btnTextLesson4.setOnClickListener(this);
        btnTextLesson5.setOnClickListener(this);
        btnTextLesson6.setOnClickListener(this);
        btnTextLesson7.setOnClickListener(this);
        btnTextLesson8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTextLesson1:
                //Переход на активити Lesson1
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnTextLesson1);break;
            case R.id.btnTextLesson2:
                //Переход на активити Lesson2
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnTextLesson2);break;
             case R.id.btnTextLesson3:
                //Переход на активити Lesson4
                //Тест активности кнопки
                 Intent intent = new Intent(this, Lesson3.class);
                 startActivity(intent);
                //testTextBtnClick.setText(R.string.btnTextLesson3);break;
            case R.id.btnTextLesson4:
                //Переход на активити Lesson4
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnTextLesson4);break;

            case R.id.btnTextLesson5:
                //Переход на активити Lesson5
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnTextLesson5);break;
            case R.id.btnTextLesson6:
                //Переход на активити Lesson6
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnTextLesson6);break;
            case R.id.btnTextLesson7:
                //Переход на активити Lesson7
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnTextLesson7);break;
            case R.id.btnTextLesson8:
                //Переход на активити Lesson8
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnTextLesson8);break;

        }

    }
}
