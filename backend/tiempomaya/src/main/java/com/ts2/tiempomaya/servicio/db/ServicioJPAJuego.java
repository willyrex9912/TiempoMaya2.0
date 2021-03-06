package com.ts2.tiempomaya.servicio.db;

import com.ts2.tiempomaya.modelo.Juego;
import com.ts2.tiempomaya.repositorio.RepositorioJuego;
import com.ts2.tiempomaya.servicio.ServicioJuego;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioJPAJuego implements ServicioJuego {

    private RepositorioJuego repositorioJuego;

    public ServicioJPAJuego(RepositorioJuego repositorioJuego) {
        this.repositorioJuego = repositorioJuego;
    }

    @Override
    public List<Juego> obtenerJuegos() {
        return this.repositorioJuego.findAll();
    }

    @Override
    public List<Juego> obtenerJuegos(String nombreUsuario) {
        return this.repositorioJuego.findAllByNombreUsuario(nombreUsuario);
    }

    @Override
    public List<Juego> obtenerJuegos(int dificultad) {
        return this.repositorioJuego.findAllByDificultad(dificultad);
    }

    @Override
    public void guardar(Juego juego) {
        this.repositorioJuego.save(juego);
    }
}
