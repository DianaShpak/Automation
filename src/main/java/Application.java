import additional.User;
import additional.UserStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*
import additional.ClassA;
import additional.ClassB;
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Application {

    // static int a = 25 + 25;

    private final static Logger LOG = LogManager.getLogger();

    public static void main(String[] args) {


        LOG.info("==start==");


/*
        int[][] ints = new int[3][2];
        ints[0][0] = 1;
        ints[0][1] = 2;

        ints[1][0] = 3;
        ints[1][1] = 4;

        ints[2][0] = 5;
        ints[2][1] = 6;

        */


/*
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 2; a++) {
                System.out.println("value" + ints[i][a]);
            }
        }
*/
        /*
        List<List<String>> strings = new ArrayList<>();
        List<String> listOne = new ArrayList<>();
        listOne.add("String 1");
        listOne.add("String 2");
        listOne.add("String 3");
        listOne.add("String 4");

        strings.add(listOne);
*/

        List<User> users = new ArrayList<>();

        Map<String, User> userMap = new HashMap<>();

        User admin = new User("admin", "1234");
        User businessA = new User("businessA", "123qweqwe");
        User customer = new User("customer", "123qwe");

        User availableUser = new User();

        userMap.put("admin", admin);
        userMap.put("businessA", businessA);
        userMap.put("customer", customer);


        users.add(admin);
        users.add(businessA);
        users.add(customer);

        int[] ints = new int[1];

        try {
            LOG.info(ints[2]);
        }catch (IndexOutOfBoundsException e){
            LOG.error("Обращение за пределами массива", e);
        }

        for (String username : userMap.keySet()) {
            User cycleUser = userMap.get(username);
            StringBuilder builder = new StringBuilder();

            builder.append("Current user data: {")
                    .append("\n")
                    .append("user id: ")
                    .append(cycleUser.getId())
                    .append("\n")
                    .append("Hidden password: ")
                    .append(cycleUser.getPassword(true))
                    .append("\n");
            LOG.info(username.toUpperCase());

            /*
            LOG.info("Login: " + userMap.get(username).getUsername());
            LOG.info("Password: " + userMap.get(username).getPassword(true));
            LOG.info("True Password: " + userMap.get(username).getPassword());
            */

            LOG.info(builder.toString());


        }
        LOG.info("==finish==");
    }

}

/*


        ClassA obj2 = new ClassA();
        ClassB obj3 = new ClassB();

        System.out.println(obj2.methA(i));
        System.out.println(obj3.methB(i));
    }
}
      System.out.println("==start==");

        int[] intArray = new int[]{2, 4, 5, 6, 235};
        int[] ints = new int[4];

        List<Integer> intList = new ArrayList();
        intList.add(235);
        intList.add(7);
        intList.add(6);
        intList.add(5);
        intList.add(3);
        intList.add(2);


        ints[0] = 5;

        int b = 0;

        while (b!=6){
            System.out.println("Current value of b is " + b);
            b++;
        }

        System.out.println("=====");

 */
        /*
        do {
            System.out.println("Current value of b is " + b);
            b++;
        }while (b!=6);
*/
  /*
        Calc calc = new Calc();

        for (int element : intList) { //контркция "for each"
            System.out.println("Result: " + calc.sum(element, 4));
        }



        //   try {
       // System.out.println("Result: " + calc.sum(2.4, 4));
        // System.out.println("Our element: " + ints[0]);
        //    } catch (Exception e){
        //        System.out.println("Found exception");
        System.out.println("==finish==");
    }
    }


 /*       Variables v = new Variables();
        Variables v1 = new Variables();



        v.helloWorld = "Hello, Java!";

        int b = 30;

        boolean c = false;

        if(b<35) {
           switch (b){
               case 39:
                    System.out.println("equal 39");
                    break;
               case 30:
                    System.out.println("too low");
                    break;
               default:
                   System.out.println("");
           };

        } else if (b==40){
            System.out.println("equal");
        }
        else {
            System.out.println("no");
        }


        v.a = 40;

        switch (v.a){
            case 40:
                System.out.println("equal");
                break;
            case 10:
                System.out.println("yes");
                break;
            default:
               System.out.println("no");
        }


       someStatic = "Redifined static";

       Object o = new Object ();

       //  System.out.println(v.helloWorld);
        // System.out.println(v1.helloWorld);
        // System.out.println(someStatic);

       //System.out.println(a + 20 + " and some string and " + v);

    }

   */


