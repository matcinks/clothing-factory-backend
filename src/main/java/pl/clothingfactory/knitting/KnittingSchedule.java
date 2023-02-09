package pl.clothingfactory.knitting;

import lombok.Data;
import pl.clothingfactory.common.Schedule;
import pl.clothingfactory.knitting.KnittingDevices.KnittingDevice;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

// TODO zmienic dziedziczenie na ProductionSchedul, zeby uwzglednic material
@Entity
@Table(name = "knitting_schedules")
@Data
class KnittingSchedule extends Schedule {

    @ManyToOne
    private KnittingDevice knittingDevice;

}