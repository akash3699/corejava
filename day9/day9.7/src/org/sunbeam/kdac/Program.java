package org.sunbeam.kdac;

import java.util.Map.Entry;

class MapEntry<K,V> implements Entry<K, V>
{
	private K key;
	private V value;
	public MapEntry() 
	{	}
	public MapEntry(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() 
	{
		return this.key;
	}
	@Override
	public V getValue() 
	{
		return this.value;
	}
	@Override
	public V setValue(V value) 
	{
		this.value = value;
		return this.value;
	}
}
public class Program 
{
	public static void main(String[] args) 
	{
		Entry<Integer, String> entry = new MapEntry<>( 1, "DAC");
 		Integer key = entry.getKey();
  		String value = entry.getValue();
  		System.out.println(key + " " +value);
	}
}