package cz.konsalting.www.android_1_lesson_3_home_work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     TextView testTextBtnClick;
     Button btnTextLesson1 ;
     Button btnTextLesson2 ;
     Button btnTextLesson3 ;
     Button btnTextLesson4 ;
     Button btnTextLesson5 ;
     Button btnTextLesson6 ;
     Button btnTextLesson7 ;
     Button btnTextLesson8 ;

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
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTextLesson1:
                //Переход на активити Lesson1
                //Тест активности кнопки
                testTextBtnClick.setText(getString(R.string.btnTextLesson1));
            case R.id.btnTextLesson2:
                //Переход на активити Lesson2
                //Тест активности кнопки
                testTextBtnClick.setText(getString(R.string.btnTextLesson2));
            case R.id.btnTextLesson3:
                //Переход на активити Lesson3
                //Тест активности кнопки
                testTextBtnClick.setText(getString(R.string.btnTextLesson3));
            case R.id.btnTextLesson4:
                //Переход на активити Lesson4
                //Тест активности кнопки
                testTextBtnClick.setText(getString(R.string.btnTextLesson4));break;
            case R.id.btnTextLesson5:
                //Переход на активити Lesson5
                //Тест активности кнопки
                testTextBtnClick.setText(getString(R.string.btnTextLesson5));break;
            case R.id.btnTextLesson6:
                //Переход на активити Lesson6
                //Тест активности кнопки
                testTextBtnClick.setText(getString(R.string.btnTextLesson6));break;
            case R.id.btnTextLesson7:
                //Переход на активити Lesson7
                //Тест активности кнопки
                testTextBtnClick.setText(getString(R.string.btnTextLesson7));break;
            case R.id.btnTextLesson8:
                //Переход на активити Lesson8
                //Тест активности кнопки
                testTextBtnClick.setText(getString(R.string.btnTextLesson8));break;

        }

    }
}
