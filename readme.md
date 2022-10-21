# <div align="center">**Project 2**</div>
## **Overview**
The double hashing algorithm was implemented using two helper classes: *HashTable* and *HashEntry. The class *HashEntry.java* creates a *HashEntry* object, which contains a value and its key (or index). The class *HashTable* creates the hash table. This class contains an insert, remove, and print method. The insert method utilizes a *getKey()* method that determines the key based on the hash functions and *i*, where *i* is initially set to zero. The *getKey()* method prints out *i* and the key until a valid key is found.

The class *Double_Hashing.java* was used to test the *HashTable* and *HashEntry* classes. It declares a *HashTable* with size = 16. It then allows the user to insert or remove a value into or from the hash table until the while loop ends. Finally, the hash table is printed, displaying each element in the table along with its key.
## **Running the File**
The user will first be prompted with *Insert (i), Remove (r), Exit (x)*, where the user should input should be 'i', 'r', or 'x' (not case sensitive). If the user chooses to insert or remove a value, they will then be prompted to enter a value, which will then be inserted into or removed from the hash table. This repeats until the user chooses to exit by entering 'x' or 'X'. Once the loop is exited, the hash table is printed and then made empty.