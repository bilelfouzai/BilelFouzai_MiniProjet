package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class concert {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idconcert;
	private String place;
	private Date dateconcert;
	private Long prixticket;
	
	@JsonIgnore
	@OneToMany (mappedBy = "conc")
	private List<chanteur> chanteurs;
}

	