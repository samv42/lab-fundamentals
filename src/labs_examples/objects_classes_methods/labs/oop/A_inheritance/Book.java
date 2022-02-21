package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Book {
        public int pageCount;
        public int chapterCount;
        public String title;
        public Book(){}
        public Book (int pageCount, int chapterCount, String title){
            this.pageCount = pageCount;
            this.chapterCount = chapterCount;
            this.title = title;
        }
    public int getPageCount(){
        return pageCount;
    }

    public int getChapterCount(){
        return chapterCount;
    }

    public String getTitle(){
        return title;
    }
        @Override
        public String toString() {
            return "The title is " + title + ", it has " + pageCount + " many pages, and it has " + chapterCount + " many chapters.";
        }
}
