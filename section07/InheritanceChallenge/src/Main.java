public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("tim","12/10/1999","1/1/2020");
        System.out.println(tim);
        System.out.println("age=" + tim.getAge());
        System.out.println("pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe","11/12/1970",
                "11/11/2020",200000);
        System.out.println(joe);
        System.out.println("joes paycheck = " + joe.collectPay());
        joe.retire();
        System.out.println("joes pension check = " + joe.collectPay());
    }
}