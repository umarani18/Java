class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Singlell{
    static Node head=null;
    public static void insertAtBeg(int val){
        Node nn=new Node(val);
        if(head==null){
            head=nn;
        }else{
            nn.next=head;
            head=nn;
        }
    }
    public static void insertAtMid(int val,int pos){
        Node nn=new Node(val);
        if(head==null){
            head=nn;
        }else{
            Node temp=head;
            for(int i=2;i<pos;i++){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
    }
    public static void insertAtEnd(int val){
        Node nn=new Node(val);
        if(head==null){
            head=nn;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }
    public static void delAtBeg(){
        if(head.next!=null){
            head=head.next;
        }else{
            head=null;
        }
    }
    public static void delAtMid(int pos){
        Node temp=head;
        if(pos==1){
            delAtBeg();
        }else{
            for(int i=2;i<pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public static void delAtEnd(){
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node h=new Node(10);
        Node f=new Node(20);
        Node s=new Node(30);
        head=h;
        head.next=f;
        f.next=s;
        display();
        insertAtEnd(40);
        display();
        insertAtBeg(20);
        display();
        insertAtMid(10,2);
        display();
        delAtBeg();
        display();
        delAtMid(2);
        display();
        delAtEnd();
        display();
    }
}