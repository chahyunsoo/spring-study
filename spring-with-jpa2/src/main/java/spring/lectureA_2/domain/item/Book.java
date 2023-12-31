package spring.lectureA_2.domain.item;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("B")
@Getter @Setter
public class Book extends Item{
    @Column(name = "author")
    private String author;

    @Column(name = "isbn")
    private String isbn;

    public String getItemType() {
        return this.getClass().getSimpleName().toLowerCase();
    }

}
