package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca pojedynczy węzeł (element);
 * Zawiera wartość całkowitą oraz referencje do poprzedniego i następnego węzła.
 */
public class Node {

    private final int value;
    private Node prev;
    private Node next;

    /**
     * Konstruktor inicjalizujący nowy węzeł z podaną wartością.
     *
     * @param i wartość przechowywana w węźle
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Zwraca wartość przechowywaną w węźle.
     *
     * @return wartość całkowita węzła
     */
    public int getValue() {
        return value;
    }

    /**
     * Zwraca referencję do poprzedniego węzła.
     *
     * @return poprzedni węzeł
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Ustawia referencję do poprzedniego węzła.
     *
     * @param prev poprzedni węzeł
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Zwraca referencję do następnego węzła.
     *
     * @return następny węzeł
     */
    public Node getNext() {
        return next;
    }

    /**
     * Ustawia referencję do następnego węzła.
     *
     * @param next następny węzeł
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
