
public class CelebratityProblem {
    int celebrity(int M[][], int n){
    Stack<Integer> stack = new Stack<>();
     for(int i=0;i<n;i++){
        stack.push(i);
     }
     while((stack.size()>=2))
     {
         int person1 = stack.pop();
         int person2 = stack.pop();
         if(M[person1][person2] == 1)
         {
             stack.push(person2);
         }
        else
         {
             stack.push(person1);
         }
     }
    int celeb = stack.pop();
     for(int person=0;person<n;person++)
     {
         if( person != celeb)
         {
             if(M[person][celeb] == 0 || M[celeb][person] ==1)
             {
                 return -1;
             }
         }
     }
     return celeb;

    }
}
    

