package Assignment_2;

public class InstanceVariable {
    // Declaring instance variables
    private String name;
    private int age;

    // Constructor to initialize instance variables
    public InstanceVariable(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to display the values of instance variables
    public void displayValue(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
    // Method to change the value of an instance variable
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        // Creating an instance of the InstanceVariable class
        InstanceVariable instanceVariable = new InstanceVariable("Nusaiba", 3);
        InstanceVariable instanceVariable1 = new InstanceVariable("nazmun", 1);

        // Displaying information for each InstanceVariable
        instanceVariable.displayValue();
        instanceVariable1.displayValue();

        // Changing and displaying updated information for instanceVariable
        instanceVariable.setName("Nusaiba");
        instanceVariable.setAge(4);
        instanceVariable.displayValue();
    }

}
