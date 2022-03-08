package ordenando_colecciones;
import java.util.Comparator;
class EdadComparator implements Comparator {
 public int compare(Object o1, Object o2) {

 Usuario1 u1 = (Usuario1) o1;
 Usuario1 u2 = (Usuario1) o2;
 return u1.getEdad() - u2.getEdad();
 }
 public boolean equals(Object o) {
 return this == o;
 }
}
