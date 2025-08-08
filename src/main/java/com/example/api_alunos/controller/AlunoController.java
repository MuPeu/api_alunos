package com.example.api_alunos.controller;

import com.example.api_alunos.model.Aluno;
import com.example.api_alunos.repository.AlunoRepository; //Permite que a classe atual use a interface AlunoRepository. É uma interface do Spring que fornece métodos de acesso ao banco de dados. Com esse import você pode injetar o repositorio em sua classe
import org.springframework.beans.factory.annotation.Autowired; //Essa anotação é usada para realizar a injeção de dependencia. Ela pede ao SpringBoot para fornecer uma instancia de uma classe
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/alunos") //Define o caminho base para todas as requisições mapeadas neste controlador

public class AlunoController {
    @Autowired //Utiliza a injeção de despendencias do Spring para obter uma instancia do AlunoRepository, permitindo que o controlador interaja com o banco de dados

    private AlunoRepository al;

    @GetMapping //Mapeia requisições HTTP GET para o metodo ListarAlunos()
    public List<Aluno>listarAlunos(){
        return al.findAll();
    } //listaAlunos - Chama o metodo findAll que retorna uma lista de todos os objetos Alunos, ou seja, lista todos os registros da tabela aluno_tb
}
