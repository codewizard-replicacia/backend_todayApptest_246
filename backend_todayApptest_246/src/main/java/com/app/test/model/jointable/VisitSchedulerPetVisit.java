package com.app.test.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.test.model.Visit;
import com.app.test.model.Pet;
import com.app.test.model.PetOwner;
import com.app.test.model.VisitScheduler;
import com.app.test.model.Veterian;
import com.app.test.model.Appointment;
import com.app.test.model.VaccineScheduler;
import com.app.test.model.Image;

@Entity(name = "VisitSchedulerPetVisit")
@Table(schema = "\"test\"", name = "\"VisitSchedulerPetVisit\"")
@Data
public class VisitSchedulerPetVisit{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ScheduleVisit_id\"")
	private Integer scheduleVisit_id;

    
    @Column(name = "\"Pet_id\"")
    private Integer pet_id;
 
}