package projectm.cf2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class ChapterActivity extends ActionBarActivity {
    private ListView listChapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);

        ChapterItemAdapter adapter = new ChapterItemAdapter(this);
        adapter.addItem("Chapter 1", "Test1");
        adapter.addItem("Chapter 2", "Test2");
        adapter.addItem("Chapter 3", "Test3");
        adapter.addItem("Chapter 4", "Test4");
        adapter.addItem("Chapter 5", "Test5");
        adapter.addItem("Chapter 6", "Test6");
        adapter.addItem("Chapter 7", "Test7");
        adapter.addItem("Chapter 8", "Test8");
        adapter.addItem("Chapter 9", "Test9");

        listChapter = (ListView) findViewById(R.id.chapter_list);
        listChapter.setAdapter(adapter);
    }
}
