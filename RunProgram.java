import java.util.HashSet;
import java.util.Objects;
import java.util.Iterator;

public class RunProgram {
public static void main (String[] args){
try{
main_program();} catch (Exception ex){ex.printStackTrace();}
}

private static int TEN=10;
private static int fun(int a){
int var=a+1;
return var;
}
private static void main_program () {
int a=1;
int c=fun (a);
Element el1=new Element("first");
Element el2=new Element("second");
Set s=new Set();
s.add(el1);
s.add(el2);
System.out.println(String.valueOf(s));
s.remove(el2);
System.out.println(String.valueOf(s));
Set h=Set.union(s,s);
System.out.println(String.valueOf(h));
int i=0;
while (i<5){
i=i+1;
System.out.println(String.valueOf(i));
}
if (i==5) {
Element el3=new Element("third");
Set m=new Set();
m.add(el3);
Set k=Set.simDiff(s,m);
System.out.println(String.valueOf(k));
}
 else {
}
for (Element e:s){
System.out.println(String.valueOf(e));
}
}

}
class Element {

    private final String data;

    public Element(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Element) {
            return ((Element) obj).data.equals(data);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

}

class Set implements Iterable<Element> {

    private final java.util.Set<Element> set = new HashSet<>();

    public Set() {
    }

    public boolean add(Element element) {
        return set.add(element);
    }

    public boolean remove(Element element) {
        return set.remove(element);
    }

    public int size() {
        return set.size();
    }

    public void clear() {
        set.clear();
    }

    public static Set union(Set s1, Set s2) {
        Set out = new Set();
        out.set.addAll(s1.set);
        out.set.addAll(s2.set);
        return out;
    }


    public static Set intersection(Set s1, Set s2) {
        Set out = new Set();
        for (Element el : s1.set) {
            if (s2.set.contains(el)) {
                out.add(el);
            }
        }
        for (Element el : s2.set) {
            if (s1.set.contains(el)) {
                out.add(el);
            }
        }
        return out;
    }

    public static Set diff(Set s1, Set s2) {
        Set out = new Set();
        out.set.addAll(s1.set);
        for (Element el : s2.set) {
            if (s1.set.contains(el)) {
                out.remove(el);
            }
        }
        return out;
    }


    public static Set simDiff(Set s1, Set s2) {
        Set out = new Set();
        out.set.addAll(s1.set);
        out.set.addAll(s2.set);
        for (Element el : s1.set) {
            if (s2.set.contains(el)) {
                out.remove(el);
            }
        }
        for (Element el : s2.set) {
            if (s1.set.contains(el)) {
                out.remove(el);
            }
        }
        return out;
    }

    @Override
    public String toString() {
        return set.toString();
    }
    @Override
public Iterator<Element> iterator() {
   return set.iterator();
}
}
