package in.jobjunction.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
@RequiredArgsConstructor
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employer_gen")
    @SequenceGenerator(name = "employer_gen", sequenceName = "employer_seq", initialValue = 51, allocationSize = 100)
    @Column(name = "id", nullable = false)
    private Long id;

    private String fullName;

    private String email;

    private String password;

    private String contact;

    private String company;

    private String industry;

    // Additional fields
    // ...

    // Relationships
    @OneToMany(mappedBy = "employer")
    private List<Job> jobs;

    @OneToMany(mappedBy = "employer")
    private List<JobApplication> jobApplications;

}
