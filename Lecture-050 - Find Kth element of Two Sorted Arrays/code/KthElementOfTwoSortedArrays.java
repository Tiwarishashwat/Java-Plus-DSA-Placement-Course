public long kthElement( int nums1[], int nums2[], int n, int m, int k) {
        // make num1 as min length array.
        // call same function, and change the params
        // if nums1 was greater and nums2 was smaller
        // so because we swapped these two, now nums1 is smaller and
        // nums2 is greater.
        if(nums1.length > nums2.length){
            return kthElement(nums2,nums1,m,n,k);
        }
        // nums1 is smaller and num2 is greater.
        int n1 = nums1.length;
        int n2 = nums2.length;
        // int N = n1+n2;
        int start = Math.max(0, k-n2); //0;
        int end = Math.min(k, n1); // n1;
        while (start<=end){
            // mid -> cut1
            int cut1 = start + (end - start)/2;
            // K - length of cut1
            int cut2 = k - cut1;
            // l1,l2, r1 and r2.
            int l1 = (cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
            int l2 = (cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
            int r1 = (cut1==n1)?Integer.MAX_VALUE:nums1[cut1];
            int r2 = (cut2==n2)?Integer.MAX_VALUE:nums2[cut2];

            // check if cut is valid
            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            } else if (l1>r2) {
                end = cut1-1;
            } else{
                start = cut1+1;
            }
        }
    return 0; // to avoid error
        
    }