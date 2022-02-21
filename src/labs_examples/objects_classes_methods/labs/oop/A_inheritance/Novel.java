package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class Novel extends Book {
    private String subTitle;

    public Novel (int pageCount, int chapterCount, String title, String subTitle){
        super(pageCount, chapterCount, title);
        this.subTitle = subTitle;
    }

    @Override
    public String toString() {
        return "The title is " + title + ": " + subTitle + "it has " + pageCount +
                " many pages, and it has " + chapterCount + " many chapters.";
    }
}
