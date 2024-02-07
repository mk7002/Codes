
/**
 * 
1 
2 9 
3 8 10 
4 7 11 14 
5 6 12 13 15 
 */
import java.util.*;
class Pattern
{
	 public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int size =  5;
        for (int i = 0; i < size ; i++){
            for (int j = 0; j <= i ; j++){
                 int previousColumn = getPreviousColumnFinalValue(map, j, size);
                 int value = previousColumn + ( j%2 == 0 ? (i - j + 1) : (size - i) );
                System.out.print(value+" ");    
            }
            System.out.println();
        }
        
    }

    public static int getPreviousColumnFinalValue(HashMap<Integer,Integer> map, int currentColumnIndex,int size){
        int previousSize = 0;
        int lastColumnIndex = currentColumnIndex - 1;
        if(map.containsKey(lastColumnIndex)){
            previousSize = map.get(lastColumnIndex);
        }else{
            previousSize = getSize(lastColumnIndex);
            map.put(lastColumnIndex, previousSize);
        }
        int totalSize = (size * (lastColumnIndex+1)) - previousSize;
        return totalSize;
    }
    
    public static int getSize(int n) {
        int current = 0;
        for (int i = 1; i <= n; i++) {
            current += i;
        }
       
        return current;
    }
}
