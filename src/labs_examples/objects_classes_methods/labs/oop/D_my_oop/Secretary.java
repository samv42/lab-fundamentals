package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Secretary extends Staff{
    int pay;
    String office;
    public Secretary(String name, int years, String jobTitle, String accessLevel, int pay, String office){
        super(name, years, jobTitle, accessLevel);
        this.pay = pay;
        this.office = office;
    }
    public Secretary(String name, int years, String jobTitle, String accessLevel, String office){
     super(name, years, jobTitle, accessLevel);
     pay = 15;
     this.office = office;
    }
    public int getPay(){
        return pay;
    }
    public void setPay(int pay){
        this.pay = pay;
    }
    public String getOffice(){
        return office;
    }
    public void setOffice(String office){
        this.office = office;
    }
    public void giveRaise(int raise){
        pay = pay + raise;
    }
    @Override
    public String toString() {
        return "This worker's name is " + name + ", they have worked for " + years + " years, they're job title is " + jobTitle + ", their acccess level is " + accessLevel +
               ", their pay is $" + pay + " per hour, and they work at the " + office;
    }
}
