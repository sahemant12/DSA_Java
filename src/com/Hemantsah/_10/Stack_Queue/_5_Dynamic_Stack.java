package com.Hemantsah._10.Stack_Queue;

public class _5_Dynamic_Stack extends _2_Stack_CustomImplementation{
    public _5_Dynamic_Stack() {
        super(); //it will call parent class constructor
    }
    public _5_Dynamic_Stack(int size) {
        super(size); //it will call parent class constructor
    }

    @Override
    public boolean push(int item) {

        if(isFull()){
            //double the size of the array
            int[] temp = new int[data.length * 2];

            //copy the content of data Array into new Array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
