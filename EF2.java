//Ejercicio de BubbleSort

public class EF2{
	public static void main(String args[]){
		int array [] = {2,3,8,109,13,4,18,10,23,18,50,11,13,2};
		EF2 bs = new EF2();
		bs.Sort(array);
		bs.print(array);
	}
	public void Sort (int array[]){
		for(int i=0; i<array.length; i++){
			for (int j =1; j<array.length-i; j++){
				if (array[j-1]>array[j]){
					int temp = array[j];
					array[j]=array[j-1];
					array[j-1]= temp;
				}
				this.print(array);
			}
		}
	}
	public void print (int array []){
		for (int i=0; i<array.length; i++)
		System.out.println(array[i]);
		System.out.println("\n");
	}
}