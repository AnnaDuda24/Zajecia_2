package Zajęcia_2;

    public class NewSwitch2 {
        public static void main(String[] args) {
            String str = "dwa";
            int number;

            number = switch (str) {
                case "jeden":
                case "jedynka":
                   yield 1;
                case "dwa":
                case "dwójka":
                    yield 2;
                case "trzy":
                case "trójka":
                   yield 3;
                default:
                   yield 0;
            };
            System.out.println(number);
        }
    }
