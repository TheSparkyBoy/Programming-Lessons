public class helper {
    private int val1;
    private int val2;

    public helper(){

    }

    public helper(int val1, int val2){
        this.val1 = val1;
        this.val1 = val2;
    }

    private void squareValues(){
        val1 = val1*val1;
        val2 = val2*val2;
    }
    
    public int getValues(){
        return val1+val2;
    }
}
