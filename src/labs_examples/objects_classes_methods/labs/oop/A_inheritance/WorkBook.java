package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class WorkBook extends TextBook {
    public int questionsPerChapter;

    public WorkBook (int pageCount, int chapterCount,String title, String timePeriod, int questionsPerChapter){
        super(pageCount, chapterCount, title, timePeriod);
        this.questionsPerChapter = questionsPerChapter;
    }

    public int getQuestionsPerChapter(){
        return questionsPerChapter;
    }

    @Override
    public String toString() {
        return "The title is " + title + "and covers " + timePeriod + ". It has " + pageCount +
                " many pages, and it has " + chapterCount + " many chapters, each with " + questionsPerChapter + " many questions.";
    }
}
