class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int l=image[0].length;
       for(int [] row:image)
       {
        for(int i=0;i<(l+1)/2;i++)
        {
            int temp=row[i]^1;
            row[i]=row[l-i-1]^1;
            row[l-i-1]=temp;
        }
       }   
       return image;
    }
}
