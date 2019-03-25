package py.com.mechague;

/**
 * @author Marcos Echague
 * @since 22/02/2019
 */

//Is only String for now
public class DynamicArray{

    private Object[] array;
    private int size;
    private int capacity;

    public DynamicArray(int initialCapacity){
        capacity = initialCapacity;
        array = new Object[initialCapacity];
        size = 0;
    }

    public Object get(int index){ //O(1) --Most faster
        return array[index];
    }

    public void set(int index, String element ){ //O(1)
        array[index] = element;
    }

    public void delete(int index){ // O(n) --n is from index to length of the array

        if(index > size) {
            //no action, only return
            return;
        }

        for(int i = index +1 ; i < array.length ; i++) {
            array[i-1] = array [i];
        }

        size--;
    }

    public void add(String element){
        if(size == capacity){
            resize();
        }
        array[size] = element;
        size++;
    }

    public void insert(int index, String element){
        if(index>capacity) {
            throw new IndexOutOfBoundsException("The index is greather than the array capacity");
        }
        if(size == capacity){
            resize();
        }
        for(int i= size; i>=index; i--){
            array[i] = array[i-1];
        }
        array[index] = element;
    }

    public void resize(){
        int newSize = size *2;
        Object[] arrayResized = new Object[newSize];
        for(int i=0;i<array.length ; i++){
            arrayResized[i] = array[i];
        }
        capacity = newSize;
        array = arrayResized;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(String element){
        if(element==null){
            return false;
        }
        for (int i = 0 ; i < size; i++){
            if (element.equals(array[i])){
                return true;
            }
        }
        return false;
    }

}
