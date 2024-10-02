class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       if(root==null)
       return new ArrayList<>();
       else
       {
        List<Integer> result=new ArrayList<>();
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
       }
        
    }
}