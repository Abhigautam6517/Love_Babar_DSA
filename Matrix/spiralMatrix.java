import java.util.ArrayList;

class spiralMatrix
{

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
       int l=0;
       int t=0;
       int b=r-1;
       int rig=c-1;
       int d=0;
       
       ArrayList<Integer> list=new ArrayList<>();
       while(l<=rig && t<=b){
           if(d==0){
               for(int i=l;i<=r;i++){
                   list.add(matrix[t][i]);
               }
               d=1;t++;
           }
           else if(d==1){
               for(int i=t;i<=b;i++){
                    list.add(matrix[i][r]);
               }
               d=2;rig--;
           }
             else if(d==2){
               for(int i=rig;i>=l;i--){
                    list.add(matrix[b][i]);
               }
               d=3;b--;
           }
           else if(d==3){
               for(int i=b;i>=t;i--){
                    list.add(matrix[i][l]);
               }
               d=0;l++;
           }
       }
        return list;
            
    }
}
