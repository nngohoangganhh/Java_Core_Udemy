package chapter11.lap9;

import java.util.*;

public class Lap9 {
    public static void main(String[] args) {

        ///1
        ArrayList<Member> members = new ArrayList<>();
         members.add(new Member(1,"AN", 20));
         members.add(new Member(2,"Binh", 20));
         members.add(new Member(3,"Cường", 19));
         members.add(new Member(4,"Thái", 18));
         members.add(new Member(5,"Thịnh", 22));

         for (Member member :members){
             System.out.println("Danh Sách "+ member);
         }
        //2
        HashSet<Integer> memberIDs = new HashSet<>();
         for (Member member : members){
           memberIDs.add(member.getId());
         }
         boolean added  = memberIDs.add(1);
        System.out.println("thêm id" + added);
        System.out.println("Danh Sách Id");
        System.out.println(memberIDs);
        //3
        TreeSet<Member> rank = new TreeSet<>();
        rank.addAll(members);
        System.out.println("Danh sách theo tuôi");
        for(Member m :rank){
            System.out.println(m);
        }
        //4
        HashMap<Integer,Integer> point = new HashMap<>();
        point.put(1,10);
        point.put(2,30);
        point.put(3,33);
        if(point.containsKey(1)){
            point.put(1,point.get(1)+10);
        }
        System.out.println("Điểm thưởng");
        for (Map.Entry<Integer,Integer> entry : point.entrySet() ){
            System.out.println("ID" +entry.getKey()+ "điểm" +entry.getValue() );
        }
          TreeMap<Integer,String> ID = new TreeMap<>();
        for(Member m: members){
            ID.put(m.getId(),m.getName());
        }
        System.out.println(ID);

    }
}
