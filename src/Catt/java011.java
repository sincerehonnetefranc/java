package Catt;

public class java011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,10,15,25,64,90};
		int[] al=new int[a.length];
		
		/*for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		
			for(int b:a){
				System.out.print(b+",");
				
			}
			System.out.println();
		}*/
		
		
		
		for(int i=0;i<a.length-1;i++){
			for(int j=i;j<a.length-1;j++){
				if(a[i]<a[j+1]){
					int tmp=a[i];
					a[i]=a[j+1];
					a[j+1]=tmp;
				}
			}
		
			for(int c:a){
				System.out.print(c+",");
				
			}
			System.out.println();
		}
			}

}
