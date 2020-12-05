import java.util.HashMap;

public class UsingHashMap {
    public static void main(String args[]){
        HashMap<String, Integer> student = new HashMap<String, Integer>();
        student.put("Anna", 23);
        student.put("Mathew", 28);
        System.out.println(student);
        System.out.println(student.size());
        student.put("Thomas",72);
        System.out.println(student.get("Mathew")); 

    }
}
