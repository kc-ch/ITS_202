import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;             // root of BST
    int size;
    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    //constructor of the class
    public Solution() {
        root = null;
        size =0;
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        // Checks whether the symbolic table is empty or not
        if(size()==0){
            return true;
        }
        return false;
       
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
      return size; //gives the size
    }

    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(Key key) {
        if(key == null) {
            throw new IllegalArgumentException("The key should not be null");
        } 

        else{
            Node temp = root;

            while(temp != null && temp.val != key){
            	int comp = key.compareTo(temp.key);
                if(comp < 0){
                    temp = temp.left; // goes to the left subtree
                }
                else{
                    temp = temp.right;// goes to right subtree
                }
            }
            if(temp == null){
                System.out.println("Not found");
            }
            if(temp == root){
				System.out.println("The key " +key+ " is the root");
            }
            return true;
        }
    }

    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
    	if(key == null){
            throw new IllegalArgumentException("The key should not be null");
        }
        else{
            return get(root, key); 
        }
        
    }

    private Value get(Node x, Key key) {
        if(x == null){
            return null;
        }
    	while(x != null){
    		int comp = key.compareTo(x.key);
    		if(comp < 0){
    			x = x.left;
    		}
    		else if(comp > 0){
    			x=x.right;
    		}
    		else{
    			return x.val; //gives the value of 
    		}
    	}
    	return null;
        
    }

//     /**
//      * Inserts the specified key-value pair into the symbol table, overwriting the old 
//      * value with the new value if the symbol table already contains the specified key.
//      * Deletes the specified key (and its associated value) from this symbol table
//      * if the specified value is {@code null}.
//      *
//      * @param  key the key
//      * @param  val the value
//      * @throws IllegalArgumentException if {@code key} is {@code null}
//      */
    public void put(Key key, Value val) {
        Node temp = new Node(key,val, 1);
        if(root == null){
            root = temp;
        }
        else{
            Node newest = root;
            Node parent = null;
            while(newest != null){
                parent = newest;
                int comp = key.compareTo(newest.key);
                if(comp <0){
                    newest = newest.left;
                    if(comp < 0 && newest == null){
                        parent.left = temp;
                        size = size + 1;
                        return;
                    }
                    else if(newest.key == key){
                        newest.val = val;
                        return;
                    }
                }
                else{
                    newest = newest.right;
                    if(comp > 0 && newest == null){
                        parent.right = temp;
                        size = size + 1;
                        return;
                    }
                    else if(newest.key == key){
                        newest.val = val;
                        return;
                        
                    } 
                }
                
            } 
        }
        size = size+1;  //incrementation of the size
    }

//     // private Node put(Node x, Key key, Value val) {
        
//     // }

//     /**
//      * Returns the smallest key in the symbol table.
//      *
//      * @return the smallest key in the symbol table
//      * @throws NoSuchElementException if the symbol table is empty
//      */
    public Key min() {
       return min(root).key;
    } 

    private Node min(Node x) { 
        x = root;

       while(x.left != null){
            x = x.left;
       }
       return x;     
    } 

   

//     /**
//      * Returns the largest key in the symbol table less than or equal to {@code key}.
//      *
//      * @param  key the key
//      * @return the largest key in the symbol table less than or equal to {@code key}
//      * @throws NoSuchElementException if there is no such key
//      * @throws IllegalArgumentException if {@code key} is {@code null}
//      */
    public Key floor(Key key) {
        Node x = floor(root, key);
        if(key == null){
            throw new IllegalArgumentException("invalid");
        }
        else if(size() == 0){
            throw new NoSuchElementException("invalid");
        }
        return x.key;
    } 

    private Node floor(Node x, Key key) {
        Node parent =null;
        if(x == null){
            return null; 
        }
        while(x != null){
            
            int comp = key.compareTo(x.key);
            if(comp <0){
                x = x.left;
            }
            else{
                parent = x;
                x = x.right;       
            } 
        }
        return parent;
    }
    


//     /**
//      * Return the key in the symbol table whose rank is {@code k}.
//      * This is the (k+1)st smallest key in the symbol table.
//      *
//      * @param  k the order statistic
//      * @return the key in the symbol table of rank {@code k}
//      * @throws IllegalArgumentException unless {@code k} is between 0 and
//      *        <em>n</em>–1
//      */
    // public Key select(int k) {
    //     if (k < 0 || k >= size()) {
    //         throw new IllegalArgumentException("argument to select() is invalid: " + k);
    //     }
    //     return select(root, k);
    // }

    // // Return key of rank k. 
    // private Key select(Node x, int k) {
    //     Node parent = null;
    //     if(x==null){
    //         return null;
    //     } 
    //     while(x!=null){
    //         int tempsize = 0;
    //         int comp = temsize.size+1.compareTo(x.size);
    //         if(comp > 0){
    //             return x.right;
    //         }
    //         else{
    //             return x.left;
    //         }
    //     } 
    //     return parent.key; 
    // }

    

//     /**
//      * Returns all keys in the symbol table in the given range,
//      * as an {@code Iterable}.
//      *
//      * @param  lo minimum endpoint
//      * @param  hi maximum endpoint
//      * @return all keys in the symbol table between {@code lo} 
//      *         (inclusive) and {@code hi} (inclusive)
//      * @throws IllegalArgumentException if either {@code lo} or {@code hi}
//      *         is {@code null}
//      */
    public Iterable<Key> keys(Key lo, Key hi) {
        if (lo == null) throw new IllegalArgumentException("The lower part of the key should not be null");
        if (hi == null) throw new IllegalArgumentException("The lower part of the key should not be null");

        ArrayList<Key> arr = new ArrayList<Key>();
        keys(root, arr, lo, hi);
        return arr; 
    } 

    private void keys(Node x,ArrayList<Key> arr, Key lo, Key hi) { 
        if (x == null) return;  
        
        Node curNode = x;  
        //searches through the tree till the condition is fulfilled
        while (curNode != null){  
      
            int cmplo = lo.compareTo(curNode.key);
            int cmphi = hi.compareTo(curNode.key);


            if (curNode.left == null){   
                if (cmplo <= 0 && cmphi >= 0)  arr.add(curNode.key);
                curNode = curNode.right;

            //if the left node is not null it is assigned to curNode.left 
            }else{  
                Node node = curNode.left;
                while (node.right != null && node.right != curNode)  
                    node = node.right;  
        
                if (node.right == null){  
                    node.right = curNode;  
                    curNode = curNode.left; 
            
                }else{  
                    node.right = null;    
                    if (cmplo <= 0 && cmphi >= 0)  arr.add(curNode.key);  
                    curNode = curNode.right;  
                }  
            }  
        }   
   } 

   
//     /* Run the program by giving the approriate command obtained from
//     input files through input.txt files. The output should be displayed
//     exactly like the file output.txt shows it to be.*/
     
}
