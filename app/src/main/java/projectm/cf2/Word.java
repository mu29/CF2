package projectm.cf2;

public class Word {
    private int mChapter;
    private String mWord;
    private String mPronunciation;
    private String mMean;

    public Word(int _chapter, String _word, String _pronunciation, String _mean) {
        mChapter = _chapter;
        mWord = _word;
        mPronunciation = _pronunciation;
        mMean = _mean;
    }

    public int getChapter() {
        return mChapter;
    }

    public String getWord() {
        return mWord;
    }

    public String getPronunciation() {
        return mPronunciation;
    }

    public String getMean() {
        return mMean;
    }
}
