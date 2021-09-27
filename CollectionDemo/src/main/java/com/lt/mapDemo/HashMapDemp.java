package com.lt.mapDemo;

import java.util.HashMap;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HashMapDemp {
    public static void main(String[] args) {
        /**
         *
         *
         */
        HashMap<Integer,String> hm = new HashMap();

        System.out.println(hm.put(12, "丽丽"));
        hm.put(12,"丽");
        hm.put(12,"kk");
        hm.put(2,"lmk");
        hm.put(9,"hujnm");

        System.out.println(hm.size());
        System.out.println(hm.get(12));




    }

    public void method() {
        /*public V put(K key, V value) {
            if (table == EMPTY_TABLE) {
                inflateTable(threshold);
            }
            if (key == null)
                return putForNullKey(value);
            int hash = hash(key);
            int i = indexFor(hash, table.length);
            for (HashMap.Entry<K,V> e = table[i]; e != null; e = e.next) {
                Object k;
                if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                    V oldValue = e.value;
                    e.value = value;
                    e.recordAccess(this);
                    return oldValue;
                }
            }

            modCount++;
            addEntry(hash, key, value, i);
            return null;
        }*/
    }

}
