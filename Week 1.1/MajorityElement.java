class Solution {
    public int majorityElement(int[] arr) {
     int cnt=0;
     int ele=0;
     int n=arr.length;
     for(int i=0;i<n;i++){
        if(cnt==0){
            cnt=1;
            ele=arr[i];
        }
        else if(ele==arr[i]){
            cnt++;
        }
        else{
            cnt--;
        }
     }   
     cnt=0;
     for(int i=0;i<n;i++){
        if(arr[i]==ele){
            cnt++;
        }
     }
     if(cnt> n/2){
        return ele;
     }
     return -1;
    }
}