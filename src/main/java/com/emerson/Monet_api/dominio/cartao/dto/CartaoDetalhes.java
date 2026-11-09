package com.emerson.Monet_api.dominio.cartao.dto;

import com.emerson.Monet_api.dominio.cartao.model.BandeiraCartao;

import java.time.LocalDateTime;

public record CartaoDetalhes(String id, String nome, BandeiraCartao bandeira, LocalDateTime dataCadastro) {
}
