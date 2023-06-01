public class test {

    public static void main(String args[]){

        Employee ob1 = new Employee();
        Employee ob2 = new Employee();

        ob1.setID(0);
        ob1.setName("name1");
        ob1.setDesignation("designation 1");

        ob2.setID(1);
        ob2.setName("name2");
        ob2.setDesignation("designation 2");


        System.out.println(ob1.getID());
        System.out.println(ob1.getName());
        System.out.println(ob1.getDesignation());
        System.out.println(ob2.getID());
        System.out.println(ob2.getName());
        System.out.println(ob2.getDesignation());
    }
    
}
