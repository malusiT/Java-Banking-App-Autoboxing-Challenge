import java.util.ArrayList;
import java.util.Objects;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, ArrayList<Double> transactions){
        this.name = name;
        this.transactions = transactions;
    }

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    public void addCredit(Double credit){

        if(credit <= 0){
            throw new IllegalArgumentException("Credit should be a positive double");
        }
        transactions.add(credit);
    }

    public void addDebit(Double debit){
        if(debit >= 0){
            throw new IllegalArgumentException("Debit should be a negative double");
        }
        transactions.add(debit);
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(transactions, customer.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transactions);
    }
}
