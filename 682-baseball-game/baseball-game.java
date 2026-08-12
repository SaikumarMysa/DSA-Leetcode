class MyStack{
    private int top;
    private int maxSize;
    private int[] arr;

    MyStack(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
        this.arr = new int[maxSize];
    }

    //push
    //isFull
    public boolean isFull(){
        if(top>=maxSize-1){
            return true;
        }
        return false;
    }
    public boolean push(int data){
        if(isFull()){
            return false;
        }else{
            arr[++top] = data;
            return true;
        }
    }

    public boolean isEmpty(){
        if(top<0){
            return true;
        }
        return false;
    }

    public int pop(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return arr[top--];
    }

    public int peek1(){
        return arr[top];
    }

    public int peek2(){
        return arr[top-1];
    }
}

class Solution {
   
    public int calPoints(String[] operations) {
        MyStack my = new MyStack(operations.length);

        for(int i=0; i<operations.length; i++){
            String str = operations[i];
            if(str.equals("+")){
                my.push(my.peek1()+my.peek2());
            }else if(str.equals("D")){
                my.push(2*my.peek1());
            }else if(str.equals("C")){
                my.pop();
            }else{
                int x = Integer.parseInt(str);
                my.push(x);
            }
        }

        int sum=0;
        while(!my.isEmpty()){
            sum+=my.pop();
        }
        return sum;
    }
}