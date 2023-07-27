public class payerType2 extends Movements {

    boolean coruched = false;

    public boolean getCourched(){
        return this.coruched;
    }

    public void setCourched(boolean coruched){
        this.coruched = coruched;
    }

    private void move(String direction){
        if(this.coruched){
            System.out.println("Move "+direction+" by 2 spaces");
        }
        else{
            System.out.println("Move "+direction+" by 5 spaces");
        }
    }

    @Override
    public void moveUp() {
        this.move("up");
    }

    @Override
    public void moveDown() {
        this.move("down");
    }

    @Override
    public void moveLeft() {
        this.move("left");
    }

    @Override
    public void moveRight() {
        this.move("right");
    }
    
}
