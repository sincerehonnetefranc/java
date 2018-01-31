package Catt;

import qqq.Bbb;

public class Aaa {
	public static void main(String[]args){
		System.out.println(Bbb.i);
		Bbb z1=new Bbb();
		z1.setName("–°¥Û");
		System.out.println(z1.getName());
		int c=z1.add(2, 3);
		System.out.println(c);
		String v=z1.add("jorya", 5);
		System.out.println(v);
		
		
		//√∞≈›≈≈–Ú
		int[] a={1,3,5,7,9};
		int[] al=new int[a.length];
//		for(int j=0;j<a.length-1;j++){
//			for(int i=0;i<a.length-1-j;i++){
//				if(a[i]<a[i+1]){
//					int tmp=a[i];
//					a[i]=a[i+1];
//					a[i+1]=tmp;
//				}
//			}
//		}
//		
//		for(int b:a){
//			System.out.print(b+",");
//		}
//		System.out.println();
		
		
		//—°‘Ò≈≈–Ú
		for(int x=0;x<a.length-1;x++){
			for(int y=x;y<a.length-1-x;y++){
				if(a[x]<a[y+1]){
					int tmp=a[x];
					a[x]=a[y+1];
					a[y+1]=tmp;
				}
			}
			for(int m:a){
				System.out.print(m+",");
			}
			System.out.println();
		}
	
	}

}
