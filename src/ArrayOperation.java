import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayOperation {
    private int[] array;

    public ArrayOperation(int n){
        SetArray(n);
    }

    public void SetArray(int n){
        this.array = new int[n];
    }
    public int[] GetArray(){
        return this.array;
    }

    public void RandomFillArray(int max){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(max);
        }
    }
    public void SortArray(){
        Arrays.sort(this.array);
    }
    public void PrintArray(){
        System.out.printf("Current array: " + this.toString());
    }
    @Override
    public String toString(){
        String arrayToString = "";
        for (int i = 0; i < array.length; i++){
            arrayToString += (array[i] + ",");
        }
        return arrayToString.substring(0,arrayToString.length()-1) + "\n";
    }
}
