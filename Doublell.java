class Node_d{
    int data;
    Node_d prev,next;
    Node_d(int data){
        this.data=data;
        this.prev=this.next=null;
    }
}
class Doublell{
    static Node_d head=null;
    public static void insertAtBeg(int val){
        Node_d nn=new Node_d(val);
        if(head==null){
            head=nn;
        }else{
            nn.next=head;
            head.prev=nn;
            head=nn;
        }
    }
    public static void insertAtEnd(int val){
        Node_d nn=new Node_d(val);
        if(head==null){
            head=nn;
        }else{
            Node_d temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
            nn.prev=temp;
        }
    }
    public static void insertAtMid(int val,int pos){
        Node_d nn=new Node_d(val);
        if(head==null){
            head=nn;
        }else if(pos==1){
            insertAtBeg(val);
        }else{
            Node_d temp=head;
            for(int i=2;i<pos;i++){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next.prev=nn;
            temp.next=nn;
            nn.prev=temp;
        }
    }
    public static void delAtBeg(){
        if(head.next==null){
            head=null;
        }else{
            head=head.next;
            head.prev=null;
        }
    }
    public static void delAtEnd(){
        if(head.next==null){
            head=null;
        }else{
            Node_d temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public static void delAtMid(int pos){
        if(pos==1){
            delAtBeg();
        }else{
            Node_d temp=head;
            for(int i=2;i<pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.next.prev=temp;
        }
    }
    public static void display(){
        Node_d temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        head=new Node_d(15);
        Node_d f=new Node_d(20);
        Node_d s=new Node_d(30);
        head.next=f;
        f.prev=head;
        f.next=s;
        s.prev=f;
        display();
        insertAtBeg(10);
        display();
        insertAtEnd(40);
        display();
        insertAtMid(50,3);
        display();
        delAtBeg();
        display();
        delAtEnd();
        display();
        delAtMid(2);
        display();
    }
}