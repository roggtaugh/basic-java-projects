package Basic_projects.LList;

public class Main {
    public static void main(String[] args) {
        LList list = new LList();
        list.display();
        list.insertAtLast(50);
//        list.display();
        list.add(56);
        list.add(556);
        list.add(6);
        list.add(5);
        list.display();
        System.out.println(list.size);
//        list.removeLast();
        list.removeAt(6);
        list.display();
        System.out.println(list.size);
    }
}
