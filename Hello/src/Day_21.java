 import java.lang.reflect.Method;

class Day_21 {
	
	 public static <T> void printArray(T[] array){
		         for(T E: array){
		             System.out.println(E);
		         }
		     }
	 
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Day_21.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}