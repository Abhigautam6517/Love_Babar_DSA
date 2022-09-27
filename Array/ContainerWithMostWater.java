import java.util.Locale.LanguageRange;

public class ContainerWithMostWater {
    public static int water(int height[]){
        int i = 0;
        int j = height.length-1;
        int max=0;
        int total = 0;
        while(i!=j){
            total = (j-i)*Math.min(height[i], height[j]);
            if(max<total){
                max = total;
            }
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
      
        
    }

    public static void main(String[] args) {
        int height[] = {5,1,4,2,5,3};
        System.out.println(water(height));
        
    }
    
}
