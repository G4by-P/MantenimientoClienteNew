/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientes.servicesImpl;

import com.clientes.bean.ClienteBean;
import com.clientes.dao.ClienteDao;
import com.clientes.daoImpl.ClienteDAOImpl;
import com.clientes.services.ClienteService;
import java.util.List;

public class ClienteServiceImpl implements ClienteService{
    private ClienteDao clienteDAO; //declaramos una variable del cliente DAO
    
    
    public int insertar(ClienteBean cliente) {
    	 clienteDAO = new ClienteDAOImpl();
        return clienteDAO.insertar (cliente);
    }

    
    public List<ClienteBean> buscar(String razSocial) {
        clienteDAO = new ClienteDAOImpl();
        return clienteDAO.buscar(razSocial);
    }

    
    public ClienteBean obtenerPorId(int id) {
        clienteDAO = new ClienteDAOImpl();
        return clienteDAO.obtenerPorId(id);
    }

    
    public int actualizar(ClienteBean cliente) {
        clienteDAO = new ClienteDAOImpl();
        return clienteDAO.actualizar(cliente);
    }

    
    public int eliminar(int id) {
        clienteDAO = new ClienteDAOImpl();
        return clienteDAO.eliminar(id);
    }
}
