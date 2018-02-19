package sef.module8.sample;

//Needs to be completed
public class TryCatchFinallySample {

    //The following String variable is declared at class level. It'd automatically be initialized to null.
    static String str;

    public static void main(String[] args) {
        //1 - Create an instance of TryCatchFinallySample and call catchMeIfYouCan()
        TryCatchFinallySample obj = new TryCatchFinallySample();
        obj.catchMeIfYouCan("text");
        obj.catchMeIfYouCan(str);
        obj.catchMeIfYouCan("uuiyiyui");
    }

    public void catchMeIfYouCan(String s) {
        //As long as we try to print it, it'd work and print null.
        System.out.println("------------------------");
        System.out.println(s);

        try {
            System.out.println(s.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("" +
                    "This is finally" +
                    "\n ---------------------");
        }


    }

}
