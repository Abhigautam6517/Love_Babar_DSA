import java.util.ArrayList;
import java.util.Collections;

public class sortedMatrix {
    int[][] sortedMatrix(int N, int Mat[][]) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                al.add(Mat[i][j]);
            }
        }
        Collections.sort(al);
        int ind=0;
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                Mat[i][j]=al.get(ind++);
            }
        }
        return Mat;
    }
}
    

