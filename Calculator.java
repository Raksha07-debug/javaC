import java.util.Scanner;
class Calculator {
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("welcome to calculator");

char operator = scanner.next().charAt(0);
double num1 = scanner.nextDouble();
double num2  = scanner.nextDouble();
double result;

switch(operator){
case'+':
result=num1+num2;
break;

case'-':
result=num1-num2;
break;


case '*':
result=num1*num2;

}



}