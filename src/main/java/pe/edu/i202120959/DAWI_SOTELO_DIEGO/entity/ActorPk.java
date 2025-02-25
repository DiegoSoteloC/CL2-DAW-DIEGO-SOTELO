package pe.edu.i202120959.DAWI_SOTELO_DIEGO.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorPk {
    private Integer actor_id;
    private Integer film_id;
}