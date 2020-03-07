
package testhashtable;
import java.util.*;

public class TestHashTable 
{

    public static void main(String[] args) 
    {
        
        //linear
        
        System.out.println("create a hash table: ");
        HashTableLin Table = new HashTableLin (6,1);
        Table.printKeysAndIndexes();
        
        System.out.println(Table.getSize());
        System.out.println(" ");
        
        System.out.println("insert 1: ");
        Table.insert(1);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        System.out.println("insert 5: ");
        Table.insert(5);
        Table.printKeysAndIndexes();
        System.out.println(" ");

        System.out.println("insert 6: ");
        Table.insert(6);
        Table.printKeysAndIndexes();
        System.out.println(" ");

        System.out.println("insert 10: ");
        Table.insert(10);
        Table.printKeysAndIndexes();
        System.out.println(" ");

        System.out.println("insert 2: ");
        Table.insert(2);
        Table.printKeysAndIndexes();
        System.out.println(" ");

        System.out.println("insert 3: ");
        Table.insert(3);
        Table.printKeysAndIndexes();
        System.out.println(" ");

        System.out.println("insert 20: ");
        Table.insert(20);
        Table.printKeysAndIndexes();
        System.out.println(" ");

        System.out.println("insert 11: ");
        Table.insert(11);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        /*
        System.out.println("insert 16: ");
        Table.insert(16);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        System.out.println("insert 21: ");
        Table.insert(21);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        System.out.println("insert 22: ");
        Table.insert(22);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        System.out.println("insert 0: ");
        Table.insert(0);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        
        System.out.println("insert 12: ");
        Table.insert(12);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        System.out.println("insert 13: ");
        Table.insert(13);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        System.out.println("insert 14: ");
        Table.insert(14);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        System.out.println("insert 15: ");
        Table.insert(15);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        
        System.out.println("insert 27: ");
        Table.insert(27);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        
        System.out.println("insert 22: ");
        Table.insert(22);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        System.out.println("isIn(1): " + Table.isIn(1));
        System.out.println("isIn(0): " + Table.isIn(0));
        System.out.println("isIn(200): " + Table.isIn(200));
        System.out.println("isIn(20): " + Table.isIn(20));
        System.out.println("isIn(111): " + Table.isIn(111));
        System.out.println("isIn(4): " + Table.isIn(4));
        System.out.println("isIn(245): " + Table.isIn(245));
        System.out.println("isIn(46): " + Table.isIn(46));
        System.out.println("isIn(321341252): " + Table.isIn(321341252));
        System.out.println("isIn(20): " + Table.isIn(20));

        
        System.out.println(" a new Hashtable: ");
        HashTableLin TestProb = new HashTableLin(6, 1);
        System.out.println("number of probes of adding 1: " + TestProb.insertCount(1));
        System.out.println("number of probes of adding 5: " + TestProb.insertCount(5));
        System.out.println("number of probes of adding 6: " + TestProb.insertCount(6));
        System.out.println("number of probes of adding 10: " + TestProb.insertCount(10));
        System.out.println("number of probes of adding 12: " + TestProb.insertCount(12));
        System.out.println("number of probes of adding 3: " + TestProb.insertCount(3));
        System.out.println("number of probes of adding 100: " + TestProb.insertCount(100));
        System.out.println("number of probes of adding 6: " + TestProb.insertCount(6));
        System.out.println("number of probes of adding 20: " + TestProb.insertCount(20));
        System.out.println("number of probes of adding 11: " + TestProb.insertCount(11));
        System.out.println(Table.getSize());
        System.out.println(" ");



        TestProb.printKeysAndIndexes();
        
        /*
        
        System.out.println("create a hash table: ");
        HashTableQuad Table = new HashTableQuad (4,1);
        Table.printKeysAndIndexes();
        
        System.out.println(Table.getSize());
        System.out.println(" ");
        
        System.out.println("insert 1: ");
        Table.insert(1);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        System.out.println("insert 5: ");
        Table.insert(5);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        System.out.println("insert 10: ");
        Table.insert(10);
        Table.printKeysAndIndexes();
        
        System.out.println(" ");
        System.out.println("insert 7: ");
        Table.insert(7);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        
        System.out.println("insert 168: ");
        Table.insert(168);
        Table.printKeysAndIndexes();
        System.out.println(" ");
        
        
        
        
        
        //isIn
        
        System.out.println("isIn(1): " + Table.isIn(1));
        
        System.out.println("isIn(0): " + Table.isIn(0));
        
        System.out.println("isIn(20): " + Table.isIn(20));
        
        System.out.println("isIn(4): " + Table.isIn(4));
        
        System.out.println("isIn(46): " + Table.isIn(46));

        
        System.out.println("***************************************************");
        System.out.println("new Hashtable: ");
        HashTableQuad TestProb = new HashTableQuad(4, 1);
        System.out.println(TestProb.getSize());
        System.out.println("number of probes of adding 1: " + TestProb.insertCount(1));
        System.out.println("number of probes of adding 5: " + TestProb.insertCount(5));
        System.out.println(TestProb.getSize());

        System.out.println("number of probes of adding 10: " + TestProb.insertCount(10));
        System.out.println(TestProb.getSize());
        System.out.println("number of probes of adding 21: " + TestProb.insertCount(21));
        System.out.println(TestProb.getSize());
        System.out.println("number of probes of adding 31: " + TestProb.insertCount(31));
        System.out.println("number of probes of adding 21: " + TestProb.insertCount(21));
        System.out.println("number of probes of adding 44: " + TestProb.insertCount(44));
 
        TestProb.printKeysAndIndexes();
        
        
        
        //test time
        System.out.println("****************QUAD*********************************");
        for(double lambdaQuad = 0.1; lambdaQuad < 1; lambdaQuad += 0.1) 
        {

            double avg = 0.0;

            for (int i = 0; i < 100; i++) 
            {
                HashTableQuad hashtable = new HashTableQuad(100000, lambdaQuad);
                double counter = 0.0;
                for (int j = 0; j < 100000; j++) 
                {
                    Random ran = new Random();
                    double value = hashtable.insertCount(ran.nextInt(Integer.MAX_VALUE));
                    counter += value;
                }
                counter /= 100000;
                avg += counter;


            }
            System.out.println("lambda: " + lambdaQuad);
            System.out.println("actualS: " + avg / 100);
        }

        
        System.out.println("**********************LIN***************************");
        for(double lambdaLin = 0.1; lambdaLin < 1; lambdaLin += 0.1) 
        {
            double avgS = 0.0;
            double avgU = 0.0;
            double idx = 0.0;
            double temp = 0.0;
            
            
            for (int i = 0; i < 100; i++) 
            {
                HashTableLin hashtable = new HashTableLin(100000, lambdaLin);
                double counterS = 0.0;
                for (int j = 0; j < 100000; j++) 
                {
                    Random ran = new Random();
                    double value = hashtable.insertCount(ran.nextInt(Integer.MAX_VALUE));
                    
                    counterS += value;
                }
                counterS = counterS / 100000;
                avgS += counterS;

                int k = 0;
                while(k < 100000) 
                {
                    Random ran = new Random();
                    temp = hashtable.isNotIn(ran.nextInt(Integer.MAX_VALUE));
                    if (temp != 0) 
                    {
                        idx += temp;
                        k++;
                    }
                }
                idx /= 100000;
                avgU += idx;
            }
            
            
            
            System.out.println("lambda is: " + lambdaLin);
            System.out.println(" ");
            System.out.println("actualS is: " + avgS / 100);
            double theoreticalS = 0.5 * (1 + (1 / (1 - lambdaLin)));
            System.out.println("theoreticalS is: " + theoreticalS);
            System.out.println(" ");
            System.out.println("actualU is: " + avgU / 100);
            double theoreticalU = 0.5 * (1 + (1 / ((1 - lambdaLin) * (1 - lambdaLin))));
            System.out.println("theoreticalU is: " + theoreticalU);
            System.out.println(" ");
        }*/
    }

    
    
    
    
    
    }
    
    
        



        
   
