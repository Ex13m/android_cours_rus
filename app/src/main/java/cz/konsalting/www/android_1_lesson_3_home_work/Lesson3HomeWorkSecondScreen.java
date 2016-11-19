package cz.konsalting.www.android_1_lesson_3_home_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Lesson3HomeWorkSecondScreen extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_home_work_second_screen);

        Intent intent = getIntent();
        String messageText=intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView=(TextView) findViewById(R.id.ReceiveMsgView);
        messageView.setText(messageText);


    }
}
