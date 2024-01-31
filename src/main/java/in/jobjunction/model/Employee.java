package in.jobjunction.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
@RequiredArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String email;

    private String password;

    @OneToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    private String mobile;

    private String address;

    private String city;

    private String state;

    private String country;

    // Additional fields
    private boolean servingNoticePeriod;
    private String currentJobTitle;
    private String currentEmployer;

    // Relationships
    @OneToMany(mappedBy = "employee")
    private List<EmployeeBidding> employeeBiddings;

    @OneToMany(mappedBy = "employee")
    private List<JobApplication> jobApplications;

    @OneToOne(mappedBy = "employee")
    private PerformanceSettings performanceSettings;

    @OneToMany(mappedBy = "employee")
    private List<LeaveApplication> leaveApplications;
}
