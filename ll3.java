public class ll3 {
    Node head;
    public class Node{
        String data;
        Node next;

        Node(String data){
        this.data = data;
        this.next = null;

    }}
    
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head== null)
        {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!=null)
        {
            lastNode = lastNode.next;

        }
        lastNode.next = newNode;


    }

    public void printList()
    {
        Node currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;

        }
        System.out.println("NULL");

        
    } 

    public static void main(String[] args) {
        ll3 list = new ll3();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();
        list.addLast("list");
        list.addLast("hello");
        list.printList();
    }

}
         
