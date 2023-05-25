public class item{

    private int location;
    private String description;

    public item(int location,String description){
        this.location = location;
        this.description = description;
    }

    public int getLocation(){
        return this.location;
    }

    public String getDescription(){
        return this.description;
    }
    public void setLocation(int location){
        this.location = location;
    }
    public void setDescription(String description){
        this.description = description;
    }
    
}