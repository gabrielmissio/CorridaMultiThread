import java.util.Random;

class Coelho extends Thread {
   private Thread t;
   private String threadName;//Nome da thead
   Random gerador = new Random();
   
   Coelho( String name) {
      threadName = name;
      //System.out.println(threadName + " alongando");
   }
   
   public void run() {
      System.out.println(threadName + " correndo");//Thead em execução
      try {
         for(int i = 0; i < 100; i++) {//Setando os 100 metros do enunciado
            Thread.sleep(gerador.nextInt((51 - 11) + 1) + 11);//((max - min) + 1) + min -> formula para setar o range do numero aleatorio
         }
      } catch (InterruptedException e) {
         System.out.println(threadName + " desmaiou");
      }
      System.out.println("Cheguei: " + threadName);//Fim da execução
   }
   
   public void start () {
      System.out.println("Aquecendo: " +  threadName );
         t = new Thread (this, threadName);
         t.start ();//Tornando a thead executavel
   }
}
