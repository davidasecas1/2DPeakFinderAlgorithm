
public class Alg {
	static int i,j,m,n;
	public static void main(String[] args) {
		int[][] nums= {
			{ 0, 0, 12, 8, 0, 0, 0},
			{ 0, 0, 10, 8, 0, 0, 0},
			{ 0, 1, 4, 6, 0, 0, 0},
			{ 0, 2, 3, 1, 0, 0, 0},
			{ 0, 0, 0, 0, 0, 0, 0},
			{ 0, 0, 5, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 0, 0, 0}
		};
		n=nums.length;
		m=nums[0].length;
		i=n/2;
		j=m/2;
		double TInicio, TFin, tiempo;
		TInicio=System.nanoTime();
		peakFinding(nums,i,j);
		TFin=System.nanoTime();
		tiempo=TFin-TInicio;
		System.out.println("Tiempo de ejecución: "+tiempo/Math.pow(10,6)+" milisegundos");
	}
	
	private static void peakFinding(int[][] nums,int starti,int startj){
		i=starti;
		j=startj;
		int peak=0;
		if(j>0 && nums[i][j]<nums[i][j-1]){
			peakFinding(nums,i,j-1);
		}else if(j<m-1 && nums[i][j]<nums[i][j+1]){
			peakFinding(nums,i,j+1);
		}else if(i>0 && nums[i][j]<nums[i-1][j]){
			peakFinding(nums,i-1,j);
		}else if(i<n-1 && nums[i][j]<nums[i+1][j]){
			peakFinding(nums,i+1,j);
		}else{
			peak=nums[i][j];
			System.out.println("Peak: "+peak);
		}
		
	}
}
