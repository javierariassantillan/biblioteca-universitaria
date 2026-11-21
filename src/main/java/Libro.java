import java.util.Objects;
 
/**
 * Representa un libro de la biblioteca universitaria y controla su disponibilidad.
 */
public class Libro {
 
  private final String titulo;
  private final String autor;
  private boolean disponible = true;
 
  /**
   * Crea un libro disponible para préstamo.
   *
   * @param titulo título del libro
   * @param autor autor del libro
   */
  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }
 
  /**
   * Devuelve el título del libro.
   *
   * @return título del libro
   */
  public String getTitulo() {
    return titulo;
  }
 
  /**
   * Devuelve el autor del libro.
   *
   * @return autor del libro
   */
  public String getAutor() {
    return autor;
  }
 
  /**
   * Indica si el libro está disponible para préstamo.
   *
   * @return true si el libro no está prestado
   */
  public boolean estaDisponible() {
    return disponible;
  }
 
  /**
   * Marca el libro como prestado.
   *
   * @throws IllegalStateException si el libro ya está prestado
   */
  public void prestar() {
    if (!disponible) {
      throw new IllegalStateException("Libro no disponible");
    }
    disponible = false;
  }
 
  /**
   * Marca el libro como disponible nuevamente.
   */
  public void devolver() {
    disponible = true;
  }
 
  /**
   * Indica si el título del libro coincide con otro título comparando su contenido.
   *
   * @param otroTitulo título con el que se compara
   * @return true si ambos títulos tienen el mismo contenido
   */
  public boolean esMismoTitulo(String otroTitulo) {
    return Objects.equals(titulo, otroTitulo);
  }
}
