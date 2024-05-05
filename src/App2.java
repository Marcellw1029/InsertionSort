


public class App2 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; //seleccionamos el elemento a insertar en su posicion correcta
            int j = i - 1;
            //movemos los elementos mayores que key a una posicion adelante de su posicion actual
            while (j>=0 && arr[j]>key) {
                arr[j + 1] = arr[j];
                j--;
                
            }
            arr [j+1]= key; //insertamos key en su posicion correcta
            
        }
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println("metodo de ordenamiento por insercion ");
        int [] arr = {12, 11, 13, 5, 6};

        System.out.println("Arreglo oficial ");
        for (int num : arr) {
            System.out.println(num + " ");

            
        }
            System.out.println();

            System.out.println("====================================");
            insertionSort(arr); //llamada al metodo de ordenamiento por insercion

            System.out.println("Arreglo ordenado ");
            for (int num : arr) {
                System.out.println(num + " ");
                
            }

}
}
