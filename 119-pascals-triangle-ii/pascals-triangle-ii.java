class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<>();
        long val=1;
        row.add((int)val);
        for(int K=1;K<=rowIndex;K++){
            val=val*(rowIndex-K+1)/K;
            row.add((int)val);

        }
        return row;
        
    }
}