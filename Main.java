import java.util.*;

class Main {

  public static void Add(int edge,int edgesec, String key,String val,HashMap<String,List<HashMap<Integer,String>>> data){
    

   if(data.size()==0){
      List<HashMap<Integer,String>> temp = new ArrayList<>();
      temp.add(new HashMap(){{put(edge,val);}});
      data.put(key, temp);
      temp =new ArrayList<HashMap<Integer,String>>();
      temp.add(new HashMap(){{put(edgesec,key);}});
      data.put(val,temp);

   }
   else
   {
     if(data.containsKey(key)){
     List<HashMap<Integer,String>> temp = data.get(key);
     HashMap<Integer,String> hs = new HashMap<>();
     hs.put(edge, val);
     temp.add(hs);
     data.put(key, temp);
     }
     else{
      List<HashMap<Integer,String>> temp = new ArrayList<>();
     HashMap<Integer,String> hs = new HashMap<>();
     hs.put(edge, val);
     temp.add(hs);
     data.put(key, temp);
     }
     if(data.containsKey(val)){
     List<HashMap<Integer,String>> temp = data.get(val);
     HashMap<Integer,String> hs = new HashMap<>();
     hs.put(edgesec, key);
     temp.add(hs);
     data.put(val, temp);
     }
     else{
      List<HashMap<Integer,String>> temp = new ArrayList<>();
     HashMap<Integer,String> hs = new HashMap<>();
     hs.put(edgesec, key);
     temp.add(hs);
     data.put(val, temp);
     }
   }

  ;


  }
  public static void main(String[] args) {
    HashMap<String, List<HashMap<Integer,String>>> data = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    while(true){

      System.out.println("Enter hexa Name where you want to add : ");
      String key = sc.next();
      System.out.println("Enter Edge number where you want to add :");
      int edge= sc.nextInt();
      if(edge>5){
        System.out.println("Invalid Edge input: <6");
        break;
      }
      System.out.println("Enter hexagon which you want to add:");
      String hexa= sc.next();
      System.out.println("Enter edge where "+key+" will be add:");
      int edgesec = sc.nextInt();
      if(edgesec>5){
        System.out.println("Invalid Edge input: <6");
        break;
      }

      Add(edge,edgesec,key,hexa,data);

      System.out.println("If you want to add more press 1 otherwise anynumber");
      int check = sc.nextInt();
      if(check!=1)
      break;

    }
    System.out.println("This is All Hexa with details: "+data);

  }
}

