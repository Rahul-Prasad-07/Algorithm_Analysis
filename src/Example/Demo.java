package Example;

public class Demo {

     //  int i = 1;
     //
     //  int function() {
     //      if (i <= 5) {
     //          System.out.print(i++ + " ");
     //          function();
     //      }
     //      return 0;
     //  }
    void function(String st) {
        if ((st == null) || (st.length() <= 1))
            System.out.println(st);
        else {
            System.out.print(st.charAt(st.length() - 1));
            function(st.substring(0, st.length() - 1));
        }
    }

    public static void main(String[] args) {
        String st = "abc d efg";
        Demo obj = new Demo();
        obj.function(st);
    }

      // public static void main(String[] args) {
      //     Demo obj = new Demo();
      //     obj.function();
      // }
    }

