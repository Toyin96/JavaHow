package myDiary;

public class Diary {

    private Entry[] entries;
    private int entryCounter = 0;

    public Diary(int numberOfDiaryEntries) {
        entries = new Entry[numberOfDiaryEntries];
    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry entry) {
        if (entryCounter < entries.length) {
            entries[entryCounter] = entry;
            entryCounter++;
        }
    }
}
