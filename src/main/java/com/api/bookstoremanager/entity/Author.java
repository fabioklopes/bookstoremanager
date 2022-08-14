package com.api.bookstoremanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;

    
}
