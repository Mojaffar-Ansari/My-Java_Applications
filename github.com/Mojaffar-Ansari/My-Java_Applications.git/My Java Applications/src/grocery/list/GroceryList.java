package grocery.list;
import java.util.*;
public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    public void modifygroceryItem(int position,String newItem){
        groceryList.set(position-1,newItem);
        System.out.println("Grocery item "+position+" has been modified.");
    }
    public void removeGroceryItem(int position){
        if(groceryList.isEmpty()) {
            System.out.println("Grocery list is empty...");
            return;
        }
        String item=groceryList.get(position-1);
        groceryList.remove(position-1);
    }
    public String findItem(String searchitem){
        //boolean exists = groceryList.contains(searchitem);
        int position=groceryList.indexOf(searchitem);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }

}
