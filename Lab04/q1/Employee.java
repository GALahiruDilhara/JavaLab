public class Employee{
    private int empID;
    private String empName;
    private String empDesignation;

    public int getID(){
        return this.empID;
    }

    public String getName(){
        return this.empName;
    }

    public String getDesignation(){
        return this.empDesignation;
    }

    public void setID(int id){
        this.empID = id;
    }
    public void setName(String name){
        this.empName = name;
    }
    public void setDesignation(String designation){
        this.empDesignation = designation;
    }
}