package grocery.list;
import java.util.*;
public class Main {
	private static Scanner s=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();
    public static void main(String[] args){
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice){
                case 0: printInstructions();
                        break;
                case 1: groceryList.printGroceryList();
                        break;
                case 2: addItem();
                        break;
                case 3: modifyItem();
                        break;
                case 4: removeItem();
                        break;
                case 5: searchForItem();
                       break;
                case 6: quit=true;
                        break;
            }
        }
    }
    public static  void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice option");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search an item in the list");
        System.out.println("\t 6 - To quit the application");
    }
    public static void addItem(){
        System.out.println("Enter the grocery item: ");
        groceryList.addGroceryItem(s.nextLine());
    }
    public static  void modifyItem(){
        System.out.println("Enter the item number: ");
        int itemNo = s.nextInt();
        s.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem  = s.nextLine();
        groceryList.modifygroceryItem(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item number: ");
        int itemNo = s.nextInt();
        s.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem(){
        System.out.println("Enter item to search: ");
        String searchItem = s.nextLine();
        if(groceryList.findItem(searchItem)!=null)
            System.out.println("Found "+searchItem+" in our grocery list");
        else
            System.out.println(searchItem+" is not in the shopping list");
    }
}
		