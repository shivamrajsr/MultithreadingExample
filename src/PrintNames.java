public class PrintNames extends Thread{
    private int threadNumber;

    public PrintNames(int threadNumber){
        this.threadNumber = threadNumber ;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("name" + i + " -> printed by threadNumber: "+ threadNumber);
            // if we make an exception in any thread that thread stops executing
            // by using below code
//            if(threadNumber == 2 ) {
//                throw new RuntimeException();
//            }

            // a pause of 1 sec between printing names
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
