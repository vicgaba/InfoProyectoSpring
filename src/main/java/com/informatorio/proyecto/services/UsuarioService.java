package com.informatorio.proyecto.services;

import com.informatorio.proyecto.models.UsuarioModel;
import com.informatorio.proyecto.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Integer id){
        return usuarioRepository.findById(id);
    }

    public boolean eliminarUsuario(Integer id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
