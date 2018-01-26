package sef.module19.sample;

/**
The inner class is referenced no earlier and therefore loaded no earlier 
by the class loader than the moment that getInstance() is called. 
Thus, this solution is thread-safe without requiring special language constructs
like volatile or synchronized
*/

public class SingletonRecommended {
   // Protected constructor is sufficient to suppress unauthorized calls to the constructor
   protected SingletonRecommended() {}
 
   /**
    * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
    * or the first access to SingletonHolder.instance , not before.
    */
   private static class SingletonHolder { 
     private final static SingletonRecommended INSTANCE = new SingletonRecommended();
   }
   
   public static SingletonRecommended getInstance() {
     return SingletonHolder.INSTANCE;
   }
}
