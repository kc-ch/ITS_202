import java.util.*;
public class array{
	//variable declaration
	double len1; //1 over 4 variable
	double len2; //3 over 4 variable
	double size;
	int count;
	int delete;
	int first;
	int array[];
	int len;

	//constructor
	public array(){
		len1=0.25;
		len2=0.75;
		first=0;
		array=new int[4];
		count=0;
	}
	// add function to add the element in the array
	public void add(int e){
		array[first] =e;
		first++;
	}
	// pop function removes the elements from an array
	public void pop(){
		first--;
        delete= array[first];
        array[first] = 0;
        count = 0;
        for(int i = 0; i < array[i]; i++) {
            count++;
        }
        size = (double)count/4;
        System.out.println("The deleted elements = " +delete);
	}
	//resizing the array size when the array is 3by4 and 1by4
	public void resize(){
		if(size == len1){
			int newarr[] = new int[(4/2)*2];
			for(int i=0; i< array.length;i++){
				newarr[i] = array[i];
			}
			array = newarr;
			len= 4/2;
			for(int j : newarr){
				System.out.print(j+" ");
			}

		}
		else if(size == len2){
			int newarr[] = new int[4*2];
			for(int i=0; i<array.length; i++){
				newarr[i] = array[i];
			}
			len=4*2;
			array = newarr;
			for(int n : newarr){
				System.out.println(n+" ");
			}
			System.out.println();
		}
		else{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
	//returns the size of an array
	public int size(){
		return len;
	}
	//converting the array to string
	public String toString(){
		String str = Arrays.toString(array);
		return str;
	}
	public static void main(String[] args) {
		//creating object for ArrayList class
		array k = new array();
		k.add(1);
		k.add(2);
		k.add(3);
		k.add(4);
		k.pop();
		k.resize();

		System.out.println("The string" +k.toString());
        System.out.println("The Size of new Array is = "+k.size());

        //checking the working of the function
    	assert(k.size() == 8);
    	System.out.println("All the functions are working");



	}


}