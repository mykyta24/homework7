public class Game {
    enum gameType {
        soccer,
        hockey,
        rugby;

    }

    public static double game(double a, double b, gameType game) {
        double result = 0;

        try {

            switch (game) {
                case soccer:
                    result = a * b;
                    break;
                case hockey:
                    result = a + b;
                    break;

                case rugby:
                    result = a / b;
                    break;

                default:
                    result = 0;

            }
        } catch (Exception err) {
            System.out.println("Something bad has happened ");
            //   throw err;

        }



        return result;
    }
}






