package com.emerson.Monet_api.dominio.cartao;

import com.emerson.Monet_api.dominio.cartao.dto.CartaoDetalhes;
import com.emerson.Monet_api.dominio.cartao.dto.CartaoForm;
import com.emerson.Monet_api.dominio.cartao.mapper.CartaoMapper;
import com.emerson.Monet_api.dominio.cartao.model.CartaoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {
    @Autowired

    private CartaoValidator validator;
    @Autowired
    private CartaoRepository repository;

    @Autowired
    private CartaoMapper mapper;

    public CartaoDetalhes criar(CartaoForm form){

        validator.validar(form);
        CartaoEntity entity = mapper.toEntity(form);
        repository.save(entity);
        return mapper.toDetalhes((entity));

    }

}
