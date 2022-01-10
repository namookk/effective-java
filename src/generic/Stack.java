package generic;

import java.util.Collection;

public class Stack<E> {
    public static final int DEFAULT_SIZE = 20;
    private int size;
    private E[] elements;
    public Stack() { elements = (E[]) new Object[DEFAULT_SIZE]; size = 0; }
    public E push(E item){
        elements[++size] = item;
        return item;
    }
    //아래는 에러가 발생
//    public void pushAll(Iterable<E> src){
//        for(E e : src)
//            push(e);
//    }

    //이렇게 수정해야함
    public void pushAll(Iterable<? extends E> src) {
        for(E e : src)
            push(e);
    }

    public void popAll(Collection<? super E> dst){
        //...
    }
}
