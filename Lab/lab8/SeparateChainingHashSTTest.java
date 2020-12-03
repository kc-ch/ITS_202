public class SeparateChainingHashSTTest{
	 public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        st.put("A", 1);
        st.put("D",2);
        st.put("P",3);
        st.put("Q",3);
        st.put("W",3);

        System.out.println(st.get("D"));
       
        System.out.println(st.contains("P"));
        st.delete("A");
        System.out.println(st.size());

        assert(st.isEmpty()==false);
        assert(st.size()==4);
        System.out.println("All the function are working");
    }
}