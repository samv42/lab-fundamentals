package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Staff {
    int years;
    String jobTitle;
    String accessLevel;
    String name;

    public Staff(String name, int years, String jobTitle, String accessLevel){
        this.name = name;
        this.years = years;
        this.jobTitle = jobTitle;
        this.accessLevel = accessLevel;
    }
    public Staff(){
    }
    public int getYears(){
        return years;
    }
    public void setYears(int years){
        this.years = years;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getAccessLevel(){
        return accessLevel;
    }
    public void setAccessLevel(String accessLevel){
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "This worker's name is " + name + ", they have worked for " + years + " years, they're job title is " + jobTitle + ", and their acccess level is " + accessLevel;
    }
}
