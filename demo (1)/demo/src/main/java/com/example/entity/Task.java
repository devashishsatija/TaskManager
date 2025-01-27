@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status; // OPEN, IN_PROGRESS, COMPLETED

    @ManyToOne
    private User assignedTo;

    @ManyToOne
    private Team team;

    // Audit fields like createdAt, updatedAt
}
