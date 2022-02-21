package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class TextBook extends Book {
    public String timePeriod;


    public String getTimePeriod(){
        return timePeriod;
    }
    public TextBook(){}
    public TextBook (int pageCount, int chapterCount, String title, String timePeriod){
        super(pageCount, chapterCount, title);
        this.timePeriod = timePeriod;
    }

    @Override
    public String toString() {
        return "The title is " + title + " and covers " + timePeriod + ". It has " + pageCount +
                " many pages, and it has " + chapterCount + " many chapters.";
    }
}
