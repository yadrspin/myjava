public class method {

    public static void main(String[] args) {
        int[] arr = new int[]{10,1,3,2,4,6,5,7,9,8};
        int arrLength = arr.length;
        for(boolean sorted = false; sorted != true; arrLength--){
            sorted = true;
            for(int i = 1; i < arrLength; i++){
                if(arr[i-1] > arr[i]) {
                    sorted = false;
                    int buffer = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = buffer;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
