public class Bear {

    private String name;
    private int age;
    private double weight;
    private char gender;

//    constuctor init method - one global one to keep all the class property objects
    public Bear(String name, int age, double weight, char gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

//    getter  method to extract name property
    public String getName(){
        return this.name;
    }

//    Setter - void means not expecting anything back i.e no return
    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){

        return this.age;

    }

    public double getWeight(){
        return this.weight;
    }

    public boolean readyToHibernate(){
        if (weight >= 80){
            return true;
        }
            return false;

    }

    public char getGender(){
        return this.gender;
    }
}
