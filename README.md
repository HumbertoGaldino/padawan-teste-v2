# Teste de Conceito para Desenvolvedores Juniors - Analista de Documentação

Olá, este teste foi criado por **João Alcides** e **Glauco**, líderes técnicos de duas squads de desenvolvimento da Pacto Soluções. Escrevemos este teste para avaliar algumas competências suas. Ele é simples, mas nos ajudará a entender seu nível de conhecimento em back-end e sua desenvoltura com a resolução de problemas.

## Instruções Gerais
1. Clone o repositório: [https://gitlab.com/glauco-pacto/padawan-teste-v2](https://gitlab.com/glauco-pacto/padawan-teste-v2)
2. O projeto é uma aplicação em **Java**, utilizando o framework **Spring Boot**, e suas dependências são gerenciadas com **Maven**. Caso precise, recomendamos a leitura deste guia: [https://spring.io/guides/gs/spring-boot](https://spring.io/guides/gs/spring-boot).
3. Execute a aplicação. Ela será iniciada na porta `9099`.
4. Acesse a documentação do projeto em: [https://documenter.getpostman.com/view/116353/TVCZYW7D](https://documenter.getpostman.com/view/116353/TVCZYW7D).
5. Responda às seguintes perguntas:

---

### Parte 1: Subir a Aplicação

**Yoda:** Como primeira parte de seu treinamento, capaz você deverá ser para subir a aplicação.

1. Qual será o retorno ao fazer um **POST** em `http://localhost:9099/generic-post` com o seguinte corpo (body)?
    ```json
    {
       "planet": "Coruscant 985",
       "ranking": 42,
       "classe": "Jedi Knight"
    }
    ```

2. Se mudarmos o campo `ranking` para `0`, a aplicação gera um erro. Por quê?

3. Como podemos alterar a porta na qual a aplicação é iniciada?

---

### Parte 2: Implementação de Funcionalidades
Agora você irá programar. Massa, hein?!

#### Tarefa 1: Criar Novo Endpoint de Habilidades

1. Atualmente, ao acessar o endpoint `http://localhost:9099/vader/skills`, a aplicação retorna uma lista de habilidades do Darth Vader. 
2. Crie um endpoint similar, mas que utilize seu nome e suas habilidades.
    - Exemplo: `http://localhost:9099/seunome/skills`.
3. Detalhe muito importante: ao fazer isso, você **não pode impactar** o funcionamento do endpoint original do Darth Vader.

#### Tarefa 2: Adicionar Informações de Jedi

1. Adicione as seguintes informações para cada Jedi:
    - Nome
    - Status: **Padawan**, **Jedi** ou **Mestre Jedi**
    - Mentor

2. Qui-Gon Jinn, ao fazer contato espiritual, informou que é possível mensurar a quantidade de **midichlorians** em cada Jedi. Certifique-se de incluir essa informação.

#### Tarefa 3: Consultas com Native SQL

Implemente as seguintes consultas usando **Native SQL** e crie endpoints para elas:

1. **Listar todos os Mestres Jedi e seus aprendizes.**
2. **Listar todos os Jedis cujo nível de midichlorians seja acima de 9000.**
3. **Listar, por categoria, a quantidade de Jedis (Padawan, Jedi, Mestre Jedi).**

---

### Entrega
Um desenvolvedor júnior deve estar pronto para reconhecer suas dificuldades e, acima de tudo, saber perguntar.

1. Crie uma branch no repositório do GitLab e faça suas alterações.
2. Envie seu usuário do GitLab (se ainda não tiver, crie um. Não tem problema se estiver vazio).
3. Responda às perguntas acima e envie para os seguintes e-mails:
    - **rh@pactosolucoes.com.br**
    - **alcides@pactosolucoes.com.br**
    - Com cópia para **amandasouza@pactosolucoes.com.br**

---

**Boa sorte, e que a Força esteja com você!**
