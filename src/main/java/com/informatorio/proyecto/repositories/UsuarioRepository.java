package com.informatorio.proyecto.repositories;

import com.informatorio.proyecto.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
//    public abstract ArrayList<UsuarioModel> findByPriority(Integer id);
    public abstract ArrayList<UsuarioModel> findById(Integer id);
}
