
import java.util.*;
public class Main {
	   private static Scanner scanner = new Scanner(System.in);
	    private static Bank bank = new Bank("State Bank Of india");

	    public static void main(String[] args) {
	        printActions();
	        while(true){
	            System.out.println("Enter action: (5 to show available actions)");
	            int action = scanner.nextInt();
	            scanner.nextLine();
	            switch(action){
	                case 1: addBranch();
	                        break;
	                case 2: addCustomerToBranch();
	                        break;
	                case 3:addCustomerTransaction();
	                        break;
	                case 4: listOfcustomers();
	                        break;
	                case 5: printActions();
	                        break;
	                case 6: System.exit(0);
	                        break;
	                default:
	                    System.out.println("Please enter a valid action");
	            }
	        }
	    }

	    private static void printActions() {
	        System.out.println("\nPress\n\t1. Add branch\n\t2. Add customer to a branch\n\t3. Add customer transactions\n\t" +
	                "4. print list of customers of a branch \n\t5. Available actions\n\t6. Stop");
	    }
	    private static void addBranch(){
	        System.out.println("Enter branch name: ");
	        String branch = scanner.nextLine();
	        if(bank.addBranch(branch)){
	            System.out.println(branch +" branch added ");
	            return;
	        }
	        System.out.println(branch + " branch already exists");
	    }
	    private static void addCustomerToBranch(){
	        System.out.println("Enter branch name: ");
	        String branch=scanner.nextLine();        System.out.println("Enter customer name: ");
	        String customaerName=scanner.nextLine();
	        System.out.println("Enter amount");
	        double amount=scanner.nextDouble();
	        bank.addCustomer(branch,customaerName,amount);
	           System.out.println("Customer "+customaerName +" added in branch " +branch);
	    }
	    private static void addCustomerTransaction(){
	        System.out.println("Enter branch name: ");
	        String branch=scanner.nextLine();
	        System.out.println("Enter customer name: ");
	        String customaerName=scanner.nextLine();
	        System.out.println("Enter initial amount");
	        double amount=scanner.nextDouble();
	        if(bank.addCustomerTransaction(branch,customaerName,amount)){
	            System.out.println("Transaction added to branch "+branch);
	            return;
	        }
	        System.out.println(branch+"branch not found");
	    }
	    private static void listOfcustomers(){
	        System.out.println("Enter branch name: ");
	        String branchName=scanner.nextLine();
	        System.out.println("Would you like see transactions(Y or N): ");
	        String choice=scanner.nextLine();
	        boolean show=false;
	        if(choice.equals("Y")){
	            show=true;
	        }
	        else if(choice.equals("N")){
	            show=false;
	        }
	        if(!bank.listCustomers(branchName,show)){
	            System.out.println("Branch not found");
	        }
	    }
}
