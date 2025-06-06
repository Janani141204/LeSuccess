class QueueArray{
    static final int MAX_SIZE=30;
    int arr[];
    int front,rear;
    QueueArray(){
        arr=new int[MAX_SIZE];
        front=-1;
        rear=-1;
}
public void enqueue(int val){
    if(rear==MAX_SIZE-1)
    {
        System.out.println("queue is full");
    }
    if(front==-1)
    {
        front++;
    }
    arr[++rear]=val;
}
public int dequeue()
{
    if(front==-1||front>rear)
    {
        System.out.println("queue is empty");
    }
return arr[front++];
}
}
public class Main{
    public static void main(String[] args)
    {
        QueueArray q=new QueueArray();
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(2);
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}