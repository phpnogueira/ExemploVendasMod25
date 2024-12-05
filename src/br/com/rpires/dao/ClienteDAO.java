package br.com.rpires.dao;

import br.com.rpires.dao.generics.GenericDAO;
import br.com.rpires.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente>  implements IClienteDAO{


    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
