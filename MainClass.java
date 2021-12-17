
public class MainClass {

    public static void main(String[] args) {

        ListNode node = null;

        for (int i = 1;i<10;i++){
            node = addNodeAtLast(i,node);
        }

      //  node =  addNodeAtPos(5,24,node);
       // node = deleteFirstNode(node);
         node = deleteLastNode(node);
         node = deleteLastNode(node);
         node = deleteLastNode(node);
         node = deleteLastNode(node);
        while (node !=null){
            System.out.print(node.getData() + " --> ");
            node = node.getNext();
        }

        System.out.print(" null");

    }

    public static ListNode deleteFirstNode(ListNode node){
        ListNode temp = node;
        ListNode newNode = node.getNext();
        temp.setNext(null);
        node = newNode;
        return  node;
    }

    public static  ListNode deleteLastNode(ListNode node){

        ListNode currentNode = node;

        ListNode prevNode = null;
        while (currentNode.getNext()!= null){
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }

        prevNode.setNext(null);
        return node;
    }

    public  static ListNode addNodeAtBefore(int data,ListNode node){
        ListNode newNode = new ListNode(data);
        if(node == null){
            return  newNode;
        }else{
            newNode.setNext(node);
            node = newNode;
        }

        return node;
    }

    public static ListNode addNodeAtLast(int data,ListNode node){

        ListNode newNode = new ListNode(data);

        if(node == null){
            return newNode;
        }else{

            ListNode currentNode = node;

            while(currentNode.getNext() !=null){
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(newNode);

            return node;
        }
    }
    public static ListNode addNodeAtPos(int pos,int data,ListNode node){

        ListNode newNode = new ListNode(data);

        if(pos == 1){
            newNode.setNext(node);
            node = newNode;
            return  node;
        }else{
            ListNode currentNode = node;
            int count = 1;
            while(count < pos-1){
                currentNode = currentNode.getNext();
                count++;
            }

            ListNode nextNode = currentNode.getNext();
            currentNode.setNext(newNode);
            newNode.setNext(nextNode);
        }
        return node;
    }
}



class ListNode{

    private int data;
    private ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

