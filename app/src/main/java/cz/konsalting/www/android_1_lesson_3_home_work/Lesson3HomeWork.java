package cz.konsalting.www.android_1_lesson_3_home_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lesson3HomeWork extends AppCompatActivity implements View.OnClickListener{


    private EditText editText;
    private Button btnSendText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_home_work);
        editText = (EditText) findViewById(R.id.editText);
        btnSendText=(Button) findViewById(R.id.btnSendText);
        btnSendText.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnSendText:
                //Переход на активити Lesson1
                //Тест активности кнопки
                //testTextBtnClick.setText(R.string.btnTextLesson1);break;
                String messageText= editText.getText().toString();
                Intent intent = new Intent (this,Lesson3HomeWorkSecondScreen.class);
                intent.putExtra(Lesson3HomeWorkSecondScreen.EXTRA_MESSAGE,messageText);
                startActivity(intent);break;


        }
    }
}
