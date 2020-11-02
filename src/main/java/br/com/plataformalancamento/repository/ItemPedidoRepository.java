package br.com.plataformalancamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.plataformalancamento.model.ItemPedidoModel;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, Long> { }
