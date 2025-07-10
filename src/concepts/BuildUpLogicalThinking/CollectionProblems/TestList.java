package concepts.BuildUpLogicalThinking.CollectionProblems;

import javax.xml.transform.Templates;

public class TestList {
    TestList next;
    int value;

    TestList(int value){
        this.value = value;
    }

    TestList addItemToList(int value, TestList list){
        TestList currentNode = list;

        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new TestList(value);
        return list;
    }

    TestList removeOneElement(int value, TestList list){
        if (list == null) {
            return null;
        }
        if (list.value == value) {
            return list.next;
        }

        TestList currentNode = list;
        TestList prev = null;

        while (currentNode.next != null){
            if(currentNode.value == value){
                prev.next = currentNode.next;
                break;
            }
            prev = currentNode;
            currentNode = currentNode.next;
        }
        return list;
    }

    TestList reverseList(TestList list){
        TestList prev = null;
        TestList current = list;

        while(current != null){
            TestList temp = current;

            current.next = prev;
            current = temp.next;

        }

        return  prev;
    }



}
