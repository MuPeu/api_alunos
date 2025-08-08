package com.example.api_alunos.repository;

import com.example.api_alunos.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Marca esta interface como um componente Spring que atua como um repositorio de dados. O Spring Data JPA irá fornecer em tempo de execução

public interface AlunoRepository extends JpaRepository<Aluno,Long>{

}
