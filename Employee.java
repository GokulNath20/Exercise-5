import java.util.Scanner;
class Employee{

    int employeeID;
    double grossPay,stateTax,fedTax;

    public void input(){

        Scanner input = new Scanner(System.in);
        System.out.printf("%-35s%s","Enter your employee ID number",": ","%n");
        employeeID = input.nextInt();
        System.out.printf("%-35s%s","Enter your Gross Pay",": RM ","%n");
        grossPay = input.nextDouble();
        System.out.printf("%-35s%s","Enter your State Tax",": RM ","%n");
        stateTax = input.nextDouble();
        System.out.printf("%-35s%s","Enter your Federal Tax",": RM ");
        fedTax = input.nextDouble();
    }
}
