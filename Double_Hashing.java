import java.util.Scanner;
import java.util.Random;
public class Double_Hashing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int TABLE_SIZE = 29;
        int[] testNums = new int[TABLE_SIZE / 2];
        HashTable ht = new HashTable(TABLE_SIZE);
        Random random = new Random();
        for(int i=0; i < testNums.length; i++)
            testNums[i] = Math.abs(random.nextInt(1000));
        for(int i=0; i < testNums.length; i++)
            ht.insert(testNums[i]);
        ht.printHashTable();
        ht.makeEmpty();
    }
}