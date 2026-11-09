package com.emerson.Monet_api.dominio.cartao;

import com.emerson.Monet_api.dominio.cartao.model.CartaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;
import java.util.UUID;

public interface CartaoRepository extends JpaRepository<CartaoEntity, UUID> {


}
