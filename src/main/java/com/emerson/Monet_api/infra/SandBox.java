package com.emerson.Monet_api.infra;

import com.emerson.Monet_api.dominio.cartao.CartaoRepository;
import com.emerson.Monet_api.dominio.cartao.model.BandeiraCartao;
import com.emerson.Monet_api.dominio.cartao.model.CartaoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SandBox implements CommandLineRunner {

    @Autowired
    private CartaoRepository repository;
    public void salvarCartao(){

        CartaoEntity cartao = new CartaoEntity();
        cartao.setNome("Nu Card");
        cartao.setBandeira(BandeiraCartao.MASTERCARD);
        repository.save(cartao);

    }

    @Override
    public void run(String... args) throws Exception {
        salvarCartao();
    }
}
