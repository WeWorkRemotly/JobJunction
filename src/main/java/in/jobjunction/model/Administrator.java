package in.jobjunction.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
@RequiredArgsConstructor
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "administrator_gen")
    @SequenceGenerator(name = "administrator_gen", sequenceName = "administrator_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    private String fullName;

    private String email;

    private String password;

    private String contact;
}
