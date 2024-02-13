package dataStructures;

class Neighbor {
    public String homeOwnerName;
    public int houseNumber;

    public Neighbor next;
    public Neighbor previous;

    public Neighbor(String homeOwnerName, int houseNumber) {
        this.homeOwnerName = homeOwnerName;
        this.houseNumber = houseNumber;
    }

    public void display() {
        System.out.println(homeOwnerName + ": " + houseNumber + " Private Drive");
    }

    public String toString() {
        return homeOwnerName;
    }
}

public class DoubleEndedLinkedList {

    Neighbor firstLinkNeighbor;
    Neighbor lastLinkNeighbor;

    public void insertInFirstPosition(String homeOwnerName, int houseNumber) {
        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        if (isEmpty()) {
            lastLinkNeighbor = theNewLink;
        } else {
            firstLinkNeighbor.previous = theNewLink;
        }

        theNewLink.next = firstLinkNeighbor;
        firstLinkNeighbor = theNewLink;
    }

    public void insertInLastPosition(String homeOwnerName, int houseNumber) {
        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        if (isEmpty()) {
            firstLinkNeighbor = theNewLink;
        } else {
            lastLinkNeighbor.next = firstLinkNeighbor;
        }
        lastLinkNeighbor = theNewLink;
    }

    public boolean isEmpty() {
        return (firstLinkNeighbor==null);
    }

    public boolean insertAfterKey(String homeOwnerName, int houseNumber, int key) {

        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        Neighbor currentNeighbor = firstLinkNeighbor;

        while (currentNeighbor.houseNumber != key) {
            currentNeighbor = currentNeighbor.next;

            if (currentNeighbor == null) {
                return false;
            }
        }

        if (currentNeighbor == lastLinkNeighbor) {
            theNewLink.next = null;
            lastLinkNeighbor = theNewLink;
        } else {
            theNewLink.next = currentNeighbor.next;
            currentNeighbor.next.previous = theNewLink;
        }

        theNewLink.previous = currentNeighbor;
        currentNeighbor.next = theNewLink;
        return true;
    }

    public void insertInOrder(String homeOwnerName, int houseNumber) {
        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        Neighbor previousNeighbor = null;
        Neighbor currentNeighbor = firstLinkNeighbor;

        while ((currentNeighbor != null) && (houseNumber > currentNeighbor.houseNumber)) {
            previousNeighbor = currentNeighbor;
            currentNeighbor = currentNeighbor.next;
        }

        if (previousNeighbor == null) {
            firstLinkNeighbor = theNewLink;
        } else {
            previousNeighbor.next = theNewLink;
        }

        theNewLink.next = currentNeighbor;
    }

    public static void main(String[] args) {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.insertInOrder("Marin 1", 7);
        doubleEndedLinkedList.insertInOrder("Marin 2", 8);
        doubleEndedLinkedList.insertInOrder("Marin 3", 5);
        doubleEndedLinkedList.insertInOrder("Marin 4", 3);

        doubleEndedLinkedList.insertAfterKey("marko", 11, 2);

        doubleEndedLinkedList.display();
    }

    public void display() {
        Neighbor theLink = firstLinkNeighbor;

        while (theLink != null) {
            theLink.display();
            System.out.println("The next link: " + theLink.next);
            theLink = theLink.next;

            System.out.println();
        }
    }
}

class NeighborIterator {

    Neighbor currentNeighbor;
    Neighbor prevNeighbor;

    DoubleEndedLinkedList doubleEndedLinkedList;

    NeighborIterator(DoubleEndedLinkedList doubleEndedLinkedList) {
        this.doubleEndedLinkedList = doubleEndedLinkedList;
        currentNeighbor = doubleEndedLinkedList.firstLinkNeighbor;
        prevNeighbor = doubleEndedLinkedList.lastLinkNeighbor;
    }

    public boolean hasNext() {
        if (currentNeighbor.next != null) {
            return true;
        }
        return false;
    }

    public Neighbor next () {
        if (hasNext()) {
            prevNeighbor = currentNeighbor;
            currentNeighbor= currentNeighbor.next;

            return currentNeighbor;
        }

        return null;
    }

    public void remove() {
        if (prevNeighbor == null) {
            doubleEndedLinkedList.firstLinkNeighbor = currentNeighbor.next;
        } else {
            prevNeighbor.next = currentNeighbor.next;

            if (currentNeighbor.next == null) {
                currentNeighbor = doubleEndedLinkedList.firstLinkNeighbor;
                prevNeighbor = null;
            } else {
                currentNeighbor = currentNeighbor.next;
            }
        }
    }
}


