package org.sunbeam.kdac;



class Pair<K, V>
{
	public K key;
	public V value;
	
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public Pair() {
	
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	
}

public class Program {
	
	public static void main(String[] args) {
		Pair<Integer,String> pk1 = new Pair<>(1,"Karad");
		Integer key = pk1.getKey();
		String value = pk1.getValue();
		System.out.println("Key   : "+key+" Pair  : "+value);
		
		
	}
	
}