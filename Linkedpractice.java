public class Linkedpractice {
    Node head;
     class Node{
        
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void  addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void  addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node curNode=head;
        while(curNode.next!=null)
        {
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }
    public  void printlns()
    {   
        if(head==null)
        {
            System.out.println("NULL");
            return;
        }
        Node curNode=head;
        while(curNode!=null)
        {
            System.out.print(curNode.data+"-->");
            curNode=curNode.next;
        }
        System.out.println("NULL");

    }




    public static void main(String[] args) {
        Linkedpractice ll=new Linkedpractice();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.printlns();
        ll.addLast(4);
        ll.addLast(5);
        ll.printlns();
    


        
    }
    
}
