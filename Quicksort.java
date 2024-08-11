public class Quicksort {
    public static void quick(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        int pivot= partation(arr,si,ei);
        quick(arr, si, pivot-1);
        quick(arr, pivot+1, ei);
    }
    public static int partation(int arr[], int si, int ei){
        int i=si-1; //to make space for element smaller then pi.
        int pi=arr[ei];

        for(int j=si; j<ei; j++){
            if (arr[j]<pi) {
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pi;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        quick(arr, 0, arr.length-1);
        print(arr);
    }
}
