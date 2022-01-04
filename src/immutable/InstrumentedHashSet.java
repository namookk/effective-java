package immutable;

import java.util.Collection;
import java.util.HashSet;

//상속 보다는 컴포지션을 사용
// 아래는 상속 예시 ( cnt가 예상과 다르게 동작 함 )

public class InstrumentedHashSet<E> extends HashSet<E> {
    private int cnt = 0;
    @Override
    public boolean add(E e){
        cnt++;
        return super.add(e);
    }
    @Override
    public boolean addAll(Collection<? extends E> c){
        cnt += c.size();
        return super.addAll(c);
    }
}
