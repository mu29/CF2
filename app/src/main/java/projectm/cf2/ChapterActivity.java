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

        listChapter = (ListView) findViewById(R.id.chapter_list);
        listChapter.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_chapter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
