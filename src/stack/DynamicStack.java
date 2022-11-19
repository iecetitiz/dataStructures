package stack;

public class DynamicStack extends MyStack{
   public DynamicStack() {
       super();
   }

   public DynamicStack(int size) {
       super(size);
   }

   public boolean push(int item) {
       if(this.isFull()) {
           int[] temp = new int[data.length * 2];
           for(int i = 0; i < data.length; i++) {
               temp[i] = data[i];
           }
           data = temp;
       }

       //at this point we know that array is not full
       //insert item

       return super.push(item);
   }
}
