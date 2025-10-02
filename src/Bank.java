import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name, ArrayList<Customer> customers){
        this.name = name;
        this.customers = customers;
    }

    public boolean findCustomer(Customer customer){
        for(Customer i : customers){
            if(i.equals(customer)){
                return true;
            }
        }
        return false;
    }

    public void addCustomer(Customer customer){
        boolean exist = findCustomer(customer);

        if(!exist){
            customers.add(customer);
        }else{
            System.out.println("Can't add customer, it already exists");
        }
    }

    public void addCustomerTransaction(Customer customer, Double amount){

        boolean exists = findCustomer(customer);

        if(exists && amount > 0){
            customer.addCredit(amount);
        } else if (exists && amount < 0) {
            customer.addDebit(amount);
        }else{
            System.out.println("Customer does not exist!");
        }
    }

    public void printStatement(Customer customer){
        boolean exists = findCustomer(customer);

        if(exists){
            System.out.println(customer.toString());
        }else{
            System.out.println("Customer does not exist!!");
        }

    }

}
