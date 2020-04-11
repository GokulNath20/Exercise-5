import java.util.Scanner;
class Employee{

    String employeeID;
    double grossPay,stateTax,fedTax;

    public void input(){

        Scanner gk = new Scanner(System.in);

        System.out.printf("%-35s%s","Enter your employee ID number",": ","%n");
        employeeID = gk.next()+gk.nextLine();
        System.out.printf("%-35s%s","Enter your Gross Pay",": RM ","%n");
        grossPay = gk.nextDouble();
        System.out.printf("%-35s%s","Enter your State Tax",": RM ","%n");
        stateTax = gk.nextDouble();
        System.out.printf("%-35s%s","Enter your Federal Tax",": RM ");
        fedTax = gk.nextDouble();
    }
}
