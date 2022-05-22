package Stack;

public class ArrayStackDEmo {
    public static void main(String[] args)
    {
        ArrayStack a1 = new ArrayStack(10);
        for(int num = 0;num<10;num++)
        {
            a1.push(num);
        }
        a1.pop();
        a1.print();
    }
}
class ArrayStack{
    private int maxSize;//栈的大小
    private int[] stack;//数组模拟栈，数据就放在数组中
    private int top = -1;//top表示栈顶，初始化为-1

    public ArrayStack(int maxSize)//构造器
    {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull()//判断栈是否已满
    {
        return top == maxSize - 1;
    }

    public boolean isEmpty()//判断栈是否为空
    {
        return top == -1;
    }

    public void push(int value) //入栈
    {
        if(isFull()) {
            System.out.println("栈已满，无法添加数据哦~");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop()//出栈
    {
        if(isEmpty())
        {
            throw new RuntimeException("栈空，没有数据哦~");
        }
        int value = stack[top];
        top--;
        return value;
    }

    public void print()//打印栈内所有数据（不出栈）
    {
        if(isEmpty()) {
            throw new RuntimeException("栈空，没有数据哦~");
        }
        for(int num = top;num>=0;num--)
        {
            System.out.printf("stack[%d]=%d\n",num,stack[num]);
        }
    }

}

