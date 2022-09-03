package com.informatorio.proyecto.controllers;

import com.informatorio.proyecto.models.UsuarioModel;
import com.informatorio.proyecto.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired()
    UsuarioService usuarioService;

    @GetMapping()
    public Optional obtnerUsuarioPorId(@RequestParam("id") Integer id){
        return this.usuarioService.obtenerPorId(id);
    }
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }


    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);

    }

   @GetMapping(path = "/{id}")
    public Optional obtenerPorId(@PathVariable("id") Integer id){
        return this.usuarioService.obtenerPorId(id);
    }


    @GetMapping("/query")
    public Optional obtenerUsuarioPorId(@RequestParam("id") Integer id) {
        return this.usuarioService.obtenerPorId(id);
    }
    @DeleteMapping( path ="/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id" + id;
        } else {
            return "No se pudo eliminar el usuario con id" + id;
        }
    }
}