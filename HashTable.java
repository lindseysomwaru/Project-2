public class HashTable {
    private int HASH_TABLE_SIZE, size;
    private HashEntry[] table;
    public HashTable(int ts) {
        size = 0;
        HASH_TABLE_SIZE = ts;
        table = new HashEntry[HASH_TABLE_SIZE];
        for(int i=0; i < HASH_TABLE_SIZE; i++)
            table[i] = null;
    }
    public boolean isEmpty() {
        if(size == 0)
            return true;
        else
            return false;
    }
    public void makeEmpty() {
        size = 0;
        for(int i=0; i < HASH_TABLE_SIZE; i++)
            table[i] = null;
    }
    public int getKey(int value) {
        int hash1 = myHash1(value);
        int hash2 = myHash2(value);
        int key = 0;
        for(int i=0; i < HASH_TABLE_SIZE; i++) {
            key = (hash1 + (i * hash2)) % HASH_TABLE_SIZE;
            System.out.println("i: " + i + ", key: " + key);
            if(table[key] == null) {
                System.out.println();
                return key;
            }
        }
        return key;
    }
    public void insert(int value) {
        if(size == HASH_TABLE_SIZE) {
            System.out.println("Table is full!");
            return;
        }
        System.out.println("Inserting " + value);
        int key = getKey(value);
        table[key] = new HashEntry(key, value);
        size++;
    }
    public void remove(int value) {
        if(isEmpty()) {
            System.out.println("Table is empty!");
            return;
        }
        System.out.println("Removing " + value);
        for(int i=0; i < HASH_TABLE_SIZE; i++)
            if(table[i] != null && table[i].value == value)
                table[i] = null;
        size--;
    }
    private int myHash1(int value) {
        int key = value % HASH_TABLE_SIZE;
        return key;
    }
    private int myHash2(int value) {
        int key = 2 * (value % 4) + 1;
        return key;
    }
    public void printHashTable() {
        System.out.println("Hash Table: ");
        for(int i=0; i < HASH_TABLE_SIZE; i++)
            if(table[i] != null)
                System.out.println(table[i].value + ", key: " + table[i].key);
    }
}