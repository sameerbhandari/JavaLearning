public class LinkedListClass {
    int n;
    LinkedListClass nextItem;

    public LinkedListClass getNextItem() {
        return nextItem;
    }
    public LinkedListClass(int n){
        this.n = n;
    }

    public LinkedListClass addItem(int n, LinkedListClass list){
        LinkedListClass newNode = new LinkedListClass(n);
        LinkedListClass currentNode = list;
        while(list.nextItem!=null){
            currentNode = list.nextItem;
        }
        currentNode.nextItem = newNode;
        return list;
    }

    public LinkedListClass reverseList(int start, int end, LinkedListClass list){
        LinkedListClass currentNode = list;
        LinkedListClass startingNode;
        LinkedListClass endingNode;
        int currentNodeIndex = 0;

        while(currentNodeIndex!=start-1){
            currentNode = currentNode.nextItem;
            currentNodeIndex++;
        }
        startingNode = currentNode;
        while(currentNodeIndex!=end){
            currentNode = currentNode.nextItem;
            currentNodeIndex++;
        }
        endingNode = currentNode;

        LinkedListClass tempNode = startingNode;

        while(tempNode != endingNode){
            tempNode.nextItem.nextItem = tempNode;

        }
    return list;
    }
}
