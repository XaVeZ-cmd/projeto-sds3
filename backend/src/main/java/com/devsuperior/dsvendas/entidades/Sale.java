package com.devsuperior.dsvendas.entidades;

import java.time.LocalDate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//Classe Vendas - Muitas pra um vendedor

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincremento no ID 
	private Long id;
	private Integer visited; //visitados
	private Integer deals; // negócios fechados
	private Double amount; // quantia vendida
	private LocalDate date; // data
	
	@ManyToOne //Muitos para um
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	public Sale () {
	}

	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date,
			Seller seller) {
		this.id = id;
		this.visited = visited; 
		this.deals = deals; 
		this.amount = amount; 
		this.date = date; 
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getvisited() {
		return visited;
	}

	public void setvisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getdeals() {
		return deals;
	}

	public void setdeals(Integer deals) {
		this.deals = deals;
	}

	public Double getamount() {
		return amount;
	}

	public void setamount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getdate() {
		return date;
	}

	public void setdate(LocalDate date) {
		this.date = date;
	}

	public Seller getseller() {
		return seller;
	}

	public void setseller(Seller seller) {
		this.seller = seller;
	}
	
}
