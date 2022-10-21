import java.util.Scanner;
public class Double_Hashing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = ' ';
        int TABLE_SIZE = 16;
        HashTable ht = new HashTable(TABLE_SIZE);
        while(c != 'x' || c != 'X') {
            System.out.print("Insert (i), Remove (r), Exit (x): ");
            c = s.next().charAt(0);
            if(c == 'I' || c =='i') {
                System.out.print("Enter positive integer to insert: ");
                int value = s.nextInt();
                ht.insert(value);
            }
            else if(c == 'R' || c =='r') {
                System.out.print("Enter positive integer to remove: ");
                int value = s.nextInt();
                ht.remove(value);
            }
            else if(c == 'x' || c == 'X')
                break;
            else
                System.out.println("Invalid input");
        }
        s.close();
        ht.printHashTable();
        ht.makeEmpty();
    }
}