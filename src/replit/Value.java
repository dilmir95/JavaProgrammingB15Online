package replit;

public class Value {
    int x;
    int y ;
    public static int count1 =0;
    public static int count=0;

    public Value(int x){
        this.x = x;
        ++count1;
    }
    public Value(){

    }
    public void setVal(int y){
        this.x = y;
        ++count;
        this.y = y;
    }
    public boolean wasModified(){
        if(count>0){
            return true;
        }
        return false;
    }
    public int getVal(){
        if(count>0){
            return y;
        }else if(count1>0){
            return x;
        }
        return 0;
    }
}
