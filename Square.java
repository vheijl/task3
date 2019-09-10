public class Square {
    public static void main(String[] args) {

        int length = Integer.parseInt(args[0]);

        if (length > 0 && length <= 20) {
            for(int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    
                    if (i > 0 && i < length - 1 && j > 0 && j < length - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }

                }
                System.out.println();
            }

        }
    }
} 