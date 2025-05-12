package com.Task03Octo;


public class OwnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Own obj=new Own();
		obj.f_Name="Sambit";
		obj.m_Name="Kumar";
		obj.l_Name="Swain";
		obj.age=24;
		obj.roll=2270295;
		obj.mob=9861164945l;
		obj.gender="Male";
		obj.getDetails();
		boolean istrue=obj.isMadua();
		System.out.println("Madua"+istrue);
		
		System.out.println("-----------------------");
		Own obj2=new Own();
		obj2.f_Name="Pratap";
		obj2.m_Name="Kumar";
		obj2.l_Name="Parihari";
		obj2.age=21;
		obj2.roll=123789;
		obj2.mob=786578554l;
		obj2.gender="Gay";
		obj2.getDetails();
		
		System.out.println("Madua:"+istrue);
		
		
		
	}

}
