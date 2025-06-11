public class CustomArraylist {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomArraylist() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        Double newCapacity;
        newCapacity = capacity * 1.5;
        String[] newElements = new String[newCapacity.intValue()];
        for (int i = 0; i < elements.length; i++) {
             newElements[i] = elements[i];
        }
        capacity = newElements.length;
        elements = new String[capacity];

        for (int i = 0; i < newElements.length; i++) {
            elements[i] = newElements[i];
        }
    }
}
