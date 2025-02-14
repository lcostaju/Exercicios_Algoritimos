package Prova3;

public class Animal {
    String nome;
    int idade;
    String nomeTutor;
    String registro;

    public Animal(String nome, int idade, String nomeTutor, String registro) {
        this.nome = nome;
        this.idade = idade;
        this.nomeTutor = nomeTutor;
        this.registro = registro;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNomeTutor() {
        return nomeTutor;
    }
    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idade;
        result = prime * result + ((nomeTutor == null) ? 0 : nomeTutor.hashCode());
        result = prime * result + ((registro == null) ? 0 : registro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade != other.idade)
            return false;
        if (nomeTutor == null) {
            if (other.nomeTutor != null)
                return false;
        } else if (!nomeTutor.equals(other.nomeTutor))
            return false;
        if (registro == null) {
            if (other.registro != null)
                return false;
        } else if (!registro.equals(other.registro))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Nome do Tutor: " + nomeTutor + " | Registro: " + registro;
    }
}
