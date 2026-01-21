package Basic_projects.LList;

public class LList {
    node head;
    int size = 0;
    private class node{
        int num;
        node next;
        node(int num){
            this.num = num;
            this.next = null;
            size++;
        }
    }
    void size(){
        System.out.println("Size of the list is -> " + size);
    }
    void add(int num){
        node Node = new node(num);
        if(head == null){
            head = Node;
            return;
        }
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = Node;
    }
    void display(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        node temp = head;
        System.out.print("head -> ");
        while (temp != null){
            System.out.print("[" + temp.num + "] ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtFirst(int num){
        if(head == null){
            head = new node(num);
            return;
        }
        node temp = new node(num);
        temp.next = head;
        head = temp;
    }
    void insertAtLast(int num){
        node temp = head;
        if(temp == null){
            System.out.println("No elements present so adding it as new element");
            add(num);
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new node(num);
    }
    void removeFirst(){
        if(head == null){
            System.out.println("Already empty list");
            return;
        }
        head = head.next;
        size--;
    }
    void removeLast(){
        node temp = head;
        if(temp.next == null){
            removeFirst();
            size--;
            return;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    void removeAt(int index){
        node temp = head;
        if (index > size){
            System.out.println("the list is smaller than the entered position");
            return;
        }
        if(index < 1){
            System.out.println("enter a valid position");
            return;
        }
        if (index == 1){
            head = head.next;
            size--;
            return;
        }
        for (int i = 2; i < index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
