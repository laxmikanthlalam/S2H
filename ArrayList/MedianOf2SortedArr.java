         {
                arr.add(nums1[i]);
                i++;
            }
            else{
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i<n1)
        {
            arr.add(nums1[i]);
            i++;

        }
        while(j<n2)
        {
            arr.add(nums2[j]);
            j++;
        }
        double mide=0;
        if(n%2==0)
        {
           int mid1 = n/2;
           mide = (arr.get(mid1)+arr.get(mid1-1))/2.0;
          
           return mide;
 
        }
        else
        {
           int mid = n/2;
           return arr.get(mid); 
        }


             

    }
}
