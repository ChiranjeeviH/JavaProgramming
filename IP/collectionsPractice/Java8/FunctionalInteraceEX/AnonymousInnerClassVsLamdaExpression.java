package collectionsPractice.Java8.FunctionalInteraceEX;

public class AnonymousInnerClassVsLamdaExpression {

    public static void main(String[] args) {
        //Implementing Anonymous inner class for Runnable interface
        Runnable r = new Runnable(){
            @Override
                public void run(){
                    for(int i=0;i<10;i++){
                        System.out.println("This is Child class-1");
                    }
                }
        };
        //Implementing lamda expressions for Runnable interface
        Runnable r1 = () -> {for(int i=0;i<10;i++){System.out.println("this is child class");}};

        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        t.start();
        t1.start();;
        for(int i=0;i<10;i++){
            System.out.println("This is Main class");
        }
    }

}