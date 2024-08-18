package Assignment_2;

public class StaticVariable {
    //Static variable
    private static int count = 0;

    //Static method
    public static void printCount(){
        System.out.println(count);
   }
    //NonStatic variable
    private  int count2 = 0;

    //NonStatic method
    public static void printCount2(){
        StaticVariable staticVariable = new StaticVariable();
        System.out.println(staticVariable.count2);
    }



    //Static method
    public static int add(int a,int b){
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    //nonstatic method
    public  int add2(int a,int b){
        return a+b;
    }
    public  int multiply2(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {

        System.out.println("====NonStatic Method Calling without creat instance in the class");
        int result = StaticVariable.add(1,2);
        System.out.println(result);
        int result2 = StaticVariable.multiply(2,3);
        System.out.println(result2);
        System.out.println("====NonStatic Method Calling with creat instance in the class");
        StaticVariable staticVariable = new StaticVariable();

        int result3 = staticVariable.add2(1,2);
        System.out.println(result3);

        int result4 = staticVariable.multiply2(5,10);
        System.out.println(result4);


    }





}
