import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreakingProblem {

        static List<String> wordBreak(int n, List<String> dict, String s){
            List<String> list = new ArrayList<>();
            HashSet<String> setDict = new HashSet<>();
            for(int i = 0; i<n; i++){
                setDict.add(dict.get(i));
            }
            
            traverse(list, setDict, s, "");
            return list;
        }
        static void traverse(List<String> list, HashSet<String> dict, String str, String ansStr){
            if(str.length()==0){
                ansStr+="";
                list.add(ansStr);
            }else{
                String tempStr = "", ogStr = "", ogAns = "";
                for(int i = 0; i<str.length(); i++){
                    tempStr+=str.charAt(i);
                    if(dict.contains(tempStr)){
                        ogAns = ansStr;
                        if(ansStr.length()==0) ansStr += tempStr;
                        else ansStr += " " + tempStr;
                        ogStr = str;
                        str = str.substring(i+1, str.length());
                        traverse(list, dict, str, ansStr);
                        str = ogStr;
                        ansStr = ogAns;
                    }
                }
            }
        }
    }
    

