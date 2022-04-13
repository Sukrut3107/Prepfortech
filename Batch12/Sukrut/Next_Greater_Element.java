public static void NGE(int arr[], int n){
        int next,i,j;
        n = arr.length;
        for (i = 0; i < n; i++) {
            next = -1;
            for ( j = i+1; j <n ; j++) {
                if(arr[i]<arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+"-- "+next);
        }
    }
