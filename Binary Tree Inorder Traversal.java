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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<Integer>();
        Stack<TreeNode> Stack = new Stack<TreeNode>();
        TreeNode node = root;
        while(true){
            if(node != null){
                Stack.push(node);
                node = node.left; 
            } else {
                if(Stack.isEmpty()){
                    break;
                }
                node = Stack.pop();
                answer.add(node.val);
                node = node.right;
            }
        }
        return answer;
    }
}
