import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    int data;
    LinkedListClass next;

    public LinkedListClass(int data) {
        this.data = data;
        this.next = null;
    }

    public void addItemAtEnd(int data) {
        LinkedListClass newNode = new LinkedListClass(data);
        LinkedListClass current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        LinkedListClass current = this;
        while (current != null) {
            System.out.print(current.data + "=>");
            current = current.next;
        }
        System.out.println("null");
    }

    public LinkedListClass reverseList() {
        LinkedListClass current = this;
        LinkedListClass previous = null;

        while (current != null) {
            LinkedListClass next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public int lengthOfList() {
        int count = 0;
        LinkedListClass current = this;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int searchElementIndex(int searchItem) {
        //return the index of the searchItem
        LinkedListClass current = this;
        int index = 1;

        while (current != null) {
            if (current.data == searchItem) {
                break;
            }
            current = current.next;
            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        LinkedListClass l1 = new LinkedListClass(5);
        l1.addItemAtEnd(6);
        l1.addItemAtEnd(8);
        l1.addItemAtEnd(9);
        l1.addItemAtEnd(10);
        System.out.println("Length of List => " + l1.lengthOfList());
        l1.printList();
    }
}
