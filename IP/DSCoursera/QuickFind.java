package DSCoursera;


public class QuickFind { 

   private int id[];

   public QuickFind(int elementsSize){
       id = new int[elementsSize];
       for(int i=0;i<elementsSize;i++){
           id[i] = i;
       }
   }

   public boolean isConnected(int p,int q){
        return id[p]==id[q];
   }

   public void union(int p,int q){
       if(!isConnected(p, q)){
        int pid = id[p];
        int qid = id[q];
        for(int i=0;i<id.length;i++){
            if(id[i] == pid){
                 id[i] = qid;
            }
        }
       }else{
           System.out.println("Already connected");
       }
       
   }


   public static void main(String[] args) {
        QuickFind finder = new QuickFind(10);
        System.out.println(finder.isConnected(4, 3));
        finder.union(4, 3);
        System.out.println(finder.isConnected(4, 3));
        finder.union(3, 8);
        System.out.println(finder.isConnected(4, 8));
        finder.union(6,5);
        finder.union(9, 4);
        System.out.println(finder.isConnected(3, 6));
        finder.union(2, 1);
        finder.union(8, 9);
        finder.union(5, 0);
        finder.union(7, 2);
        finder.union(6, 1);
        System.out.println(finder.isConnected(0, 7));
   }


   /*
    cost model
    Algorithm        initialize        union       find
    quick-find          N               N           1

    Quick find defect Union too expensive 

    Ex: Takes N^2 (Quadratic) array access to process sequence  of N Union commands of N Objects
   */
    
}