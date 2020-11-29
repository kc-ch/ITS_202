public class SolutionTest{
	public static void main(String[] args) { 
    	Solution<String, Integer> obj = new Solution<String, Integer>();

        obj.put("ABDUL",1);
        System.out.println(obj.get("ABDUL"));
        obj.put("HRITHIK",2);
        obj.put("SAI",3);
        obj.put("SAMAL",6);
        System.out.println(obj.get("SAI"));
        obj.put("TASHI",4);



        
        
        System.out.println(obj.size()); 
        System.out.println(obj.min());
        System.out.println(obj.floor("HRITHIK")); 
        System.out.println(obj.floor("HAHA")); 
        //System.out.println(obj.select(2));
        for (String s : obj.keys("ABDUL","TASHI"))
            System.out.print(s+" ");
        System.out.println();
        obj.put("CHIMI",5);
        obj.put("SAMAL",4);
        System.out.println(obj.get("SAMAL"));
        obj.put("NIMA",7);
        System.out.println(obj.size());
         System.out.println(obj.get("CHIMI"));
        System.out.println(obj.floor("CHIMA"));
        obj.put("SONAM",8);
        for (String s : obj.keys("ABDUL","TASHI"))
            System.out.print(s+" ");
        System.out.println();


       
    }
}