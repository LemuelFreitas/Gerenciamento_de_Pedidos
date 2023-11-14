package com.ProjetojpaAPIGerenciamentodePedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetojpaAPIGerenciamentodePedidos.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	// Nenhuma implementação é necessária. Spring Data JPA cuidará disso.
}