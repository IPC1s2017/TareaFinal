public class EF2 {

    int tem;

    public static void main(String[] args) {
        int array[] = {2,3,8,109,13,4,18,10,23,18,50,11,13,2};
        EF2 bs = new EF2();
        bs.Sort(array);
        System.out.print("{");
        bs.print(array);

    }

    public void Sort(int array[]) {
        for (int i = 0; i < (array.length); i++) {
            for (int j = 1; j < (array.length); j++) {
                if (array[j - 1] > array[j]) {
                    tem = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tem;

                }

            }
        }

    }

    public void print(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }

        }

        System.out.print("}");

        System.out.println("");
    }

}