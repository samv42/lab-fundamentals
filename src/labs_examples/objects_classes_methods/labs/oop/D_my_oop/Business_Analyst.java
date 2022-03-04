package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Business_Analyst extends Staff {
    int floor;
    double salary;
    String cubicle;

    public Business_Analyst(String name, int years, String jobTitle, String accessLevel, int floor, double salary, String cubicle){
        super(name, years, jobTitle, accessLevel);
        this.floor = floor;
        this.salary = salary;
        this.cubicle = cubicle;
    }
    public Business_Analyst(String name, int years, String jobTitle, String accessLevel, int floor, String cubicle){
        super(name, years, jobTitle, accessLevel);
        this.floor = floor;
        this.cubicle = cubicle;
        salary = 40000;
    }
    public int getFloor(){
        return floor;
    }
    public void setFloor(int floor){
        this.floor = floor;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getCubicle(){
        return cubicle;
    }
    public void setCubicle(String cubicle){
        this.cubicle = cubicle;
    }
    public void giveRaise(double raise){
        salary = salary + salary*raise;
    }
    @Override
    public String toString() {
        return "This worker's name is " + name + ", they have worked for " + years + " years, they're job title is " + jobTitle + ", their acccess level is " + accessLevel +
                ", their salary is " + salary + ". They work on floor " + floor + " and work at cubicle " + cubicle + ".";
    }
}
