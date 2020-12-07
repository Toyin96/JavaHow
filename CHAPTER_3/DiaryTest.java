package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDiaryEntryIsSet(){

        //given
        Diary myDiary = new Diary(15);

        //when
       int numberOfDiaryEntries = myDiary.getNumberOfDiaryEntries();


        //assert
        assertEquals(numberOfDiaryEntries, myDiary.getNumberOfDiaryEntries());
    }

    @Test
    void testDiaryEntryIsNotNull(){

        //given
        Diary myDiary;

        //when
        myDiary = new Diary(10);


        //assert
        Entry[] entries = myDiary.getEntries();
        assertNotNull(entries);
    }

    @Test
    void testDiaryEntryCanBeEntered(){
        //given
        Diary myBreakUpDiary = new Diary(5);
        Entry entry = new Entry("My Break Up Story");
        entry.setEntryBody("It just happened");

        //when
        myBreakUpDiary.addNewEntry(entry);

        //assert
        assertEquals(entry,myBreakUpDiary.getEntries()[0]);
//        Entry[] assertionEntry = new Entry[5];
//        assertionEntry[0] = entry;
//        assertArrayEquals(assertionEntry, myBreakUpDiary.getEntries());


        //given
        Entry newEntry = new Entry("yguji");

        //when
        myBreakUpDiary.addNewEntry(newEntry);

        //assert
        assertEquals(newEntry, myBreakUpDiary.getEntries()[1]);

    }
}