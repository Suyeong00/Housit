package housit.housit_backend.domain.finance;

import housit.housit_backend.domain.room.Room;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity @Getter
public class PredictedExpense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomId")
    private Room room;

    private String description;
    private String amount;
    private Boolean isChecked;
    private LocalDate dueDate;
}
