package com.unrc.app;
import com.unrc.app.models.Owner;
import java.util.List;

/**
 * Class crudOwner
 */
public class crudOwner {
	
	/** Pre: city.exist() = true **/
	/** Pos: Created owner **/
	public void create(String first_name, String last_name, String city_id, String neighborhood, String street, String n_street, String email){
		Owner o = new Owner();
       	o.set("first_name", first_name);
       	o.set("last_name",last_name);
       	o.set("city_id", city_id);
       	o.set("neighborhood", neighborhood);
       	o.set("street", street);
       	o.set("n_street", n_street);
       	o.set("email", email);
       	o.saveIt();
	}//end create
        
   	public void delete(String id){   
   		Owner o = Owner.findFirst("id = ?", id);
       	o.deleteCascade();
   	}//end delete
        
   	public void update(String id, String first_name, String new_name){
   		//Updating a single record
        List<Owner> list = Owner.find("id = id");
        Owner o = list.get(0);
        o.set(first_name, new_name).saveIt();
    }//end update
}
