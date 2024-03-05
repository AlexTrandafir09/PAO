package lab1.task4;
import java.lang.String;
import java.util.Scanner;

public class DummyCalculator {

    public void calculator(){
        String operator1;
        String operand;
        String operator2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter operator 1: ");
        operator1= scanner.nextLine();
        System.out.println("Enter operand: ");
        operand=scanner.nextLine();
        System.out.println("Enter operator 2: ");
        operator2=scanner.nextLine();
        System.out.println(calculate(operator1,operand,operator2));

    }

    public String calculate(String operator1,String operand,String operator2) {
        if (isBoolean(operator1, operator2)) {
            boolean op1 = Boolean.parseBoolean(operator1);
            boolean op2 = Boolean.parseBoolean(operator2);
            if (operand.equals("&"))
                return String.valueOf(op1 && op2);
            else if (operand.equals("|"))
                return String.valueOf(op1 || op2);
            else return "Operand invalid;";
        }
        else if(isDouble(operator1,operator2)){
            double op1=Double.parseDouble(operator1);
            double op2=Double.parseDouble(operator2);
            switch (operand) {
                case "+":
                    return String.valueOf(op1 + op2);
                case "-":
                    return String.valueOf(op1 - op2);
                case "*":
                    return String.valueOf(op1 * op2);
                case "/":
                    return String.valueOf(op1 / op2);
                default:
                    return "Operand invalid";
            }
        }
        else {
            int op1= Integer.parseInt(operator1);
            int op2= Integer.parseInt(operator2);
            switch (operand) {
                case "+":
                    return String.valueOf(op1 + op2);
                case "-":
                    return String.valueOf(op1 - op2);
                case "*":
                    return String.valueOf(op1 * op2);
                case "/":
                    return String.valueOf((double)op1 / (double) op2);
                default:
                    return "Operand invalid";
            }
        }
    }

    public boolean isBoolean(String operator1,String operator2){
        return (operator1.equals("true") && operator2.equals("true"))
                || (operator1.equals("true") && operator2.equals("false"))
                ||(operator1.equals("false") && operator2.equals("true"))
                ||(operator1.equals("false") && operator2.equals("false"));
    }

    public boolean isDouble(String operator1,String operator2){
        return operator1.contains(".") || operator2.contains(".");
    }
}
