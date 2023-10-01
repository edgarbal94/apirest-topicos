package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "topico")
public class Topicomodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String titulo;
    private String mensaje;
    private String fechacreacion;
    private String estatustopico;
    private String autor;
    private String curso;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return String return the fechacreacion
     */
    public String getFechacreacion() {
        return fechacreacion;
    }

    /**
     * @param fechacreacion the fechacreacion to set
     */
    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    /**
     * @return String return the estatustopico
     */
    public String getEstatustopico() {
        return estatustopico;
    }

    /**
     * @param estatustopico the estatustopico to set
     */
    public void setEstatustopico(String estatustopico) {
        this.estatustopico = estatustopico;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
