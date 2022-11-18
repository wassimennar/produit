package com.nadhem.produit.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadhem.produit.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
