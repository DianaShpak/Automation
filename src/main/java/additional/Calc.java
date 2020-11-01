package additional;

public class Calc {

    public int sum(int var1, int var2) {

        System.out.println("Action: " + var1 + " + " + var2);
        return var1 + var2;
    }

        public int sum(Object var1, int var2) {
            System.out.println("Action: " + var1 + " + " + var2);
            Object var = var1;
            if (var1 instanceof String) {
                try {
                    int result = Integer.parseInt(var1.toString());
                    return result + var2;
                } catch (NumberFormatException m) {
                    System.out.println("Catch NumberFormatException");
                    double result = Double.parseDouble(var1.toString());
                    return (int) result + var2;
                } catch (Exception e) {
                    System.out.println("возникла ошибка: " + e.getMessage());
                    return -1;
                }
            } else if (var1 instanceof Double) {
            return (int) Double.parseDouble(var1.toString()) + var2;
          } else {
            return -1;

    }


    }
}
