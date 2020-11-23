import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args)
    {
        //Arrays.binarySearch()
        byte byteArr[] = {10,20,15,22,35};
        byte byteKey = 22;
        System.out.println(byteKey + " trouvé à l'index = " +Arrays.binarySearch(byteArr,0,4,byteKey));
        //Arrays.equals()
        int[] array1 = new int [] {1, 2, 3, 4};
        int[] array2 = new int [] {1, 2, 3, 4};
        int[] array3 = new int [] {1, 2, 4, 3};

        System.out.println("array1 égale à array2 : " +
                Arrays.equals(array1, array2));
        System.out.println("array1 égale à array3 : " +
                Arrays.equals(array1, array3));
        //Arrays.fill()
        int array[] = {1, 2, 3, 4, 5, 6, 7};

        // 1-Pour remplir un tableau complet avec une valeur particulière
        Arrays.fill(array, 12);
        System.out.println( Arrays.toString(array));
        // 2-remplir une partie du tableau de l'index 2 à l'index 5
        Arrays.fill(array, 2, 6, 20);
        System.out.println(Arrays.toString(array));

        // Arrays.parallelSort()
        int nombres[] = {7, 5,6,4,2, 3, 1 };
        System.out.print("Tableau non trié: ");
        System.out.println(Arrays.toString(nombres));
        Arrays.parallelSort(nombres);
        System.out.print("Tableau trié: ");
        System.out.println(Arrays.toString(nombres));
        System.out.println();

        // Arrays.copy
        int tableau1[] = {1, 2, 3, 4, 5};
        // un tableau2[] de la même taille que tableau1[]
        int tableau2[] = new int[tableau1.length];
        System.arraycopy(tableau1, 0, tableau2, 0, 5);
        System.out.println("tableau1 : "+Arrays.toString(tableau1));
        System.out.println("tableau2 : "+Arrays.toString(tableau2));
    }
}
