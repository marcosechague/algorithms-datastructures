package py.com.mechague;

/**
 * @author Marcos Echague
 * @since 30/03/2019
 */

public class HashTable {

    private static final int INITIAL_SIZE = 16;

    private HashEntry data[] ;

    public HashTable() {
        this.data = new HashEntry[INITIAL_SIZE];
    }

    public void put(String key, String value){

        HashEntry entry = new HashEntry(key, value);
        int index = getIndex(key);

        //if no dataon index, add the first
        if(data[index] ==null){
            data[index] = entry;
        //collision case, add the entry in the end
        }else{
            HashEntry entries = data[index];
            while (entries.next !=null){
                entries = entries.next;
            }
            entries.next= entry;
        }
    }

    public String getValue(String key){
        int index = getIndex(key);
        //If no data, null
        if (data[index]==null){
            return null;
        }

        //Walking in the stack of the index
        HashEntry entries =  data[index];
        while (entries.next!=null && !entries.getKey().equals(key)){
            entries = entries.next;
        };
        return entries.getValue();
    }


    private int getIndex(String key){
        int hashCode = key.hashCode();
        int index = (hashCode & 0x7fffffff) % INITIAL_SIZE;
        //For testing purpose of collision case

        if("name".equals(key) || "street".equals(key)){
            System.out.println("Collision case");
            index = 7;
        }
        System.out.println("Index : "+index);
        return index;
    }

}
