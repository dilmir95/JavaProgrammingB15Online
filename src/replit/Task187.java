package replit;
import java.util.*;
public class Task187 {

    public static void main(String[] args) {


        System.out.print(
                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
        );
        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );
        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
        );
        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );
    }

    public static String lameDb(String db, String op,String id,String data)
    {
        String result = "";

        String[] dbSplitted = db.split("#");
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(dbSplitted));
        if(op.equals("add")){
            result= db+"#"+id+data;
        }else if(op.equals("edit")){
            int x = Integer.valueOf(id);
            list1.set(x , (id+data));
            for (int i = 0; i <list1.size() ; i++) {
                if(i!= list1.size()-1){
                    result+=list1.get(i)+"#";
                }else{
                    result+=list1.get(i);
                }
            }
        } else if(op.equals("delete")){
            list1.remove(Integer.valueOf(id)-1);
            for (int i = 0; i <list1.size() ; i++) {
                if(i!= list1.size()-1){
                    result+=list1.get(i)+"#";
                }else{
                    result+=list1.get(i);
                }
            }
        }else if(op.equals("none")){
            result= db;
        }

        return result;

    }//end lameDb
}
