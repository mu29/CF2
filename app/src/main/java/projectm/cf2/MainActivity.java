package projectm.cf2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    private Button buttonWord;
    private Button buttonSentence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWord = (Button) findViewById(R.id.main_button_word);
        buttonSentence = (Button) findViewById(R.id.main_button_sentence);
        buttonWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChapterActivity.class);
                startActivity(intent);
            }
        });
        buttonSentence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChapterActivity.class);
                startActivity(intent);
            }
        });
    }
}
