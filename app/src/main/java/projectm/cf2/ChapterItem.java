package projectm.cf2;

public class ChapterItem {
    private String mName;
    private String mTitle;

    public ChapterItem( String _name, String _title) {
        mName = _name;
        mTitle = _title;
    }

    public String getName() {
        return mName;
    }

    public String getTitle() {
        return mTitle;
    }
}
