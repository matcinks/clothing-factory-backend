package pl.ilpiu.clothingfactory.common;

import lombok.Data;
import pl.ilpiu.clothingfactory.product.colour.Colour;
import pl.ilpiu.clothingfactory.product.Product;
import pl.ilpiu.clothingfactory.product.size.Size;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MappedSuperclass
@Data
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Size size;

    @ManyToOne
    private Colour colour;

    @NotNull
    private Integer amount;

    // TODO Plan schedule priorities, maybe add some restrictions, check restrictions @Min, @Max
    @Min(1)
    @Max(10)
    @NotNull(message = "Schedule entry should have positive amount.")
    private Integer priority;

    // TODO check default status
    // TODO add more statuses
    @Enumerated(EnumType.STRING)
    private Status status = Status.ZAPLANOWANE;

    private Date scheduledOn;

    @PrePersist
    private void scheduledOn(){
        this.scheduledOn = new Date();
    }
}