public class HashSet {
	String[] list = new String[10000000];

    public int getIndex(String s) {
    	int num = 1;
    	for(char c : s.toCharArray())
    		num = num * c /10;
    	return num;
    }

    public void add(String s) {
    	int num = getIndex(s);
    	if(list[num] != null)
    		System.out.println("Collison");
    	list[num] = s;
    }

    public void remove(String s) {
		int num = getIndex(s);
    	list[num] = null;
	}

	public boolean contains(String s) {
		int num = getIndex(s);
    	if(list[num] != null)
    		return true;
    	return false;
	}
}