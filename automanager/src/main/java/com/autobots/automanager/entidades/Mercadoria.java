package com.autobots.automanager.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mercadoria extends RepresentationModel<Mercadoria> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Date validade;
	
	@Column
	private Date fabricao;
	
	@Column
	private Date cadastro;
	
	@Column
	private String nome;
	
	@Column
	private Long quantidade;
	
	@Column
	private Double valor;
	
	@Column
	private String descricao;
}
