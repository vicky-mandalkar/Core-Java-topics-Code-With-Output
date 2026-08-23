import java.util.*;
class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,1,2,3,3));
       
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<list2.size();i++){
            set.add(list2.get(i));
        }
        for(int st:set){
            System.out.print(st+"\t");
        }
        System.out.println("Start small. Ship something.");
    }
}