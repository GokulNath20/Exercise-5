public class Payroll {

    private double grossPay, stateTax, fedTax, netPay;

    public Payroll(double grossPay,double stateTax,double federalTax){
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.fedTax = federalTax;
    }

    public double calculateNetPay(){
        return netPay = grossPay - stateTax - fedTax;
    }

    public void printOutput(){
        System.out.printf("Net pay: RM %.2f", calculateNetPay());
    }
}
