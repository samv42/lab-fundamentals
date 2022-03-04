package labs_examples.enumerations.labs;

enum enum2 {
    The_Hobbit(162),
    The_Fellowship_Of_The_Ring(230),
    The_Two_Towers(324),
    Return_Of_The_King(356);

    private int pages;

    enum2(int pages){
        this.pages = pages;
    }
    public int getPageCount(){
        return pages;
    }
}
