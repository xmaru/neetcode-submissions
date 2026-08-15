class DynamicArray {
    int capacity;
    int length;
    int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        length = 0;
        arr = new int[capacity];
    }

    public int get(int i) {
        if (i < length) {
            return arr[i];
        }
        // throw error for out of bounds exception
        return -1;
    }

    public void set(int i, int n) {
        if (i < length) {
            arr[i] = n;
            return;
        }
        return;
        // throw out of bounds exception
    }

    public void pushback(int n) {
        if (length == capacity) {
            this.resize();
        }
        
        // insert at next empty position
        arr[length] = n;
        length++;
    }

    public int popback() {
        int num = this.arr[length-1];
        if (length > 0) {
            length--;
        }
        return num;
    }

    private void resize() {
        // Create new array of double capacity
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];

        // copy elements to newArr
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
