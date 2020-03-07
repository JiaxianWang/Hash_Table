package testhashtable;


public class HashTableLin 
{
    private Integer[] table;
    private int size;
    private int key_num;
    private double max_load;
    
    
    public static int getPrime (int n)
    {
        if (n == 2)
            return n;
        
        for (int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                n += 1;
                getPrime (n);
            }
        }
        
        return n;
    }
    //constructor
    public HashTableLin(int maxNum, double load)
    {
        max_load = load;
        double size_double = maxNum/load;
        size = getPrime((int)size_double);
        table = new Integer[size];
        key_num = 0;
    }
    
    //insert method
    public void insert (int n)
    {
        if (isIn(n) == true)
            return;
        int index = n % size;
        
        if (key_num >= size)
        {
            rehash();
            System.out.println("rehash");
            insert(n); 
            return;
        }
        
        if (table[index] == null)
        {
            table[index] = n;
            key_num++;
            
        }
        
        else 
        {
            for (int i = index; i < size; i++)
            {
                if (table[i] == null)
                {
                    table[i] = n;
                    key_num++;
                    return;
                }
                
            }
            
            for (int i = 0; i < index; i++)
            {
                if (table[i] == null)
                {
                    table[i] = n;
                    key_num++;
                    return;
                }
                
            }
            
           
        }
    }
    
    
    //rehash method
    public void rehash()
    {
        int newsize = getPrime(2*size);
        
        HashTableLin NewTable = new HashTableLin(newsize,1);
        
        for (int i = 0; i < size; i++)
        {
            if (table[i] == null)
            {
                i++;
                continue;
            }
            NewTable.insert(table[i]);
        }
        
        this.key_num = NewTable.key_num;
        this.size = NewTable.size;
        this.max_load = NewTable.max_load;
        this.table = NewTable.table;
        
    }
    //isIn method
    public boolean isIn(int n)
    {
        if (key_num == 0)
            return false;
        
        else
        {
           
        
            int check = n % size;
            
            if(table[check] == null)
                    return false;
            
            else
            {
                for (int i = check; i < size; i++)
                {
                    if (table[i] == null)
                        return false;
                    else if(table[i] == n)
                        return true;
                }
                
                
                for (int i = 0; i < check; i++)
                {
                    if (table[i] == null)
                        return false;
                    else if(table[i] == n)
                        return true;
                }
                
                
                return false;
            }   
        
        }
    }
    
    //printKeys
    public void printKeys()
    {
       for(int i = 0; i < size; i++)
       {
            if(table[i] != null)
            {
                System.out.print(table[i] + ", ");
            }
        } 
    }
    
    //printKeysAndIndexes
    public void printKeysAndIndexes()
    {
        for(int i = 0; i < size; i++)
        {
            if(table[i] != null)
            {
                System.out.println("index: " + i + ", key:" + table[i]);
            }
        }
    }
    
    //get methods
    public int getSize()
    {
        return size;
    }
    
    public int getKeysNum()
    {
        return key_num;
    }
    
    public double getLoad()
    {
        return max_load;
    }
    
    
    
    public int insertCount(int n)
    {
        int prob = 0;
        if (isIn(n) == true)
            return 0;
        int index = n % size;
        
        if (key_num >= size)
        {
            rehash();
            System.out.println("rehash occurs");
            prob = insertCount(n);
            return prob;
        }
        
        if (table[index] == null)
        {
            table[index] = n;
            key_num++;
            prob++;
            return prob;
        }
        
        else 
        {
            for (int i = index; i < size; i++)
            {
                prob++;
                if (table[i] == null)
                {
                    table[i] = n;
                    key_num++;
                    return prob;
                }
                
                
            }
            
            for (int i = 0; i < index; i++)
            {
                prob++;
                if (table[i] == null)
                {
                    table[i] = n;
                    key_num++;
                    return prob;
                }
            }
        }
        
        return prob;
    }
    
    public int isNotIn(int n)
    {
        int check = 1;
        
        int i = n%size;
        while(true)
        {
            if(table[i] == null)
                return check;
            else if(table[i] == n)
                return 0;
            i++;
            check++;
            if(i >= size-1)
            {
                i = 0;
            }
        }
    }
    
    
    
    
    
}
