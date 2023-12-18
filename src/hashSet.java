import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

public class hashSet<E> implements Set{

    public HashMap<Object, Object> map;
    public hashSet(){
        this.map = new HashMap<>();
    }
    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.map.containsKey(o);
    }

    @Override
    public Iterator iterator() {
        return this.map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if(!this.contains(o)) return this.map.put(o, null) == null;
        else return false;
    }

    @Override
    public boolean remove(Object o) {
        return this.map.remove(o) != null;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean modified = false;
        for (Object element : c) {
            modified |= add(element);
        }
        return modified;
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        boolean modified = false;
        for (Object element : c) {
            if (modified | remove(element)) modified = true;
            else modified = false;
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection c) {
        hashSet<E> retainSet = new hashSet<>();
        retainSet.addAll(map.keySet());
        boolean modified = false;
        for (Object element : retainSet){
            if(!c.contains(element)) map.remove(element);
            modified = true;
        }
        return modified;
    }

    @Override
    public boolean containsAll(Collection c) {
        return this.map.keySet().containsAll(c);
    }


}
