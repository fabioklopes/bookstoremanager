package com.api.bookstoremanager.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @Entity = declara que a classe é uma entidade e/ou tabela
 * @Data = cria todos os Getters/Setters, Equals e HashCode
 * @Builder = cria objetos de forma segura
 * @NoArgsConstructor = cria um construtor SEM argumentos
 * @AllArgsConstructor = cria um construtor COM argumentos
 */

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer pages;
    
    @Column(nullable = false)
    private Integer chapters;
    
    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false, name = "publisher_name", unique = true)
    private String publisherName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "author_id")
    private Author author;

    // *******************************

    public void author() {
        author.getName();
    }
    
}
