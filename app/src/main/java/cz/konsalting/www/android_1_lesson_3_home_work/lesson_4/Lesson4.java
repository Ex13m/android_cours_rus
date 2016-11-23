package cz.konsalting.www.android_1_lesson_3_home_work.lesson_4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cz.konsalting.www.android_1_lesson_3_home_work.R;
import cz.konsalting.www.android_1_lesson_3_home_work.lesson_3.Lesson3HomeWork;

public class Lesson4 extends AppCompatActivity implements View.OnClickListener{

    private TextView testTextBtnClick;
    private Button btnTheory;
    private Button btnWebinar;
    private Button btnCodLesson3;
    private Button btnCodLesson3onGitHub;
    private Button btnHomeWorkAppStart;
    private Button btnHomeWorkOnGitHub;
    private Button btnTestQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);
        testTextBtnClick = (TextView) findViewById(R.id.testTextBtnClick);
        btnTheory = (Button) findViewById(R.id.btnTheory);
        btnWebinar = (Button) findViewById(R.id.btnWebinar);
        btnCodLesson3 = (Button) findViewById(R.id.btnCodLesson3);
        btnCodLesson3onGitHub = (Button) findViewById(R.id.btnCodLesson3onGitHub);
        btnHomeWorkAppStart = (Button) findViewById(R.id.btnHomeWorkAppStart);
        btnHomeWorkOnGitHub = (Button) findViewById(R.id.btnHomeWorkOnGitHub);
        btnTestQuestions = (Button) findViewById(R.id.btnTestQuestions);

        btnTheory.setOnClickListener(this);
        btnWebinar.setOnClickListener(this);
        btnCodLesson3.setOnClickListener(this);
        btnCodLesson3onGitHub.setOnClickListener(this);
        btnHomeWorkAppStart.setOnClickListener(this);
        btnHomeWorkOnGitHub.setOnClickListener(this);
        btnTestQuestions.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //читать теорию
            case R.id.btnTheory:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.alexanderklimov.ru/android/theory/resources.php"));
                startActivity(intent1);
                //Ссылка на презентацию https://d1ywbwqv5var5z.cloudfront.net/attachments/doc/000/152/314152314.pptx?1479324280
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(newVideoPath));
//                intent.setDataAndType(Uri.parse(newVideoPath), "video/mp4");
//                startActivity(intent);
                break;
            //смотреть вебинар
            case R.id.btnWebinar:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NIYY1ARrW7s&t=2s"));
                startActivity(intent2);
                break;
            //Скачать код на телефон
            case R.id.btnCodLesson3:
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/legioner010/Intent/archive/master.zip"));
                startActivity(intent3);
                break;
            //Смотреть код урока н гитхабе
            case R.id.btnCodLesson3onGitHub:
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/legioner010/Intent"));
                startActivity(intent4);
                break;
            //запуск приложения - домашняя работа
            case R.id.btnHomeWorkAppStart:
                Intent intent5 = new Intent(this, Calculator.class);
                startActivity(intent5);
                break;
            //смотреть код ДЗ на гитхаб
            case R.id.btnHomeWorkOnGitHub:
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/legioner010/Intent"));
                startActivity(intent6);
                break;
            case R.id.btnTestQuestions:
                testTextBtnClick.setText(R.string.btnTestQuestions);
                break;

        }
    }
}
