@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<User> members;

    @OneToMany(mappedBy = "team")
    private List<Task> tasks;
}
