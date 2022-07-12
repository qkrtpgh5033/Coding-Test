package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 -트리 순회
 *

 7
 A B C
 B D .
 C E F
 E . .
 F . G
 D . .
 G . .

 */

class Node{
    char data;
    Node leftNode;
    Node rightNode;

    public Node(char data) {
        this.data = data;
    }
}



public class Problem_1991 {
    static Node headNode = new Node('A');
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            StringTokenizer token = new StringTokenizer(br.readLine(), " ");
            char root = token.nextToken().charAt(0);
            char left = token.nextToken().charAt(0);
            char right = token.nextToken().charAt(0);

            insertNode(headNode, root, left, right);

        }

        preOrder(headNode);
        System.out.println();
        inOrder(headNode);
        System.out.println();
        postOrder(headNode);
        System.out.println();


    }


    public static void insertNode(Node tempNode, char root, char left, char right) {

        if(tempNode.data == root){
            tempNode.leftNode = (left == '.' ? null : new Node(left));
            tempNode.rightNode = (right == '.' ? null : new Node(right));
        }
        else{
            if(tempNode.leftNode != null) insertNode(tempNode.leftNode, root, left, right);
            if(tempNode.rightNode != null) insertNode(tempNode.rightNode, root, left, right);
        }
    }

    public static void preOrder(Node node) {
        if(node ==null) return;
        System.out.print(node.data);
        preOrder(node.leftNode);
        preOrder(node.rightNode);
    }

    public static void inOrder(Node node) {
        if(node ==null) return;
        inOrder(node.leftNode);
        System.out.print(node.data);
        inOrder(node.rightNode);
    }

    public static void postOrder(Node node) {
        if(node ==null) return;
        postOrder(node.leftNode);
        postOrder(node.rightNode);
        System.out.print(node.data);
    }

}
