package testhashtable;

public class HashTableQuad 
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
    public HashTableQuad(int maxNum, double load)
    {
        max_load = load;
        double max = (double)maxNum / load;
        double int_max = Math.ceil(max);
        size = getPrime((int)int_max);
        table = new Integer[size];
        key_num = 0;
    }
    
    //insert method 
    public void insert (int n)
    {
        if (isIn(n) == true)
        {
            return;
        }
        if (key_num > size/2)
        {
            rehash();
            insert(n);
        }
        int index  = n % size;
        
        
        
        if (table[index] == null)
        {
            table[index] = n;
            key_num++;
        }
        
        else
        {
            int i = 0;
            do
            {
                if (table[(index + i*i) % size] == null)
                {
                    table[(index + i*i) % size] = n;
                    key_num++;
                    
                    return;
                }
                i++;
                
            }while (true);
            
        }
        
    }
    
    //rehash method
    public void rehash()
    {
        int newsize = getPrime(2*size);
        
        HashTableQuad NewTable = new HashTableQuad(newsize,1);
        
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
        boolean flag = false;
        int i= n%size;
        int a = 1;
        while(table[i]!=null)
        {
            if(table[i]==n)
                return true;
            i += a*a;
            a++;
            if(i>(size - 1))
            {
               i=i%size;
            }
        }
        return flag;
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
    
    //insertCunt
    public int insertCount (int n)
    {
        int prob = 0;
        if (isIn(n) == true)
        {
            return 0;
        }
        if (key_num > size/2)
        {
            rehash();
            System.out.println("rehash occurs");
            prob = insertCount(n);
            return prob;
        }
        
        
        int index  = n % size;
        
        if (table[index] == null)
        {
            table[index] = n;
            key_num++;
            prob++;
        }
        
        else
        {
            int i = 0;
            do
            {
                prob++;
                if (table[(index + i*i) % size] == null)
                {
                    table[(index + i*i) % size] = n;
                    key_num++;
                    
                    return prob;
                }
                i++;
                
            }while (true);
            
        }
        return prob;
    }
    
    
    
    
    
    
    
}
