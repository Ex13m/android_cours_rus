package cz.konsalting.www.android_1_lesson_3_home_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lesson3 extends AppCompatActivity implements View.OnClickListener{


    TextView testTextBtnClick;
    Button btnTheory;
    Button btnWebinar;
    Button btnCodLesson3;
    Button btnCodLesson3onGitHub;
    Button btnHomeWorkAppStart;
    Button btnHomeWorkOnGitHub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);

        testTextBtnClick = (TextView) findViewById(R.id.testTextBtnClick);
        btnTheory = (Button)findViewById(R.id.btnTheory);
        btnWebinar = (Button)findViewById(R.id.btnWebinar);
        btnCodLesson3 = (Button)findViewById(R.id.btnCodLesson3);
        btnCodLesson3onGitHub = (Button)findViewById(R.id.btnCodLesson3onGitHub);
        btnHomeWorkAppStart = (Button)findViewById(R.id.btnHomeWorkAppStart);
        btnHomeWorkOnGitHub = (Button)findViewById(R.id.btnHomeWorkOnGitHub);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTheory:
                //Переход на активити Lesson1
                //Тест активности кнопки
                //Ссылка на презентацию https://d1ywbwqv5var5z.cloudfront.net/attachments/doc/000/152/314152314.pptx?1479324280
                testTextBtnClick.setText(R.string.btnTheory);break;
            case R.id.btnWebinar:
                //Переход на активити Lesson1
                //Тест активности кнопки
                //ссылка на вебинар https://pcprogschool.cdnvideo.ru/progschool/records/000/004/190/02d2843cab8783cdf19ee3d74f5fe6d37a796dc0.mp4?1479324657
                testTextBtnClick.setText(R.string.btnWebinar);break;
            case R.id.btnCodLesson3:
                //Переход на активити Lesson1
                //Тест активности кнопки
                //Ссылка для скачивания кода https://d1ywbwqv5var5z.cloudfront.net/attachments/doc/000/152/316152316.zip?1479324342
                testTextBtnClick.setText(R.string.btnCodLesson3);break;
            case R.id.btnCodLesson3onGitHub:
                //Переход на активити Lesson1
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnCodLesson3onGitHub);break;
            case R.id.btnHomeWorkAppStart:
                //Переход на активити Lesson1
                //Тест активности кнопки
                Intent intent = new Intent(this, Lesson3HomeWork.class);
                startActivity(intent);
                testTextBtnClick.setText(R.string.btnHomeWorkAppStart);break;
            case R.id.btnHomeWorkOnGitHub:
                //Переход на активити Lesson1
                //Тест активности кнопки
                testTextBtnClick.setText(R.string.btnHomeWorkOnGitHub);break;

        }
    }

}
