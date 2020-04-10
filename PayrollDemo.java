public class PayrollDemo {
    public static void main(String[] args){


        Employee bossku = new Employee();
        bossku.input();

        Payroll dude = new Payroll(bossku.grossPay,bossku.stateTax,bossku.fedTax);
        dude.printOutput();
    }
}
