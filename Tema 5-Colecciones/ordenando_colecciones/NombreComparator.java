package ordenando_colecciones;
import java.util.Comparator;
class NombreComparator implements Comparator {
 public int compare(Object o1, Object o2) {
 Usuario1 u1 = (Usuario1) o1;
 Usuario1 u2 = (Usuario1) o2;
 return u1.getNombre().compareTo(u2.getNombre());
 }
 public boolean equals(Object o) {
 return this == o;
 }
}
