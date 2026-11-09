package com.emerson.Monet_api.dominio.cartao.mapper;

import com.emerson.Monet_api.dominio.cartao.dto.CartaoDetalhes;
import com.emerson.Monet_api.dominio.cartao.dto.CartaoForm;
import com.emerson.Monet_api.dominio.cartao.model.CartaoEntity;

public interface CartaoMapper {
    CartaoEntity toEntity(CartaoForm form);
    CartaoDetalhes toDetalhes(CartaoEntity entity);
}
