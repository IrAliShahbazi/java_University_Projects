import java.util.Scanner;
/*
    create by Ali Shahbazi
    date: 2023/5/10
 */
public class math_function {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter operator {+,-,*,/,%} :");
        String op = s.nextLine();
        System.out.print("enter number 1 :");
        int n1 = s.nextInt();
        System.out.print("enter number 2 :");
        int n2 = s.nextInt();
        System.out.println("-----------------");
        System.out.println(math1(n1,n2,op));

    }
    private static int math1(int num1,int num2,String op){
        /*
            num1 == number1
            num2 == number2
            op = operator {+,-,*,/,%}
        */
        int res = 0;
        switch (op){
            case "+":
                res = num1+num2;
                break;
            case "-":
                res = num1-num2;
                break;
            case "/":
                res = num1/num2;
                break;
            case "%":
                res = num1%num2;
                break;
            case "*":
                res = num1*num2;
                break;
        }
        return res;
    }
}
