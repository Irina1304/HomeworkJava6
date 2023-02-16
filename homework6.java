import java.util.HashMap;

public class homework6 {

    public static void main(String[] args) {
        MySet mySet = new MySet();

        mySet.add(1);
        mySet.add(6);
        mySet.add(37);
        mySet.add(6);
        System.out.println(mySet);

        for (int e = 0; e < mySet.size(); e++) {
            System.out.println(mySet.get(e));
            
        }
        
    }
}

class MySet{
    private HashMap<Integer,Object> map = new HashMap<>();
    private final Object OBJ = new Object();

    @Override
    public String toString(){
        return map.keySet().toString();  
    }

    public boolean add(Integer i){
        map.put(i, OBJ);
        return true;
    }
    
    public Integer size() {
        return map.keySet().size();
    }

    public Integer get(Integer a){
        return (Integer) map.keySet().toArray()[a];
    }

}