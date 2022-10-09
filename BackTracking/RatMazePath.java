import java.util.ArrayList;

public class RatMazePath{
    static ArrayList<String> maze(int startRow,int endRow,int startcol,int endcol){
        if(startRow==endRow && startcol == endcol){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        if(startRow>endRow || startcol> endcol){
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        ArrayList<String> finalresult = new ArrayList<>();
        ArrayList<String> horizontal = maze(startRow+1, endRow, startcol, endcol);
        for(String r : horizontal){
            finalresult.add(r+"H");

         }

         ArrayList<String> vertical = maze(startRow, endRow, startcol+1, endcol);
         for(String r : vertical){
             finalresult.add(r+"V");
 
          }


        return finalresult;
        

    }
    public static void main(String[] args) {
        int startRow = 0;
        int endRow = 2;
        int startcol = 0;
        int endcol = 2;
        
       System.out.println( maze(startRow,endRow,startcol,endcol));

    }

}