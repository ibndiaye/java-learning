public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("donald duck",15000,"donal@duck.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer("rufus","ruf@us.co");
        
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer lastCustomer = new Customer();

        System.out.println(lastCustomer.getName());
        System.out.println(lastCustomer.getCreditLimit());
        System.out.println(lastCustomer.getEmail());
    }
}