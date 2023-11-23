package it.itispaleocapa.tascal.myapp;
import jakarta.persistence.*;

@Entity
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   @Column(nullable = false, unique = false)
   private String title;
   //getter
   public Long getId() {
      return id;
   };
    public String getTitle() {
        return title;
    };
}