package com.Hemantsah._11.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


  //levelOrder(102)
  public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> list1 = new ArrayList<>();
      List<Integer> list2 = new ArrayList<>();
      Queue<TreeNode> q = new LinkedList<>();
      if(root==null){
          return list1;
      }
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
          TreeNode currNode = q.remove();
          if(currNode==null){
              list1.add(list2);
              list2.clear();
              if(q.isEmpty()){
                  break;
              }

              q.add(null);
          }else{
              list2.add(currNode.val);
              if(currNode.left!=null){
                  q.add(currNode.left);
              }
              if(currNode.right!=null){
                  q.add(currNode.right);
              }
          }
      }
      return list1;
  }


    public static void main(String[] args) { //may complete it later
        LeetCode lcQues = new LeetCode();
//        lcQues.levelOrder(1);
    }
}
