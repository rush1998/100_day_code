public class Dncsol {
    public static String[] mergesort(String arr[], int lo, int hi){
        if (lo==hi) {
            String A[]={arr[lo]};
            return A;
        }
        int mid = lo+(hi-lo)/2;
        String arr1[]=mergesort(arr, lo, mid);
        String arr2[]=mergesort(arr, mid+1, hi);

        String[] arr3=merge(arr1,arr2);
        return arr3;
    }

    public static String[] merge(String arr1[], String arr2[]){
        int m=arr1.length;
        int n =arr2.length;
        String arr3[]= new String[m+n];

        int ind=0;
        int i=0;
        int j=0;

        while (i<m && j<n) {
            if (isAlphabeticallysmaller(arr1[i],arr2[j])) {
                arr3[ind]=arr1[i];
                i++;
                ind++;
            }else{
                arr3[ind]=arr2[j];
                j++;
                ind++;
            }           
        }

        while (i<m) {
            arr3[ind]=arr1[i];
            i++;
            ind++;
        }

        while (j<n) {
            arr3[ind]=arr2[j];
            j++;
            ind++;
        }
        return arr3;
    }

     static Boolean isAlphabeticallysmaller(String str1, String str2){
        if (str1.compareTo(str2)<0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static int majority(int nums[]){
        int majcount=nums.length/2;

        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if (nums[j]==nums[i]) {
                    count+=1;
                }
            }
            if (count>majcount) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String arga[]){
        // String arr[]= {"sun","earth","mars","mercury"};
        // String a[]= mergesort(arr, 0, arr.length-1);
        
        // for(int i=0; i<a.length;i++){
        //     System.out.print(a[i]);
        // }
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
}
