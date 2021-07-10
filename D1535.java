import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1535 {
    static class node {
        node left, right;
        char character;
        int index;

        public node(char c, int i) {
            character = c;
            index = i;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        String str = br.readLine().trim();
        String s = sb.append(str + "*").reverse().toString();
        node root = makeTree(s, 1);
        StringBuilder ans = new StringBuilder();
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            String[] query = br.readLine().split(" ");
            int index = Integer.parseInt(query[0]);
            char c = query[1].charAt(0);
            ans.append(solution(root, index, c) + "\n");
        }
        System.out.println(ans);
    }

    public static node makeTree(String s, int index) {
        if (index >= s.length() || index <= 0)
            return null;
        // System.out.println(s.charAt(index) + " " + (s.length() - index));
        node root = new node(s.charAt(index), s.length() - index);
        root.left = makeTree(s, index * 2 + 1);
        root.right = makeTree(s, index * 2);
        return root;
    }

    // public static int solution(node root, int index, char c) {
    // if (root == null)
    // return 1;
    // if (root.index == index) {
    // root.character=c;
    // if (c == '0')
    // return solution(root.left, index, c);
    // else if (c == '1')
    // return solution(root.right, index, c);
    // else
    // return solution(root.left, index, c) + solution(root.right, index, c);
    // } else {
    // if (root.character == '0')
    // return solution(root.left, index, c);
    // else if (root.character == '1')
    // return solution(root.right, index, c);
    // else
    // return solution(root.left, index, c) + solution(root.right, index, c);
    // }
    // }

    public static int solution(node root, int index, char c) {
        if (root == null)
            return 1;
        if (root.index == index)
            root.character = c;

        if (root.character == '0')
            return solution(root.left, index, c);
        else if (root.character == '1')
            return solution(root.right, index, c);
        else {
            // if (root.left == null && root.right == null)
            //     return 1;
            return solution(root.left, index, c) + solution(root.right, index, c);
        }
    }
}
