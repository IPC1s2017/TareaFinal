public class EF2 {

    public static void main(String args[]) {

        int array[] = {2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2};
        System.out.println("------- ENTRADA -------");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("{ ");
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(" "+array[i]);
        }
        System.out.println(" }");
        
        
        EF2 bs = new EF2();
        System.out.println("------- SALIDA -------");
        bs.sort(array);
        bs.print(array);
    }

    public void sort(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temporal = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temporal;
                }
            }
            
        }
    }

    public void print(int array[]) {
                for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("{ ");
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(" "+array[i]);
        }
        System.out.println(" }");
    }
}