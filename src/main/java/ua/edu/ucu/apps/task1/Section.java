package ua.edu.ucu.apps.task1;

public abstract class Section {
    
    private int denomanation;

    private Section next;

    public Section(int denomanation) {
        this.denomanation = denomanation;
    }

    public void setNext(Section next) {
        this.next = next;
    }

    private boolean hasNext() {
        return next != null;
    }

    public void process(int amount) {
        int left = amount % denomanation;
        if (left != 0) {
            if (hasNext()) {
                next.process(left);
            } else {
                throw new IllegalArgumentException("Invalid amount");
            }
        }
        System.out.println("Denomination: " 
        + denomanation
        + " Quantity: "
        + amount / denomanation);
    }
}
