package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class Biography extends Book {
    private String subject;

    public Biography(int pageCount, int chapterCount, String title, String subject) {
        super(pageCount, chapterCount, title);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    @Override
    public String toString() {
        return "The title is " + title + " and is about " + subject +
                ", it has " + pageCount + " many pages, and it has " + chapterCount + " many chapters.";
    }
}

