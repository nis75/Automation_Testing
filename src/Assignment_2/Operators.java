package Assignment_2;

public class Operators {


    public static void main(String[] args) {
        System.out.println("Unary Operator: expr++ expr-- ++expr --expr");
        int number=100;
        number=number+10;
        number=number-5;
        System.out.println(number++);
        System.out.println(number);
        System.out.println(--number);
        System.out.println(number);
        System.out.println(number--);
        System.out.println(++number);
        System.out.println(number);
        System.out.println("Arithmetic Operator: * / % + -");
        int mark1=66, mark2=99, mark3;
        mark3=mark2-mark1;
        System.out.println(mark3);//33

        mark3=mark2+mark3;
        System.out.println(mark3);//132

        mark3=mark2/mark1;
        System.out.println(mark3);//1

        mark3=mark2*mark3;
        System.out.println(mark3);//99

        mark3=mark2%mark1;
        System.out.println(mark3);//33
        System.out.println("Relational Operator: < > <= >= instanceof == !=");
        int number1=66, number2=99;
        System.out.println(number1 != number2);//T
        System.out.println(number1 == number2);//F
        System.out.println(number1 > number2);//F
        System.out.println(number1 < number2);//T
        System.out.println(number1 >= number2);//F
        System.out.println(number1 <= number2);//T
        System.out.println("Logical Operator: && ||");

        System.out.println((number1 == number2) && (number1 > number2));//F
        System.out.println((number1 == number2) || (number1 < number2));//T

        System.out.println("Ternary Operator and : ? : (int min=(a<b)?a:b; )");
        int num1=66,num2=99,num3;
        num3=(num1>num2)?num1:num2;
        System.out.println(num3);

        System.out.println("Assignment Operator: = += -= *= /= %=");

        int number4=66, number5=99;

        number4 += number5;
        System.out.println(number4);//165

        number5 -= number4;
        System.out.println(number5);//66

        number4 *= number5;
        System.out.println(number4);//6534

        number5 /= number4;
        System.out.println(number5);//1

        number4 %= 7;
        System.out.println(number4);//33
    }
}
