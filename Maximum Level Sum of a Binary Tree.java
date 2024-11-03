/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE;
        int level=0;
        int j=0;
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()){
            int lvl = que.size();
            j++;
            int sum=0;
            for(int i=0;i<lvl;i++){
                if(que.peek().left!= null) 
                que.offer(que.peek().left);
                if(que.peek().right!= null) 
                que.offer(que.peek().right);
                sum+=que.poll().val;
            }
            if(sum>max){
                max=sum;
                level=j;
            }
        }
        return level; 
    }
}
