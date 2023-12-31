package spring.lectureA_2.domain.item;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("M")
@Getter @Setter
public class Movie extends Item{
    @Column(name = "director")
    private String director;

    @Column(name = "actor")
    private String actor;

    public String getItemType() {
        return this.getClass().getSimpleName().toLowerCase();
    }

}
