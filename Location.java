import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Location {
	
	public String name;
	public String description;
	private Vector locationExit;
	List<Item> items = new ArrayList<Item>();
	
	
	public void Location(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public void addDescription(String Ndescription){
		description = Ndescription;
	}
	
	public void setDescription(String Ndescription){
		description = Ndescription;
	}
	
	public void setName(String Nname){
		name = Nname;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public void addExit(Exit exit){
		locationExit.addElement(exit);
	}
	
	public Vector getExit(){
		return (Vector) locationExit.clone();
	}
	
	public void removeItem(Item item){
		for(int i = 0;i <= items.size(); i++){
			if(item.equals(items.get(i))){
				items.remove(i);
			}
		}
	}

}
