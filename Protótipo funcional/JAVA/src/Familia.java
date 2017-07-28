/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dalvan
 */
public class Familia {

    String cidade;
    String estado;
    String cep;
    MembroFamilia membro;

    Familia(String cidade, String estado, String cep, MembroFamilia membro) {
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.membro = membro;

    }
}
