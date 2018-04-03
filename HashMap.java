import java.util.*;

public class HashMap {
	ArrayList<String>[] list = new ArrayList[10000];

    public void put(String key, String value) {
    	int hash = 7;
    	for(char c : key.toCharArray())
    		hash *= (int)c%10;
    	hash /= 100;
    	list[hash] = new ArrayList<String>();
    	list[hash].add(key);
    	list[hash].add(value);
    }

    public String get(String key) {
    	int hash = 7;
    	for(char c : key.toCharArray())
    		hash *= (int)c%10;
    	hash /= 100;
    	if(list[hash] == null)
    		return null;
    	return list[hash].get(1);
    }


}