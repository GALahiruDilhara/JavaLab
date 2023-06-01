public class TestInheritance {
    
    public static void main(String[] args) {
        
        SuperB b = new SuperB();
        b.setit(2);
        b.increase();
        b.triple();
        System.out.println(b.returnit());

        SubC c = new SubC();
        c.setit(2);
        c.increase();
        c.triple();
        System.out.println(c.returnit());
    }
}
