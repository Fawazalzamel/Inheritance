public class App {
    public static void main(String[] args) throws Exception {


        Employee Fawaz = new Employee("Fawaz ", 1850, "IT");
        Director Mohammed = new Director("Mohammed ", " HR ", 2500, 9000);
        SalesPerson Msalam = new SalesPerson("Msalam ", " Sales " , 3900, 120);
        System.out.println(Fawaz);
        System.out.println(Mohammed);
        System.out.println(Msalam);
    }
}
