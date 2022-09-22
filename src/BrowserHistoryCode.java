class BrowserHistory {
    public class Node{
        String url;
        Node next, prev;
        public Node(String url) {
            this.url = url;
            next = null;
            prev = null;
        }
    }

    Node head, curr;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        curr = head;
    }



    public void visit(String url) {

        Node node = new Node(url);
        curr.next = node;
        node.prev = curr;
        curr = node;
        System.out.println("Directing to: " + url);

    }

    public String back(int steps) {
        while (curr.prev != null && steps-- > 0) {
            curr = curr.prev;
        }
        return curr.url;

    }

    public String forward(int steps) {
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.url;

    }


}

    public class BH {
        public static void main(String[] args) {

            BrowserHistory obj = new BrowserHistory("Home.com");
            obj.visit("youtube.com");
            obj.visit("facebook.com");
            obj.visit("linkedin.com");
            String back_step = obj.back(1);
            System.out.println("Redirected to " + back_step);
            String fwd_step = obj.forward(2);
            System.out.println("Redirected to " + fwd_step);
            //System.out.println();
            obj.visit("gmail.com");
            back_step = obj.back(2);
            System.out.println("Redirected to " + back_step);
            back_step = obj.back(7);
            System.out.println("Redirected to " + back_step);



        }
    }
