package com.uttara.duplicatcharcterinarray;

public  final class ImmutableClass {
	private final String name;

	private final  int i;
	
	public ImmutableClass(String name, int i)
	{
		super();
		this.name = name;
		this.i = i;
	}
	
	public String getName()
	{
		return name;
	}
	public int getI()
	{
		return i;
	}
	

}
