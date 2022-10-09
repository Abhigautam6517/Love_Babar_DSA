

public class RatMazePathBlockPath {

    private static int mazePath(int[][] path, int startRow, int endRow, int startcol, int endcol) {
        
        if(startRow==endRow && startcol==endcol){
            return 1;
            
        }
        if(startRow>endRow || startcol>endcol || path[startRow][startcol]==0){
            return 0;
            
        }
        int answer = mazePath(path, startRow+1, endRow, startcol, endcol) + mazePath(path, startRow, endRow, startcol+1, endcol);
        return answer;


   
    }
    public static void main(String[] args) {
        int startRow =0, startcol=0;
        int endRow=3, endcol=3;
        int path[][] = { { 1, 0, 0, 0 },
                       { 1, 1, 0, 1 },
                       { 0, 1, 0, 0 },
                       { 1, 1, 1, 1 } 
                    };
        System.out.println(mazePath(path, startRow,endRow, startcol,endcol));
        
    }

 
    
}
