package in.jobjunction.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "job_category_id")
    private JobCategory jobCategory;

    private String description;

    private String requirements;

    private double bidCTC;

    private boolean noticePeriodNotification;

    private String location;

    private int vacancies;

    private String employmentType;

    private String skillsRequired;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @OneToMany(mappedBy = "job")
    private List<JobApplication> jobApplications;
}
