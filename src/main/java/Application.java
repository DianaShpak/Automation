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


        LOG.info("==begin==");



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

        User admin = new User("administrator", "1234");
        User businessA = new User("business", "123qweqwe");
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
                    .append("user's id: ")
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
        LOG.info("==end==");
    }

}


