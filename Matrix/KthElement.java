import java.util.Arrays;

public class KthElement {

public static int kthSmallest(int[][]mat,int n,int k)
	{
        int []nums = new int[mat[0].length * mat.length];
        int index = 0;
        for(int []a : mat){
            for(int b : a){
                nums[index++] = b;
            }
        }
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        return nums[k - 1];
    }
}
    
