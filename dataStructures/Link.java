package dataStructures;

import java.util.LinkedList;

public class Link {
    public String bookName;
    public int millionsSold;

    public Link next;

    public Link(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display() {
        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }

    public String toString() {
        return bookName;
    }


    public static void main(String[] args) {
        LinkList linkedList = new LinkList();

        linkedList.insertFirstLink("Don Marko", 500);
        linkedList.insertFirstLink("A Tale of Two Cities", 200);
        linkedList.insertFirstLink("THe lord", 150);
        linkedList.insertFirstLink("Harry Potter", 120);


        linkedList.removeFirst();

        System.out.println(linkedList.find("THe lord").bookName + " Was Found");

        linkedList.removeLink("THe lord");

        linkedList.display();
    }
}

class LinkList {

    public Link firstLink;

    LinkList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return (firstLink == null);
    }

    public boolean esEmpty() {
        return (firstLink==null);
    }

    public void insertFirstLink(String bookName, int millionsSold) {
        Link newLink = new Link(bookName, millionsSold);

        newLink.next = firstLink;

        firstLink = newLink;
    }

    public Link removeFirst(){
        Link linkReference = firstLink;



        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty LinkList");
        }

        return linkReference;
    }

    public void display() {
        Link theLink = firstLink;

        while (theLink != null){
            theLink.display();
            System.out.println("Next link: " + theLink.next);

            theLink = theLink.next;
            System.out.println();
        }
    }

    public Link find(String bookName) {
        Link theLink = firstLink;

        if (!isEmpty()) {
            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("Empty LinkList");
        }

        return theLink;
    }

    public Link removeLink (String bookName) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while (currentLink.bookName != bookName) {

            if (currentLink.next == null) {
                return null;
            } else {
                previousLink = currentLink;

                currentLink = currentLink.next;
            }
        }

        if (currentLink == firstLink) {
            firstLink = firstLink.next;
        } else {
            previousLink.next = currentLink.next;
        }

        return currentLink;
    }

}




