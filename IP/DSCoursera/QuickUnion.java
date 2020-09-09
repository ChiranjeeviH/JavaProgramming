package DSCoursera;

public class QuickUnion {

    private int id[];

   public QuickUnion(int elementsSize){
       id = new int[elementsSize];
       for(int i=0;i<elementsSize;i++){
           id[i] = i;
       }
   }

   private int root(int i){

    while(i != id[i] ){
        i = id[i];
    }
        return i;
   }

   public boolean isConnected(int p, int q){
       return root(p) == root(q);
   }

   public void union(int p, int q){
       int i=root(p);
       int j=root(q);
       id[i]= j;
   }

    
}