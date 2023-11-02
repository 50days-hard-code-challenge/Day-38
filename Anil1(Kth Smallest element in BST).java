class Solution {
    int res = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;

    }
    public void inorder(TreeNode root, int k){
        // Base case
        if(root == null){
            return ;
        }
        if(root.left != null)
        inorder(root.left,k);
        count++;
        if(count == k){
            res = root.val;
            return;
        }

        if(root.right!=null)
        inorder(root.right,k);
    }
}
