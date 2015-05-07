package projectm.cf2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ChapterItemAdapter extends BaseAdapter {
    private Context mContext = null;
    private ArrayList<ChapterItem> mChapterItem = new ArrayList<ChapterItem>();

    public ChapterItemAdapter(Context mContext) {
        super();
        this.mContext = mContext;
    }
    
    public void addItem(String _title, String _date){
        ChapterItem addInfo = new ChapterItem(_title, _date);
        mChapterItem.add(addInfo);
    }
    
    @Override
    public int getCount() {
        return mChapterItem.size();
    }

    @Override
    public Object getItem(int position) {
        return mChapterItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();

            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.chapter_item, null);

            holder.mName = (TextView) convertView.findViewById(R.id.chapter_item_name);
            holder.mTitle = (TextView) convertView.findViewById(R.id.chapter_item_title);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ChapterItem mData = mChapterItem.get(position);

        holder.mName.setText(mData.getName());
        holder.mTitle.setText(mData.getTitle());

        return convertView;
    }

    private class ViewHolder {
        public TextView mName;
        public TextView mTitle;
    }
}
